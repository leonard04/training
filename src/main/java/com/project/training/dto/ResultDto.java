package com.project.training.dto;

public class ResultDto {
    private NormalInputClass input;
//    private LingkaranInputClass inputLingkaran;
//    private PersegiInputClass inputPersegi;
//    private SegitigaInputClass inputSegitiga;
    private Double result;

    public ResultDto() {
    }
//
//    public ResultDto(LingkaranInputClass inputLingkaran, Double result) {
//        this.inputLingkaran = inputLingkaran;
//        this.result = result;
//    }
//
//    public ResultDto(PersegiInputClass inputPersegi, Double result) {
//        this.inputPersegi = inputPersegi;
//        this.result = result;
//    }
//
//    public ResultDto(SegitigaInputClass inputSegitiga, Double result) {
//        this.inputSegitiga = inputSegitiga;
//        this.result = result;
//    }

    public ResultDto(NormalInputClass input, Double result) {
        this.input = input;
        this.result = result;
    }
//    public LingkaranInputClass getInputLingkaran() {
//        return inputLingkaran;
//    }
//
//    public void setInputLingkaran(LingkaranInputClass inputLingkaran) {
//        this.inputLingkaran = inputLingkaran;
//    }
//
//    public PersegiInputClass getInputPersegi() {
//        return inputPersegi;
//    }
//
//    public void setInputPersegi(PersegiInputClass inputPersegi) {
//        this.inputPersegi = inputPersegi;
//    }
//
//    public SegitigaInputClass getInputSegitiga() {
//        return inputSegitiga;
//    }
//
//    public void setInputSegitiga(SegitigaInputClass inputSegitiga) {
//        this.inputSegitiga = inputSegitiga;
//    }



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
