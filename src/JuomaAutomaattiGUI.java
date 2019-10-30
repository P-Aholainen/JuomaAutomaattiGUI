import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;

public class JuomaAutomaattiGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnYllapito;
	private JMenu mnTietojaOhjelmasta;
	private JMenuItem mntmTietoja;
	private JMenuItem mntmAsetaKahvinMaara;
	private JMenuItem mntmAsetaTeenMaara;
	private JMenuItem mntmAsetaKaakaonMaara;
	private JMenuItem mntmTallennaAutomaatinTila;
	private JMenuItem mntmLataaAutomaatti;
	private JMenuItem mntmLopeta;
	private JButton btnKahvi;
	private JTextArea txtrKahvi;
	private JButton btnTee;
	private JTextArea txtrTee;
	private JButton btnKaakao;
	private JTextArea txtrKaakao;
	private static JTextArea textTeeta;
	static JTextArea textKahvia;
	private JTextArea textArea_2;
	private JTextArea textArea_3;
	private static JTextArea textKaakaota;
	private JTextArea textArea_5;
	private JMenuItem mntmVersiotiedot;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				//JuomaAutomaatti olion luonti
				JuomaAutomaatti ja = new JuomaAutomaatti(50, 50, 50);
				
				
				try {
					JuomaAutomaattiGUI frame = new JuomaAutomaattiGUI(ja);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 * @param ja 
	 */
	public JuomaAutomaattiGUI(JuomaAutomaatti ja) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 641);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnYllapito = new JMenu("Yll\u00E4pito");
		menuBar.add(mnYllapito);
		
		mntmAsetaKahvinMaara = new JMenuItem("Aseta kahvin m\u00E4\u00E4r\u00E4");
		mntmAsetaKahvinMaara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JuomaAutomaatti.kahviFilleri();
				
			}
		});
		mnYllapito.add(mntmAsetaKahvinMaara);
		
		mntmAsetaTeenMaara = new JMenuItem("Aseta teen m\u00E4\u00E4r\u00E4");
		mntmAsetaTeenMaara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JuomaAutomaatti.teeFilleri();
			}
		});
		mnYllapito.add(mntmAsetaTeenMaara);
		
		mntmAsetaKaakaonMaara = new JMenuItem("Aseta kaakaon m\u00E4\u00E4r\u00E4");
		mntmAsetaKaakaonMaara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JuomaAutomaatti.kaakaoFilleri();
				
			}
		});
		mnYllapito.add(mntmAsetaKaakaonMaara);
		
		mntmTallennaAutomaatinTila = new JMenuItem("Tallenna automaatin tila");
		mntmTallennaAutomaatinTila.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Sarjallistamista.kirjoitaTiedostoon(ja);
				
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//System.out.println(ja);
			}
		});
		mnYllapito.add(mntmTallennaAutomaatinTila);
		
		mntmLataaAutomaatti = new JMenuItem("Lataa automaatti");
		mntmLataaAutomaatti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					JuomaAutomaatti uusi = Sarjallistamista.lueTiedostosta();
					//System.out.print(uusi + "1");
				ja.setKahvia(uusi.getKahvia());
				ja.setTeeta(uusi.getTeeta());
				ja.setKaakaota(uusi.getKaakaota());
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		mnYllapito.add(mntmLataaAutomaatti);
		
		mntmLopeta = new JMenuItem("Lopeta");
		mntmLopeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		mnYllapito.add(mntmLopeta);
		
		mnTietojaOhjelmasta = new JMenu("Tietoja ohjelmasta");
		menuBar.add(mnTietojaOhjelmasta);
		
		mntmTietoja = new JMenuItem("Tietoja..");
		mntmTietoja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JuomaAutomaatti.tietoja();
			}
		});
		
		mntmVersiotiedot = new JMenuItem("Versiotiedot");
		mntmVersiotiedot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Versiotiedot.Versiotiedot();
				
			}

		
		});
		mnTietojaOhjelmasta.add(mntmVersiotiedot);
		mnTietojaOhjelmasta.add(mntmTietoja);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		btnKahvi = new JButton("");
		btnKahvi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JuomaAutomaatti.valmistaKahvi();
			}
		});
		btnKahvi.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnKahvi.setBackground(new Color(128, 0, 0));
		contentPane.add(btnKahvi);
		Image imgKahvi = null;
		try {
			imgKahvi = ImageIO.read(getClass().getResource("/images/kahvi.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		btnKahvi.setIcon(new ImageIcon(imgKahvi));
		
		txtrKahvi = new JTextArea();
		txtrKahvi.setEnabled(false);
		txtrKahvi.setEditable(false);
		txtrKahvi.setFont(new Font("High Tower Text", Font.BOLD, 30));
		txtrKahvi.setText("Kahvi");
		contentPane.add(txtrKahvi);
		Image imgTee = null;
		try {
			imgTee = ImageIO.read(getClass().getResource("/images/tee.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setTextKahvia(new JTextArea());
		contentPane.add(getTextKahvia());
		// Haetaan kahvin m‰‰r‰
		textKahvia.setText("Kahvia j‰ljell‰ " + JuomaAutomaatti.kahvia);
		
		textArea_2 = new JTextArea();
		textArea_2.setEditable(false);
		textArea_2.setEnabled(false);
		contentPane.add(textArea_2);
		
		btnTee = new JButton("");
		btnTee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JuomaAutomaatti.valmistaTee();
				
			}
		});
		btnTee.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnTee.setBackground(Color.GREEN);
		btnTee.setIcon(new ImageIcon(imgTee));
		
		contentPane.add(btnTee);
		
		txtrTee = new JTextArea();
		txtrTee.setEnabled(false);
		txtrTee.setEditable(false);
		txtrTee.setFont(new Font("High Tower Text", Font.BOLD, 30));
		txtrTee.setText("Tee");
		contentPane.add(txtrTee);
		
		setTextTeeta(new JTextArea());

		contentPane.add(getTextTeeta());
		
		// haetaan teen m‰‰r‰
		textTeeta.setText("Teet‰ j‰ljell‰ " + JuomaAutomaatti.teeta);
		
		textArea_3 = new JTextArea();
		textArea_3.setEnabled(false);
		textArea_3.setEditable(false);
		contentPane.add(textArea_3);
		
		btnKaakao = new JButton("");
		btnKaakao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JuomaAutomaatti.valmistaKaakao();
			}
		});
		btnKaakao.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnKaakao.setBackground(new Color(210, 105, 30));
		contentPane.add(btnKaakao);
		
		Image imgKaakao = null;
		try {
			imgKaakao = ImageIO.read(getClass().getResource("/images/kaakao.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		btnKaakao.setIcon(new ImageIcon(imgKaakao));
		txtrKaakao = new JTextArea();
		txtrKaakao.setEnabled(false);
		txtrKaakao.setEditable(false);
		txtrKaakao.setBorder(new CompoundBorder());
		txtrKaakao.setFont(new Font("High Tower Text", Font.BOLD, 30));
		txtrKaakao.setText("Kaakao");
		contentPane.add(txtrKaakao);
		
		textKaakaota = new JTextArea();
		contentPane.add(textKaakaota);
		
		textKaakaota.setText("Kaakaota j‰ljell‰ " + JuomaAutomaatti.kaakaota);
		
		textArea_5 = new JTextArea();
		textArea_5.setEnabled(false);
		textArea_5.setEditable(false);
		contentPane.add(textArea_5);
	}

	public static JTextArea getTextKaakaota() {
		return textKaakaota;
	}

	public void setTextKaakaota(JTextArea textKaakaota) {
		JuomaAutomaattiGUI.textKaakaota = textKaakaota;
	}

	
	
	public static JTextArea getTextTeeta() {
		return textTeeta;
	}

	public static void setTextTeeta(JTextArea textTeeta) {
		JuomaAutomaattiGUI.textTeeta = textTeeta;
	}

	public static JTextArea getTextKahvia() {
		return textKahvia;
	}

	public void setTextKahvia(JTextArea textKahvia) {
		JuomaAutomaattiGUI.textKahvia = textKahvia;
	}

}
