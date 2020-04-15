package com.project.training.dto;

public class ResultDto {
    private NormalInputClass input;
    private Double result;

    public ResultDto() {
    }

    public ResultDto(NormalInputClass input, Double result) {
        this.input = input;
        this.result = result;
    }

    public NormalInputClass getInput() {
        return input;
    }

    public void setInput(NormalInputClass input) {
        this.input = input;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }
}
