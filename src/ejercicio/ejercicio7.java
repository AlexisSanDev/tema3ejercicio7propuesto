package ejercicio;

import java.util.*;

public class ejercicio7 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int valor;
        boolean exit = false;

        do {

            valor = rnd.nextInt(200);

            int res = valor % 2;
            if (res == 0 && (valor >= 100 && valor <= 200)) {
                System.out.println("El numero esta comprendido entre 100 y 200: " + valor + " y es par " + res);
                exit = true;
            } else if (res != 0 && (valor >= 100 && valor <= 200)) {
                System.out.println("El numero esta comprendido entre 100 y 200: " + valor + " y es impar " + res);
                exit = true;
            }

        } while (exit != true);

    }
}
