package visao;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controle.PessoaDAO;
import modelo.Pessoa;

public class JanelaPessoa extends JFrame {
	private JLabel cpfLabel, emailLabel, nomeLabel, senhaLabel;
	private JTextField cpfTextField, emailTextField, nomeTextField;
	private JPasswordField senhaField;
	private JButton cadastrarButton;
	private Pessoa p = new Pessoa();
	private PessoaDAO pDAO = new PessoaDAO();

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPessoa frame = new JanelaPessoa();
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
	public JanelaPessoa() {
		// Define o layout da tela
		setLayout(new GridBagLayout());

		// Cria os componentes da tela
		cpfLabel = new JLabel("CPF:");
		emailLabel = new JLabel("E-mail:");
		nomeLabel = new JLabel("Nome:");
		senhaLabel = new JLabel("Senha:");
		cpfTextField = new JTextField(20);
		emailTextField = new JTextField(20);
		nomeTextField = new JTextField(20);
		senhaField = new JPasswordField(20);
		cadastrarButton = new JButton("Cadastrar");

		pDAO = PessoaDAO.getInstancia();

		// Adiciona os componentes na tela
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.LINE_END;
		gbc.insets = new Insets(5, 5, 5, 5);
		add(cpfLabel, gbc);

		gbc.gridy++;
		add(emailLabel, gbc);

		gbc.gridy++;
		add(nomeLabel, gbc);

		gbc.gridy++;
		add(senhaLabel, gbc);

		gbc.gridx++;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.LINE_START;
		add(cpfTextField, gbc);

		gbc.gridy++;
		add(emailTextField, gbc);

		gbc.gridy++;
		add(nomeTextField, gbc);

		gbc.gridy++;
		add(senhaField, gbc);

		gbc.gridx = 0;
		gbc.gridy++;
		gbc.gridwidth = 2;
		gbc.anchor = GridBagConstraints.CENTER;
		add(cadastrarButton, gbc);

		// Define o listener para o botão de cadastro
		cadastrarButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//acao("Inserir");
			}
		});

		// Define as configurações da janela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 200);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}

}
