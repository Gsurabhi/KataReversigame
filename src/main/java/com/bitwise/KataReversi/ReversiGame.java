package com.bitwise.KataReversi;



/**
 * Created by surabhig on 7/22/2016.
 */
public class ReversiGame {

    private String[][] array= new String[10][];
    private Integer[][] whiteCoinAtXY=new Integer[8][2];
    private int countWhiteCoinsNearby=0;
    private Direction inDirection;
    private int i,j;
    private String[][] output=new String[10][];


    public boolean newOutput(){

//        for(int i=0;i<8;i++) {
//            for (int j = 0; j < 8; j++) {
//                System.out.print("\t" + array[i][j]);
//            }
//            System.out.print("\n");
//        }
        for (i = 0; i < 8; i++)
        {
            for (j = 0; j < 8; j++)
            {
                if (array[i][j].equals(output[i][j]))
                {
                    return true;

                }
            }
        }

        return false;
    }


    public void scan(int i, int j) {
        if (isEnemyNearby("B", i, j)) {
            addPossibleMove(i, j);
            countWhiteCoinsNearby = 0;
        }
    }

    public void addPossibleMove(int i, int j){
        for(int m=0;m<this.countWhiteCoinsNearby;m++){
            inDirection.getDirection(i,j,this.whiteCoinAtXY[m][0],this.whiteCoinAtXY[m][1]);
            if(inDirection.isBlackCoinInDirection(this.whiteCoinAtXY[m][0],this.whiteCoinAtXY[m][1])){
                this.array[i][j]="1";
            }
        }
        //newOutput();
    }

    public boolean isEnemyNearby(String WorB,int line,int column){
        countEnemyNearby(line,column);
        if(this.countWhiteCoinsNearby>0)
            return true;
        return false;
    }

    public void countEnemyNearby(int line,int column){
        for(int i=-1;i<2;i++){
            for(int j=-1;j<2;j++){
                if(array[line+i][column+j].equals("W")){
                    this.whiteCoinAtXY[this.countWhiteCoinsNearby][0]=line+i;
                    this.whiteCoinAtXY[this.countWhiteCoinsNearby][1]=column+j;
                    this.countWhiteCoinsNearby++;
                }
            }
        }
    }


    public  boolean printLegalMoves(String[][]input_array,String[][]output_array) {
        inDirection= new Direction(input_array);
        array=input_array;
        output=output_array;
        for (i = 1; i < 7; i++)
        {
            for (j = 1; j < 7; j++)
            {
                if (array[i][j].equals("0"))
                {
                    this.scan(i, j);

                }
            }
        }

        return newOutput();

    }


}