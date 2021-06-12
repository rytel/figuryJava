package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            Figure figure = null;

            System.out.println("podaj nazwę figury: kwadrat, trójkąt, koło");
            String figureName = scanner.next();

            System.out.println("pole czy obwód?");
            String areaOrPerimeter = scanner.next();

            if (figureName.equals("trójkąt")) {

                figure = FigureController.createTriangle();

            } else if (figureName.equals("kwadrat")) {
                figure = FigureController.createSquare();

            } else if (figureName.equals("koło")) {
                figure = FigureController.createCircle();

            } else {
                System.out.println("Podano złą nazwę figury");
            }

            if (figure.isCorrect()) {
                if (areaOrPerimeter.equals("pole")) {
                    System.out.println("Pole figury " + figure.getName() + " wynosi " + figure.getArea());
                } else if (areaOrPerimeter.equals("obwód")) {
                    System.out.println("Obwód figury " + figure.getName() + " wynosi " + figure.getPerimeter());
                } else {
                    System.out.println("Nie wpisano poprawnie obwód/pole");
                }
            }
        }
    }
}
