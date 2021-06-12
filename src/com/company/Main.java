package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("podaj nazwę figury: kwadrat, trójkąt, koło. 0 wyjście");
                String figureName = scanner.next();

                if (figureName.equals("0")) {
                    return;
                }
                System.out.println("pole czy obwód?");
                String areaOrPerimeter = scanner.next();

                Figure figure = FigureCreator.getFigure(figureName);

                if (figure.isCorrect()) {
                    if (areaOrPerimeter.equals("pole")) {
                        System.out.println("Pole figury " + figure.getName() + " wynosi " + OperatorHelper.calcArea(figure));
                    } else if (areaOrPerimeter.equals("obwód")) {
                        System.out.println("Obwód figury " + figure.getName() + " wynosi " + OperatorHelper.calcPerimeter(figure));
                    } else {
                        System.out.println("Nie wpisano poprawnie obwód/pole");
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
