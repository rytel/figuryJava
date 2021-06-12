package com.company;

public class TriangleOperator implements Operator<Triangle> {
    @Override
    public double calcPerimeter(Triangle figure) {
        return figure.getSegments()[0].getLength() +
                figure.getSegments()[1].getLength() +
                figure.getSegments()[2].getLength();
    }

    @Override
    public double calcArea(Triangle figure) {
        double perimeter = calcPerimeter(figure);

        return Math.sqrt(perimeter / 2 *
                (perimeter / 2 - figure.getSegments()[0].getLength()) *
                (perimeter / 2 - figure.getSegments()[1].getLength()) *
                (perimeter / 2 - figure.getSegments()[2].getLength()));
    }

    @Override
    public Class<Triangle> getFigureType() {
        return Triangle.class;
    }


}
