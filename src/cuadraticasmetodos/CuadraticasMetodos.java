/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadraticasmetodos;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Alonso
 */
public class CuadraticasMetodos {
    
    public static double leer(){
        Scanner leer = new Scanner(System.in);
        double numero;
        try{
            System.out.println("Ingrese un número");
            numero = leer.nextDouble();
        } 
        catch(InputMismatchException e) {
            System.out.println("Ingrese un valor númerico");
            leer.nextLine();
            numero = leer.nextDouble();
        }
        return numero;
    }
    
    public static void cuadratica(double A, double B, double C){
        
        if(A == 0) {
            
            lineal();
            
        } else if((discriminante(A,B,C)) < 0) {
            
            imaginarios(A,B,C);
            
        } else {
            
            reales(A,B,C);
            
        }
    }
    
    public static double discriminante(double A, double B, double C){
        return ((B*B) - (4*A*C));
    }
    public static void lineal(){
        System.out.println("Si A es 0 la ecuación no es cuadŕatica, ¡Es lineal!");
    }
    
    public static void imaginarios(double A, double B, double C){
            double raiz1;
            double imaginario1;
            raiz1 = (-B) / (2*A);
            imaginario1 = Math.sqrt((discriminante(A,B,C)) * (-1));
            imaginario1 = imaginario1 / (2*A);
                    
            System.out.println("Las soluciones para esta ecuación cuadratica de la forma " +A+"x² + " +B+"x + " +C);
            System.out.printf("x1 = %.2f + %.2fi %nx2 = %.2f - %.2fi %n",raiz1, imaginario1, raiz1, imaginario1);
    }
    
    public static void reales(double A, double B, double C){
            double raiz1;
            double raiz2;

            raiz1 = (-B) + (Math.sqrt(discriminante(A,B,C)));
            raiz1 = raiz1/ (2*A);
                
            raiz2 = (-B) - (Math.sqrt(discriminante(A,B,C)));
            raiz2 = raiz2/ (2*A);
                
            System.out.println("Las soluciones para esta ecuación cuadratica de la forma " +A+"x² + " +B+"x + " +C);
            System.out.printf("x1 = %.2f %nx2 = %.2f %n",raiz1, raiz2);
        
    }

    
    public static void main(String[] args) {
        cuadratica(leer(),leer(),leer());
    }
    
}
