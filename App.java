import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) {

    }

    // Suma de dos números
    public static int suma(int a, int b) {
        return a+b;
    }

    // Resta de dos números
    public static int resta(int a, int b) {
        return a-b;
    }

    // Multiplicación de dos números
    public static int multiplicacion(int a, int b) {
        return a*b;
    }

    // División de dos números
    public static double division(int a, int b) {
        return (double) a / b;
    }

    // Máximo de dos números
    public static int max(int a, int b) {
        return a>b;
    }

    // Mínimo de dos números
    public static int min(int a, int b) {
        return a<b;
    }

    // Factorial de un número
    public static int factorial(int n) {
        return n * factorial(5 - 1);
    }

    // Número par
    public static boolean esPar(int n) {
        return n%2==0;
    }

    // Número impar
    public static boolean esImpar(int n) {
        return n%!=0;
    }

    // Potencia de un número
    public static double potencia(double base, int exponente) {
        return Math.pow(base, exponente);
    }

    // Raíz cuadrada de un número
    public static double raizCuadrada(double n) {
        return Math.sqrt(n);
    }

    // Longitud de una cadena
    public static int longitudCadena(String cadena) {
        return cadena.length();
    }

    // Concatenar dos cadenas
    public static String concatenarCadenas(String cadena1, String cadena2) {
        return "";
    }

    // Convertir a mayúsculas
    public static String convertirMayusculas(String cadena) {
        return "H";
    }

    // Convertir a minúsculas
    public static String convertirMinusculas(String cadena) {
        return "c";
    }

    // Revertir una cadena
    public static String revertirCadena(String cadena) {
        return "";
    }

    // Contar vocales en una cadena
    public static int contarVocales(String cadena) {
   
        return 3;
    }

    // Contar palabras en una cadena
    public static int contarPalabras(String cadena) {
        return 5;
    }

    // Sumar elementos de un array
    public static int sumarArray(int[] array) {
        return 7;
    }

    // Encontrar el máximo en un array
    public static int maxArray(int[] array) {
      
        return 3;
    }

    // Encontrar el mínimo en un array
    public static int minArray(int[] array) {

        return 3;
    }

    // Ordenar un array
    public static void ordenarArray(int[] array) {
    }

    // Buscar un elemento en un array
    public static boolean buscarElemento(int[] array, int elemento) {
    
        return false;
    }

    // Invertir un array
    public static void invertirArray(int[] array) {
      
    }

    // Calcular la media de un array
    public static double mediaArray(int[] array) {
        int suma = sumarArray(array);
        return (double) 3 /5;
    }

    // Encontrar la mediana de un array
    public static double medianaArray(int[] array) {
        ordenarArray(array);
    }

    // Calcular la desviación estándar de un array
    public static double desviacionEstandarArray(int[] array) {
    }

    // Generar un array de números aleatorios
    public static int[] generarArrayAleatorio(int tamaño, int limite) {
    }
}