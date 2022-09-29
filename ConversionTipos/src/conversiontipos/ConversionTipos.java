/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiontipos;

import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class ConversionTipos {

    /**
     * @param args the command line arguments
     */
    
     public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
       /* System.out.println("Introduzca un número entero:");
        String n = in.nextLine();
        int a = Integer.valueOf(n);
        System.out.println("El String es "+a);*/
        //Realmente son dos variables diferentes, no es una conversión de var.
        //la conversion es:
        
        System.out.println("String a entero \n\nIntroduzca un número entero:");
        int n = Integer.valueOf(in.nextLine());
        n+=2;
        
        System.out.println("Entero a String \n\nIntroduzca un número entero:");
        int a = in.nextInt();
        Integer.toString(a);// a ahora es un String
    }
    
}
