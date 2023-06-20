package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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

import controle.FilmeDAO;
import controle.IngressoDAO;
import modelo.Ingresso;
import modelo.Filme;

import javax.swing.JTable;

public class Historico extends JFrame {

	private JPanel contentPane;
	private IngressoDAO iDAO = IngressoDAO.getInstancia();
	private FilmeDAO fDAO = FilmeDAO.getInstancia();
	private JTable tbIngresso;
	private JButton btnDeletar;
	private Character fileira;
	private Integer cadeira;
	private Filme filme = new Filme();

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
				dispose();
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
		tbIngresso.setDefaultEditor(Object.class, null);

		tbIngresso.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int selectedRow = tbIngresso.getSelectedRow();
				if (selectedRow != -1) {
					btnDeletar.setEnabled(true);
				} else {
					btnDeletar.setEnabled(false);
				}
			}
		});
		scrollPane.setViewportView(tbIngresso);
		DefaultTableModel modelo = new DefaultTableModel(new Object[][] {},
				new String[] { "ID Ingresso", "Filme", "Assento" });
		tbIngresso.setModel(modelo);

		btnDeletar = new JButton("Deletar");
		btnDeletar.setBackground(Color.WHITE);
		btnDeletar.setFont(new Font("Verdana", Font.BOLD, 15));
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Integer idDeletar = Integer.valueOf(JOptionPane.showInputDialog("Informe a id do Ingresso: "));

				for (Ingresso ingresso : iDAO.listaIngressos()) {
					if (ingresso.getIdIngresso().equals(idDeletar)) {

						boolean deletado = iDAO.deletarIngresso(ingresso, idDeletar);
						if (deletado) {
							JOptionPane.showMessageDialog(null, "Ingresso cancelado com sucesso");

							int selectedRow = tbIngresso.getSelectedRow();
							if (selectedRow != -1) {
								int idIngresso = (int) tbIngresso.getValueAt(selectedRow, 0);
								iDAO.deletarIngresso(ingresso, idIngresso);
								modelo.removeRow(selectedRow);
								btnDeletar.setEnabled(false);
							}
							// Restaurar campos para valores vazios ou desabilitados, se necessário
						} else {
							JOptionPane.showMessageDialog(null, "Falha ao cancelar ingresso.");
						}
						break;
					}
				}

			}
		});
		btnDeletar.setBounds(1010, 270, 100, 50);
		contentPane.add(btnDeletar);

		for (Ingresso ingresso : iDAO.listaIngressos()) {
			fileira = ingresso.getFileira();
			cadeira = ingresso.getNumCadeira();

			for (Filme filme : fDAO.listaFilmes()) {

				ingresso.setFilme(filme);
				System.out.println(ingresso.getFilme());

			}
			modelo.addRow(new Object[] { ingresso.getIdIngresso(), ingresso.getFilme().getNomeFilme(),
					fileira.toString() + cadeira.toString() });
		}

	}
}
