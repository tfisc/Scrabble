import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Affichage extends JPanel {
	
	
	private JFrame fenetre;
	
	private JLabel flecheHaut;
	
	private JLabel flecheBas;
	
	private JLabel flecheDroite;
	
	private JLabel flecheGauche;
	
	private JLabel mot;
	private JLabel mot1;
	private JLabel mot2;
	private JLabel mot3;
	private JLabel mot4;
	private JLabel mot5;
	private JLabel mot6;
	
	
	
	private ImageIcon plateau;
	private Image plateauimg;
	
	private ImageIcon menu;
	private Image menuimg;
	
	private ImageIcon background;
	private Image backgroundimg;
	
	private ImageIcon score;
	private Image scoreimg;
	
	private ImageIcon scoretxt;
	private Image scoretxtimg;
	
	private ImageIcon scorebar;
	private Image scorebarimg;
	
	private ImageIcon gamebar;
	private Image gamebarimg;
	
	private ImageIcon pick;
	private Image pickimg;
	
	private ImageIcon topArrow;
	private Image topArrowimg;
	
	private ImageIcon bottomArrow;
	private Image bottomArrowimg;
	
	private ImageIcon rightArrow;
	private Image rightArrowimg;
	
	private ImageIcon leftArrow;
	private Image leftArrowimg;
	
	private JButton lettre1;
	private JButton lettre2;
	private JButton lettre3;
	private JButton lettre4;
	private JButton lettre5;
	private JButton lettre6;
	private JButton lettre7;
	
	
	public JButton getLettre1() {
		return lettre1;
	}
	
	public JButton getLettre2() {
		return lettre3;
	}
	
	public JButton getLettre3() {
		return lettre3;
	}
	
	public JButton getLettre4() {
		return lettre4;
	}
	public JButton getLettre5() {
		return lettre5;
	}
	
	public JButton getLettre6() {
		return lettre6;
	}
	
	public JButton getLettre7() {
		return lettre7;
	}
	
	
public Affichage() {
	super();
	this.setLayout(null);
	plateau=new ImageIcon(getClass().getResource("/images/board.png"));
	plateauimg=plateau.getImage();
	
	menu=new ImageIcon(getClass().getResource("/images/menu.png"));
	menuimg=menu.getImage();
	
	background=new ImageIcon(getClass().getResource("/images/background.png"));
	backgroundimg=background.getImage();
	
	score=new ImageIcon(getClass().getResource("/images/score_planet.png"));
	scoreimg=score.getImage();

	scoretxt=new ImageIcon(getClass().getResource("/images/score_txt_score.png"));
	scoretxtimg=scoretxt.getImage();
	
	scorebar=new ImageIcon(getClass().getResource("/images/score_bar.png"));
	scorebarimg=scorebar.getImage();
	
	gamebar=new ImageIcon(getClass().getResource("/images/score_bar.png"));
	gamebarimg=gamebar.getImage();
	
	pick=new ImageIcon(getClass().getResource("/images/game_pick_empty.png"));
	pickimg=pick.getImage();

	topArrow=new ImageIcon(getClass().getResource("/images/Arrows/arrow_red_3.png"));
	topArrowimg=topArrow.getImage();
	
	bottomArrow=new ImageIcon(getClass().getResource("/images/Arrows/arrow_red_1.png"));
	bottomArrowimg=bottomArrow.getImage();
	
	rightArrow=new ImageIcon(getClass().getResource("/images/Arrows/arrow_red_4.png"));
	rightArrowimg=rightArrow.getImage();
	
	leftArrow=new ImageIcon(getClass().getResource("/images/Arrows/arrow_red_2.png"));
	leftArrowimg=leftArrow.getImage();
	
	flecheHaut=new JLabel("");
	flecheHaut.setIcon(topArrow);
	
	flecheBas=new JLabel("");
	flecheBas.setIcon(bottomArrow);
	
	flecheDroite=new JLabel("");
	flecheDroite.setIcon(rightArrow);
	
	
	flecheGauche=new JLabel("");
	flecheGauche.setIcon(leftArrow);
	lettre1=new JButton();
	lettre2=new JButton();
	lettre3=new JButton();
	lettre4=new JButton();
	lettre5=new JButton();
	lettre6=new JButton();
	lettre7=new JButton();
	lettre1.setIcon(new ImageIcon(getClass().getResource("/images/Lettres/s.png")));
	lettre2.setIcon(new ImageIcon(getClass().getResource("/images/Lettres/c.png")));
	lettre3.setIcon(new ImageIcon(getClass().getResource("/images/Lettres/r.png")));
	lettre4.setIcon(new ImageIcon(getClass().getResource("/images/Lettres/a.png")));
	lettre5.setIcon(new ImageIcon(getClass().getResource("/images/Lettres/b.png")));
	lettre6.setIcon(new ImageIcon(getClass().getResource("/images/Lettres/l.png")));
	lettre7.setIcon(new ImageIcon(getClass().getResource("/images/Lettres/e.png")));
	lettre1.setBounds(800, 670, 48, 48);
	lettre2.setBounds(850, 670, 48, 48);
	lettre3.setBounds(900, 670, 48, 48);
	lettre4.setBounds(950, 670, 48, 48);
	lettre5.setBounds(1000, 670, 48, 48);
	lettre6.setBounds(1050, 670, 48, 48);
	lettre7.setBounds(1100, 670, 48, 48);
	
	validate();
	
	this.add(lettre1);
	this.add(lettre2);
	this.add(lettre3);
	this.add(lettre4);
	this.add(lettre5);
	this.add(lettre6);
	this.add(lettre7);
	this.add(flecheHaut);
	
	this.add(flecheBas);

	this.add(flecheGauche);
	mot=new JLabel("");
	mot1=new JLabel("");
	mot2=new JLabel("");
	mot3=new JLabel("");
	mot4=new JLabel("");
	mot5=new JLabel("");
	mot6=new JLabel("");

this.add(flecheDroite);
	
	

	fenetre=new JFrame("Scrabble");
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fenetre.setSize(1300, 769);
    fenetre.setLocationRelativeTo(null);
    fenetre.setResizable(false);
   
    
    fenetre.setContentPane(this);
    fenetre.setVisible(true);	
    
   
}   


public void paintComponent(Graphics g) {
	super.paintComponent(g);
	g.drawImage(backgroundimg, 0,0, null);
	g.drawImage(plateauimg, 0,0, null);
	g.drawImage(menuimg, 1190,0, null);
	g.drawImage(scoreimg,830,230, null);
	g.drawImage(scoretxtimg,905,240, null);
	g.drawImage(scorebarimg,1020,250, null);
	g.drawImage(gamebarimg,800,720, null);
	g.drawImage(pickimg,1200,650, null);

	
}


public void affichageLettresJoueurCourant(ArrayList<Jetons> jetons) {
	lettre1.setIcon(new ImageIcon(getClass().getResource("/images/Lettres/"+jetons.get(0).getLettre()+".png")));
	lettre2.setIcon(new ImageIcon(getClass().getResource("/images/Lettres/"+jetons.get(1).getLettre()+".png")));
	lettre3.setIcon(new ImageIcon(getClass().getResource("/images/Lettres/"+jetons.get(2).getLettre()+".png")));
	lettre4.setIcon(new ImageIcon(getClass().getResource("/images/Lettres/"+jetons.get(3).getLettre()+".png")));
	lettre5.setIcon(new ImageIcon(getClass().getResource("/images/Lettres/"+jetons.get(4).getLettre()+".png")));
	lettre6.setIcon(new ImageIcon(getClass().getResource("/images/Lettres/"+jetons.get(5).getLettre()+".png")));
	lettre7.setIcon(new ImageIcon(getClass().getResource("/images/Lettres/"+jetons.get(6).getLettre()+".png")));
	
	
}

public void affichageLettresPlateau(ArrayList<Jetons> jetons,int x,int y) {
	
	x=x*48;
	y=y*48;
	if(jetons.size()>=1) {
		mot.setIcon(new ImageIcon(getClass().getResource("/images/Lettres/"+jetons.get(0).getLettre()+".png")));
		mot.setBounds(x+(0*0)-48,y,48,48);
		
		this.add(mot);
		
		}
	if(jetons.size()>=2) {
		mot1.setIcon(new ImageIcon(getClass().getResource("/images/Lettres/"+jetons.get(1).getLettre()+".png")));
		mot1.setBounds(x+(1*48)-48,y,48,48);
		
		this.add(mot1);
		
		}
	if(jetons.size()>=3) {
		mot2.setIcon(new ImageIcon(getClass().getResource("/images/Lettres/"+jetons.get(2).getLettre()+".png")));
		mot2.setBounds(x+(2*48)-48,y,48,48);
		
		this.add(mot2);
		
		}
	if(jetons.size()>=4) {
		mot3.setIcon(new ImageIcon(getClass().getResource("/images/Lettres/"+jetons.get(3).getLettre()+".png")));
		mot3.setBounds(x+(3*48)-48,y,48,48);
		
		this.add(mot3);
		
		}
	if(jetons.size()>=5) {
		mot4.setIcon(new ImageIcon(getClass().getResource("/images/Lettres/"+jetons.get(4).getLettre()+".png")));
		mot4.setBounds(x+(4*48)-48,y,48,48);
		
		this.add(mot4);
	
		}
	if(jetons.size()>=6) {
		mot5.setIcon(new ImageIcon(getClass().getResource("/images/Lettres/"+jetons.get(5).getLettre()+".png")));
		mot5.setBounds(x+(5*48)-48,y,48,48);
		
		this.add(mot5);
		
		}
	if(jetons.size()>=7) {
		mot6.setIcon(new ImageIcon(getClass().getResource("/images/Lettres/"+jetons.get(6).getLettre()+".png")));
		mot6.setBounds(x+(6*48)-48,y,48,48);
		
		this.add(mot6);
		
		}
	revalidate();
	}


public void affichagefleches(int x, int y){
	System.out.println("tu rentres");
	x=x*48;
	y=y*48;
	flecheHaut.setBounds(x+6, y-30,37,26);
	flecheBas.setBounds(x+4, y+55,37,26);
	flecheDroite.setBounds(x+48,y+8,26,37);
	flecheGauche.setBounds(x-30, y+8,26,37);

	
		this.add(flecheHaut);
	
		this.add(flecheBas);
	
		this.add(flecheGauche);
	
	this.add(flecheDroite);
	revalidate();

}








}



