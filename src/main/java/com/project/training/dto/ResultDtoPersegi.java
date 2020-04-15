package com.project.training.dto;

public class ResultDtoPersegi {
    private PersegiInputClass input;
    private Double result;

    public ResultDtoPersegi() {
    }

    public ResultDtoPersegi(PersegiInputClass input, Double result) {
        this.input = input;
        this.result = result;
    }

    public PersegiInputClass getInput() {
        return input;
    }

    public void setInput(PersegiInputClass input) {
        this.input = input;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }
}
