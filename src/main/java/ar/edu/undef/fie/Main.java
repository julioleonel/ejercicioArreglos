package ar.edu.undef.fie;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int numeros [] = new int [99]; // declaro

            for (int indice = 0; indice < numeros.length; indice++){
                numeros [indice] = (int)(Math.random() * 100); // 100 numeros random
            }

            for (int numero : numeros){
                System.out.print(numero + " "); // muestro los numeros creados
            }
        System.out.println(" ");


        // Mostrar en consola el número mayor.

        int numeroMayor = numeros[0]; // inicializo la variable con el primer numero del array

            for (int numero : numeros){
                if (numero > numeroMayor){
                    numeroMayor = numero;
                }
            }
            System.out.println("El mayor es: " + numeroMayor);

        // Mostrar en consola el número menor.

        int numeroMenor = numeros [0];

        for (int numero : numeros){
            if (numero < numeroMenor){
                numeroMenor = numero;
            }
        }
        System.out.println("El menor es: " + numeroMenor);

        //Mostrar en consola todos los números primos.

        var esPrimo = true;

        for (int numero : numeros){
             esPrimo = true;

            if(numero <= 1){
                esPrimo = false;
            } else {
                for (int i = 2; i <= Math.sqrt(numero); i++){
                    if (numero % i == 0) {
                        esPrimo = false;
                        break;

                    }
                }
            }
            if (esPrimo){
                System.out.println(numero + " Es primo");
            }
        }

        // Mostrar en consola todos los números pares.

        for (int numero : numeros){
            if (numero % 2 == 0){
                System.out.println(numero + " es par");
            }
        }

        // Mostrar en consola el arreglo de forma ascendente.

        for (int numero : numeros){

            Arrays.sort(numeros);

            System.out.println(numero + " ");
        }

        //Mostrar en consola el promedio del arreglo.

        int cantidad = numeros.length;
        int suma = 0;

        for (int numero : numeros){

            suma += numero;

        }
        float promedio = (float) suma / cantidad;
        System.out.println("El promedio es: " + promedio);

    // Mostrar en consola la suma del primer y último elemento del arreglo.

        int primerElemento = numeros[0];
        int ultimoElemento = numeros[98];
        int sumaPyU = primerElemento + ultimoElemento;
        System.out.println(primerElemento + " " + ultimoElemento);
        System.out.println("suma primero y ultimo: " + sumaPyU);

        //Mostrar en consola el mensaje "Existe cien" en dado caso el arreglo almacene por los menos un cien.

        boolean existe100 = false;

        for (int numero : numeros){
            if(numero == 100){
                existe100 = true;
                break;

            }

        }
        if (existe100){
            System.out.println("Existe 100");
        }
        }

    }








/*


    Crear un arreglo cual nos permita almacenar cien números enteros.
    Llenar el arreglo con números aleatorios.

    Para obtener un número aleatorio en Java podemos hacer uso de la siguiente sentencia.

    int numero = (int)(Math.random() * 100);

A partir del arreglo anteriormente creado.

    Mostrar en consola el número mayor.
    Mostrar en consola el número menor.
    Mostrar en consola todos los números primos.
    Mostrar en consola todos los números pares.
    Mostrar en consola el arreglo de forma ascendente.
    Mostrar en consola el promedio del arreglo.
    Mostrar en consola la suma del primer y último elemento del arreglo.
    Mostrar en consola el mensaje "Existe cien" en dado caso el arreglo almacene por los menos un cien.


 */