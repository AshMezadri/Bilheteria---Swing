package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

import modelo.Pessoa;
import controle.PessoaDAO;

public class Perfil extends JFrame {

	private JPanel JanelaPerfil;
	private JButton btnSalvar, btnAtualizar;
	private JPanel faixa;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtCPF;
	private JTextField txtSenha;
	private JButton btnTelaPrincipal;
	private PessoaDAO pDAO = PessoaDAO.getInstancia();
	private Pessoa p = new Pessoa();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Perfil frame = new Perfil();
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
	public Perfil() {
		setTitle("Perfil");
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0, 0, screen.width, screen.height - 30);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JanelaPerfil = new JPanel();
		JanelaPerfil.setBackground(new Color(7, 1, 88));
		JanelaPerfil.setToolTipText("Hitórico");
		JanelaPerfil.setForeground(Color.WHITE);
		JanelaPerfil.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(JanelaPerfil);
		JanelaPerfil.setLayout(null);

		faixa = new JPanel();
		faixa.setBackground(Color.WHITE);
		faixa.setBounds(0, 0, 400, 705);
		getContentPane().add(faixa);
		faixa.setLayout(null);
		Image iconPerfil = new ImageIcon(this.getClass().getResource("/profileResized.png")).getImage();

		JLabel lblPerfil = new JLabel(" Perfil");
		lblPerfil.setForeground(Color.BLACK);
		lblPerfil.setBounds(85, 286, 200, 70);
		faixa.add(lblPerfil);
		lblPerfil.setBorder(null);
		lblPerfil.setFont(new Font("Verdana", Font.BOLD, 53));

		// nome
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setForeground(Color.WHITE);
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setFont(new Font("Verdana", Font.BOLD, 20));
		lblNome.setBounds(500, 135, 95, 50);
		JanelaPerfil.add(lblNome);

		txtNome = new JTextField();
		txtNome.setEnabled(false);
		txtNome.setEditable(false);
		txtNome.setForeground(Color.BLACK);
		txtNome.setFont(new Font("Verdana", Font.BOLD, 20));
		txtNome.setColumns(10);
		txtNome.setBackground(Color.WHITE);
		txtNome.setBounds(625, 135, 500, 50);
		JanelaPerfil.add(txtNome);

		// email
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setFont(new Font("Verdana", Font.BOLD, 20));
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBounds(500, 235, 90, 50);
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		JanelaPerfil.add(lblEmail);

		txtEmail = new JTextField();
		txtEmail.setForeground(Color.BLACK);
		txtEmail.setFont(new Font("Verdana", Font.BOLD, 20));
		txtEmail.setEnabled(false);
		txtEmail.setEditable(false);
		txtEmail.setColumns(10);
		txtEmail.setBackground(Color.WHITE);
		txtEmail.setBounds(625, 235, 500, 50);
		JanelaPerfil.add(txtEmail);

		// cpf
		JLabel lblCPF = new JLabel("CPF: ");
		lblCPF.setFont(new Font("Verdana", Font.BOLD, 20));
		lblCPF.setForeground(Color.WHITE);
		lblCPF.setHorizontalAlignment(SwingConstants.CENTER);
		lblCPF.setBounds(520, 335, 75, 50);
		JanelaPerfil.add(lblCPF);

		txtCPF = new JTextField();
		txtCPF.setForeground(Color.BLACK);
		txtCPF.setFont(new Font("Verdana", Font.BOLD, 20));
		txtCPF.setEnabled(false);
		txtCPF.setEditable(false);
		txtCPF.setColumns(10);
		txtCPF.setBackground(Color.WHITE);
		txtCPF.setBounds(625, 335, 500, 50);
		JanelaPerfil.add(txtCPF);

		// senha
		JLabel lblSenha = new JLabel("Senha: ");
		lblSenha.setHorizontalAlignment(SwingConstants.CENTER);
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setFont(new Font("Verdana", Font.BOLD, 20));
		lblSenha.setBounds(500, 435, 95, 50);
		JanelaPerfil.add(lblSenha);

		txtSenha = new JPasswordField();
		txtSenha.setForeground(Color.BLACK);
		txtSenha.setFont(new Font("Verdana", Font.BOLD, 20));
		txtSenha.setEnabled(false);
		txtSenha.setEditable(false);
		txtSenha.setColumns(10);
		txtSenha.setBackground(Color.WHITE);
		txtSenha.setBounds(625, 435, 500, 50);
		JanelaPerfil.add(txtSenha);

