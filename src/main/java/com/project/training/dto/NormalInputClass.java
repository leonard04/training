package com.project.training.dto;

public class NormalInputClass {
    private Double a;
//    private Double a2;
    private Double b;
//    private Double b2;

    public Double getA() {
        return a;
    }

    public void setA(Double a1) {
        this.a = a1;
    }


    public Double getB() {
        if (this.b == null){
            return 0.0;
        }
        return b;
    }

    public void setB(Double b1) {
        this.b = b1;
    }

}
