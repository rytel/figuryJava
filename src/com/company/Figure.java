package com.company;

public abstract class Figure {
    private final String name;
    private Point[] points;
    private Segment[] segments;

    protected Figure(String name) {
        this.name = name;
    }

    protected void setPoints(Point[] points) {
        this.points = points;
    }

    protected void setSegments(Segment[] segments) {
        this.segments = segments;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    public boolean isCorrect() {
        for (Segment i : this.segments) {
            if (i.getLength() == 0) {
                System.out.println("Dwa punkty są identyczne, to nie jest " + this.name);
                return false;
            }
        }
        return true;
    }

    public Segment[] getSegments() {
        return segments;
    }

    public Point[] getPoints() {
        return points;
    }


}
