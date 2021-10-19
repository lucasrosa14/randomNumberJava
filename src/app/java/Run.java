package app.java;

import javax.swing.*;
import java.util.Random;

public class Run {
    static Integer entrada;
    static Integer aleatorio;
    static int dialogResult;

    public static void main(String[] args) {

        Start();

            if (dialogResult == JOptionPane.YES_OPTION) {

                GeraAleatorio();

                Entrada();

                Compara();
            } else {
                JOptionPane.showMessageDialog(null, "Você fechou o programa.");

            }

    }

    public static int Entrada() {
        entrada = Integer.parseInt
                (JOptionPane.showInputDialog("Digite um número entre 1 e 5"));
        return entrada;
    }

    public static int GeraAleatorio() {
        Random random = new Random();
        aleatorio = random.nextInt(5);
        while(aleatorio == 0){
            aleatorio = random.nextInt(5);
            return aleatorio;
        }
        JOptionPane.showMessageDialog(null, "Número Aleatório gerado!");
        return aleatorio;

    }

    public static void Compara() {
        boolean isTrue = true;
        while (isTrue) {
            if (aleatorio != entrada) {
                if (aleatorio < entrada) {
                    JOptionPane.showMessageDialog(null, "Digite um número menor!");
                    Entrada();
                } else if (aleatorio > entrada) {
                    JOptionPane.showMessageDialog(null, "Digite um número maior!");
                    Entrada();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
                isTrue = false;
            }
        }

    }

    public static int Start() {
        int dialogButton = JOptionPane.YES_NO_OPTION;
        dialogResult = JOptionPane.showConfirmDialog (null, "Deseja Iniciar?","Warning",dialogButton);
        return dialogResult;
    }
}
