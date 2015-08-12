package exsrevisão;

import java.util.Scanner;

/* @author 31402836 */
public class Ex2 {

    public Ex2() {
        Scanner sc = new Scanner(System.in);

        String resposta = "opção invalida";

        do {
            System.out.println("Escolha uma opção: "
                    + "\n 1: Solteiro(a) "
                    + "\n 2: Desquitado(a) "
                    + "\n 3: Casado(a) "
                    + "\n 4: Divorciado(a) "
                    + "\n 5: Viúvo(a)");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    resposta = "Solteiro(a))";
                    break;

                case 2:
                    resposta = "Desquitado(a)";
                    break;

                case 3:
                    resposta = "Casado(a)";
                    break;

                case 4:
                    resposta = "Divorciado(a)";
                    break;

                case 5:
                    resposta = "Víuvo(a)";
                    break;

                /*default:
                    System.out.println("Opção Inválida"); */
            }
        } while (resposta.equals("opção invalida"));

        System.out.println("Você é: " + resposta);
    }
}
