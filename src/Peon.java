
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
public class Peon extends Piezas {

    String figura;

    public Peon() {
    }

    public Peon(boolean color) {
        super(color);
        if (color) {
            figura = "♙";
        } else {
            figura = "♟";
        }
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    @Override
    public String toString() {
        return figura;
    }

    @Override
    public int[][] movimiento(int x, int y, Piezas[][] tablero) {
        int[][] pos = new int[1][12];
        for (int i = 0; i < 12; i++) {
            pos[0][i] = -1;
        }
        int cont = 0;
        if (tablero[x][y].getColor()) {
            if (x == 6) {
                if (tablero[x - 1][y] == null) {
                    pos[0][cont] = x - 1;
                    pos[0][cont + 1] = y;
                    cont += 2;
                    if (tablero[x - 2][y] == null) {
                        pos[0][cont] = x - 2;
                        pos[0][cont + 1] = y;
                        cont += 2;
                    }
                }
            } else {
                if (x - 1 >= 0) {
                    if (tablero[x - 1][y] == null) {
                        pos[0][cont] = x - 1;
                        pos[0][cont + 1] = y;
                        cont+=2;
                    }
                }
            }
            if ((y - 1 >= 0 && x - 1 >= 0) && (tablero[x - 1][y - 1] != null)) {
                if (tablero[x - 1][y - 1].getColor() != this.color) {
                    pos[0][cont] = x - 1;
                    pos[0][cont + 1] = y - 1;
                    cont+=2;
                }

            }
            if ((y + 1 < 8 && x - 1 >= 0) && (tablero[x - 1][y + 1] != null)) {
                if (tablero[x - 1][y + 1].getColor() != this.color) {
                    pos[0][cont] = x - 1;
                    pos[0][cont + 1] = y + 1;
                    cont+= 2;
                }
            }
            //peones negros
        } else {
            if (x == 1) {
                if (tablero[x + 1][y] == null) {
                    pos[0][cont] = x + 1;
                    pos[0][cont + 1] = y;
                    cont += 2;
                    if (tablero[x + 2][y] == null) {
                        pos[0][cont] = x + 2;
                        pos[0][cont + 1] = y;
                        cont += 2;
                    }
                }
            } else {
                if (x + 1 < 8) {
                    if (tablero[x + 1][y] == null) {
                        pos[0][cont] = x + 1;
                        pos[0][cont + 1] = y;
                        cont+=2;
                    }
                }
            }
            if ((y - 1 >= 0 && x + 1 < 8) && (tablero[x + 1][y - 1] != null)) {
                if (tablero[x + 1][y - 1].getColor() != this.color) {
                    pos[0][cont] = x + 1;
                    pos[0][cont + 1] = y - 1;
                    cont+=2;
                }

            }
            if ((y + 1 < 8 && x + 1 < 8) && (tablero[x + 1][y + 1] != null)) {
                if (tablero[x + 1][y + 1].getColor() != this.color) {
                    pos[0][cont] = x + 1;
                    pos[0][cont + 1] = y + 1;
                    cont+=2;
                }
            }
        }
        return pos;
    }

}
