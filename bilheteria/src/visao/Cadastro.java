package visao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import controle.PessoaDAO;

import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import modelo.Pessoa;

public class Cadastro extends JFrame {

	private JPanel contentPane, panelCadastro;
	private JLabel lblEmailCadastro, lblSenhaCadastro, lblCPFCadastro, lblNomeCadastro, lblCadastro, lblIconCadastro;
	private JTextField txtNomeCadastro;
	private JPasswordField txtSenhaCadastro;
	private JTextField txtEmailCadastro;
	private JTextField txtCPFCadastro;
	private JButton btnTelaPrincipal, btnCadastro;
	private MaskFormatter mascaraCpf;
	private JLabel lblNewLabel;
	private JLabel lblFaaSeuCadastro;
	private PessoaDAO pDAO = PessoaDAO.getInstancia();


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
	 * CONSTRUTOR DA CLASSE
	 */
	public Cadastro() {
		setTitle("Cadastro");
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0, 0, screen.width, screen.height - 30);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		getContentPane().setBackground(new Color(7, 1, 88));
		getContentPane().setForeground(new Color(255, 255, 255));
		getContentPane().setLayout(null);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(69, 159, 185));
		contentPane.setToolTipText("Histórico");
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelCadastro = new JPanel();
		panelCadastro.setBackground(Color.WHITE);
		panelCadastro.setBounds(0, 0, 400, 705);
		getContentPane().add(panelCadastro);
		panelCadastro.setLayout(null);

		// lbl cadastro
		lblCadastro = new JLabel("CADASTRO");
		lblCadastro.setForeground(Color.BLACK);
		lblCadastro.setBounds(21, 250, 330, 70);
		panelCadastro.add(lblCadastro);
		lblCadastro.setFont(new Font("Verdana", Font.BOLD, 53));

		// lbl icon
		lblIconCadastro = new JLabel("");
		lblIconCadastro.setBounds(150, 350, 75, 75);
		panelCadastro.add(lblIconCadastro);

		Image iconCadastro = new ImageIcon(this.getClass().getResource("/signUp.png")).getImage();

		// Nome
		lblNomeCadastro = new JLabel("Nome: ");
		lblNomeCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomeCadastro.setForeground(Color.WHITE);
		lblNomeCadastro.setFont(new Font("Verdana", Font.BOLD, 20));
		lblNomeCadastro.setBounds(613, 135, 95, 50);
		getContentPane().add(lblNomeCadastro);

		txtNomeCadastro = new JTextField();
		txtNomeCadastro.setFont(new Font("Verdana", Font.BOLD, 20));
		txtNomeCadastro.setForeground(new Color(0, 0, 0));
		txtNomeCadastro.setBackground(Color.WHITE);
		txtNomeCadastro.setBounds(755, 135, 500, 50);
		getContentPane().add(txtNomeCadastro);

		// Email
		lblEmailCadastro = new JLabel("Email: ");
		lblEmailCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmailCadastro.setForeground(new Color(255, 255, 255));
		lblEmailCadastro.setFont(new Font("Verdana", Font.BOLD, 20));
		lblEmailCadastro.setBounds(613, 235, 90, 50);
		getContentPane().add(lblEmailCadastro);

		txtEmailCadastro = new JTextField();
		txtEmailCadastro.setForeground(Color.BLACK);
		txtEmailCadastro.setFont(new Font("Verdana", Font.BOLD, 20));
		txtEmailCadastro.setColumns(10);
		txtEmailCadastro.setBackground(Color.WHITE);
		txtEmailCadastro.setBounds(755, 235, 500, 50);
		getContentPane().add(txtEmailCadastro);

		// CPF
		lblCPFCadastro = new JLabel("CPF: ");
		lblCPFCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lblCPFCadastro.setForeground(Color.WHITE);
		lblCPFCadastro.setFont(new Font("Verdana", Font.BOLD, 20));
		lblCPFCadastro.setBounds(613, 335, 75, 50);
		getContentPane().add(lblCPFCadastro);

		/*****************/
		MaskFormatter mascaraCpf = null;
		try {
			mascaraCpf = new MaskFormatter("###.###.###-##");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		txtCPFCadastro = new JFormattedTextField(mascaraCpf);
		/*****************/

		txtCPFCadastro.setForeground(Color.BLACK);
		txtCPFCadastro.setFont(new Font("Verdana", Font.BOLD, 20));
		txtCPFCadastro.setColumns(10);
		txtCPFCadastro.setBackground(Color.WHITE);
		txtCPFCadastro.setBounds(755, 335, 500, 50);
		getContentPane().add(txtCPFCadastro);

		// Senha
		lblSenhaCadastro = new JLabel("Senha:");
		lblSenhaCadastro.setHorizontalAlignment(SwingConstants.CENTER);
		lblSenhaCadastro.setForeground(new Color(255, 255, 255));
		lblSenhaCadastro.setFont(new Font("Verdana", Font.BOLD, 20));
		lblSenhaCadastro.setBounds(613, 435, 95, 50);
		getContentPane().add(lblSenhaCadastro);

		txtSenhaCadastro = new JPasswordField();
		txtSenhaCadastro.setForeground(Color.BLACK);
		txtSenhaCadastro.setFont(new Font("Verdana", Font.BOLD, 20));
		txtSenhaCadastro.setColumns(10);
		txtSenhaCadastro.setBackground(Color.WHITE);
		txtSenhaCadastro.setBounds(755, 435, 500, 50);
		getContentPane().add(txtSenhaCadastro);

		// Btn Cadastro
		btnCadastro = new JButton("Cadastrar");
		btnCadastro.setBorder(new LineBorder(new Color(149, 232, 236), 4));
		btnCadastro.setForeground(new Color(0, 0, 0));
		btnCadastro.setBackground(new Color(183, 232, 174));
		btnCadastro.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				Pessoa p = new Pessoa();
				String senha = String.valueOf(txtSenhaCadastro.getPassword());
				String cpfS = String.valueOf(txtCPFCadastro.getText());

				if (txtNomeCadastro.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "O nome deve ser inserido!");
				} else if (txtEmailCadastro.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "O email deve ser inserido!");
				} else if (txtCPFCadastro.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "O CPF deve ser inserido!");
				} else if (senha.isEmpty()) {
					JOptionPane.showMessageDialog(null, "A senha deve ser inserido!");
				} else {
					cpfS = cpfS.replace(".", "");
					cpfS = cpfS.replace("-", "");
					cpfS = cpfS.trim();
					Long cpf = Long.parseLong(cpfS);

					
					String email = txtEmailCadastro.getText();
					String nome = txtNomeCadastro.getText();
					
					p.setCpf(cpf);
					p.setEmail(email);
					p.setNome(nome);
					p.setSenha(senha);
					
					Boolean cadastro = pDAO.cadastrarPessoa(p);
					
					if (cadastro) {
						JOptionPane.showMessageDialog(null, "Cadastro concluído com sucesso");

					} else {
						JOptionPane.showMessageDialog(null, "Cadastro não concluído");
					}
					
					System.out.println(p);
				}

			}
		});

		btnCadastro.setFont(new Font("Verdana", Font.BOLD, 19));
		btnCadastro.setBounds(683, 575, 275, 55);
		getContentPane().add(btnCadastro);

		// Btn TelaPrincipal
		btnTelaPrincipal = new JButton("Voltar");
		btnTelaPrincipal.setBorder(new LineBorder(new Color(255, 155, 200), 4));
		btnTelaPrincipal.setForeground(Color.BLACK);
		btnTelaPrincipal.setFont(new Font("Verdana", Font.BOLD, 20));
		btnTelaPrincipal.setBackground(new Color(242, 146, 132));
		btnTelaPrincipal.setBounds(1031, 575, 275, 55);

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

		lblCadastro = new JLabel(" Seja Bem-Vindo! ");
		lblCadastro.setBorder(new LineBorder(new Color(0, 0, 160), 4));
		lblCadastro.setBackground(new Color(0, 0, 160));
		lblCadastro.setBounds(49, 34, 330, 70);
		getContentPane().add(lblCadastro);
		lblCadastro.setForeground(new Color(0, 0, 160));
		lblCadastro.setFont(new Font("Verdana", Font.BOLD, 30));

		lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setIcon(new ImageIcon(
				"C:\\Users\\Aluno\\Desktop\\Bilheteria-Swing\\bilheteria\\img\\Red Orange Cinema Festival Your Story (1).png"));
		lblNewLabel.setBounds(-310, -430, 774, 1183);
		getContentPane().add(lblNewLabel);

		lblFaaSeuCadastro = new JLabel("Faça seu cadastro:");
		lblFaaSeuCadastro.setForeground(Color.WHITE);
		lblFaaSeuCadastro.setFont(new Font("Verdana", Font.BOLD, 30));
		lblFaaSeuCadastro.setBackground(Color.BLACK);
		lblFaaSeuCadastro.setBounds(807, 34, 330, 70);
		getContentPane().add(lblFaaSeuCadastro);

	}

}
