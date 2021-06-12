package com.company;

public class TriangleOperator implements Operator<Triangle>{
    @Override
    public double calcPerimeter(Triangle figure) {
        return figure.getSegments()[0].getLength() +
                figure.getSegments()[1].getLength() +
                figure.getSegments()[2].getLength();
    }

    @Override
    public double calcArea(Triangle figure) {
        return Math.sqrt(figure.getPerimeter() / 2 *
                (figure.getPerimeter() / 2 - figure.getSegments()[0].getLength()) *
                (figure.getPerimeter() / 2 - figure.getSegments()[1].getLength()) *
                (figure.getPerimeter() / 2 - figure.getSegments()[2].getLength()));
    }

    @Override
    public boolean isCorrect(Figure figure) {
        for (int i = 0; i < 3; i++) {
            if (figure.getSegments()[i % 3].getLength() + figure.getSegments()[(1 + i) % 3].getLength() == figure.getSegments()[(2 + i) % 3].getLength()) {
                System.out.println("Punkty są współliniowe, to nie trójkąt");
                return false;
            }
        }
        return  true;
    }
}
