package com.company;

public class Triangle extends Figure {
    private Point[] points = new Point[3];
    private Segment[] segments = new Segment[3];

    public Triangle(Point point1, Point point2, Point point3) {
        points[0] = point1;
        points[1] = point2;
        points[2] = point3;
        setSegments();
        super.setName("trojkat");
        super.setPoints(this.points);
        super.setSegments(this.segments);
    }

    public void setArea() {
        setPerimeter();
        super.setArea(Math.sqrt(super.getPerimeter() / 2 *
                (super.getPerimeter() / 2 - this.segments[0].getLength()) *
                (super.getPerimeter() / 2 - this.segments[1].getLength()) *
                (super.getPerimeter() / 2 - this.segments[2].getLength())));
    }

    public void setPerimeter() {
        super.setPerimeter(this.segments[0].getLength() +
                this.segments[1].getLength() +
                this.segments[2].getLength());
    }

    public void setSegments() {
        for(int i=0; i<3; i++){
            this.segments[i] = new Segment(this.points[i], this.points[(i+1)%3]);
        }
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

    @Override
    public boolean isCorrect() {
        for (int i = 0; i < 3; i++) {
            if (this.segments[i % 3].getLength() + this.segments[(1 + i) % 3].getLength() == this.segments[(2 + i) % 3].getLength()) {
                System.out.println("Punkty są współliniowe");
                return false;
            }
        }
        return super.isCorrect();
    }
}
