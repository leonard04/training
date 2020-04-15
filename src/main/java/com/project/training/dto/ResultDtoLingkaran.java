package com.project.training.dto;

public class ResultDtoLingkaran {
    private LingkaranInputClass input;
    private Double result;

    public ResultDtoLingkaran() {
    }

    public ResultDtoLingkaran(LingkaranInputClass input, Double result) {
        this.input = input;
        this.result = result;
    }

    public LingkaranInputClass getInput() {
        return input;
    }

    public void setInput(LingkaranInputClass input) {
        this.input = input;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }
}
