package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import controle.IngressoDAO;
import modelo.Ingresso;

import javax.swing.JTable;

public class Historico extends JFrame {

	private JPanel contentPane;
	private JTable tblIngressos;
	private IngressoDAO iDAO = IngressoDAO.getInstancia();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Historico frame = new Historico();
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
	public Historico() {

		setTitle("Histórico de Compra");
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0, 0, screen.width, screen.height - 30);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(7, 1, 88));
		contentPane.setToolTipText("Histórico");
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnTelaPrincipal = new JButton("Voltar");
		btnTelaPrincipal.setBorder(new LineBorder(new Color(210, 123, 132), 4));
		btnTelaPrincipal.setFont(new Font("Verdana", Font.BOLD, 20));
		btnTelaPrincipal.setBackground(Color.WHITE);
		btnTelaPrincipal.setBounds(1150, 50, 150, 65);
		contentPane.add(btnTelaPrincipal);
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

		JPanel panel = new JPanel();
		panel.setBounds(0, 30, 1375, 125);
		panel.setBackground(UIManager.getColor("Button.highlight"));
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblHistorico = new JLabel("HISTÓRICO");
		lblHistorico.setBounds(30, 25, 395, 75);
		panel.add(lblHistorico);
		lblHistorico.setFont(new Font("Verdana", Font.BOLD, 57));

		tblIngressos = new JTable();
		tblIngressos.setBorder(new LineBorder(new Color(0, 0, 128), 3, true));

		DefaultTableModel tableModel = new DefaultTableModel(null,
				new String[] { "ID do Ingresso", "Filme", "Tipo de Ingresso", "Valor" });
		tblIngressos.setModel(tableModel);

		// Preencha a tabela com os dados dos ingressos
		for (Ingresso ingresso : iDAO.listaIngressos()) {
			Object[] rowData = new Object[4]; // Array para armazenar os dados de cada linha

			// Preencha os dados do ingresso nas colunas correspondentes
			rowData[0] = ingresso.getIdIngresso();
			rowData[1] = ingresso.getFilme();
			rowData[2] = ingresso.getValor();

			tableModel.addRow(rowData); // Adicione a linha à tabela
		}

		// Defina o tamanho e a posição da tabela
		tblIngressos.setBounds(350, 275, 700, 300);

		contentPane.add(tblIngressos);

	}
}
