import java.util.Scanner;

public class combinacionPermutacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero 1 (n): ");
        int numero1 = sc.nextInt();

        System.out.print("Ingrese el numero 2 (r): ");
        int numero2 = sc.nextInt();

        if (numero2 > numero1) {
            System.out.println("Pilas: el numero 2 no puede ser mayor que el numero 1.");
            return;
        }

        int factorialNumero1 = factorial(numero1);
        int factorialNumero2 = factorial(numero2);
        int factorialDiferencia = factorial(numero1 - numero2);

        int C = factorialNumero1 / (factorialNumero2 * factorialDiferencia);
        int P = factorialNumero1 / factorialDiferencia;

        System.out.println("Combinatoria C(n, r): " + C);
        System.out.println("Permutacion P(n, r): " + P);
    }

    public static int factorial(int numero) {
        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }
}