		for (Pessoa pessoa : pDAO.listaPessoas()) {

			String cpf = String.valueOf(pessoa.cpf);

			txtNome.setText(pessoa.nome);
			txtEmail.setText(pessoa.email);
			txtCPF.setText(cpf);
			txtSenha.setText(pessoa.senha);
		}

		// btn atualizar infos
		btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setForeground(Color.BLACK);
		btnAtualizar.setBorder(new LineBorder(new Color(0, 255, 255), 3, true));
		btnAtualizar.setBackground(new Color(128, 255, 255));
		btnAtualizar.setFont(new Font("Verdana", Font.BOLD, 20));
		btnAtualizar.setBounds(475, 560, 200, 65);
		JanelaPerfil.add(btnAtualizar);
		btnAtualizar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String senhaAtualizar = String.valueOf(JOptionPane.showInputDialog("Informe sua senha: "));

				for (Pessoa pessoa : pDAO.listaPessoas()) {
					if (pessoa.getSenha().equals(senhaAtualizar)) {
						txtNome.setEnabled(true);
						txtNome.setEditable(true);

						txtEmail.setEditable(true);
						txtEmail.setEnabled(true);

						txtCPF.setEnabled(true);
						txtCPF.setEditable(true);

						// btn salvar
						btnSalvar = new JButton("Salvar");
						btnSalvar.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
						btnSalvar.setBackground(new Color(146, 241, 170));
						btnSalvar.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 20));
						btnSalvar.setBounds(1150, 128, 150, 65);
						JanelaPerfil.add(btnSalvar);
						btnSalvar.addActionListener(new ActionListener() {

							public void actionPerformed(ActionEvent e) {

								boolean atualizacao = pDAO.alterarPessoa(p, null, txtNome.getText(), txtEmail.getText(),
										senhaAtualizar);

								if (atualizacao) {
									JOptionPane.showMessageDialog(null, "Atualização concluída com sucesso");
								} else {
									JOptionPane.showMessageDialog(null, "Atualização não concluída");
								}

								for (Pessoa pessoa : pDAO.listaPessoas()) {
									String cpf = String.valueOf(pessoa.getCpf());
									txtNome.setText(pessoa.getNome());
									txtEmail.setText(pessoa.getEmail());
									txtCPF.setText(cpf);
									txtSenha.setText(pessoa.getSenha());
								}
							}
						});

					} else {
						JOptionPane.showInputDialog("Senha não compatível.");
					}
				}
			}
		});

		// btn deletar
		JButton btnDeletar = new JButton("Deletar conta");
		btnDeletar.setForeground(Color.BLACK);
		btnDeletar.setBorder(new LineBorder(new Color(255, 128, 128), 3, true));
		btnDeletar.setBackground(new Color(242, 146, 132));
		btnDeletar.setFont(new Font("Verdana", Font.BOLD, 20));
		btnDeletar.setBounds(975, 560, 200, 65);
		JanelaPerfil.add(btnDeletar);
		btnDeletar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String senhaDeletar = String.valueOf(JOptionPane.showInputDialog("Informe sua senha: "));

				for (Pessoa pessoa : pDAO.listaPessoas()) {
					if (pessoa.getSenha().equals(senhaDeletar)) {

						boolean deletado = pDAO.deletarPessoa(pessoa, pessoa.getCpf());
						if (deletado) {
							JOptionPane.showMessageDialog(null, "Pessoa deletada com sucesso");

							new Principal().setVisible(true);
							this.dispose();
							// Restaurar campos para valores vazios ou desabilitados, se necessário
						} else {
							JOptionPane.showMessageDialog(null, "Falha ao deletar pessoa");
						}
						break;
					}
				}

			}

			private void dispose() {
				setVisible(false);

			}
		});

		// btn voltar main
		btnTelaPrincipal = new JButton("Voltar");
		btnTelaPrincipal.setForeground(Color.BLACK);
		btnTelaPrincipal.setBorder(new LineBorder(new Color(7, 1, 88), 3, true));
		btnTelaPrincipal.setFont(new Font("Verdana", Font.BOLD, 20));
		btnTelaPrincipal.setBackground(Color.WHITE);
		btnTelaPrincipal.setBounds(730, 560, 200, 65);
		JanelaPerfil.add(btnTelaPrincipal);
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

	}
}
