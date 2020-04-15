package com.project.training.controller;

import com.project.training.dto.*;
import com.project.training.service.ICounter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/count")
public class CountController {
    @Autowired
    @Qualifier("HPitagoras")
    private ICounter<NormalInputClass,Double> euDistance;

    @Autowired
    @Qualifier("HLSegitiga")
    private ICounter<SegitigaInputClass,Double> segitiga;

    @Autowired
    @Qualifier("HLPersegi")
    private ICounter<PersegiInputClass,Double> persegi;

    @Autowired
    @Qualifier("HLLingkaran")
    private ICounter<LingkaranInputClass,Double> lingkaran;

    @PostMapping("/euDistance")
    public ResponseEntity<ResultDto> getEuDistance(@RequestBody NormalInputClass input){

        Double res = euDistance.count(input);
        ResultDto resultDto =new ResultDto(input,res);

        return ResponseEntity.ok().body(resultDto);
    }
    @PostMapping("/luasSegitiga")
    public ResponseEntity<ResultDtoSegitiga> getLuasSegitiga(@RequestBody SegitigaInputClass input){

        Double res = segitiga.count(input);
        ResultDtoSegitiga resultDto =new ResultDtoSegitiga(input,res);

        return ResponseEntity.ok().body(resultDto);
    }

    @GetMapping("/luasPersegi/{sisi}")
    public ResponseEntity<ResultDtoPersegi> getLuasPersegi(@PathVariable("sisi") Double sisi){
        PersegiInputClass input = new PersegiInputClass();
        input.setSisi(sisi);
        Double res = persegi.count(input);
        ResultDtoPersegi resultDto = new ResultDtoPersegi(input,res);
        return ResponseEntity.ok().body(resultDto);
    }

    @GetMapping("/luasLingkaran/{jarijari}")
    public ResponseEntity<ResultDtoLingkaran> getLuasLingkaran(@PathVariable("jarijari") Double jarijari){
        LingkaranInputClass input = new LingkaranInputClass();
        input.setJarijari(jarijari);
        Double res = lingkaran.count(input);
        ResultDtoLingkaran resultDto = new ResultDtoLingkaran(input,res);
        return ResponseEntity.ok().body(resultDto);
    }
}
