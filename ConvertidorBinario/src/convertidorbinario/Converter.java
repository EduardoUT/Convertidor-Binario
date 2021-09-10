/*
 * El sistema numérico binario utiliza sólo dos dígitos:
 * 0 y 1. Los ordenadores funcionan en binario, lo que significa que almacenan 
 * datos y realizan cálculos usando sólo ceros y unos.
 * Necesitas hacer un programa para convertir los números enteros a su representación binaria.
 * Crea una clase Converter con un método estático toBinary(), que devuelve la versión binaria de su
 * argumento.
 * El código en general toma un número como entrada y llama al método estático correspondiente.
 * Asegúrate de que el código funciona como se espera.
 * Ejemplo de entrada:
 * 42
 * Ejemplo de salida:
 * 101010
 * Puedes usar el siguiente código para convertir un número en binario.
String binary = "";
while(num > 0) {
    binary = (num % 2) +  binary;
    num /= 2;
}
 * Nota: El código anterior utiliza un bucle para convertir un número a bunario
 * y almacena el resultado en la cadena binaria.
 */
package convertidorbinario;

/**
 *
 * @author mcore
 */
public class Converter {

    public static String toBinary(int num) {
        String binary = "";
        while (num > 0) {
            binary = (num % 2) + binary;
            num /= 2;
        }
        return binary;
    }
}
