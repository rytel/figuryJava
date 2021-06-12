package com.company;

public class Circle extends Figure {

    private final CircleOperator operator;

    public Circle(Point point1, Point point2) {
        super("koło");
        Point[] points = new Point[2];
        Segment[] segments = new Segment[1];
        points[0] = point1;
        points[1] = point2;
        segments[0] = new Segment(point1, point2);
        this.operator = new CircleOperator();

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
}

