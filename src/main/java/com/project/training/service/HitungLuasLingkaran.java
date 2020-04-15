package com.project.training.service;

import com.project.training.dto.NormalInputClass;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("HLLingkaran")
public class HitungLuasLingkaran implements ICounter<NormalInputClass,Double> {
    @Override
    public Double count(NormalInputClass input) {
        return input.getA() * input.getA() * 3.14;
    }
}
