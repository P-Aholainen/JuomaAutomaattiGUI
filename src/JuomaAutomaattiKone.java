
public class JuomaAutomaattiKone extends JuomaAutomaatti {
	public static void main(String[] args){
		JuomaAutomaatti ja = new JuomaAutomaatti(50, 50, 50);
		JuomaAutomaattiGUI x = new JuomaAutomaattiGUI(ja);
		x.setVisible(true);


	}
} 