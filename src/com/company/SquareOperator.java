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
    public boolean isCorrect(Figure figure) {
        Segment[] diagonal = new Segment[2];
        diagonal[0] = new Segment(figure.getPoints()[0], figure.getPoints()[2]);
        diagonal[1] = new Segment(figure.getPoints()[1], figure.getPoints()[3]);
        if (diagonal[0].getLength() != diagonal[1].getLength()) {
            System.out.println("To nie jest kwadrat");
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if (figure.getSegments()[i % 4].getLength() != figure.getSegments()[(1 + i) % 4].getLength()) {
                System.out.println("To nie jest kwadrat");
                return false;
            }
        }
        return true;
    }
}
