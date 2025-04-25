/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labp1_1_rodrigomondragon;
import java.util.Scanner;

/**
 *
 * @author HP 15DA0086OD
 */
public class Labp1_1_RodrigoMondragon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int respuesta= -1;
        Scanner read = new Scanner(System.in);
        while(respuesta != 0){
            System.out.println("Menu Principal");
            System.out.println("Opcion 1. Mensaje");
            System.out.println("Opcion 2. Calculadora");
            System.out.println("Opcion 3. Edades");
            
            respuesta = read.nextInt();
            
            if(respuesta == 1){
                System.out.println("Hola soy yo");
                
                //opcion 2: Calculadora
            } else if(respuesta == 2){
                System.out.println("Ingrese numero uno: ");
                int num1 = read.nextInt();
                System.out.println("Ingrese numero dos: ");
                int num2 = read.nextInt();
                int resultado = num1*num2;
                System.out.println("Resultado: "+resultado);
                
                //Opcion 3
            } else if(respuesta ==3){
                System.out.println("Ingrese su edad: ");
                int edad = read.nextInt();
                
                if (edad >= 18){
                    System.out.println("Usted es un mayor");
                }else{
                    System.out.println("Usted es un menor");
                }
                        
            
            }
        }  
            
    }
    
}
