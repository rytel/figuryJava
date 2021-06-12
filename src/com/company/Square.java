package com.company;

public class Square extends Figure {

    private final SquareOperator operator;

    public Square(Point point1, Point point2, Point point3, Point point4) {
        super("kwadrat");
        this.operator = new SquareOperator();

        Point[] points = new Point[4];
        points[0] = point1;
        points[1] = point2;
        points[2] = point3;
        points[3] = point4;

        Segment[] segments = new Segment[4];
        for (int i = 0; i < 4; i++) {
            segments[i] = new Segment(points[i], points[(i + 1) % 4]);
        }

        super.setPoints(points);
        super.setSegments(segments);
    }


    @Override
    public double getPerimeter() {
        if(isCorrect()) {
            return this.operator.calcPerimeter(this);
        }
        return 0;
    }

    @Override
    public double getArea() {
        if(isCorrect()) {
            return this.operator.calcArea(this);
        }
        return 0;
    }
    @Override
    public boolean isCorrect() {
        Segment[] diagonal = new Segment[2];
        diagonal[0] = new Segment(getPoints()[0], getPoints()[2]);
        diagonal[1] = new Segment(getPoints()[1], getPoints()[3]);
        if (diagonal[0].getLength() != diagonal[1].getLength()) {
            System.out.println("To nie jest kwadrat");
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if (getSegments()[i % 4].getLength() != getSegments()[(1 + i) % 4].getLength()) {
                System.out.println("To nie jest kwadrat");
                return false;
            }
        }
        return super.isCorrect();
    }

//    }
}

