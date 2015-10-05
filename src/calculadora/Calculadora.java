/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author darkaliensky
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int eleccion = 0;
        double A;
        double B;
        double C;
        double raiz1;
        double raiz2;
        double imaginario1;
        double x1;
        double y1;
        double x2;
        double y2;
        double m;
        double b;
        
        while(eleccion != 6){
            System.out.println("MENÚ");
            System.out.println("1. Operaciones aritméticas");
            System.out.println("2. Ecuación cuadrática");
            System.out.println("3. Figuras geométricas");
            System.out.println("4. Sistema ecuaciones lineales");
            System.out.println("5. Ecuación de la recta");
            System.out.println("6. Salir");

            System.out.println("Ingrese la opción que desee usar");
            try{
                eleccion = leer.nextInt();
                while (eleccion < 1 || eleccion > 6) {
                    System.out.println("Ingrese un número válido");
                    eleccion = leer.nextInt();
                }
            }catch (InputMismatchException e){
                System.out.println("Debe ingresar un valor númerico");
                break;
            }
            

            if (eleccion == 1) {
                // Colocar aquí codigo de operaciones aritmeticas
            } else if (eleccion == 2) {
                System.out.println("Dada la ecuación cuadrática de la forma Ax² + Bx + C");
                System.out.println("Ingrese el coeficiente cuadrático (Ax²) de la ecuación");
                
                try{
                    A = leer.nextDouble();
                    System.out.println("Ingrese el coeficiente lineal (Bx) de la ecuación");
                    B = leer.nextDouble();
                    System.out.println("Ingrese el coeficiente númerico (C) de la ecuación");
                    C = leer.nextDouble();
                    
                    if(A == 0) {
                    System.out.println("Si A es 0 la ecuación no es cuadŕatica, ¡Es lineal!");
                } else if((B*B - 4*A*C) < 0) {
                    raiz1 = (-B) / (2*A);
                    imaginario1 = Math.sqrt((B*B - 4*A*C) * (-1));
                    imaginario1 = imaginario1 / (2*A);
                    
                    System.out.println("Las soluciones para esta ecuación cuadratica de la forma " +A+"x² + " +B+"x + " +C);
                    System.out.println("x1 = " +raiz1+ " + " +imaginario1+ "i x2 = " +raiz1+ " - " +imaginario1+ "i");
                    
                } else {
                    raiz1 = (-B) + (Math.sqrt(B*B - 4*A*C));
                    raiz1 = raiz1/ (2*A);
                
                    raiz2 = (-B) - (Math.sqrt(B*B - 4*A*C));
                    raiz2 = raiz2/ (2*A);
                
                    System.out.println("Las soluciones para esta ecuación cuadratica de la forma " +A+"x² + " +B+"x + " +C);
                    System.out.println("x1 = " +raiz1+ " x2 = " +raiz2);
                }
                }
                catch (Exception e){
                    System.out.println("Ingrese un númereo válido");
                }
 
            } else if (eleccion == 3) {
                // Colocar Figuras geometricas
            } else if (eleccion == 4) {
                // Colocar Sistema ecuaciones lineales
            } else if (eleccion == 5){
                try{
                    System.out.println("Ingrese x1");
                    x1=leer.nextDouble(); 
                    System.out.println("Ingrese y1");
                    y1=leer.nextDouble();

                    System.out.println("Ingrese x2");
                    x2=leer.nextDouble();

                    System.out.println("Ingrese y2");
                    y2=leer.nextDouble();

                    if(x2==x1)
                        System.out.println("Error");
                    if(x2!=x1){
                        m=(y2-y1)/(x2-x1);
                        b=y1-m*x1;
                        System.out.print("La Ecuacion de la recta es: Y="+ m + "X + "+b );}
                    }
                    catch(Exception e){
                      System.out.println("ERROR");
                            }
            }
        }
        
    }
    
}
