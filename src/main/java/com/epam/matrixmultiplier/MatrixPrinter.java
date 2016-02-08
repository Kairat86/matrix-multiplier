package com.epam.matrixmultiplier;

public class MatrixPrinter {

    public static void printMatrixElements(Matrix matrix) {
        for (int row = 0; row < matrix.getRowNumber(); row++) {
            for (int column = 0; column < matrix.getColumnNumber(); column++) {
                System.out.print(matrix.getElementFromArray(row, column) + " ");
            }
            System.out.println();
        }
    }
}
