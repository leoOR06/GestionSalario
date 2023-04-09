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
public class Administrativo extends Empleado {

    public int categoria;

    public Administrativo(int id, String nombre, int hijos, int antiguedad
            , int categoria) {
        super(id, nombre, hijos, antiguedad);
        this.categoria = categoria;
    }

    public int sueldoCategoria(int categoria) {
        int scategoria;
        switch (categoria) {
            case 0:
                scategoria = 5000;
                break;
            case 1:
                scategoria = 7000;
                break;
            case 2:
                scategoria = 9000;
                break;
            case 3:
                scategoria = 15000;
                break;
            case 4: 
                scategoria = 20000;
                break;
            default:
                scategoria = 0;

        }
       return scategoria;
    }

    @Override
    public double calcularSueldo() {
        double sueldo_neto;
        int remunerativos;
        int salario_familiar;
        double descuentos;

        remunerativos = sueldo_base + (antiguedad * 2000) + sueldoCategoria(categoria);
        salario_familiar = hijos * 3000;
        descuentos = 0.15 * remunerativos;
        sueldo_neto= remunerativos + salario_familiar - descuentos;

        return sueldo_neto;
    }

}
