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
        System.out.println("Podaj współrzędne rogów we właściwej kolejności x1 y1 x2 y2 x3 y3 x4 y4: ");

        return new Square(new Point(validatedDouble(), validatedDouble()),
                new Point(validatedDouble(), validatedDouble()),
                new Point(validatedDouble(), validatedDouble()),
                new Point(validatedDouble(), validatedDouble()));
    }

    public static Figure createTriangle() {
        System.out.println("Podaj współrzędne rogów x1 y1 x2 y2 x3 y3: ");
        return new Triangle(new Point(validatedDouble(), validatedDouble()),
                new Point(validatedDouble(), validatedDouble()),
                new Point(validatedDouble(), validatedDouble()));
    }

    public static Figure createCircle() {
        System.out.println("Podaj współrzędne środka koła oraz współrzędne punktu znajdującego sie na krawędzi koła x1 y1 x2 y2: ");
        return new Circle(new Point(validatedDouble(), validatedDouble()),
                new Point(validatedDouble(), validatedDouble()));
    }

    private static double validatedDouble() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                return Double.parseDouble(scanner.next());
            } catch (NumberFormatException ignore) {
                System.out.println("Wpisano niewłaściwe dane");
            }
        }
    }
}
