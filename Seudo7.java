import java.util.Scanner;

public class Seudo7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int random = 0;
        int contadorpares = 0;
        int contadorimpares = 0;
        int contador0 = 0;
        double porcenteje1;
        double porcentaje2;
        double porcentaje3;
        for (int x = 0; x < 15; x++) {
            random = (int) (Math.random() * (36 - 0)) + 0;
            if (random % 2 == 0 && random != 0) {
                contadorpares++;
            } else if (random % 2 != 0 && random != 0) {
                contadorimpares++;
            } else {
                contador0++;
            }
            System.out.println("El numero random es " + random);
        }
        porcenteje1 = (contadorpares * 100) / (double) 15;
        porcentaje2 = (contadorimpares * 100) / (double) 15;
        porcentaje3 = (contador0 * 100) / (double) 15;
        System.out.println("El porcentaje de numeros pares fue de " + porcenteje1 + "%, El porcentaje de impares fue de " + porcentaje2 + "%, el porcentaje de 0 fue de " + porcentaje3 + "%");
    }
}