package com.epam.matrixmultiplier;


public class MainClass {


    public static void main(String[] args) {

        Matrix m1 = new Matrix(2, 2);
        Matrix m2 = new Matrix(2, 2);
        Matrix resultMatr = m1.multiply(m2);

        MatrixPrinter.printMatrixElements(m1);
        MatrixPrinter.printMatrixElements(m2);
        MatrixPrinter.printMatrixElements(resultMatr);
    }
}
