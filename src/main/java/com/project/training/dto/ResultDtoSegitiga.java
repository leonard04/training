package com.project.training.dto;

public class ResultDtoSegitiga {
    private SegitigaInputClass input;
    private Double result;

    public ResultDtoSegitiga() {
    }

    public ResultDtoSegitiga(SegitigaInputClass input, Double result) {
        this.input = input;
        this.result = result;
    }

    public SegitigaInputClass getInput() {
        return input;
    }

    public void setInput(SegitigaInputClass input) {
        this.input = input;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }
}
