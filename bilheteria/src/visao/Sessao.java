package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import java.awt.Label;
import javax.swing.JTextPane;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sessao extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sessao frame = new Sessao();
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
	public Sessao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(MAXIMIZED_BOTH);
		setBounds(100, 100, 14500, 13000);
		contentPane = new JPanel();
		contentPane.setBounds(100, 100, 450, 300);
		contentPane.setBackground(new Color(7, 1, 88));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 29, 2020, 125);
		panel.setBackground(UIManager.getColor("Button.highlight"));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblSessao = new JLabel("SESSÃO");
		lblSessao.setBounds(807, 22, 268, 74);
		lblSessao.setVerticalAlignment(SwingConstants.BOTTOM);
		lblSessao.setFont(new Font("Verdana", Font.BOLD, 60));
		lblSessao.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblSessao);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(71, 171, 1778, 788);
		contentPane.add(tabbedPane);
		
		JPanel horarios = new JPanel();
		horarios.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Horários", null, horarios, null);
		horarios.setLayout(null);
		
		JLabel lblGG = new JLabel("Guardiões da Galáxia");
		lblGG.setFont(new Font("Verdana", Font.BOLD, 14));
		lblGG.setBounds(45, 96, 167, 14);
		horarios.add(lblGG);
		
		JLabel lblS = new JLabel("Shrek 2");
		lblS.setFont(new Font("Verdana", Font.BOLD, 14));
		lblS.setBounds(45, 341, 65, 14);
		horarios.add(lblS);
		
		JLabel lblNewLabel = new JLabel("Barbie");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 14));
		lblNewLabel.setBounds(45, 546, 65, 14);
		horarios.add(lblNewLabel);
		
		JLabel lblDub = new JLabel("Dublado");
		lblDub.setFont(new Font("Verdana", Font.BOLD, 20));
		lblDub.setBounds(657, 46, 98, 26);
		horarios.add(lblDub);
		
		JLabel lblLeg = new JLabel("Legendado");
		lblLeg.setFont(new Font("Verdana", Font.BOLD, 20));
		lblLeg.setBounds(1142, 48, 141, 23);
		horarios.add(lblLeg);
		
		JButton btnDubladoG = new JButton("16:00h");
		btnDubladoG.setBackground(new Color(255, 255, 255));
		btnDubladoG.setBounds(657, 200, 112, 44);
		horarios.add(btnDubladoG);
		
		JButton btnLegendadoG = new JButton("18:30h");
		btnLegendadoG.setBackground(new Color(255, 255, 255));
		btnLegendadoG.setBounds(1159, 200, 112, 44);
		horarios.add(btnLegendadoG);
		
		JButton btnDubladoS = new JButton("20:00h");
		btnDubladoS.setBackground(new Color(255, 255, 255));
		btnDubladoS.setBounds(657, 413, 112, 44);
		horarios.add(btnDubladoS);
		
		JButton btnLegendadoS = new JButton("19:30h");
		btnLegendadoS.setBackground(new Color(255, 255, 255));
		btnLegendadoS.setBounds(1159, 413, 112, 44);
		horarios.add(btnLegendadoS);
		
		JButton btnDubladoB = new JButton("17:00h");
		btnDubladoB.setBackground(new Color(255, 255, 255));
		btnDubladoB.setBounds(657, 624, 112, 44);
		horarios.add(btnDubladoB);
		
		JButton btnLegendadoB = new JButton("18:30h");
		btnLegendadoB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLegendadoB.setBackground(new Color(255, 255, 255));
		btnLegendadoB.setBounds(1159, 624, 112, 44);
		horarios.add(btnLegendadoB);
		
		JLabel lblGDG = new JLabel("");
		lblGDG.setBounds(34, 114, 141, 216);
		horarios.add(lblGDG);
		Image img = new ImageIcon(this.getClass().getResource("/GuardioesGalaxia.png")).getImage();
		lblGDG.setIcon(new ImageIcon(img));
		
		JLabel lblShrek = new JLabel("");
		lblShrek.setBounds(45, 366, 112, 169);
		horarios.add(lblShrek);
		Image imgShrek = new ImageIcon(this.getClass().getResource("/shrekDois.png")).getImage();
		lblShrek.setIcon(new ImageIcon(imgShrek));
		
		JLabel lblBarbie = new JLabel("");
		lblBarbie.setBounds(45, 571, 112, 159);
		horarios.add(lblBarbie);
		Image imgBarb = new ImageIcon(this.getClass().getResource("/barb.png")).getImage();
		lblBarbie.setIcon(new ImageIcon(imgBarb));
		
		JPanel Assentos = new JPanel();
		tabbedPane.addTab("Assentos", null, Assentos, null);
		Image imgS = new ImageIcon(this.getClass().getResource("/Shrek2.png")).getImage();
		Image imgB = new ImageIcon(this.getClass().getResource("/Barbie.png")).getImage();
		Image imgG = new ImageIcon(this.getClass().getResource("/GuardioesG.png")).getImage();

	}
}
