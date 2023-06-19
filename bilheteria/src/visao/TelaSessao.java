package visao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import controle.FilmeDAO;
import controle.IngressoDAO;
import controle.PessoaDAO;
import controle.SessaoDAO;
import modelo.Sessao;
import modelo.Filme;
import modelo.Ingresso;
import modelo.Pessoa;

public class TelaSessao extends JFrame {

	private JPanel contentPane;
	private IngressoDAO iDAO = IngressoDAO.getInstancia();
	private FilmeDAO fDAO = FilmeDAO.getInstancia();
	private PessoaDAO pDAO = PessoaDAO.getInstancia();
	private SessaoDAO sDAO = SessaoDAO.getInstancia();
	private JButton[][] assentos = new JButton[5][5];
	private JLabel[][] lugares = new JLabel[5][5];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSessao frame = new TelaSessao();
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
	public TelaSessao() {
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(0, 0, screen.width, screen.height - 30);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = new JPanel();
		contentPane.setBounds(100, 100, 450, 300);
		contentPane.setBackground(new Color(7, 1, 88));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 30, 1375, 115);
		panel.setBackground(UIManager.getColor("Button.highlight"));
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblSessao = new JLabel("Sessão");
		lblSessao.setBounds(30, 25, 250, 65);
		lblSessao.setVerticalAlignment(SwingConstants.BOTTOM);
		lblSessao.setFont(new Font("Verdana", Font.BOLD, 55));
		lblSessao.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblSessao);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(50, 170, 1250, 515);
		contentPane.add(tabbedPane);
		Image img = new ImageIcon(this.getClass().getResource("/GuardioesGalaxia.png")).getImage();
		Image imgShrek = new ImageIcon(this.getClass().getResource("/Shrek2Resized.png")).getImage();
		Image imgBarb = new ImageIcon(this.getClass().getResource("/BarbieResized.png")).getImage();

		JPanel horarios = new JPanel();
		horarios.setForeground(new Color(7, 1, 88));
		horarios.setBackground(Color.WHITE);
		tabbedPane.addTab("Horários", null, horarios, null);
		horarios.setLayout(null);

		//

		JLabel lblGuardioes = new JLabel("Guardiões da Galáxia");
		lblGuardioes.setFont(new Font("Verdana", Font.BOLD, 14));
		lblGuardioes.setBounds(265, 25, 170, 15);
		horarios.add(lblGuardioes);

		JLabel lblShrek = new JLabel("Shrek 2");
		lblShrek.setFont(new Font("Verdana", Font.BOLD, 14));
		lblShrek.setBounds(615, 25, 65, 14);
		horarios.add(lblShrek);

		JLabel lblBarbie = new JLabel("Barbie");
		lblBarbie.setFont(new Font("Verdana", Font.BOLD, 14));
		lblBarbie.setBounds(915, 25, 65, 14);
		horarios.add(lblBarbie);

		JLabel lblDub = new JLabel("Dublado");
		lblDub.setFont(new Font("Verdana", Font.BOLD, 20));
		lblDub.setBounds(45, 320, 100, 26);
		horarios.add(lblDub);

		JLabel lblLeg = new JLabel("Legendado");
		lblLeg.setFont(new Font("Verdana", Font.BOLD, 20));
		lblLeg.setBounds(30, 402, 130, 23);
		horarios.add(lblLeg);

		JLabel lblPosterGuardioes = new JLabel("");
		lblPosterGuardioes.setBounds(275, 50, 150, 215);
		horarios.add(lblPosterGuardioes);
		lblPosterGuardioes.setIcon(new ImageIcon(img));

		JLabel lblPosterShrek = new JLabel("");
		lblPosterShrek.setBounds(565, 50, 150, 215);
		horarios.add(lblPosterShrek);
		lblPosterShrek.setIcon(new ImageIcon(imgShrek));

		JLabel lblPosterBarbie = new JLabel("");
		lblPosterBarbie.setBounds(865, 50, 150, 215);
		horarios.add(lblPosterBarbie);
		lblPosterBarbie.setIcon(new ImageIcon(imgBarb));

		JRadioButton rdbtnDubladoG = new JRadioButton("16:00h");
		rdbtnDubladoG.setBackground(Color.LIGHT_GRAY);
		rdbtnDubladoG.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnDubladoG.setFont(new Font("Verdana", Font.BOLD, 16));
		rdbtnDubladoG.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		rdbtnDubladoG.setBounds(295, 315, 115, 50);

		horarios.add(rdbtnDubladoG);

		JRadioButton rdbtnLegendadoG = new JRadioButton("18:30h");
		rdbtnLegendadoG.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnLegendadoG.setFont(new Font("Verdana", Font.BOLD, 16));
		rdbtnLegendadoG.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		rdbtnLegendadoG.setBackground(Color.LIGHT_GRAY);
		rdbtnLegendadoG.setBounds(295, 400, 115, 50);

		horarios.add(rdbtnLegendadoG);

		JRadioButton rdbtnLegendadoS = new JRadioButton("20:00h");
		rdbtnLegendadoS.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnLegendadoS.setFont(new Font("Verdana", Font.BOLD, 16));
		rdbtnLegendadoS.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		rdbtnLegendadoS.setBackground(Color.LIGHT_GRAY);
		rdbtnLegendadoS.setBounds(590, 400, 115, 50);

		horarios.add(rdbtnLegendadoS);

		JRadioButton rdbtnDubladoS = new JRadioButton("19:00h");
		rdbtnDubladoS.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnDubladoS.setFont(new Font("Verdana", Font.BOLD, 16));
		rdbtnDubladoS.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		rdbtnDubladoS.setBackground(Color.LIGHT_GRAY);
		rdbtnDubladoS.setBounds(590, 315, 115, 50);

		horarios.add(rdbtnDubladoS);

		JRadioButton rdbtnLegendadoB = new JRadioButton("18:00h");
		rdbtnLegendadoB.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnLegendadoB.setFont(new Font("Verdana", Font.BOLD, 16));
		rdbtnLegendadoB.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		rdbtnLegendadoB.setBackground(Color.LIGHT_GRAY);
		rdbtnLegendadoB.setBounds(890, 400, 115, 50);

		horarios.add(rdbtnLegendadoB);

		JRadioButton rdbtnDubladoB = new JRadioButton("16:30h");
		rdbtnDubladoB.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnDubladoB.setFont(new Font("Verdana", Font.BOLD, 16));
		rdbtnDubladoB.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		rdbtnDubladoB.setBackground(Color.LIGHT_GRAY);
		rdbtnDubladoB.setBounds(890, 309, 115, 50);

		horarios.add(rdbtnDubladoB);

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnDubladoG);
		buttonGroup.add(rdbtnLegendadoG);
		buttonGroup.add(rdbtnDubladoS);
		buttonGroup.add(rdbtnLegendadoS);
		buttonGroup.add(rdbtnDubladoB);
		buttonGroup.add(rdbtnLegendadoB);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setFont(new Font("Verdana", Font.BOLD, 20));
		btnSalvar.setBackground(Color.WHITE);
		btnSalvar.setBounds(1085, 345, 150, 65);

		btnSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Filme f = new Filme();
				Sessao s = new Sessao();

				if (rdbtnDubladoG.isSelected()) {
					System.out.println("DubladoG");

					f.setIdFilme(001);
					f.setNomeFilme("Guardiões da Galáxia");
					f.setHorarioFilmeDublado(LocalDateTime.of(2023, 6, 19, 16, 00));
					f.setHorarioFilmeLegendado(null);

					System.out.println(f);

					fDAO.cadastrarFilme(f);

					s.setFilme(f);
					s.setIdSessao(101);
					s.setNumeroSala(1);
					s.setQuantIngressosDisp(20);

					sDAO.cadastrarSessao(s);

					tabbedPane.setEnabledAt(1, true);

				} else if (rdbtnLegendadoG.isSelected()) {
					System.out.println("LegendadoG");

					f.setIdFilme(002);
					f.setNomeFilme("Guardiões da Galáxia");
					f.setHorarioFilmeDublado(null);
					f.setHorarioFilmeLegendado(LocalDateTime.of(2023, 6, 20, 18, 30));

					System.out.println(f);

					fDAO.cadastrarFilme(f);

					s.setFilme(f);
					s.setIdSessao(102);
					s.setNumeroSala(1);
					s.setQuantIngressosDisp(20);

					sDAO.cadastrarSessao(s);

					tabbedPane.setEnabledAt(1, true);

				} else if (rdbtnDubladoB.isSelected()) {
					System.out.println("DubladoB");

					f.setIdFilme(003);
					f.setNomeFilme("Barbie");
					f.setHorarioFilmeDublado(LocalDateTime.of(2023, 6, 20, 16, 30));
					f.setHorarioFilmeLegendado(null);

					System.out.println(f);

					fDAO.cadastrarFilme(f);

					s.setFilme(f);
					s.setIdSessao(103);
					s.setNumeroSala(2);
					s.setQuantIngressosDisp(20);

					sDAO.cadastrarSessao(s);

					tabbedPane.setEnabledAt(1, true);

				} else if (rdbtnLegendadoB.isSelected()) {
					System.out.println("LegendadoG");

					f.setIdFilme(004);
					f.setNomeFilme("Barbie");
					f.setHorarioFilmeDublado(null);
					f.setHorarioFilmeLegendado(LocalDateTime.of(2023, 6, 19, 18, 00));

					System.out.println(f);

					fDAO.cadastrarFilme(f);

					s.setFilme(f);
					s.setIdSessao(104);
					s.setNumeroSala(2);
					s.setQuantIngressosDisp(20);

					sDAO.cadastrarSessao(s);

					tabbedPane.setEnabledAt(1, true);

				} else if (rdbtnDubladoS.isSelected()) {
					System.out.println("DubladoS");

					f.setIdFilme(005);
					f.setNomeFilme("Shrek");
					f.setHorarioFilmeDublado(LocalDateTime.of(2023, 6, 19, 19, 00));
					f.setHorarioFilmeLegendado(null);

					System.out.println(f);

					fDAO.cadastrarFilme(f);

					s.setFilme(f);
					s.setIdSessao(105);
					s.setNumeroSala(3);
					s.setQuantIngressosDisp(20);

					sDAO.cadastrarSessao(s);

					tabbedPane.setEnabledAt(1, true);

				} else {
					System.out.println("LegendadoS");

					f.setIdFilme(006);
					f.setNomeFilme("Shrek");
					f.setHorarioFilmeDublado(null);
					f.setHorarioFilmeLegendado(LocalDateTime.of(2023, 6, 20, 20, 00));

					System.out.println(f);

					fDAO.cadastrarFilme(f);

					s.setFilme(f);
					s.setIdSessao(106);
					s.setNumeroSala(3);
					s.setQuantIngressosDisp(20);

					sDAO.cadastrarSessao(s);

					tabbedPane.setEnabledAt(1, true);
				}

			}

		});
		horarios.add(btnSalvar);

		//

		JPanel Assentos = new JPanel();
		Assentos.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Assentos", null, Assentos, null);
		tabbedPane.setEnabledAt(1, false);
		Assentos.setLayout(null);

		JButton btnPagamento = new JButton("PAGAR");
		btnPagamento.setBorder(new LineBorder(new Color(142, 223, 147), 3));
		btnPagamento.setBounds(925, 200, 200, 70);
		Assentos.add(btnPagamento);
		btnPagamento.setFont(new Font("Verdana", Font.BOLD, 22));
		btnPagamento.setBackground(Color.WHITE);
		btnPagamento.setEnabled(false);
		btnPagamento.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Ingresso i = new Ingresso();

				for (Filme filme : fDAO.listaFilmes()) {

					i.setFilme(filme);

				}

				for (Pessoa pessoa : pDAO.listaPessoas()) {

					i.setPessoa(pessoa);

				}

				for (Sessao sessao : sDAO.listaSessoes()) {

					i.setSessao(sessao);
				}

				for (int row = 0; row < 5; row++) {
					for (int col = 0; col < 5; col++) {
						JButton btnSelecionado = assentos[row][col];
						if (btnSelecionado.isSelected()) {

							// O assento na posição (row, col) está selecionado
							i.setFileira((char) ('A' + row));
							i.setNumCadeira(col + 1);

							iDAO.cadastrarIngresso(i);

							System.out.println("Assento selecionado: " + i.getFileira() + i.getNumCadeira());
							System.out.println(i);
						}
					}
				}

				new Pagamento().setVisible(true);
				this.dispose();

			}

			private void dispose() {
				setVisible(false);
			}

		});

		// Criação da matriz de botões de ingresso

		boolean[][] ingressosDisponiveis = new boolean[5][5];

		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				// Cria um JLabel para exibir o lugar correspondente
				JLabel lblLugar = new JLabel(Character.toString((char) ('A' + row)) + (col + 1));
				lblLugar.setFont(new Font("Verdana", Font.BOLD, 14));
				lblLugar.setBounds(185 + (col * 90), 76 + (row * 90), 50, 25);
				Assentos.add(lblLugar);

				JButton btnIngresso = new JButton("");
				btnIngresso.setBackground(new Color(255, 255, 255));
				btnIngresso.setBounds(185 + (col * 90), 101 + (row * 90), 66, 65);
				Assentos.add(btnIngresso);

				final int finalRow = row;
				final int finalCol = col;
				btnIngresso.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// Altera a cor de fundo do botão quando for selecionado
						JButton btn = (JButton) e.getSource();
						btn.setBackground(btn.isSelected() ? Color.RED : Color.WHITE);

						btn.setSelected(!btn.isSelected()); // Inverte o estado de seleção do botão

						// Atualiza o estado do ingresso correspondente na matriz de ingressos
						// disponíveis
						ingressosDisponiveis[finalRow][finalCol] = btn.isSelected();

						// Verifica se algum ingresso está selecionado
						boolean algumIngressoSelecionado = false;
						for (int row = 0; row < 5; row++) {
							for (int col = 0; col < 5; col++) {
								JButton btn1 = assentos[row][col];
								if (btn1.isSelected()) {
									algumIngressoSelecionado = true;
									break;
								}
							}
							if (algumIngressoSelecionado) {
								break;
							}
						}

						// Habilita/desabilita o botão de pagamento
						btnPagamento.setEnabled(algumIngressoSelecionado);
					}
				});

				assentos[row][col] = btnIngresso;
				lugares[row][col] = lblLugar;
			}
		}

		JButton btnTelaPrincipal = new JButton("Voltar");
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

		Image imgS = new ImageIcon(this.getClass().getResource("/Shrek2.png")).getImage();
		Image imgB = new ImageIcon(this.getClass().getResource("/Barbie.png")).getImage();
		Image imgG = new ImageIcon(this.getClass().getResource("/GuardioesG.png")).getImage();

	}

}
