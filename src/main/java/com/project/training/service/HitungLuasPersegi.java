package com.project.training.service;


import com.project.training.dto.PersegiInputClass;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("HLPersegi")
public class HitungLuasPersegi implements ICounter<PersegiInputClass,Double> {

    @Override
    public Double count(PersegiInputClass input) {
        return input.getSisi() * input.getSisi();
    }
}
