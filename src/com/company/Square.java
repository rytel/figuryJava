package com.company;

public class Square extends Figure {
    private Point[] points = new Point[4];
    private Segment[] segments = new Segment[4];

    public Square(Point point1, Point point2, Point point3, Point point4) {
        points[0] = point1;
        points[1] = point2;
        points[2] = point3;
        points[3] = point4;
        setSegments();
        super.setName("kwadrat");
        super.setPoints(this.points);
        super.setSegments(this.segments);
    }

    public void setArea() {
        setPerimeter();
        super.setArea(this.segments[0].getLength() * this.segments[1].getLength());
    }

    public void setPerimeter() {
        super.setPerimeter(this.segments[0].getLength() +
                this.segments[1].getLength() +
                this.segments[2].getLength() +
                this.segments[3].getLength());
    }

    public void setSegments() {
        for (int i = 0; i < 4; i++) {
            this.segments[i] = new Segment(this.points[i], this.points[(i + 1) % 4]);
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
        Segment[] diagonal = new Segment[2];
        diagonal[0] = new Segment(points[0], points[2]);
        diagonal[1] = new Segment(points[1], points[3]);
        if (diagonal[0].getLength() != diagonal[1].getLength()) {
            System.out.println("To nie jest kwadrat");
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if (this.segments[i % 4].getLength() != this.segments[(1 + i) % 4].getLength()) {
                System.out.println("To nie jest kwadrat");
                return false;
            }
        }
        return super.isCorrect();
    }
}

