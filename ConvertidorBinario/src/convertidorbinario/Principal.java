package convertidorbinario;

import java.util.Scanner;

/**
 *
 * @author mcore
 */
public class Principal {

    public static void main(String[] args) {
        for (int i = 0; i < 40; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("|☻         Conversor Binario          ☻|");
        System.out.println("");
        for (int j = 0; j < 3; j++) {
            System.out.println("|☻                                    ☻|");
        }
        for (int k = 0; k < 40; k++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.println("Ingresa un número entero ☟ ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Resultado ☞ " + Converter.toBinary(x));
    }
}
