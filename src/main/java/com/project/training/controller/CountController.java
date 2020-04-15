package com.project.training.controller;

import com.project.training.dto.NormalInputClass;
import com.project.training.dto.ResultDto;
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
    private ICounter<NormalInputClass,Double> segitiga;

    @Autowired
    @Qualifier("HLPersegi")
    private ICounter<NormalInputClass,Double> persegi;

    @Autowired
    @Qualifier("HLLingkaran")
    private ICounter<NormalInputClass,Double> lingkaran;

    @PostMapping("/euDistance")
    public ResponseEntity<ResultDto> getEuDistance(@RequestBody NormalInputClass input){

        Double res = euDistance.count(input);
        ResultDto resultDto =new ResultDto(input,res);

        return ResponseEntity.ok().body(resultDto);
    }
    @PostMapping("/luasSegitiga")
    public ResponseEntity<ResultDto> getLuasSegitiga(@RequestBody NormalInputClass input){

        Double res = segitiga.count(input);
        ResultDto resultDto =new ResultDto(input,res);

        return ResponseEntity.ok().body(resultDto);
    }

    @GetMapping("/luasPersegi/{a}")
    public ResponseEntity<ResultDto> getLuasPersegi(@PathVariable("a") Double a){
        NormalInputClass input = new NormalInputClass();
        input.setA(a);
        Double res = persegi.count(input);
        ResultDto resultDto = new ResultDto(input,res);
        return ResponseEntity.ok().body(resultDto);
    }

    @GetMapping("/luasLingkaran/{a}")
    public ResponseEntity<ResultDto> getLuasLingkaran(@PathVariable("a") Double a){
        NormalInputClass input = new NormalInputClass();
        input.setA(a);
        Double res = lingkaran.count(input);
        ResultDto resultDto = new ResultDto(input,res);
        return ResponseEntity.ok().body(resultDto);
    }
}
