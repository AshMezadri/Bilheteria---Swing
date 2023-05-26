package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Perfil extends JFrame {

	private JPanel JanelaPerfil;
	private JButton btnSalvar, btnAtualizar;
	private JPanel faixa;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtCPF;
	private JTextField txtSenha;
	private JButton btnTelaPrincipal;

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

		JLabel lblPerfil = new JLabel("Perfil");
		lblPerfil.setFont(new Font("Verdana", Font.BOLD, 53));
		lblPerfil.setBounds(110, 250, 175, 70);
		JanelaPerfil.add(lblPerfil);

		faixa = new JPanel();
		faixa.setBackground(Color.WHITE);
		faixa.setBounds(0, 0, 400, 705);
		getContentPane().add(faixa);
		faixa.setLayout(null);

		JLabel lblIconPerfil = new JLabel("");
		lblIconPerfil.setBounds(150, 350, 75, 75);
		faixa.add(lblIconPerfil);
		Image iconPerfil = new ImageIcon(this.getClass().getResource("/profileResized.png")).getImage();
		lblIconPerfil.setIcon(new ImageIcon(iconPerfil));

		// btn atualizar infos
		btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBackground(new Color(202, 220, 249));
		btnAtualizar.setFont(new Font("Verdana", Font.BOLD, 20));
		btnAtualizar.setBounds(475, 560, 200, 65);
		JanelaPerfil.add(btnAtualizar);
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		// btn salvar
		btnSalvar = new JButton("Salvar");
		btnSalvar.setBackground(new Color(146, 241, 170));
		btnSalvar.setFont(new Font("Verdana", Font.BOLD, 20));
		btnSalvar.setBounds(725, 560, 200, 65);
		JanelaPerfil.add(btnSalvar);
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		// btn deletar
		JButton btnDeletar = new JButton("Deletar conta");
		btnDeletar.setBackground(new Color(242, 146, 132));
		btnDeletar.setFont(new Font("Verdana", Font.BOLD, 20));
		btnDeletar.setBounds(975, 560, 200, 65);
		JanelaPerfil.add(btnDeletar);
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  int opcao_escolhida = JOptionPane.showConfirmDialog(null, "Deseja sair do sistema ?", "Sair",  JOptionPane.YES_NO_OPTION);
				        if (opcao_escolhida == JOptionPane.YES_OPTION)
				        {
				        	new Inicio().setVisible(true);
							this.dispose();
						}
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});

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
		txtNome.setBackground(Color.LIGHT_GRAY);
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
		txtEmail.setBackground(Color.LIGHT_GRAY);
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
		txtCPF.setBackground(Color.LIGHT_GRAY);
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
		txtSenha.setBackground(Color.LIGHT_GRAY);
		txtSenha.setBounds(625, 435, 500, 50);
		JanelaPerfil.add(txtSenha);
		
		// btn voltar main
		
		btnTelaPrincipal = new JButton("Voltar");
		btnTelaPrincipal.setFont(new Font("Verdana", Font.BOLD, 20));
		btnTelaPrincipal.setBackground(Color.WHITE);
		btnTelaPrincipal.setBounds(1150, 30, 150, 65);
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
