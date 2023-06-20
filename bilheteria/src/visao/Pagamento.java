package visao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;

import controle.FilmeDAO;
import controle.IngressoDAO;
import controle.PessoaDAO;
import controle.SessaoDAO;
import modelo.Filme;
import modelo.Ingresso;
import modelo.Pessoa;
import modelo.Sessao;

public class Pagamento extends JFrame {

	private JPanel contentPane;
	private JLabel lblNumero, lblCVV, lblValidade, lblTitular, lblPagamento, lblTipo;
	private JTextField txtTitular;
	private JTextField txtNumeroCartao;
	private JTextField txtValidade;
	private JPanel panelCadastro;
	private JButton btnTelaPrincipal, btnCompra;
	private JLabel lblDocartao;
	private JTextField txtCVV;
	private JLabel lblValor;
	private JTextField txtValor;
	private JLabel lblPoltrona;
	private JTextField txtPoltrona;
	private JLabel lblIngresso;
	private JTextField txtIngresso;
	private JComboBox<String> cbInteiraMeia;
	private IngressoDAO iDAO = IngressoDAO.getInstancia();
	private FilmeDAO fDAO = FilmeDAO.getInstancia();
	private SessaoDAO sDAO = SessaoDAO.getInstancia();
	private PessoaDAO pDAO = PessoaDAO.getInstancia();

	private String tipoIngresso;
	private Double valorIngresso = 00.00;

	private Ingresso ingresso = new Ingresso();
	private Sessao sessao = new Sessao();
	private Filme filme = new Filme();
	private Pessoa pessoa = new Pessoa();

	private Integer idIngresso;
	private Character fileira;
	private Integer cadeira;
	private JLabel lblNome;
	private JTextField txtNome;
	private JTextField txtEmail;

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
		panelCadastro.setBounds(0, 0, 425, 705);
		getContentPane().add(panelCadastro);
		panelCadastro.setLayout(null);

		lblPagamento = new JLabel("PAGAMENTO");
		lblPagamento.setForeground(Color.BLACK);
		lblPagamento.setBounds(30, 35, 340, 70);
		panelCadastro.add(lblPagamento);
		lblPagamento.setFont(new Font("Verdana", Font.BOLD, 47));

		// infos
		lblTipo = new JLabel("Tipo: ");
		lblTipo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipo.setForeground(Color.BLACK);
		lblTipo.setFont(new Font("Verdana", Font.BOLD, 17));
		lblTipo.setBounds(75, 370, 70, 40);
		panelCadastro.add(lblTipo);

		lblValor = new JLabel("Valor: ");
		lblValor.setHorizontalAlignment(SwingConstants.CENTER);
		lblValor.setForeground(Color.BLACK);
		lblValor.setFont(new Font("Verdana", Font.BOLD, 17));
		lblValor.setBounds(75, 440, 70, 40);
		panelCadastro.add(lblValor);

		txtValor = new JTextField();
		txtValor.setEnabled(false);
		txtValor.setEditable(false);
		txtValor.setForeground(Color.BLACK);
		txtValor.setFont(new Font("Verdana", Font.BOLD, 20));
		txtValor.setBackground(new Color(243, 243, 243));
		txtValor.setBounds(155, 440, 150, 40);
		panelCadastro.add(txtValor);

		lblPoltrona = new JLabel("Poltrona: ");
		lblPoltrona.setHorizontalAlignment(SwingConstants.CENTER);
		lblPoltrona.setForeground(Color.BLACK);
		lblPoltrona.setFont(new Font("Verdana", Font.BOLD, 17));
		lblPoltrona.setBounds(45, 510, 100, 40);
		panelCadastro.add(lblPoltrona);

		txtPoltrona = new JTextField();
		txtPoltrona.setForeground(Color.BLACK);
		txtPoltrona.setFont(new Font("Verdana", Font.BOLD, 20));
		txtPoltrona.setEnabled(false);
		txtPoltrona.setEditable(false);
		txtPoltrona.setBackground(new Color(243, 243, 243));
		txtPoltrona.setBounds(155, 510, 150, 40);
		panelCadastro.add(txtPoltrona);

		lblIngresso = new JLabel("Cod. Ing.:");
		lblIngresso.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngresso.setForeground(Color.BLACK);
		lblIngresso.setFont(new Font("Verdana", Font.BOLD, 17));
		lblIngresso.setBounds(35, 580, 110, 40);
		panelCadastro.add(lblIngresso);

		txtIngresso = new JTextField();
		txtIngresso.setForeground(Color.BLACK);
		txtIngresso.setFont(new Font("Verdana", Font.BOLD, 20));
		txtIngresso.setEnabled(false);
		txtIngresso.setEditable(false);
		txtIngresso.setBackground(new Color(243, 243, 243));
		txtIngresso.setBounds(155, 580, 150, 40);
		panelCadastro.add(txtIngresso);

