package com.company;

import java.util.Scanner;

public class FigureCreator {

    public static Figure getFigure(String name) {
        switch (name) {
            case "trójkąt":
                return createTriangle();
            case "kwadrat":
                return createSquare();
            case "koło":
                return createCircle();
        }
        throw new IllegalArgumentException("Taka nazwa figury nie istnieje");
    }

    public static Figure createSquare() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj współrzędne rogów we właściwej kolejności x1 y1 x2 y2 x3 y3 x4 y4: ");
        try {
            return new Square(new Point(scanner.nextDouble(), scanner.nextDouble()),
                    new Point(scanner.nextDouble(), scanner.nextDouble()),
                    new Point(scanner.nextDouble(), scanner.nextDouble()),
                    new Point(scanner.nextDouble(), scanner.nextDouble()));
        } catch (Exception e) {
            throw new IllegalArgumentException("Niepoprawne dane (współrzędna)");
        }
    }

    public static Figure createTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj współrzędne rogów x1 y1 x2 y2 x3 y3: ");
        try {
            return new Triangle(new Point(scanner.nextDouble(), scanner.nextDouble()),
                    new Point(scanner.nextDouble(), scanner.nextDouble()),
                    new Point(scanner.nextDouble(), scanner.nextDouble()));
        } catch (Exception e) {
            throw new IllegalArgumentException("Niepoprawne dane (współrzędna)");
        }
    }

    public static Figure createCircle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj współrzędne środka koła oraz współrzędne punktu znajdującego sie na krawędzi koła x1 y1 x2 y2: ");
        try {
            return new Circle(new Point(scanner.nextDouble(), scanner.nextDouble()),
                    new Point(scanner.nextDouble(), scanner.nextDouble()));
        } catch (Exception e) {
            throw new IllegalArgumentException("Niepoprawne dane (współrzędna)");
        }
    }
}


