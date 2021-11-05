/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo01;

/**
 *
 * @author reroes
 */
public class Ejemplo06 {
    public static void main(String[] args) {
        // Uso de printf
        // f: formato
        
        String nombreEstudiante = "Daniel";
        String apellidoEstudiante = "Flores";
        int nacimiento = 2002;
        int estatura = 180;
        
        // System.out.println(nombreEstudiante+" "+apellidoEstudiante+ " "+ nacimiento);
        // En printf; 
        // usamos %s para reemplazar las cadenas, enteros, decimales
        // usamos %d para reemplazar los valores enteros
        // usamos %f para reemplazar los valore decimales
        // usamos \n para salto de linea
        System.out.printf("%s\n%s\n%d\n%d\n", 
                nombreEstudiante,
                apellidoEstudiante,
                nacimiento,
                estatura);
    }
}
