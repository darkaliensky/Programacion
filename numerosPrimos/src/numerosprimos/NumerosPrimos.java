/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosprimos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author darkaliensky
 */
public class NumerosPrimos {

    public static void menu(){
        int eleccion = 0;
        Scanner leer = new Scanner(System.in);
        while(eleccion != 5){
            System.out.println("MENÚ");
            System.out.println("1. Ingresar número y ver si es primo");
            System.out.println("2. Ingresar número y ver cuantos primos hay en ese rango (Mayor a 2 y Menor a 1000");
            System.out.println("3. Ingresar dos números enteros y saber si son primos gemelos");
            System.out.println("4. Ingresar número y mostrar los primos gemelos en este rango (Mayor a 5 y menor a 100)");
            System.out.println("5. Salir");

            System.out.println("Ingrese la opción que desee usar");
            try{
                eleccion = leer.nextInt();
                while (eleccion < 1 || eleccion > 5) {
                    System.out.println("Ingrese un número válido");
                    eleccion = leer.nextInt();
                }
            }catch (InputMismatchException e){
                System.out.println("Debe ingresar un valor númerico");
                leer.nextLine();
                eleccion = leer.nextInt();
            }
            
            if (eleccion == 1){
                esPrimo(leerEntero());
            } else if (eleccion == 2) {
                mostrarPrimo(leerEntero());
            } else if (eleccion == 3) {
                primosGemelos(leerEntero(), leerEntero());
            } else if (eleccion == 4) {
                todosGemelos(leerEntero());
            }
    }
    }
    public static boolean esPrimo(int N){
        int acumulador = 0;
        for(int i = 1; i < (N+1); i++){
            if (N % i == 0){
                acumulador++;
            }
        }
        if (acumulador == 2){
            return true;
        } else {
            return false;
        }
        
    }
    public static int leerEntero(){
        Scanner leer = new Scanner(System.in);
        int numero;
        try{
            System.out.println("Ingrese un número");
            numero = leer.nextInt();
        } 
        catch(InputMismatchException e) {
            System.out.println("Ingrese un valor númerico");
            leer.nextLine();
            numero = leer.nextInt();
        }
        return numero;
    }
    public static void mostrarPrimo(int N){
        for(int i = 2; i < N; i++){
            if(esPrimo(i)){
                System.out.println("El número " +i+ " es primo" );
            }
        }
    }
    public static boolean primosGemelos(int N, int M){
        if(esPrimo(N) && esPrimo(M)){
            if((N-M) == 2 || (M-N) == 2){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
        
    }
    public static void todosGemelos(int M){
        for(int i = 5; i < M; i++){
            if(primosGemelos(i,(i + 2))){
                System.out.println("Los números (" +i+ ", " +(i+2)+ ") son primos gemelos");
            }
        }
    }
    
    public static void main(String[] args) {
        menu();   
    }
    
}
