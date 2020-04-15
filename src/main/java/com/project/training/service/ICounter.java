package com.project.training.service;

public interface ICounter<I,O> {
    O count(I input);
}
