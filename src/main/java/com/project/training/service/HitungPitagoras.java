package com.project.training.service;

import com.project.training.dto.NormalInputClass;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
@Qualifier("HPitagoras")
public class HitungPitagoras implements ICounter<NormalInputClass,Double> {

    @Override
    public Double count(NormalInputClass input) {
        return Math.sqrt((input.getB() * input.getB()) + (input.getA() * input.getA()));
    }
}
