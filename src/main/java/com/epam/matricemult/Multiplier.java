package com.epam.matricemult;

/**
 * Created by Kairat Dos on 02/02/2016.
 */
public class Multiplier {

/*
Method dlya umnojenia matric
*/
    public static int[][] multiply(Matrix m1, Matrix m2) {

        int[][] multiplicationResult=new int [m1.getRowNumber()][m2.getColumnNumber()];
        for(int row=0;row<m1.getRowNumber();row++){
           for(int column=0;column<m2.getColumnNumber();column++){
               for(int k=0;k<m1.getColumnNumber();k++) {
                   multiplicationResult[row][column]+= m1.getElementFromArray(row, k)*m2.getElementFromArray(k,column);
               }
           }
        }
        return multiplicationResult;
    }
}
