package ATIVIDADE;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.text.MaskFormatter;

public class TelaCadastro extends JFrame {
    private JTextField campoNome;
    private JTextField campoTelefone;
    private JTextField campoBairro;
    private JTextField campoNumeroCasa;
    private JTextField campoNomeRua;
    private JFormattedTextField campoCPF;
    private JButton botaoCadastrar;

    public TelaCadastro() {
  
        setTitle("Cadastro de Usuário");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2));

        JLabel labelNome = new JLabel("Nome:");
        campoNome = new JTextField(20);
        JLabel labelTelefone = new JLabel("Telefone:");
        campoTelefone = new JTextField(20);
        JLabel labelBairro = new JLabel("Bairro:");
        campoBairro = new JTextField(20);
        JLabel labelNumeroCasa = new JLabel("Número da Casa:");
        campoNumeroCasa = new JTextField(20);
        JLabel labelNomeRua = new JLabel("Nome da Rua:");
        campoNomeRua = new JTextField(20);
        JLabel labelCpf = new JLabel("CPF:");
        campoNomeRua = new JTextField(20);

        try {
            MaskFormatter telMask = new MaskFormatter("(##) #####-####");
            campoTelefone = new JFormattedTextField(telMask);
            MaskFormatter cpfMask = new MaskFormatter("###.###.###-##");
            campoCPF = new JFormattedTextField(cpfMask);
        } catch (Exception e) {
            e.printStackTrace();
        }

        botaoCadastrar = new JButton("Cadastrar");

      
        add(labelNome);
        add(campoNome);
        add(labelTelefone);
        add(campoTelefone);
        add(labelBairro);
        add(campoBairro);
        add(labelNumeroCasa);
        add(campoNumeroCasa);
        add(labelNomeRua);
        add(campoNomeRua);
        add(labelCpf);
        add(campoCPF);
        add(new JLabel()); 
        add(botaoCadastrar);
        
        botaoCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarUsuario();
            }
        });
    }

    private void cadastrarUsuario() {
        String nome = campoNome.getText();
        String telefone = campoTelefone.getText();
        String bairro = campoBairro.getText();
        String numeroCasa = campoNumeroCasa.getText();
        String nomeRua = campoNomeRua.getText();
        String cpf = campoCPF.getText();

        JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso!");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                TelaCadastro telaCadastro = new TelaCadastro();
                telaCadastro.setVisible(true);
            }
        });
    }
}
