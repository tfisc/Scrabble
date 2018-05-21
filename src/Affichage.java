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

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Affichage extends JPanel implements MouseListener{
	
	
	JFrame fenetre;
	
	JLabel flecheHaut;
	
	JLabel flecheBas;
	
	JLabel flecheDroite;
	
	JLabel flecheGauche;
	
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
	private JButton lettre5;
	private JButton lettre6;
	private JButton lettre7;
	
	
	
	
	
	
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
	JButton lettre1=new JButton();
	JButton lettre2=new JButton();
	JButton lettre3=new JButton();
	JButton lettre4=new JButton();
	JButton lettre5=new JButton();
	JButton lettre6=new JButton();
	JButton lettre7=new JButton();
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
	
	
	

	fenetre=new JFrame("Scrabble");
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fenetre.setSize(1300, 769);
    fenetre.setLocationRelativeTo(null);
    fenetre.setResizable(false);
    fenetre.setAlwaysOnTop(true);
    
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
	this.addMouseListener(this);
	
}

public static void main(String[] args){
    
    Affichage test=new Affichage();
	
    
   
   
    
  


}


@Override
public void mouseClicked(MouseEvent e) {
	int xclick;
	int yclick;
	xclick=e.getX();
	yclick=e.getY();
	if(xclick<=730 && yclick<=730) {
		xclick=xclick/48;
		yclick=yclick/48;
		affichagefleches(xclick,yclick);
	}
	else {
		System.out.println("vous n'avez pas cliqué sur le plateau");
		
	}
	
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

}




@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
}



