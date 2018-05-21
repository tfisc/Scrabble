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
	
	
	
	
	
public Affichage() {
	super();
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
	JFrame fenetre=new JFrame("Scrabble");
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fenetre.setSize(1300, 769);
    fenetre.setLocationRelativeTo(null);
    fenetre.setResizable(false);
    fenetre.setAlwaysOnTop(true);
    
    fenetre.setContentPane(test);
    fenetre.setVisible(true);
    
   
   
    
  


}


@Override
public void mouseClicked(MouseEvent e) {
	int xclick;
	int yclick;
	xclick=e.getX();
	yclick=e.getY();
	if(xclick<=730 && yclick<=730) {
		xclick=xclick/49;
		yclick=yclick/49;
		System.out.println("vous avez cliqué sur la case "+xclick+","+yclick);
	}
	else {
		System.out.println("vous n'avez pas cliqué sur le plateau");
		
	}
	
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



