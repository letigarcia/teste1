package exsrevisão;

import javax.swing.JOptionPane;

/* @author 31402836 */
public class Ex1 {

    private double valor;
    private int codigo;

    public Ex1() {
        String entrada, saida;

        //jeito mais comprido
        entrada = JOptionPane.showInputDialog("Digite o valor do produto:");
        valor = Double.parseDouble(entrada);

        //jeito mais curto
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do aumento:"));

        switch (codigo) {
            case 1:
                //uma forma (10 = 0.1%)
                valor = valor + 0.1 * valor;
                break;

            case 3:
                //segunda forma
                valor += 0.25 * valor;
                break;

            case 4:
                //terceira forma (100+30 = 1.30%)
                valor = 1.3 * valor;
                break;

            case 8:
                valor *= 1.5;
                break;

            default:
                JOptionPane.showMessageDialog(null, "Código Inválido");
        }

        JOptionPane.showMessageDialog(null, "O valor calculado é: " + valor);
    }

}
