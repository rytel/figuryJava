package com.company;

public class SquareOperator implements Operator<Square> {
    @Override
    public double calcPerimeter(Square figure) {
        return figure.getSegments()[0].getLength() +
                figure.getSegments()[1].getLength() +
                figure.getSegments()[2].getLength() +
                figure.getSegments()[3].getLength();
    }

    @Override
    public double calcArea(Square figure) {
        return figure.getSegments()[0].getLength() * figure.getSegments()[1].getLength();
    }

    @Override
    public Class<Square> getFigureType() {
        return Square.class;
    }
}
