package com.company;

public class Segment {
    private double length;
    private Point[] points = new Point[2];

    public Segment(Point a, Point b) {
        this.points[0] = a;
        this.points[1] = b;
        setLength();
    }

    public void setLength() {
        this.length = Math.sqrt(Math.pow(points[1].getX() - points[0].getX(), 2) + Math.pow(points[1].getY() - points[0].getY(), 2));
    }

    public double getLength() {
        return length;
    }
}
