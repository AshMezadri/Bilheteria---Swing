package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Perfil extends JFrame {

	private JPanel JanelaPerfil;
	private JButton btnSalvar;
	private JTextField textFaixa;
	private JTextField textSemHistorico;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0, 0,screen.width,screen.height - 30);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JanelaPerfil = new JPanel();
		JanelaPerfil.setBackground(new Color(69, 159, 185));
		JanelaPerfil.setToolTipText("Hitórico");
		JanelaPerfil.setForeground(Color.WHITE);
		JanelaPerfil.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(JanelaPerfil);
		JanelaPerfil.setLayout(null);
		
		JLabel lblPerfil = new JLabel("Perfil");
		lblPerfil.setFont(new Font("Verdana", Font.BOLD, 57));
		lblPerfil.setBounds(876, 52, 664, 72);
		JanelaPerfil.add(lblPerfil);
		
		btnSalvar = new JButton("Salvar Informações");
		btnSalvar.setEnabled(false);
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalvar.setFont(new Font("Verdana", Font.BOLD, 14));
		btnSalvar.setBounds(893, 891, 200, 54);
		JanelaPerfil.add(btnSalvar);
		
		textFaixa = new JTextField();
		textFaixa.setEnabled(false);
		textFaixa.setEditable(false);
		textFaixa.setBounds(-23, 19, 1959, 136);
		JanelaPerfil.add(textFaixa);
		textFaixa.setColumns(10);
		
		
		
		JButton btnAtualizar = new JButton("Atualizar Informações ");
		btnAtualizar.setFont(new Font("Verdana", Font.BOLD, 14));
		btnAtualizar.setBounds(645, 794, 240, 54);
		JanelaPerfil.add(btnAtualizar);
		
		JButton btnDeletar = new JButton("Deletar conta");
		btnDeletar.setFont(new Font("Verdana", Font.BOLD, 14));
		btnDeletar.setBounds(1092, 794, 240, 54);
		JanelaPerfil.add(btnDeletar);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setFont(new Font("Verdana", Font.BOLD, 25));
		lblNome.setBounds(10, 195, 197, 131);
		JanelaPerfil.add(lblNome);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Verdana", Font.BOLD, 20));
		textField.setColumns(10);
		textField.setBackground(new Color(69, 159, 185));
		textField.setBounds(134, 231, 613, 63);
		JanelaPerfil.add(textField);
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setFont(new Font("Verdana", Font.BOLD, 25));
		lblEmail.setBounds(10, 339, 197, 131);
		JanelaPerfil.add(lblEmail);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.BLACK);
		textField_1.setFont(new Font("Verdana", Font.BOLD, 20));
		textField_1.setEnabled(false);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(69, 159, 185));
		textField_1.setBounds(134, 375, 613, 63);
		JanelaPerfil.add(textField_1);
		
		JLabel lblCPF = new JLabel("CPF: ");
		lblCPF.setFont(new Font("Verdana", Font.BOLD, 25));
		lblCPF.setBounds(10, 479, 197, 131);
		JanelaPerfil.add(lblCPF);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.BLACK);
		textField_2.setFont(new Font("Verdana", Font.BOLD, 20));
		textField_2.setEnabled(false);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBackground(new Color(69, 159, 185));
		textField_2.setBounds(134, 515, 613, 63);
		JanelaPerfil.add(textField_2);
		
		JLabel lblSenha = new JLabel("Senha: ");
		lblSenha.setFont(new Font("Verdana", Font.BOLD, 25));
		lblSenha.setBounds(10, 600, 197, 131);
		JanelaPerfil.add(lblSenha);
		
		textField_3 = new JTextField();
		textField_3.setForeground(Color.BLACK);
		textField_3.setFont(new Font("Verdana", Font.BOLD, 20));
		textField_3.setEnabled(false);
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(69, 159, 185));
		textField_3.setBounds(134, 636, 613, 63);
		JanelaPerfil.add(textField_3);
	}
}
