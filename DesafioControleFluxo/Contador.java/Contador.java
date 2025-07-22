import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();
        //basicamente no try é uma mensagem de erro, você q não entendeu, eu tbm n entendi de primeira tive q pedir ajuda ao chat
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

        terminal.close();
    }
//isso daqui é um metodo, acabei de aprender a usar kkkkkkkkkk
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("número: " + i);
        }
    }
}
//o if e else foi só pq o professor pediu ><
//eu tinha feito uma versão mais simples mas essa daqui também serviu :P
