package com.company;

import java.util.Scanner;

public class FigureController {
    public static void createFigure() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj nazwę figury: kwadrat, trójkąt, koło");
        String figureName = scanner.nextLine();
        System.out.println("pole czy obwód?");
        String areaOrPerimeter = scanner.nextLine();
    }
    public static Figure createSquare(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj współrzędne rogów we właściwej kolejności x1 y1 x2 y2 x3 y3 x4 y4: ");
        try {
            return new Square(new Point(scanner.nextDouble(), scanner.nextDouble()),
                    new Point(scanner.nextDouble(), scanner.nextDouble()),
                    new Point(scanner.nextDouble(), scanner.nextDouble()),
                    new Point(scanner.nextDouble(), scanner.nextDouble()));
        } catch (Exception exception) {
            System.out.println("błędne dane");
            return null;
        }
    }
    public static Figure createTriangle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj współrzędne rogów x1 y1 x2 y2 x3 y3: ");
        try {
            return new Triangle(new Point(scanner.nextDouble(), scanner.nextDouble()),
                    new Point(scanner.nextDouble(), scanner.nextDouble()),
                    new Point(scanner.nextDouble(), scanner.nextDouble()));
        } catch (Exception exception) {
            System.out.println("błędne dane");
            return null;
        }
    }
    public static Figure createCircle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj współrzędne środka koła oraz współrzędne punktu znajdującego sie na krawędzi koła x1 y1 x2 y2: ");
        try {
            return new Circle(new Point(scanner.nextDouble(), scanner.nextDouble()),
                    new Point(scanner.nextDouble(), scanner.nextDouble()));
        } catch (Exception exception) {
            System.out.println("błędne dane");
            return null;
        }
    }
    public static void figureCalculations(Figure figure, String areaOrPerimeter) {
        if (!figure.isCorrect()) {
            return;
        }
        if (areaOrPerimeter.equals("pole")) {
            figure.getArea();
        } else if (areaOrPerimeter.equals("obwód")) {
            figure.getPerimeter();
        } else {
            System.out.println("błędnie wpisano pole/obwód");
        }
    }
}
