/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalcularSalario;

/**
 *
 * @author Leonardo Olvera <UMSNH>
 */
public abstract class Empleado {

    public int id;
    public String nombre;
    public int hijos;
    public int antiguedad;
    public final int sueldo_base = 40000;

    public Empleado(int id, String nombre, int hijos, int antiguedad) {

        this.id = id;
        this.nombre = nombre;
        this.hijos = hijos;
        this.antiguedad = antiguedad;

    }

    
    public abstract double calcularSueldo();
    
}
