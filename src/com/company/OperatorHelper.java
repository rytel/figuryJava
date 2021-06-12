package com.company;

import java.util.List;

public class OperatorHelper {

    private static final List<Operator> availableOperators = List.of(new CircleOperator(), new SquareOperator(), new TriangleOperator());

    public static double calcPerimeter(Figure figure) {
        Operator operator = findOperatorByFigure(figure);
        return operator.calcPerimeter(figure);
    }

    public static double calcArea(Figure figure) {
        Operator operator = findOperatorByFigure(figure);
        return operator.calcArea(figure);
    }

    private static Operator findOperatorByFigure(Figure figure) {
        return availableOperators.stream().filter(op -> op.getFigureType().equals(figure.getClass())).findAny().orElseThrow(() -> new IllegalArgumentException("Operator dla danej figury nie istnieje"));
    }
}
