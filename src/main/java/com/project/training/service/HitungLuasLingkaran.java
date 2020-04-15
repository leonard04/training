package com.project.training.service;

import com.project.training.dto.LingkaranInputClass;
import com.project.training.dto.NormalInputClass;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("HLLingkaran")
public class HitungLuasLingkaran implements ICounter<LingkaranInputClass,Double> {
    @Override
    public Double count(LingkaranInputClass input) {
        return input.getJarijari() * input.getJarijari() * 3.14;
    }
}
