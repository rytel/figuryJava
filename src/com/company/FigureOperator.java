package com.company;

import java.util.Scanner;

public class FigureOperator {
    public static void createFigure() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj nazwę figury: prostokąt, trójkąt, koło");
        String figureName = scanner.nextLine();

        System.out.println("pole czy obwód?");
        String areaOrPerimeter = scanner.nextLine();

        Figure figure;

        if (figureName.equals("trójkąt")) {
            System.out.println("Podaj współrzędne rogów x1 y1 x2 y2 x3 y3: ");

            figure = new Triangle(new Point(scanner.nextDouble(), scanner.nextDouble()),
                    new Point(scanner.nextDouble(), scanner.nextDouble()),
                    new Point(scanner.nextDouble(), scanner.nextDouble()));
            figureCalculations(figure, areaOrPerimeter);

        } else if (figureName.equals("prostokąt")) {
            System.out.println("Podaj współrzędne rogów we właściwej kolejności x1 y1 x2 y2 x3 y3 x4 y4: ");

            figure = new Rectangle(new Point(scanner.nextDouble(), scanner.nextDouble()),
                    new Point(scanner.nextDouble(), scanner.nextDouble()),
                    new Point(scanner.nextDouble(), scanner.nextDouble()),
                    new Point(scanner.nextDouble(), scanner.nextDouble()));
            figureCalculations(figure, areaOrPerimeter);

        } else if (figureName.equals("koło")) {
            System.out.println("Podaj współrzędne środka koła oraz współrzędne punktu znajdującego sie na krawędzi koła x1 y1 x2 y2: ");

            figure = new Circle(new Point(scanner.nextDouble(), scanner.nextDouble()),
                    new Point(scanner.nextDouble(), scanner.nextDouble()));
            figureCalculations(figure, areaOrPerimeter);

        } else {
            System.out.println("Podano złą nazwę figury");
        }
    }

    public static void figureCalculations(Figure figure, String areaOrPerimeter) {
        if (!figure.isCorrect()) {
            return;
        }
        if (areaOrPerimeter.equals("pole")) {
            figure.showArea();
        } else if (areaOrPerimeter.equals("obwód")) {
            figure.showParimeter();
        } else {
            System.out.println("błędnie wpisano pole/obwód");
        }
    }
}
