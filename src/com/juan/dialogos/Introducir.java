package com.juan.dialogos;

import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Introducir {

    /**
     * Introducir nombre:
     *
     * @param mensaxe Texto que se pondrá en una ventana.
     * @return nombre
     */
    public static String introducirNombre(String mensaxe) {
        String nombre;
        nombre=JOptionPane.showInputDialog(mensaxe);
        return nombre;
    }

    /**
     * Introducir numero de tipo float
     *
     * @param mensaxe Texto que se pondrá en una ventana.
     * @return numero de tipo float.
     */
    public static float introducirNumFloat(String mensaxe) {
        float num=Float.parseFloat(JOptionPane.showInputDialog(mensaxe));
        return num;

    }

    /**
     * Introducir numero de tipo int
     *
     * @param mensaxe Texto que se pondrá en una ventana.
     * @return numero de tipo int
     */
    public static int introducirNumInt(String mensaxe) {
        int num=Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
        return num;
    }

    /**
     * Mostrar mensaje
     *
     * @param mensaxe de tipo String
     */
    public static void mostrarMensaxe(String mensaxe) {
        JOptionPane.showConfirmDialog(null,mensaxe);
    }

}
