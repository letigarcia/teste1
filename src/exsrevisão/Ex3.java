package exsrevisão;

import java.util.ArrayList;
import java.util.Scanner;

/* @author 31402836 */
public class Ex3 {

    private ArrayList<Praia> praias;

    public Ex3() {
        praias = new ArrayList<>();
        String nome;
        double distancia;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome da praia");
        nome = sc.next();

        System.out.println("digite a distancia da praia");
        distancia = sc.nextDouble();

        Praia a = new Praia(nome, distancia);

        System.out.println("Digite o nome da praia");
        nome = sc.next();

        System.out.println("digite a distancia da praia");
        distancia = sc.nextDouble();

        Praia b = new Praia(nome, distancia);

        System.out.println("Digite o nome da praia");
        nome = sc.next();

        System.out.println("digite a distancia da praia");
        distancia = sc.nextDouble();

        Praia c = new Praia(nome, distancia);

        praias.add(a);
        praias.add(b);
        praias.add(c);

        int cont = 0;

        for (Praia praia : praias) {
            if (praia.getDistancia() > 10 && praia.getDistancia() <= 15) {
                cont++;
            }
        }

        System.out.println("A quantidade de praias que estao a mais de 10KM do hotel é de " + cont);

        double media = 0;

        for (Praia praia : praias) {
            media = media + praia.getDistancia();
        }

        media = media / 2;

        System.out.println("A media entre as distacias das praias é de " + media + " Km");
    }

}
