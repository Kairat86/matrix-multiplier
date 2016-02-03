package com.epam.matricemult;

/**
 * Created by Kairat Dos on 02/02/2016.
 */
public class Matrice {

    private int[][] matriceArray;
    private int rowNumber;
    private int columnUmber;

    public Matrice(String data){

        constructMatriceArray(data);
    }

    public Matrice(int[][] arrayForMatr){
        this.matriceArray=arrayForMatr;
    }

    private void constructMatriceArray(String data) {
         rowNumber=data.split(";").length;  //getting number of rows
         columnUmber=data.split(";")[0].split(",").length; //getting number of columns for matriceArray
        matriceArray=new int[columnUmber][rowNumber]; //initializing the capacity of an array
        for(int row=0;row<rowNumber;row++){
            for(int column=0;column<columnUmber;column++){
                matriceArray[row][column]=Integer.parseInt(data.split(";")[row].split(",")[column]);
            }
        }
    }

    public int getRowNumber(){
        return rowNumber;
    }

    public int getColumnNumber(){
        return columnUmber;
    }
}
