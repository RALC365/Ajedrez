
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RALC
 */
public class Caballo extends Piezas{
    String figura;

    public Caballo() {
    }

    public Caballo(boolean color) {
        super(color);
        if (color) {
            figura = "♘";
        }else{
            figura = "♞";
        }
    }

    @Override
    public String toString() {
        return figura;
    }

    @Override
    public int[][] movimiento(int x, int y, Piezas[][] tablero) {
        int [][] pos = new int [8][2];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 2; j++) {
                pos[i][j] = -1;
            }
        }
        
        
        //caso 1
        if ((x-2>=0) && (y+1 <8)) {
            if (tablero[x-2][y+1] == null) {
                pos[0][0] = x-2;
                pos[0][1] = y+1;
            }else if(tablero[x-2][y+1].getColor() != this.color){
                pos[0][0] = x-2;
                pos[0][1] = y+1;
            }
        }
        //caso 2
        if ((x+2<8) && (y+1 <8)) {
            if (tablero[x+2][y+1] == null ) {
                pos[1][0] = x+2;
                pos[1][1] = y+1;

            }else if(tablero[x+2][y+1].getColor() != this.color){
                pos[1][0] = x+2;
                pos[1][1] = y+1;
            }
        }
        //caso 3
        if ((x+1<8) && (y+2 <8)) {
            if (tablero[x+1][y+2] == null) {
                pos[2][0] = x+1;
                pos[2][1] = y+2;
            }else if(tablero[x+1][y+2].getColor() != this.color){
                pos[2][0] = x+1;
                pos[2][1] = y+2;
            }
        }
        //caso 4
        if ((x-1>=0) && (y+2 <8)) {
            if (tablero[x-1][y+2] == null) {
                pos[3][0] = x-1;
                pos[3][1] = y+2;
            }else if(tablero[x-1][y+2].getColor() != this.color){
                pos[3][0] = x-1;
                pos[3][1] = y+2;
            }
        }
        //caso 5
        if ((x+2<8) && (y-1 >=0)) {
            if (tablero[x+2][y-1] == null) {
                pos[4][0] = x+2;
                pos[4][1] = y-1;
            }else if(tablero[x+2][y-1].getColor() != this.color){
                pos[4][0] = x+2;
                pos[4][1] = y-1;
            }
        }
        //caso 6
        if ((x-2>=0) && (y-1 >=0)) {
            if (tablero[x-2][y-1] == null) {
                pos[5][0] = x-2;
                pos[5][1] = y-1;
            }else if(tablero[x-2][y-1].getColor() != this.color){
                pos[5][0] = x-2;
                pos[5][1] = y-1;
            }
        }
        //caso 7
        if ((x+1 <8) && (y-2 >= 0)) {
            if (tablero[x+1][y-2] == null) {
                pos[6][0] = x+1;
                pos[6][1] = y-2;
            }else if(tablero[x+1][y-2].getColor() != this.color){
                pos[6][0] = x+1;
                pos[6][1] = y-2;
            }
        }
        //caso 8
        if ((x-1>=0) && (y-2>=0)) {
            if (tablero[x-1][y-2] == null) {
                pos[7][0] = x-1;
                pos[7][1] = y-2;
            }else if(tablero[x-1][y-2].getColor() != this.color){
                pos[7][0] = x-1;
                pos[7][1] = y-2;
            }
        }
        
        return pos;
    }

  


    



    
    
}
