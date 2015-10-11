/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadraticasmetodos;
import java.util.Scanner;
/**
 *
 * @author darkaliensky
 */
public class CuadraticasMetodos {
    
    public static double leer(){
        Scanner leer = new Scanner(System.in);
        double numero;
        numero = leer.nextDouble();
        return numero;
    }
    
    public static void cuadratica(double A, double B, double C){
        
        if(A == 0) {
            lineal();
        } else if((B*B - 4*A*C) < 0) {
            
            imaginarios(A,B,C);
        } else {
            reales(A,B,C);
        }
    }
    
    public static void lineal(){
        System.out.println("Si A es 0 la ecuación no es cuadŕatica, ¡Es lineal!");
    }
    
    public static void imaginarios(double A, double B, double C){
            double raiz1;
            double imaginario1;
            raiz1 = (-B) / (2*A);
            imaginario1 = Math.sqrt((B*B - 4*A*C) * (-1));
            imaginario1 = imaginario1 / (2*A);
                    
            System.out.println("Las soluciones para esta ecuación cuadratica de la forma " +A+"x² + " +B+"x + " +C);
            System.out.println("x1 = " +raiz1+ " + " +imaginario1+ "i x2 = " +raiz1+ " - " +imaginario1+ "i");
    }
    
    public static void reales(double A, double B, double C){
            double raiz1;
            double raiz2;

            raiz1 = (-B) + (Math.sqrt(B*B - 4*A*C));
            raiz1 = raiz1/ (2*A);
                
            raiz2 = (-B) - (Math.sqrt(B*B - 4*A*C));
            raiz2 = raiz2/ (2*A);
                
            System.out.println("Las soluciones para esta ecuación cuadratica de la forma " +A+"x² + " +B+"x + " +C);
            System.out.println("x1 = " +raiz1+ " x2 = " +raiz2);
        
    }

    
    public static void main(String[] args) {
        cuadratica(leer(),leer(),leer());
    }
    
}
