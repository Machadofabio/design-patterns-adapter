package service;

import adapter.CotacaoAdapter;

import javax.swing.*;

public class CotacaoTest {

    public static void main(String[] args) {

        CotacaoAdapter cotacao = new CotacaoAdapter();

        String valor = JOptionPane.showInputDialog(null);
        cotacao.setValor(Double.parseDouble(valor));

        JOptionPane.showMessageDialog(null,
                "R$" + cotacao.getValor() + " é equivalente à $" + cotacao.getValorDolar() + " (dólares)");
    }
}
