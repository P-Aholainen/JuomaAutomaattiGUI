import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;

public class Versiotiedot extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void Versiotiedot() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Versiotiedot frame = new Versiotiedot();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 */
	
	public Versiotiedot() {
		init();
	}

	
	public void init() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(600, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTextArea txtrJuomaautomaattiV = new JTextArea();
		txtrJuomaautomaattiV.setFont(new Font("Monospaced", Font.BOLD, 25));
		txtrJuomaautomaattiV.setText("Juoma-automaatti V1.1\n"
				+ "\n"
				+ "Tekijä: Mikko Pohjoisaho\n"
				+ "a.k.a\n"
				+ "P-Aholainen");
		txtrJuomaautomaattiV.setEnabled(false);
		txtrJuomaautomaattiV.setEditable(false);
		contentPane.add(txtrJuomaautomaattiV, BorderLayout.CENTER);
	}

		
	
	
}
