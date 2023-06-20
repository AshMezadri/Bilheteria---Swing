package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import controle.IngressoDAO;
import modelo.Ingresso;

import javax.swing.JTable;
import javax.swing.JTextField;

public class Historico extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome, txtCPF;
	private IngressoDAO iDAO = IngressoDAO.getInstancia();
	private JTable tbIngresso;
	private Ingresso ingressoSelecionado;

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

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(300, 270, 700, 300);
		contentPane.add(scrollPane);

		tbIngresso = new JTable();
		tbIngresso.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				DefaultTableModel modelo = new DefaultTableModel(new Object[][] {},
						new String[] { "ID Ingresso", "Filme", "Assento" });

				for (Ingresso ingresso : iDAO.listaIngressos()) {
					modelo.addRow(new Object[] { ingresso.getIdIngresso(), ingresso.getFilme().getNomeFilme(),
							ingresso.getFileira() + ingresso.getNumCadeira() });

				}

			}
		});
		scrollPane.setViewportView(tbIngresso);
		tbIngresso
				.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "ID Ingresso", "Filme", "Assento" }));

	}
}
