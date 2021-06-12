package com.company;

public class Triangle extends Figure {

private  final TriangleOperator operator;
    public Triangle(Point point1, Point point2, Point point3) {
        super("trójkąt");
        Point[] points = new Point[3];
        Segment[] segments = new Segment[3];
        this.operator = new TriangleOperator();
        points[0] = point1;
        points[1] = point2;
        points[2] = point3;
        for(int i=0; i<3; i++){
            segments[i] = new Segment(points[i], points[(i+1)%3]);
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


}
