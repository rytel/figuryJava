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
        return this.operator.calcPerimeter(this);
    }

    @Override
    public double getArea() {
        return this.operator.calcArea(this);
    }

//    }
}