		cbInteiraMeia = new JComboBox<>();
		cbInteiraMeia.setFont(new Font("Verdana", Font.PLAIN, 15));
		cbInteiraMeia.setBounds(155, 370, 150, 40);

		cbInteiraMeia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				tipoIngresso = cbInteiraMeia.getSelectedItem().toString();

				if (tipoIngresso.equals("Inteira")) {
					valorIngresso = 20.00;
				} else if (tipoIngresso.equals("Meia")) {
					valorIngresso = 10.00;
				}

				for (Ingresso ingresso : iDAO.listaIngressos()) {

					fileira = ingresso.getFileira();
					cadeira = ingresso.getNumCadeira();
					idIngresso = ingresso.getIdIngresso();

					txtValor.setText(String.valueOf(valorIngresso));
					txtIngresso.setText(String.valueOf(ingresso.idIngresso));
					txtPoltrona.setText(fileira.toString() + cadeira.toString());

				}

			}

		});

		panelCadastro.add(cbInteiraMeia);

		cbInteiraMeia.addItem("- Selecione");
		cbInteiraMeia.addItem("Inteira");
		cbInteiraMeia.addItem("Meia");

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 315, 380, 2);
		panelCadastro.add(separator);

		lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setForeground(Color.BLACK);
		lblNome.setFont(new Font("Verdana", Font.BOLD, 17));
		lblNome.setBounds(75, 150, 70, 40);
		panelCadastro.add(lblNome);

		txtNome = new JTextField();
		txtNome.setForeground(Color.BLACK);
		txtNome.setFont(new Font("Verdana", Font.BOLD, 20));
		txtNome.setEnabled(false);
		txtNome.setEditable(false);
		txtNome.setBackground(new Color(243, 243, 243));
		txtNome.setBounds(155, 150, 150, 40);
		panelCadastro.add(txtNome);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setForeground(Color.BLACK);
		lblEmail.setFont(new Font("Verdana", Font.BOLD, 17));
		lblEmail.setBounds(75, 215, 70, 40);
		panelCadastro.add(lblEmail);

		txtEmail = new JTextField();
		txtEmail.setForeground(Color.BLACK);
		txtEmail.setFont(new Font("Verdana", Font.BOLD, 20));
		txtEmail.setEnabled(false);
		txtEmail.setEditable(false);
		txtEmail.setBackground(new Color(243, 243, 243));
		txtEmail.setBounds(155, 215, 150, 40);
		panelCadastro.add(txtEmail);

		for (Pessoa pessoa : pDAO.listaPessoas()) {

			txtNome.setText(pessoa.nome);
			txtEmail.setText(pessoa.email);

		}

		// titular
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

		// Numero
		lblNumero = new JLabel("Número ");
		lblNumero.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumero.setForeground(new Color(255, 255, 255));
		lblNumero.setFont(new Font("Verdana", Font.BOLD, 20));
		lblNumero.setBounds(500, 240, 100, 50);
		getContentPane().add(lblNumero);

		txtNumeroCartao = new JTextField();

		/*****************/
		MaskFormatter mascaraNumeroCartao = null;
		try {
			mascaraNumeroCartao = new MaskFormatter("#### #### #### ####");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		txtNumeroCartao = new JFormattedTextField(mascaraNumeroCartao);
		/*****************/

		txtNumeroCartao.setForeground(Color.BLACK);
		txtNumeroCartao.setFont(new Font("Verdana", Font.BOLD, 20));
		txtNumeroCartao.setColumns(10);
		txtNumeroCartao.setBackground(Color.WHITE);
		txtNumeroCartao.setBounds(625, 260, 500, 50);
		getContentPane().add(txtNumeroCartao);

		// Validade
		lblValidade = new JLabel("Validade: ");
		lblValidade.setHorizontalAlignment(SwingConstants.CENTER);
		lblValidade.setForeground(Color.WHITE);
		lblValidade.setFont(new Font("Verdana", Font.BOLD, 20));
		lblValidade.setBounds(490, 400, 115, 50);
		getContentPane().add(lblValidade);

		txtValidade = new JTextField();

		/*****************/
		MaskFormatter mascaraValidade = null;
		try {
			mascaraValidade = new MaskFormatter("##/##");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		txtValidade = new JFormattedTextField(mascaraValidade);
		/*****************/

		txtValidade.setForeground(Color.BLACK);
		txtValidade.setFont(new Font("Verdana", Font.BOLD, 20));
		txtValidade.setColumns(10);
		txtValidade.setBackground(Color.WHITE);
		txtValidade.setBounds(615, 400, 200, 50);
		getContentPane().add(txtValidade);

		// CVV
		lblCVV = new JLabel("CVV:");
		lblCVV.setHorizontalAlignment(SwingConstants.CENTER);
		lblCVV.setForeground(new Color(255, 255, 255));
		lblCVV.setFont(new Font("Verdana", Font.BOLD, 20));
		lblCVV.setBounds(845, 400, 70, 50);
		getContentPane().add(lblCVV);

		lblDocartao = new JLabel("do cartão: ");
		lblDocartao.setHorizontalAlignment(SwingConstants.CENTER);
		lblDocartao.setForeground(Color.WHITE);
		lblDocartao.setFont(new Font("Verdana", Font.BOLD, 20));
		lblDocartao.setBounds(485, 275, 130, 50);
		getContentPane().add(lblDocartao);

		txtCVV = new JTextField();

		/*****************/
		MaskFormatter mascaraCVV = null;
		try {
			mascaraCVV = new MaskFormatter("###");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		txtCVV = new JFormattedTextField(mascaraCVV);
		/*****************/

		txtCVV.setForeground(Color.BLACK);
		txtCVV.setFont(new Font("Verdana", Font.BOLD, 20));
		txtCVV.setColumns(10);
		txtCVV.setBackground(Color.WHITE);
		txtCVV.setBounds(925, 400, 200, 50);
		getContentPane().add(txtCVV);

		// Btn Compra
		btnCompra = new JButton("Finalizar Compra");
		btnCompra.setBorder(new LineBorder(new Color(128, 255, 128), 3, true));
		btnCompra.setForeground(Color.BLACK);
		btnCompra.setBackground(Color.WHITE);
		btnCompra.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (txtTitular.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "O campo do titular deve ser preenchido!");
					
				} else if (txtNumeroCartao.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "O campo do número do cartão deve ser preenchido!");
					
				} else if (txtValidade.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "O campo da validade deve ser preenchido!");
					
				} else if (txtCVV.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "O campo do cvv deve ser preenchido!");
					
				} else {

					for (Filme filme : fDAO.listaFilmes()) {

						ingresso.setFilme(filme);
						System.out.println(ingresso.getFilme());

					}

					for (Pessoa pessoa : pDAO.listaPessoas()) {

						ingresso.setPessoa(pessoa);
						System.out.println(ingresso.getPessoa());

					}

					for (Sessao sessao : sDAO.listaSessoes()) {

						ingresso.setSessao(sessao);
						System.out.println(ingresso.getSessao());

					}

					Ingresso ingresso = null;

					for (Ingresso ing : iDAO.listaIngressos()) {

						ingresso = ing;

						fileira = (ingresso.getFileira());
						idIngresso = (ingresso.getIdIngresso());
						cadeira = (ingresso.getNumCadeira());
						ingresso.setValor(valorIngresso);

					}

					System.out.println("DEBUG: " + ingresso);

					boolean atualizacao = iDAO.alterarIngresso(ingresso, idIngresso, sessao, pessoa, filme,
							valorIngresso, fileira, cadeira);
					if (atualizacao) {
						JOptionPane.showMessageDialog(null, "Compra realizada com sucesso!");
					} else {
						JOptionPane.showMessageDialog(null, "Não foi possível realizar a compra.");
					}

					new Principal().setVisible(true);
					dispose();
				}

				
			}

			private void dispose() {
				setVisible(false);
			}
		});

		btnCompra.setFont(new Font("Verdana", Font.BOLD, 19));
		btnCompra.setBounds(525, 575, 275, 65);
		getContentPane().add(btnCompra);

		// Btn TelaPrincipal
		btnTelaPrincipal = new JButton("HOME");
		btnTelaPrincipal.setBorder(new LineBorder(new Color(255, 128, 128), 3, true));
		btnTelaPrincipal.setForeground(Color.BLACK);
		btnTelaPrincipal.setFont(new Font("Verdana", Font.BOLD, 20));
		btnTelaPrincipal.setBackground(Color.WHITE);
		btnTelaPrincipal.setBounds(925, 575, 275, 65);

		btnTelaPrincipal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (Ingresso ingresso : iDAO.listaIngressos()) {

					Boolean excluir = iDAO.deletarIngresso(ingresso, ingresso.getIdIngresso());
					if (excluir) {
						JOptionPane.showMessageDialog(null, "Compra não realizada");

						new Principal().setVisible(true);
						dispose();
					} else {
						JOptionPane.showMessageDialog(null, "Não foi possível voltar para a tela principal");
					}
					break;
				}
			}

			private void dispose() {
				setVisible(false);
			}
		});

		getContentPane().add(btnTelaPrincipal);

	}
}