package com.epam.matrixmultiplier;


public class Matrix implements Multiplier {

    private int[][] values;
    private int rowNumber;
    private int columnNumber;

    public Matrix() {

    }

    public Matrix multiply(Matrix matrix) {
        //Some code
        return new Matrix();
    }



//    private void constructMatriceArray(String data) {
//        rowNumber = data.split(";").length;  //getting number of rows
//        columnNumber = data.split(";")[0].split(",").length; //getting number of columns for matriceArray
//        matriceArray = new int[columnNumber][rowNumber]; //initializing the capacity of an array
//        for (int row = 0; row < rowNumber; row++) {
//            for (int column = 0; column < columnNumber; column++) {
//                matriceArray[row][column] = Integer.parseInt(data.split(";")[row].split(",")[column]);
//            }
//        }
//    }

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
