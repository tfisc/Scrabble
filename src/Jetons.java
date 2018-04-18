//fait par Thibault Fischer

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class Jetons {
	private int id;
	private static int lastId=0;
	private ImageIcon image;
	private char lettre;
	private int valeur;

	public Jetons(char lettre, int val)  {
		image =  new ImageIcon("images/"+lettre+".png");
		//this.image=img;
		this.setLettre(lettre);
		setValeur(val);
		this.id=lastId+1;
		lastId++;
	}

	public ImageIcon getImage() {
		return image;
	}

	public void setImage(ImageIcon image) {
		this.image = image;
	}

	public char getLettre() {
		return lettre;
	}

	public void setLettre(char lettre) {
		this.lettre = lettre;
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	
	public int getId() {
		return this.id;
	}
//petit main pour test que mes jetons se construisent correctement et que j'affiche bien l'image.
	public static void main (String[] args) {
		
		
		Jetons A=new Jetons('a',1);
		Jetons B=new Jetons('a',1);
		
		
		// fenêtre où l'image sera affichée
		JFrame maFenetre = new JFrame("Test");
		// ajoute l'image dans un JLabel
		maFenetre.getContentPane().add(new JLabel(A.getImage()));
		maFenetre.setBounds(1024/4,768/4,500,300);
		maFenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		maFenetre.show();
		System.out.println(B.getId());
     
		
	}
	
}


