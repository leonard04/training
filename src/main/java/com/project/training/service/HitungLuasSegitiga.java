package com.project.training.service;

import com.project.training.dto.SegitigaInputClass;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("HLSegitiga")
public class HitungLuasSegitiga implements ICounter<SegitigaInputClass,Double> {
    @Override
    public Double count(SegitigaInputClass input) {
        return input.getAlas()*input.getTinggi() * 0.5;
    }
}
