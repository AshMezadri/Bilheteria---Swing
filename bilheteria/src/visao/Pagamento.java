package visao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Pagamento extends JFrame {

	private JPanel contentPane;
	private JLabel lblNumero, lblCVV, lblValidade, lblTitular, lblPagamento;
	private JTextField txtTitular;
	private JTextField txtNumeroCartao;
	private JTextField txtCPFCadastro;
	private JPanel panelCadastro;
	private JButton btnTelaPrincipal, btnCompra;
	private JLabel lblDocartao;
	private JTextField txtCVV;
	private JLabel lblValor;
	private JTextField txtValor;
	private JLabel lblQuantidade;
	private JTextField txtQuant;
	private JLabel lblPoltrona;
	private JTextField txtPoltrona;
	private JLabel lblSessao;
	private JTextField txtSessao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pagamento frame = new Pagamento();
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
	public Pagamento() {
		setTitle("Pagamento");
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

		lblPagamento = new JLabel("PAGAMENTO");
		lblPagamento.setForeground(Color.BLACK);
		lblPagamento.setBounds(20, 35, 340, 70);
		panelCadastro.add(lblPagamento);
		lblPagamento.setFont(new Font("Verdana", Font.BOLD, 47));
		
		lblValor = new JLabel("Valor: ");
		lblValor.setHorizontalAlignment(SwingConstants.CENTER);
		lblValor.setForeground(Color.BLACK);
		lblValor.setFont(new Font("Verdana", Font.BOLD, 17));
		lblValor.setBounds(75, 175, 70, 40);
		panelCadastro.add(lblValor);
		
		txtValor = new JTextField();
		txtValor.setEnabled(false);
		txtValor.setEditable(false);
		txtValor.setForeground(Color.BLACK);
		txtValor.setFont(new Font("Verdana", Font.BOLD, 20));
		txtValor.setBackground(Color.LIGHT_GRAY);
		txtValor.setBounds(155, 175, 150, 40);
		panelCadastro.add(txtValor);
		
		lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuantidade.setForeground(Color.BLACK);
		lblQuantidade.setFont(new Font("Verdana", Font.BOLD, 17));
		lblQuantidade.setBounds(20, 250, 125, 40);
		panelCadastro.add(lblQuantidade);
		
		txtQuant = new JTextField();
		txtQuant.setForeground(Color.BLACK);
		txtQuant.setFont(new Font("Verdana", Font.BOLD, 20));
		txtQuant.setEnabled(false);
		txtQuant.setEditable(false);
		txtQuant.setBackground(Color.LIGHT_GRAY);
		txtQuant.setBounds(155, 250, 150, 40);
		panelCadastro.add(txtQuant);
		
		lblPoltrona = new JLabel("Poltrona: ");
		lblPoltrona.setHorizontalAlignment(SwingConstants.CENTER);
		lblPoltrona.setForeground(Color.BLACK);
		lblPoltrona.setFont(new Font("Verdana", Font.BOLD, 17));
		lblPoltrona.setBounds(45, 325, 100, 40);
		panelCadastro.add(lblPoltrona);
		
		txtPoltrona = new JTextField();
		txtPoltrona.setForeground(Color.BLACK);
		txtPoltrona.setFont(new Font("Verdana", Font.BOLD, 20));
		txtPoltrona.setEnabled(false);
		txtPoltrona.setEditable(false);
		txtPoltrona.setBackground(Color.LIGHT_GRAY);
		txtPoltrona.setBounds(155, 325, 150, 40);
		panelCadastro.add(txtPoltrona);
		
		lblSessao = new JLabel("Sessão:");
		lblSessao.setHorizontalAlignment(SwingConstants.CENTER);
		lblSessao.setForeground(Color.BLACK);
		lblSessao.setFont(new Font("Verdana", Font.BOLD, 17));
		lblSessao.setBounds(45, 400, 90, 40);
		panelCadastro.add(lblSessao);
		
		txtSessao = new JTextField();
		txtSessao.setForeground(Color.BLACK);
		txtSessao.setFont(new Font("Verdana", Font.BOLD, 20));
		txtSessao.setEnabled(false);
		txtSessao.setEditable(false);
		txtSessao.setBackground(Color.LIGHT_GRAY);
		txtSessao.setBounds(155, 400, 150, 40);
		panelCadastro.add(txtSessao);

		// Nome
		lblTitular = new JLabel("Titular:");
		lblTitular.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitular.setForeground(Color.WHITE);
		lblTitular.setFont(new Font("Verdana", Font.BOLD, 20));
		lblTitular.setBounds(500, 135, 95, 50);
		getContentPane().add(lblTitular);

		txtTitular = new JTextField();
		txtTitular.setFont(new Font("Verdana", Font.BOLD, 20));
		txtTitular.setForeground(new Color(0, 0, 0));
		txtTitular.setBackground(Color.WHITE);
		txtTitular.setBounds(625, 135, 500, 50);
		getContentPane().add(txtTitular);

		// Email
		lblNumero = new JLabel("Número ");
		lblNumero.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumero.setForeground(new Color(255, 255, 255));
		lblNumero.setFont(new Font("Verdana", Font.BOLD, 20));
		lblNumero.setBounds(500, 240, 100, 50);
		getContentPane().add(lblNumero);

		txtNumeroCartao = new JTextField();
		txtNumeroCartao.setForeground(Color.BLACK);
		txtNumeroCartao.setFont(new Font("Verdana", Font.BOLD, 20));
		txtNumeroCartao.setColumns(10);
		txtNumeroCartao.setBackground(Color.WHITE);
		txtNumeroCartao.setBounds(625, 260, 500, 50);
		getContentPane().add(txtNumeroCartao);

		// CPF
		lblValidade = new JLabel("Validade: ");
		lblValidade.setHorizontalAlignment(SwingConstants.CENTER);
		lblValidade.setForeground(Color.WHITE);
		lblValidade.setFont(new Font("Verdana", Font.BOLD, 20));
		lblValidade.setBounds(490, 400, 115, 50);
		getContentPane().add(lblValidade);

		txtCPFCadastro = new JTextField();
		txtCPFCadastro.setForeground(Color.BLACK);
		txtCPFCadastro.setFont(new Font("Verdana", Font.BOLD, 20));
		txtCPFCadastro.setColumns(10);
		txtCPFCadastro.setBackground(Color.WHITE);
		txtCPFCadastro.setBounds(615, 400, 200, 50);
		getContentPane().add(txtCPFCadastro);

		// Senha
		lblCVV = new JLabel("CVV:");
		lblCVV.setHorizontalAlignment(SwingConstants.CENTER);
		lblCVV.setForeground(new Color(255, 255, 255));
		lblCVV.setFont(new Font("Verdana", Font.BOLD, 20));
		lblCVV.setBounds(825, 400, 70, 50);
		getContentPane().add(lblCVV);

		// Btn Cadastro
		btnCompra = new JButton("Realizar Compra");
		btnCompra.setForeground(Color.BLACK);
		btnCompra.setBackground(Color.WHITE);
		btnCompra.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				// saveUserInfo();
			}
		});

		btnCompra.setFont(new Font("Verdana", Font.BOLD, 19));
		btnCompra.setBounds(525, 575, 275, 55);
		getContentPane().add(btnCompra);

		// Btn TelaPrincipal
		btnTelaPrincipal = new JButton("Voltar");
		btnTelaPrincipal.setForeground(Color.BLACK);
		btnTelaPrincipal.setFont(new Font("Verdana", Font.BOLD, 20));
		btnTelaPrincipal.setBackground(Color.WHITE);
		btnTelaPrincipal.setBounds(925, 575, 275, 55);

		btnTelaPrincipal.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Principal().setVisible(true);
				this.dispose();

			}

			private void dispose() {
				setVisible(false);
			}

		});

		getContentPane().add(btnTelaPrincipal);
		
		lblDocartao = new JLabel("do cartão: ");
		lblDocartao.setHorizontalAlignment(SwingConstants.CENTER);
		lblDocartao.setForeground(Color.WHITE);
		lblDocartao.setFont(new Font("Verdana", Font.BOLD, 20));
		lblDocartao.setBounds(485, 275, 130, 50);
		getContentPane().add(lblDocartao);
		
		txtCVV = new JTextField();
		txtCVV.setForeground(Color.BLACK);
		txtCVV.setFont(new Font("Verdana", Font.BOLD, 20));
		txtCVV.setColumns(10);
		txtCVV.setBackground(Color.WHITE);
		txtCVV.setBounds(925, 400, 200, 50);
		getContentPane().add(txtCVV);

	}
}
