package com.company;

import java.util.Scanner;

public class FigureController {

    public static Figure createSquare(){
        System.out.println("Podaj współrzędne rogów we właściwej kolejności x1 y1 x2 y2 x3 y3 x4 y4: ");
        try {
            return new Square(new Point(validatedDouble(), validatedDouble()),
                    new Point(validatedDouble(), validatedDouble()),
                    new Point(validatedDouble(), validatedDouble()),
                    new Point(validatedDouble(), validatedDouble()));
        } catch (Exception exception) {
            System.out.println("błędne dane");
            return null;
        }
    }
    public static Figure createTriangle(){
        System.out.println("Podaj współrzędne rogów x1 y1 x2 y2 x3 y3: ");
        try {
            return new Triangle(new Point(validatedDouble(), validatedDouble()),
                    new Point(validatedDouble(), validatedDouble()),
                    new Point(validatedDouble(), validatedDouble()));
        } catch (Exception exception) {
            System.out.println("błędne dane");
            return null;
        }
    }
    public static Figure createCircle(){
        System.out.println("Podaj współrzędne środka koła oraz współrzędne punktu znajdującego sie na krawędzi koła x1 y1 x2 y2: ");
        try {
            return new Circle(new Point(validatedDouble(), validatedDouble()),
                    new Point(validatedDouble(), validatedDouble()));
        } catch (Exception exception) {
            System.out.println("błędne dane");
            return null;
        }
    }

    private static double validatedDouble() {
        Scanner scanner = new Scanner(System.in);
        while(true){
            try {
                return Double.parseDouble(scanner.next());
            } catch (NumberFormatException ignore) {
                System.out.println("Wpisano niewłaściwe dane");
            }
        }
    }
}
