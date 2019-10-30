import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JuomaAutomaatti {

	public static int uusiKahvi;
	public static int uusiTee;
	public static int uusiKaakao;
	static int teeta;
	static int kahvia;
	static int kaakaota;
	
	
// konstruktori
	public JuomaAutomaatti() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JuomaAutomaatti(int teeta, int kahvia, int kaakaota) {
		super();
		this.teeta = teeta;
		this.kahvia = kahvia;
		this.kaakaota = kaakaota;
	}
	
// getterit ja setterit
	
	

	public int getTeeta() {
		return teeta;
	}

	public void setTeeta(int teeta) {
		this.teeta = teeta;
	}

	public static int getKahvia() {
		return kahvia;
	}

	public void setKahvia(int kahvia) {
		this.kahvia = kahvia;
	}

	public int getKaakaota() {
		return kaakaota;
	}

	public void setKaakaota(int kaakaota) {
		this.kaakaota = kaakaota;
	}

	// metodit
	
	public static void kahviFilleri() {
		
		
		JFrame f;  
		f=new JFrame();   
        String uusiArvo=JOptionPane.showInputDialog(null, "Anna m��r�");
       uusiKahvi = Integer.parseInt(uusiArvo);
       kahvia = kahvia + uusiKahvi;
        //System.out.print(uusiKahvi);
       if (kahvia <= 20) {
			JuomaAutomaattiGUI.getTextKahvia().setForeground(Color.RED);
		} else if ( kahvia >= 20) {
			JuomaAutomaattiGUI.getTextKahvia().setForeground(Color.BLACK);
		}
		
			JuomaAutomaattiGUI.getTextKahvia().setText("Kahvia j�jell�: " + kahvia +"\n");
		
	}
	
	public static void teeFilleri() {
		
		
		JFrame f;  
		f=new JFrame();   
        String uusiArvo=JOptionPane.showInputDialog(null, "Anna m��r�");
       uusiTee = Integer.parseInt(uusiArvo);
       teeta = teeta + uusiTee;
        
       JuomaAutomaattiGUI.getTextTeeta().setText("Teet� j�jell�: " + teeta +"\n");
       if (teeta <= 20) {
			JuomaAutomaattiGUI.getTextTeeta().setForeground(Color.RED);
		} else if ( teeta >= 20) {
			JuomaAutomaattiGUI.getTextTeeta().setForeground(Color.BLACK);
		}
	}
	
	public static void kaakaoFilleri() {
		
		JFrame f;  
		f=new JFrame();   
        String uusiArvo=JOptionPane.showInputDialog(null, "Anna m��r�");
       uusiKaakao = Integer.parseInt(uusiArvo);
       kaakaota = kaakaota + uusiKaakao;
       
       if (kaakaota <= 20) {
			JuomaAutomaattiGUI.getTextKaakaota().setForeground(Color.RED);
		} else if ( kaakaota >= 20) {
			JuomaAutomaattiGUI.getTextKaakaota().setForeground(Color.BLACK);
		}
			
			JuomaAutomaattiGUI.getTextKaakaota().setText("Kaakaota j�jell�: " + kaakaota +"\n");
		
	}
	
	//static int kahvinMaara = uusiKahvi + kahvia;
	public static void valmistaTee() {
		if (teeta <= 20) {
			JuomaAutomaattiGUI.getTextTeeta().setForeground(Color.RED);
		} else if ( teeta >= 20) {
			JuomaAutomaattiGUI.getTextTeeta().setForeground(Color.BLACK);
		}
		if (teeta > 0) {
			teeta -=10;
		//System.out.println("Odota hetki, Teesi valmistuu.. ");
			JuomaAutomaattiGUI.getTextTeeta().setText("Teet� j�jell�: " + teeta +"\n");

		//System.out.println("Teet� j�jell�: " + teeta +"\n");
		
		} else 
			{JuomaAutomaattiGUI.getTextTeeta().setText("Teet� ei ole en��n j�ljell�,\n"+"t�yt� s�ili�! \n");
				}
	}
	
	public static void valmistaKahvi() {
		
		if (kahvia <= 20) {
			JuomaAutomaattiGUI.getTextKahvia().setForeground(Color.RED);
		} else if ( kahvia >= 20) {
			JuomaAutomaattiGUI.getTextKahvia().setForeground(Color.BLACK);
		}
		
		
		if (kahvia > 0) {
			
			kahvia -=10;
			//System.out.print(kahvia);
		//System.out.println("Odota hetki, Kahvisi valmistuu ");
			JuomaAutomaattiGUI.textKahvia.setText("Kahvia j�jell�: " + getKahvia() +"\n");
		//System.out.println("Kahvia j�jell�: " + kahvia +"\n");
			
		} else 
			{
			JuomaAutomaattiGUI.getTextKahvia().setText("Kahvia ei ole en��n j�ljell�,\nt�yt� s�ili�! \n");
			//System.out.println("Kahvia ei ole en��n j�ljell�, t�yt� s�ili�! \n");
			}
		
	}
	public static void valmistaKaakao() {
		
		if (kaakaota <= 20) {
			JuomaAutomaattiGUI.getTextKaakaota().setForeground(Color.RED);
		} else if ( kaakaota >= 20) {
			JuomaAutomaattiGUI.getTextKaakaota().setForeground(Color.BLACK);
		}
		
		if (kaakaota > 0) {
			kaakaota -=10;
			
			JuomaAutomaattiGUI.getTextKaakaota().setText("Kaakaota j�jell�: " + kaakaota +"\n");
		//System.out.println("Odota hetki, Kaakaosi valmistuu ");
		//System.out.println("Kaakaota j�jell�: " + kaakaota +"\n");
		
		} else 
			{JuomaAutomaattiGUI.getTextKaakaota().setText("Kaakaota ei ole en��n j�ljell�,\nt�yt� s�ili�! \n");
			//System.out.println("Kaakaota ei ole en��n j�ljell�, t�yt� s�ili�! \n")
				;}
		}
	// toString
	public String toString() {
		return "JuomaAutomaatti [teeta=" + teeta + ", kahvia=" + kahvia + ", kaakaota=" + kaakaota + "]";
	}
	
	
	
	//Tietoja ohjelmasta
	public static void tietoja() {
		JOptionPane.showMessageDialog(null,
			    "JuomaAutomaatti \n"
			    + "Tallennukssa ja lataamisessa\n"
			    + "on viel� ongelma!\n\n"
			    + "Ongelma liittynee ja gettereihin ja\n"
			    + "settereihin. Aika ei riitt�nyt\n"
			    + "korjaamaan t�t� ongelmaa."
			    ,
			    "Tietoja ohjelmasta",
			    JOptionPane.PLAIN_MESSAGE);
	}
	
	
}
