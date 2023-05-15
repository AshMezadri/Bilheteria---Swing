package visao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controle.PessoaDAO;
import modelo.Pessoa;
import java.awt.Button;
import javax.swing.SwingConstants;

public class Cadastro extends JFrame {

	private JPanel contentPane;
	private JLabel lblEmailCadastro, lblSenhaCadastro, lblCPFCadastro, lblNomeCadastro, lblCadastro;
	private JTextField txtNomeCadastro;
	private JPasswordField txtSenhaCadastro;
	private JTextField txtEmailCadastro;
	private JTextField txtCPFCadastro;
	private JPanel panelCadastro;
	private JButton btnTelaPrincipal, btnCadastro;
	private ArrayList<Pessoa> ListaPessoas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cadastro() {
		setTitle("Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1947, 1017);

		getContentPane().setBackground(new Color(7, 1, 88));
		getContentPane().setForeground(new Color(255, 255, 255));
		getContentPane().setLayout(null);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(69, 159, 185));
		contentPane.setToolTipText("Hitórico");
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		panelCadastro = new JPanel();
		panelCadastro.setBackground(Color.WHITE);
		panelCadastro.setBounds(10, 36, 1904, 119);
		getContentPane().add(panelCadastro);
		panelCadastro.setLayout(null);

		lblCadastro = new JLabel("CADASTRO");
		lblCadastro.setBounds(774, 20, 349, 70);
		panelCadastro.add(lblCadastro);
		lblCadastro.setFont(new Font("Verdana", Font.BOLD, 57));

		ListaPessoas = new ArrayList<>();

		// Nome
		lblNomeCadastro = new JLabel("Nome: ");
		lblNomeCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomeCadastro.setForeground(Color.WHITE);
		lblNomeCadastro.setFont(new Font("Verdana", Font.BOLD, 23));
		lblNomeCadastro.setBounds(555, 300, 105, 60);
		getContentPane().add(lblNomeCadastro);

		txtNomeCadastro = new JTextField();
		txtNomeCadastro.setFont(new Font("Verdana", Font.BOLD, 20));
		txtNomeCadastro.setForeground(new Color(0, 0, 0));
		txtNomeCadastro.setBackground(Color.WHITE);
		txtNomeCadastro.setBounds(705, 300, 600, 60);
		getContentPane().add(txtNomeCadastro);

		// Email
		lblEmailCadastro = new JLabel("Email: ");
		lblEmailCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmailCadastro.setForeground(new Color(255, 255, 255));
		lblEmailCadastro.setFont(new Font("Verdana", Font.BOLD, 25));
		lblEmailCadastro.setBounds(555, 398, 100, 60);
		getContentPane().add(lblEmailCadastro);

		txtEmailCadastro = new JTextField();
		txtEmailCadastro.setForeground(Color.BLACK);
		txtEmailCadastro.setFont(new Font("Verdana", Font.BOLD, 20));
		txtEmailCadastro.setColumns(10);
		txtEmailCadastro.setBackground(Color.WHITE);
		txtEmailCadastro.setBounds(705, 400, 600, 60);
		getContentPane().add(txtEmailCadastro);

		// CPF
		lblCPFCadastro = new JLabel("CPF: ");
		lblCPFCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lblCPFCadastro.setForeground(Color.WHITE);
		lblCPFCadastro.setFont(new Font("Verdana", Font.BOLD, 23));
		lblCPFCadastro.setBounds(585, 498, 75, 60);
		getContentPane().add(lblCPFCadastro);

		txtCPFCadastro = new JTextField();
		txtCPFCadastro.setForeground(Color.BLACK);
		txtCPFCadastro.setFont(new Font("Verdana", Font.BOLD, 20));
		txtCPFCadastro.setColumns(10);
		txtCPFCadastro.setBackground(Color.WHITE);
		txtCPFCadastro.setBounds(705, 500, 600, 60);
		getContentPane().add(txtCPFCadastro);

		// Senha
		lblSenhaCadastro = new JLabel("Senha:");
		lblSenhaCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lblSenhaCadastro.setForeground(new Color(255, 255, 255));
		lblSenhaCadastro.setFont(new Font("Verdana", Font.BOLD, 23));
		lblSenhaCadastro.setBounds(555, 598, 105, 60);
		getContentPane().add(lblSenhaCadastro);

		txtSenhaCadastro = new JPasswordField();
		txtSenhaCadastro.setForeground(Color.BLACK);
		txtSenhaCadastro.setFont(new Font("Verdana", Font.BOLD, 20));
		txtSenhaCadastro.setColumns(10);
		txtSenhaCadastro.setBackground(Color.WHITE);
		txtSenhaCadastro.setBounds(705, 600, 600, 60);
		getContentPane().add(txtSenhaCadastro);

		// Btn Cadastro
		btnCadastro = new JButton("Cadastrar");
		btnCadastro.setForeground(Color.BLACK);
		btnCadastro.setBackground(Color.WHITE);
		btnCadastro.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				saveUserInfo();
			}
		});

		btnCadastro.setFont(new Font("Verdana", Font.BOLD, 20));
		btnCadastro.setBounds(555, 850, 350, 65);
		getContentPane().add(btnCadastro);

		// Btn TelaPrincipal
		btnTelaPrincipal = new JButton("Voltar");
		btnTelaPrincipal.setForeground(Color.BLACK);
		btnTelaPrincipal.setFont(new Font("Verdana", Font.BOLD, 20));
		btnTelaPrincipal.setBackground(Color.WHITE);
		btnTelaPrincipal.setBounds(1015, 850, 350, 65);

		btnTelaPrincipal.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Inicio().setVisible(true);
				this.dispose();

			}

			private void dispose() {
				setVisible(false);
			}

		});

		getContentPane().add(btnTelaPrincipal);

	}

	private void saveUserInfo() {
		String nome = txtNomeCadastro.getText();
		String senha = new String(txtSenhaCadastro.getPassword());
		String email = txtEmailCadastro.getText();
		String cpf = txtCPFCadastro.getText();

		if (cpf.isEmpty() || senha.isEmpty() || nome.isEmpty() || email.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!");
			return;
		}

		long cpfLong = Long.parseLong(cpf);

		Pessoa p = new Pessoa();
		p.setCpf(cpfLong);
		p.setEmail(email);
		p.setNome(nome);
		p.setSenha(senha);

		ListaPessoas.add(p);

		JOptionPane.showMessageDialog(this, "Cadastro concluído.");
		JOptionPane.showMessageDialog(null, ListaPessoas.toString());


		txtNomeCadastro.setText("");
		txtSenhaCadastro.setText("");
		txtEmailCadastro.setText("");
		txtCPFCadastro.setText("");
	}
}
