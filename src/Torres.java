
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
public class Torres extends Piezas{
    String figura;

    public Torres() {
    }

    public Torres(boolean color) {
        super(color);
        if (color) {//true es blancas
            figura = "♖";
        }else{
            figura = "♜";
        }
    }

    @Override
    public String toString() {
        return figura;
        
    }

    @Override
    public int[][] movimiento(int x, int y, Piezas[][] tablero) {
        int cont = 0;
        int cont_e = 0;
        int [][] posciones = new int [4][16];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 16; j++) {
                posciones[i][j] = -1;
            }
        }
        for (int i = x-1; i >=0 ; i--) {
            if (tablero[i][y]== null || (tablero[i][y].getColor() != this.color && cont_e == 0)) {
                if (cont_e==0) {
                    posciones[0][cont] = i;
                    posciones[0][cont+1] = y;
                    cont += 2;
                }
                if (tablero[i][y] != null) {
                    if (tablero[i][y].getColor() != this.color) {
                    cont_e = 1;
                }
                }
                
            }else{
                break;
            }
        }
        cont =0;
        cont_e = 0;
        for (int i = x+1; i < 8; i++) {
            if (tablero[i][y]== null || (tablero[i][y].getColor() != this.color && cont_e == 0)) {
                if (cont_e==0) {
                    posciones[1][cont] = i;
                    posciones[1][cont+1] = y;
                    cont += 2;
                }
                if (tablero[i][y] != null) {
                    if (tablero[i][y].getColor() != this.color) {
                    cont_e = 1;
                }
                }
            }else{
                break;
            }
        }
        cont =0;
        cont_e = 0;
        for (int i = y-1; i >= 0; i--) {
            if (tablero[x][i]== null || (tablero[x][i].getColor() != this.color && cont_e == 0)) {
                if (cont_e==0) {
                    posciones[2][cont] = x;
                    posciones[2][cont+1] = i;
                    cont += 2;
                }
                if (tablero[x][i] != null) {
                    if (tablero[x][i].getColor() != this.color) {
                    cont_e = 1;
                }
                }
            }else{
                break;
            }
        }
        cont = 0;
        cont_e = 0;
        for (int i = y+1; i < 8; i++) {
            if (tablero[x][i]== null || (tablero[x][i].getColor() != this.color && cont_e == 0)) {
                if (cont_e==0) {
                    posciones[3][cont] = x;
                    posciones[3][cont+1] = i;
                    cont += 2;
                }
                if (tablero[x][i] != null) {
                    if (tablero[x][i].getColor() != this.color) {
                    cont_e = 1;
                }
                }
            }else{
                break;
            }
        }
        return posciones;
        
    }

 

  
    



  
    
}
