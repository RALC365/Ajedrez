
import java.util.ArrayList;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RALC
 */
public abstract class  Piezas {
    public boolean color;//true--blancas; false --negras


    public Piezas() {
    }

    public Piezas(boolean color) {
        this.color = color;
       
    }

    public boolean getColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Piezas";
    }
    
    public abstract int [][] movimiento(int x, int y, Piezas[][] tablero);
}
