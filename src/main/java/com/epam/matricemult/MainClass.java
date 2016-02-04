package com.epam.matricemult;

/**
 * Created by Kairat Dos on 02/02/2016.
 */
public class MainClass {
    /*
    Input example: 0,1,2;3,4,5;6,7,8; 8,7,6;5,4,3;2,1,1;

    0,1,2;3,4,5;6,7,8; correspinds to -> 0 1 2
                                         3 4 5
                                         6 7 8
     Kolichestvo stolbcov pervoy matrcici doljno bit ravno kolichestvu strok vtoroy
    */
    public static void main(String[] args) {
        System.out.println("Matrix multiplier started");
        if(args[0].split(";")[0].split(",")!=args[1].split(";")){  //Proveryaem chto Kolichestvo stolbcov pervoy matrcici ravno kolichestvu strok vtoroy
            System.out.println("Kolichestvo stolbcov pervoy matrcici doljno bit ravno kolichestvu strok vtoroy!!!");
        return;
        }

        for(String arg:args){                       //Proveryaem format matrici(t.e kolichestvo elememntov v kajdoy stroke doljno odinakovoe)
            for (int i=0;i<arg.split(";").length;i++){
                if(arg.split(";")[0]!=arg.split(";")[i]){
                    System.out.println("Nepravilniy format matrici!");
                    return;
                }
            }
        }

        Matrix m1=new Matrix(args[0]);
        Matrix m2=new Matrix(args[1]);
        Matrix resultMatr=new Matrix(Multiplier.multiply(m1,m2));

    }
}
