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

import javax.swing.JButton;

import java.awt.Label;
import javax.swing.JTextPane;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;


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
		Assentos.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Assentos", null, Assentos, null);
		Assentos.setLayout(null);
		
		JButton btn1A = new JButton("");
		btn1A.setBackground(new Color(255, 255, 255));
		btn1A.setBounds(675, 162, 66, 65);
		Assentos.add(btn1A);
		
		JLabel lblA = new JLabel("A");
		lblA.setFont(new Font("Verdana", Font.BOLD, 22));
		lblA.setBounds(640, 182, 25, 28);
		Assentos.add(lblA);
		
		JLabel lbl1 = new JLabel("1");
		lbl1.setFont(new Font("Verdana", Font.BOLD, 22));
		lbl1.setBounds(700, 123, 19, 28);
		Assentos.add(lbl1);
		
		JLabel lbl2 = new JLabel("2");
		lbl2.setFont(new Font("Verdana", Font.BOLD, 22));
		lbl2.setBounds(787, 121, 19, 32);
		Assentos.add(lbl2);
		
		JLabel lbl3 = new JLabel("3");
		lbl3.setFont(new Font("Verdana", Font.BOLD, 22));
		lbl3.setBounds(871, 121, 19, 32);
		Assentos.add(lbl3);
		
		JLabel lbl4 = new JLabel("4");
		lbl4.setFont(new Font("Verdana", Font.BOLD, 22));
		lbl4.setBounds(951, 121, 19, 32);
		Assentos.add(lbl4);
		
		JLabel lbl5 = new JLabel("5");
		lbl5.setFont(new Font("Verdana", Font.BOLD, 22));
		lbl5.setBounds(1039, 121, 17, 32);
		Assentos.add(lbl5);
		
		JLabel lblB = new JLabel("B");
		lblB.setFont(new Font("Verdana", Font.BOLD, 22));
		lblB.setBounds(640, 262, 25, 28);
		Assentos.add(lblB);
		
		JButton btn2A = new JButton("");
		btn2A.setBackground(new Color(255, 255, 255));
		btn2A.setBounds(763, 162, 66, 65);
		Assentos.add(btn2A);
		
		JButton btn3A = new JButton("");
		btn3A.setBackground(new Color(255, 255, 255));
		btn3A.setBounds(848, 162, 66, 65);
		Assentos.add(btn3A);
		
		JButton btn4A = new JButton("");
		btn4A.setBackground(new Color(255, 255, 255));
		btn4A.setFont(new Font("Verdana", Font.BOLD, 22));
		btn4A.setHorizontalAlignment(SwingConstants.RIGHT);
		btn4A.setBounds(931, 162, 66, 65);
		Assentos.add(btn4A);
		
		JButton btn5A = new JButton("");
		btn5A.setBackground(new Color(255, 255, 255));
		btn5A.setFont(new Font("Verdana", Font.BOLD, 22));
		btn5A.setBounds(1016, 162, 66, 65);
		Assentos.add(btn5A);
		
		JButton btn1B = new JButton("");
		btn1B.setBackground(new Color(255, 255, 255));
		btn1B.setFont(new Font("Verdana", Font.BOLD, 22));
		btn1B.setBounds(675, 248, 66, 65);
		Assentos.add(btn1B);
		
		JButton btn2B = new JButton("");
		btn2B.setBackground(new Color(255, 255, 255));
		btn2B.setFont(new Font("Verdana", Font.BOLD, 22));
		btn2B.setHorizontalAlignment(SwingConstants.RIGHT);
		btn2B.setBounds(763, 248, 66, 65);
		Assentos.add(btn2B);
		
		JButton btn3B = new JButton("");
		btn3B.setBackground(new Color(255, 255, 255));
		btn3B.setHorizontalAlignment(SwingConstants.RIGHT);
		btn3B.setBounds(848, 248, 66, 65);
		Assentos.add(btn3B);
		
		JButton btn4B = new JButton("");
		btn4B.setBackground(new Color(255, 255, 255));
		btn4B.setHorizontalAlignment(SwingConstants.RIGHT);
		btn4B.setBounds(931, 248, 66, 65);
		Assentos.add(btn4B);
		
		JButton btn5B = new JButton("");
		btn5B.setBackground(new Color(255, 255, 255));
		btn5B.setBounds(1016, 248, 66, 65);
		Assentos.add(btn5B);
		
		JLabel lblC = new JLabel("C");
		lblC.setFont(new Font("Verdana", Font.BOLD, 22));
		lblC.setBounds(640, 356, 25, 21);
		Assentos.add(lblC);
		
		JButton btn1C = new JButton("");
		btn1C.setBackground(new Color(255, 255, 255));
		btn1C.setBounds(675, 334, 66, 65);
		Assentos.add(btn1C);
		
		JButton btn2C = new JButton("");
		btn2C.setBackground(new Color(255, 255, 255));
		btn2C.setBounds(763, 334, 66, 65);
		Assentos.add(btn2C);
		
		JButton btn3C = new JButton("");
		btn3C.setBackground(new Color(255, 255, 255));
		btn3C.setBounds(848, 334, 66, 65);
		Assentos.add(btn3C);
		
		JButton btn4C = new JButton("");
		btn4C.setBackground(new Color(255, 255, 255));
		btn4C.setBounds(931, 334, 66, 65);
		Assentos.add(btn4C);
		
		JButton btn5C = new JButton("");
		btn5C.setBackground(new Color(255, 255, 255));
		btn5C.setBounds(1016, 334, 66, 65);
		Assentos.add(btn5C);
		
		JLabel lblD = new JLabel("D");
		lblD.setFont(new Font("Verdana", Font.BOLD, 22));
		lblD.setBounds(640, 440, 19, 21);
		Assentos.add(lblD);
		
		JButton btn1D = new JButton("");
		btn1D.setBackground(new Color(255, 255, 255));
		btn1D.setFont(new Font("Verdana", Font.BOLD, 22));
		btn1D.setBounds(675, 421, 66, 65);
		Assentos.add(btn1D);
		
		JButton btn2D = new JButton("");
		btn2D.setBackground(new Color(255, 255, 255));
		btn2D.setHorizontalAlignment(SwingConstants.RIGHT);
		btn2D.setBounds(763, 421, 66, 65);
		Assentos.add(btn2D);
		
		JButton btn3D = new JButton("");
		btn3D.setBackground(new Color(255, 255, 255));
		btn3D.setBounds(848, 421, 66, 65);
		Assentos.add(btn3D);
		
		JButton btn = new JButton("");
		btn.setBackground(new Color(255, 255, 255));
		btn.setBounds(931, 421, 66, 65);
		Assentos.add(btn);
		
		JButton btn5D = new JButton("");
		btn5D.setBackground(new Color(255, 255, 255));
		btn5D.setBounds(1016, 421, 66, 65);
		Assentos.add(btn5D);
		Image imgS = new ImageIcon(this.getClass().getResource("/Shrek2.png")).getImage();
		Image imgB = new ImageIcon(this.getClass().getResource("/Barbie.png")).getImage();
		Image imgG = new ImageIcon(this.getClass().getResource("/GuardioesG.png")).getImage();


	}
}
