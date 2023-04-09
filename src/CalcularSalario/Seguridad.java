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
public class Seguridad extends Empleado {

    public Seguridad(int id, String nombre, int hijos, int antiguedad) {
        super(id, nombre, hijos, antiguedad);
    }

    @Override
    public double calcularSueldo() {
        double sueldo_neto;
        int remunerativos;
        int salario_familiar;
        double descuentos;

        salario_familiar = hijos * 3000;
        remunerativos = sueldo_base + 30000 + (antiguedad * 2000);
        descuentos = 0.15 * remunerativos;
        
        sueldo_neto = remunerativos + salario_familiar - descuentos;

        return sueldo_neto;

    }

    //public boolean tarea_riesgosa = true;
}
