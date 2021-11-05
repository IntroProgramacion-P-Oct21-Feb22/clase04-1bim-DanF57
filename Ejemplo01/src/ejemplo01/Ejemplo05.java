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
public class Ejemplo05 {
    public static void main(String[] args) {
        // Secuencia de escape \n ->salto y \t -> tab
        String nombreEstudiante = "Daniel";
        String apellidoEstudiante = "Flores";
        int nacimiento = 2002;
        
        System.out.println(nombreEstudiante+"\n\n"+apellidoEstudiante+"\n"+
                "\n"+ nacimiento+"\n");   
        System.out.println(nombreEstudiante+"\t\t"+apellidoEstudiante+"\t"+
                nacimiento);   
    }
}
