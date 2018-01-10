/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Personal
 */
public class Banco {

    static ArrayList<Cuenta> listaCuenta = new ArrayList<Cuenta>();

    public static void agregar(Cuenta cuenta) {
        listaCuenta.add(cuenta);
    }
    
    public static void grabar() {
        PrintWriter pw = null;
        try {
            FileWriter fw = new FileWriter("C://Users//Personal//Documents//NetBeansProjects//Examen1_JorgePucha/Banco.txt", true);
            pw = new PrintWriter(fw);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        for (Cuenta cuenta : listaCuenta) {
            String linea = "";
            if (cuenta instanceof Cuenta) {
//                linea="Circulo"+";"+((Circulo) figura).getPunto().toString();
            }
            pw.println(linea);
        }
        pw.close();
    }
    
    public static Cuenta buscarCuenta() {
        String nombre = (JOptionPane.showInputDialog(null, "Ingrese nombre", "Verificar Cuenta", JOptionPane.INFORMATION_MESSAGE));
        CuentaAhorro cuentaAH = new CuentaAhorro(nombre);
        Cuenta c=(Cuenta)cuentaAH;
        if (listaCuenta.contains(c)) {
            return listaCuenta.get(listaCuenta.indexOf(c));
        }
        return null;
    }
    public static Cuenta buscarCuentaH() {
        String nombre = (JOptionPane.showInputDialog(null, "Ingrese nombre", "Verificar Cuenta", JOptionPane.INFORMATION_MESSAGE));
        CuentaHipoteca cuentaAH = new CuentaHipoteca(nombre);
        Cuenta c=(Cuenta)cuentaAH;
        if (listaCuenta.contains(c)) {
            return listaCuenta.get(listaCuenta.indexOf(c));
        }
        return null;
    }
}

