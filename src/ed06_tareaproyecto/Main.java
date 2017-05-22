/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed06_tareaproyecto;

/**
 *
 * @author ED06
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado uno = new Empleado("1245678M","Perico de los Palotes");
        
        uno.direccion="C/del Pez,6";
        uno.numHijos=3;
        System.out.println("DNI: "+uno.dni);
        System.out.println("Nombre: "+uno.nombre);
        System.out.println("Cargo: "+uno.cargo);
        System.out.println("Número de hijos: "+uno.numHijos);
        System.out.println("Sueldo: "+uno.calcula_sueldo(1200););
    }
    
}
