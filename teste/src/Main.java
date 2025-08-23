import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {

            System.out.println("Escreva a pindaiba de um número");
            int numero = sc.nextInt();
            System.out.printf("Essa é a tabuada do seu numero de flores: %d de 1 a 10 \n",numero);
            for (i nt i= 1; i <= 10; i++){
                System.out.println(numero+ " X " + i + " = " + (numero * i));
            }

        }
    }
}