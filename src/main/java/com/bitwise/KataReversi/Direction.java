package com.bitwise.KataReversi;

/**
 * Created by surabhig on 7/22/2016.
 */
public class Direction {

        String name="left";
        String[][] array= new String[10][];


        public Direction(String[][] array){
            this.array= array;
        }

        public boolean isBlackCoinInDirection(int x,int y){

            if(this.name.equals("right")){
                int k=y;
                int h=x;
                while(k<8){
                    k++;
                    return (array[x][k].equals("0"))
                            ||(array[x][k].equals("B"));


                }
            }

            if(this.name.equals("left")){
                int k=y;
                int h=x;
                while(k>0){
                    k--;
                    return(array[x][k].equals("0"))
                            ||(array[x][k].equals("B"));


                }
            }

            else if(this.name.equals("up")){
                int k=y;
                int h=x;
                while(h>0){
                    h--;
                    if(array[h][y].equals("0"))
                        return false;
                    else if(array[h][y].equals("B"))
                        return true;

                }
            }

            else if(this.name.equals("down")){
                int k=y;
                int h=x;
                while(h<8){
                    h++;
                    if(array[h][y].equals("0"))
                        return false;
                    else if(array[h][y].equals("B"))
                        return true;

                }
            }

            else if(this.name.equals("antislash_up")){
                int k=y;
                int h=x;
                while(h>0 || k>0){
                    k--;
                    h--;
                    if(array[h][k].equals("0"))
                        return false;
                    else if(array[h][k].equals("B"))
                        return true;

                }
            }

            else if(this.name.equals("antislash_down")){
                int k=y;
                int h=x;
                while(h<8 || k<8){
                    k++;
                    h++;
                    if(array[h][k].equals("0"))
                        return false;
                    else if(array[h][k].equals("B"))
                        return true;

                }
            }

            else if(this.name.equals("slash_down")){
                int k=y;
                int h=x;
                while(h<8 || k>0){
                    k--;
                    h++;
                    if(array[h][k].equals("0"))
                        return false;
                    else if(array[h][k].equals("B"))
                        return true;

                }
            }

            else if(this.name.equals("slash_up")){
                int k=y;
                int h=x;
                while(h>0 || k<8){
                    k++;
                    h--;
                    if(array[h][k].equals("0"))
                        return false;
                    else if(array[h][k].equals("B"))
                        return true;

                }
            }

            return false;
        }

        public void getDirection(int i,int j,int x, int y){
            if(i==x && y==j-1)
                this.name="left";
            else if(i==x && y==j+1)
                this.name="right";
            else if(x==i-1 && y==j)
                this.name="up";
            else if(x==i+1 && y==j)
                this.name="down";
            else if(x==i-1 && y==j-1)
                this.name="antislash_up";
            else if(x==i+1 && y==j+1)
                this.name="antislash_down";
            else if(x==i-1 && y==j+1)
                this.name="slash_up";
            else if(x==i+1 && y==j-1)
                this.name="slash_down";

        }
    }

