package com.epam.matrixmultiplier;


import java.util.Random;

public class Matrix implements Multiplier {

    private int[][] values;
    private int rowNumber;
    private int columnNumber;

    public Matrix(int[][] values) {
        this.rowNumber = values.length;
        this.columnNumber = values[0].length;
        this.values = values;
    }

    public Matrix(int rowNumber, int columnNumber) {
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
        this.values = new int[rowNumber][columnNumber];
        generateRandomMatrixArray(rowNumber, columnNumber);
    }

    private static final int MATRIX_ELEMENT_MAX_VALUE = 100;

    private void generateRandomMatrixArray(int rowNumber, int columnNumber) {
        Random rand = new Random();
        for (int row = 0; row < rowNumber; row++) {
            for (int column = 0; column < columnNumber; column++) {
                values[row][column] = rand.nextInt(MATRIX_ELEMENT_MAX_VALUE + 1);
            }
        }

    }


    public Matrix multiply(Matrix matrix) {

        int[][] multiplicationResult = new int[this.rowNumber][matrix.getColumnNumber()];
        for (int row = 0; row < this.rowNumber; row++) {
            for (int column = 0; column < this.columnNumber; column++) {
                for (int k = 0; k < this.getColumnNumber(); k++) {
                    multiplicationResult[row][column] += this.values[row][k] * matrix.getElementFromArray(k, column);
                }
            }
        }
        return new Matrix(multiplicationResult);
    }


    public int getRowNumber() {
        return rowNumber;
    }

    public int getColumnNumber() {
        return columnNumber;
    }

    public int getElementFromArray(int row, int column) {
        return values[row][column];
    }
}
