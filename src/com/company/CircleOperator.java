package com.company;

public class CircleOperator implements Operator<Circle>{
    @Override
    public double calcPerimeter(Circle figure) {
        return 2 * Math.PI * figure.getSegments()[0].getLength();
    }

    @Override
    public double calcArea(Circle figure) {
        return Math.PI * figure.getSegments()[0].getLength() * figure.getSegments()[0].getLength();
    }

    @Override
    public boolean isCorrect(Figure figure) {
        return true;
    }
}
