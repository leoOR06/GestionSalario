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
public class Profesional extends Empleado {

    public int titulo;

    public Profesional(int id, String nombre, int hijos, int antiguedad
          , int titulo) {
        super(id, nombre, hijos, antiguedad);
        this.titulo = titulo;
    }

    @Override
    public double calcularSueldo() {
        double sueldo_neto;
        int remunerativos;
        int salario_familiar;
        double descuentos;

        remunerativos = sueldo_base + (titulo * 20000) + (antiguedad * 2000);
        salario_familiar = hijos * 3000;
        descuentos = 0.15 * remunerativos;
        sueldo_neto = (remunerativos - descuentos) + salario_familiar ;
        return sueldo_neto;
    }

}
