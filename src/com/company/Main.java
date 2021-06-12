package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            Figure figure;

            System.out.println("podaj nazwę figury: kwadrat, trójkąt, koło");
            String figureName = scanner.nextLine();

            System.out.println("pole czy obwód?");
            String areaOrPerimeter = scanner.nextLine();

            if (figureName.equals("trójkąt")) {
                figure = FigureController.createTriangle();

            } else if (figureName.equals("kwadrat")) {
                figure = FigureController.createSquare();

            } else if (figureName.equals("koło")) {
                figure = FigureController.createCircle();

            } else {
                System.out.println("Podano złą nazwę figury");
            }
        }
    }
}
