package app.java;

import javax.swing.*;
import java.util.Random;

public class Run {
    static Integer entrada;

    public static void main(String[] args) {

        Random random = new Random();
        int aleatorio = random.nextInt(1);
        JOptionPane.showMessageDialog(null, "Número Aleatório gerado!");
        System.out.println(aleatorio);

        entrada = Integer.parseInt
                (JOptionPane.showInputDialog("Digite um número"));
        System.out.println(entrada);


        if(aleatorio == entrada){
            JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
        }else if(aleatorio < entrada){
            JOptionPane.showMessageDialog(null, "Digite um número menor!");
            entrada = Integer.parseInt
                    (JOptionPane.showInputDialog("Digite um número"));
        }else if(aleatorio > entrada){
            JOptionPane.showMessageDialog(null, "Digite um número maior!");
            entrada = Integer.parseInt
                    (JOptionPane.showInputDialog("Digite um número"));
        }


    }

//    public static int Entrada() {
//        entrada = Integer.parseInt
//                (JOptionPane.showInputDialog("Digite um número"));
//        System.out.println(entrada);
//        return entrada;
//    }
//
//    public int GeraAleatorio(){
//        Random random = new Random();
//        int aleatorio = random.nextInt(5);
//        System.out.println(aleatorio);
//        return aleatorio;
//
//    }
}
