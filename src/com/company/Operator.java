package com.company;

public interface Operator<T> {
    double calcPerimeter(T figure);

    double calcArea(T figure);

    Class<T> getFigureType();
}

