package com.company;

public class Circle extends Figure {
    private Point[] points = new Point[2];
    private Segment[] segments = new Segment[1];

    public Circle(Point point1, Point point2) {
        points[0] = point1;
        points[1] = point2;
        setSegments();
        super.setName("koło");
        super.setPoints(this.points);
        super.setSegments(this.segments);
    }

    public void setArea() {
        setPerimeter();
        super.setArea(Math.PI * this.segments[0].getLength() * this.segments[0].getLength());
    }

    public void setPerimeter() {
        super.setPerimeter(2 * Math.PI * this.segments[0].getLength());
    }

    public void setSegments() {
        this.segments[0] = new Segment(this.points[0], this.points[1]);
    }

    @Override
    public void showParimeter() {
        setPerimeter();
        super.showParimeter();
    }

    @Override
    public void showArea() {
        setArea();
        super.showArea();
    }
}
