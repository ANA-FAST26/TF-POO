package janela;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

import dados.*;

public class JanelaRoboDomestico extends JFrame implements ActionListener {
    private JTextField campoId, campoModelo, campoValorDiario, campoSetor;
    private JButton confirmar, limpar, consultar, voltar, fechar;

    public JanelaRoboDomestico(GerenciaRobo gerenciaRobo) {
        super();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("RoboDomestico");
        this.setSize(680, 600);
        this.setResizable(false);
        JLabel idTexto = new JLabel("ID");
        campoId = new JTextField(15);
        JLabel modeloTexto = new JLabel("Modelo");
        campoModelo = new JTextField(15);
        JLabel campoValorDiarioTexto = new JLabel("Valor diario");
        campoValorDiario = new JTextField(15);
        JLabel campoSetorTexto = new JLabel("Setor");
        campoSetor = new JTextField(15);
        confirmar = new JButton("Confirmar");
        limpar = new JButton("Limpar");
        consultar = new JButton("Consultar");
        voltar = new JButton("Voltar");
        fechar = new JButton("Fechar");
        JPanel painel = new JPanel();
        painel.add(idTexto);
        painel.add(campoId);
        painel.add(modeloTexto);
        painel.add(campoModelo);
        painel.add(campoValorDiarioTexto);
        painel.add(campoValorDiario);
        painel.add(campoSetorTexto);
        painel.add(campoSetor);
        painel.add(confirmar);
        painel.add(limpar);
        painel.add(consultar);
        painel.add(voltar);
        painel.add(fechar);
        this.add(painel);
        confirmar.addActionListener(this);
        limpar.addActionListener(this);
        consultar.addActionListener(this);
        voltar.addActionListener(this);
        fechar.addActionListener(this);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        int id;
        String modelo;
        double valorDiario;
        int nivel;
        if(actionEvent.getSource() == confirmar);
        try {
            id = Integer.parseInt(campoId.getText());
            modelo = campoModelo.getText();
            valorDiario = Double.parseDouble(campoValorDiario.getText());

        }catch (InputMismatchException inputMismatchException) {
        }
        if (actionEvent.getSource() == confirmar) {
            System.out.println("Confirmar");
        } else if (actionEvent.getActionCommand().equals("Limpar")) {
            System.out.println("Limpar");
        } else if (actionEvent.getActionCommand().equals("Consultar")) {
            System.out.println("Consultar");
        } else if (actionEvent.getActionCommand().equals("Voltar")) {
            System.out.println("Voltar");
        } else if (actionEvent.getActionCommand().equals("Fechar")) {
            System.out.println("Fechar");
        }
    }
}


