package visao;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controle.PessoaDAO;
import modelo.Pessoa;

public class TelaCadastroPessoa extends JFrame {
	private JLabel cpfLabel, emailLabel, nomeLabel, senhaLabel;
	private JTextField cpfTextField, emailTextField, nomeTextField;
	private JPasswordField senhaField;
	private JButton cadastrarButton;
	private JTable tabelaPessoas;
	private DefaultTableModel modeloTabela;
	private List<Pessoa> listaPessoas;
	private PessoaDAO dao;

	public TelaCadastroPessoa() {
		super("Cadastro de Pessoa");

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
		cadastrarButton.setBackground(new Color(255, 255, 153)); // amarelo claro
		
		tabelaPessoas = new JTable();
		modeloTabela = new DefaultTableModel(new Object[][] {}, new String[] { "CPF", "E-mail", "Nome"});
		tabelaPessoas.setModel(modeloTabela);
		JScrollPane scrollPane = new JScrollPane(tabelaPessoas);
		dao = PessoaDAO.getInstancia();
		this.listaPessoas = dao.getList();

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

		gbc.gridx = 0;
		gbc.gridy++;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1;
		gbc.weighty = 1;
		add(scrollPane, gbc);

		// Define o listener para o botão de cadastro
		cadastrarButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Obtém os valores dos campos
				Long cpf = Long.parseLong(cpfTextField.getText());
				String email = emailTextField.getText();
				String nome = nomeTextField.getText();
				String senha = new String(senhaField.getPassword());

				// Cria uma nova pessoa com os valores informados
				Pessoa pessoa = new Pessoa();
				pessoa.setCpf(cpf);
				pessoa.setEmail(email);
				pessoa.setNome(nome);

				dao = PessoaDAO.getInstancia();
				dao.insert(pessoa);
				
				ArrayList<Pessoa> Lista = new ArrayList<>();
				Lista = dao.getList();
				atualizarTabelaPessoas(Lista);
			}
		});
	}
	
	public void atualizarTabelaPessoas(ArrayList<Pessoa> pessoas) {
	    // Limpa os dados do modelo da tabela
	    modeloTabela.setRowCount(0);

	    // Adiciona as linhas na tabela com os dados das pessoas
	    for (Pessoa pessoa : pessoas) {
	        Object[] linha = {pessoa.getCpf(), pessoa.getEmail(), pessoa.getNome(), };
	        modeloTabela.addRow(linha);
	    }
	}

	public static void main(String[] args) {
		TelaCadastroPessoa main = new TelaCadastroPessoa();
		main.setVisible(true);
		main.setExtendedState(JFrame.MAXIMIZED_BOTH);
		main.getContentPane().setBackground(new Color(0, 255, 255));
	}
}
