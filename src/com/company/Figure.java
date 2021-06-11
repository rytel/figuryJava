package com.company;

public abstract class Figure {
    private String name;
    private Point[] points;
    private Segment[] segments;
    private double area, perimeter;

    public void showParimeter() {
        if (isCorrect()) {
            System.out.println("Obwód figury " + this.name + " wynosi: " + this.perimeter);
        }
    }

    public void showArea() {
        if (isCorrect()) {
            System.out.println("Pole figury " + this.name + " wynosi: " + this.area);
        }
    }

    public boolean isCorrect() {
        for (Segment i : this.segments) {
            if (i.getLength() == 0) {
                System.out.println("Dwa punkty są identyczne, to nie jest " + this.name);
                return false;
            }
        }
        return true;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }

    public void setSegments(Segment[] segments) {
        this.segments = segments;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
