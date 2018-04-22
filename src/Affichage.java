package Affichage;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
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

public class Affichage {

private static JPanel plateau,background,saturne;

public Affichage() {
	
	JFrame fenetre = new JFrame();
	BufferedImage myPicture = null;
    
    fenetre.setSize(1250, 800);
    fenetre.setResizable(false);
    
    
    
    saturne = new JPanel();
	//myPannel.setBackground(Color.GREEN);
    saturne.setLocation(0, 0);
    saturne.setLayout(null);
	
	
		try {
			System.out.println("****");
			myPicture = ImageIO.read(new File("C:\\Users\\Nicolas\\eclipse-workspace\\affichage\\score_planet.png"));
		} catch (IOException e) {
			System.out.println("****");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("****");
	   JLabel picLabel2 = new JLabel(new ImageIcon(myPicture));
	    saturne.add(picLabel2);
	    fenetre.add(saturne);
    
    
	    
	plateau = new JPanel();
	//myPannel.setBackground(Color.GREEN);
	plateau.setLocation(0, 0);
	plateau.setLayout(null);
	
	
		try {
			System.out.println("****");
			myPicture = ImageIO.read(new File("C:\\Users\\Nicolas\\eclipse-workspace\\affichage\\board.png"));
		} catch (IOException e) {
			System.out.println("****");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("****");
	    JLabel picLabel1 = new JLabel(new ImageIcon(myPicture));
	    plateau.add(picLabel1);
	    fenetre.add(plateau);
	    
	    
	    
	    
		    
		    
		    
		    
		    background = new JPanel();
			
		    background.setLocation(0, 0);
		    background.setLayout(null);
			
			
				try {
					System.out.println("****");
					myPicture = ImageIO.read(new File("C:\\Users\\Nicolas\\eclipse-workspace\\affichage\\background.png"));
				} catch (IOException e) {
					System.out.println("****");
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("****");
						
				
				
				JLabel picLabel = new JLabel(new ImageIcon(myPicture));
			    background.add(picLabel);
			    fenetre.add(background);
	    
	    
	    picLabel.setBounds(0, 0, 1367, 769);
	    picLabel1.setBounds(0, 0, 731, 730);
	    picLabel2.setBounds(0, 0, 64, 39);
	    background.setBounds(0, 0, 1367, 769);
	    plateau.setBounds(20, 20, 731, 730);
	    saturne.setBounds(770, 180, 64, 39);
	    
	    
	    //myPannel.setLocation(20, 20);
	    fenetre.setVisible(true);
	  }   

public static void main(String[] args){
    
    Affichage test = new Affichage();
  


}
}