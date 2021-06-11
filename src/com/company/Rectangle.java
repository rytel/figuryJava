package com.company;

public class Rectangle extends Figure {
    private Point[] points = new Point[4];
    private Segment[] segments = new Segment[4];

    public Rectangle(Point point1, Point point2, Point point3, Point point4) {
        points[0] = point1;
        points[1] = point2;
        points[2] = point3;
        points[3] = point4;
        setSegments();
        super.setName("prostokąt");
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
//sprawdzenie czy sąsiadujące boki są prostopadłe czyli czy figura jest prostokątem
        for (int i = 0; i < 4; i++) {
            if ((points[i].getY() - points[(i + 1) % 4].getY()) / (points[i].getX() - points[(i + 1) % 4].getX()) *
                            (points[(i + 1) % 4].getY() - points[(i + 2) % 4].getY()) / (points[(i + 1) % 4].getX() - points[(i + 2) % 4].getX()) != -1
            ) {
                System.out.println("to nie jest prostokąt");
                return false;
            }
        }
        return super.isCorrect();
    }
}

