package com.juan.dialogos;

import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Devolver {

    /**
     * Mostar nombre:
     *
     * Muestra en pantalla un texto
     *
     * @param nombre tipo String
     */
    public static void mostrarNombre(String nombre) {
        JOptionPane.showConfirmDialog(null,nombre);

    }

    /**
     * Mostrar float:
     *
     * Muestra en pantalla un numero de tipo float
     *
     * @param num de tipo float
     */
    public static void mostrarFloat(float num) {
        JOptionPane.showConfirmDialog(null,num);

    }

    /**
     * Mostrar int:
     *
     * Muestra en pantalla un numero de tipo int
     *
     * @param num de tipo int
     */
    public static void mostrarInt(int num) {
        int confirm;
        confirm=JOptionPane.showConfirmDialog(null,num);
        if(confirm==0){
            JOptionPane.showMessageDialog(null,"Aceptaste");
            
        }
        else if(confirm==1){
            JOptionPane.showMessageDialog(null,"Negaste");
        }
        else{
            JOptionPane.showMessageDialog(null,"Cancelaste");
        }
    }

}
