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

private static JPanel plateau,background,saturne,score,barrescore,barrejoueur,pioche,menu;

public Affichage() {
	
	JFrame fenetre = new JFrame();
	BufferedImage myPicture = null;
    
    fenetre.setSize(1351, 800);
    fenetre.setResizable(false);
    
    
    
    saturne = new JPanel();
	//myPannel.setBackground(Color.GREEN);
    saturne.setLocation(0, 0);
    saturne.setOpaque(false);
    saturne.setLayout(null);
	
	
		try {
			System.out.println("****");
			myPicture = ImageIO.read(new File("images/score_planet.png"));
		} catch (IOException e) {
			System.out.println("****");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("****");
	   JLabel picLabel2 = new JLabel(new ImageIcon(myPicture));
	    saturne.add(picLabel2);
	    fenetre.add(saturne);
	    
	    

	    score = new JPanel();
		//myPannel.setBackground(Color.GREEN);
	    score.setLocation(0, 0);
	    score.setOpaque(false);
	    score.setLayout(null);
		
		
			try {
				System.out.println("****");
				myPicture = ImageIO.read(new File("images/score_txt_score.png"));
			} catch (IOException e) {
				System.out.println("****");
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("****");
		   JLabel picLabel3 = new JLabel(new ImageIcon(myPicture));
		   score.add(picLabel3);
		    fenetre.add(score);
    
		    
		    barrescore = new JPanel();
			//myPannel.setBackground(Color.GREEN);
		    barrescore.setLocation(0, 0);
		    barrescore.setOpaque(false);
		    barrescore.setLayout(null);
			
			
				try {
					System.out.println("****");
					myPicture = ImageIO.read(new File("images/score_bar.png"));
				} catch (IOException e) {
					System.out.println("****");
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("****");
			   JLabel picLabel4 = new JLabel(new ImageIcon(myPicture));
			   barrescore.add(picLabel4);
			    fenetre.add(barrescore);
			    
			    
			    barrejoueur = new JPanel();
				//myPannel.setBackground(Color.GREEN);
			    barrejoueur.setLocation(0, 0);
			    barrejoueur.setOpaque(false);
			    barrejoueur.setLayout(null);
				
				
					try {
						System.out.println("****");
						myPicture = ImageIO.read(new File("images/game_bar.png"));
					} catch (IOException e) {
						System.out.println("****");
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("****");
				   JLabel picLabel5 = new JLabel(new ImageIcon(myPicture));
				   barrejoueur.add(picLabel5);
				    fenetre.add(barrejoueur);
				    
				   pioche = new JPanel();
				   //myPannel.setBackground(Color.GREEN);
				   pioche.setLocation(0, 0);
				   pioche.setOpaque(false);
				   pioche.setLayout(null);
					
					
					try {
						System.out.println("****");
						myPicture = ImageIO.read(new File("images/game_pick_empty.png"));
					} catch (IOException e) {
						System.out.println("****");
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("****");
				   JLabel picLabel6 = new JLabel(new ImageIcon(myPicture));
				   pioche.add(picLabel6);
				   fenetre.add(pioche);
				   
				   
				   
				   menu = new JPanel();
					//myPannel.setBackground(Color.GREEN);
				   menu.setLocation(0, 0);
				   menu.setOpaque(false);
				   menu.setLayout(null);
					
					
						try {
							System.out.println("****");
							myPicture = ImageIO.read(new File("images/menu.png"));
						} catch (IOException e) {
							System.out.println("****");
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("****");
					   JLabel picLabel7 = new JLabel(new ImageIcon(myPicture));
					   menu.add(picLabel7);
					    fenetre.add(menu);
			    
		    
    
	    
	plateau = new JPanel();
	//myPannel.setBackground(Color.GREEN);
	plateau.setLocation(0, 0);
	plateau.setLayout(null);
	
	
		try {
			System.out.println("****");
			myPicture = ImageIO.read(new File("images/board.png"));
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
					myPicture = ImageIO.read(new File("images/background.png"));
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
	    picLabel3.setBounds(0, 0, 110, 26);
	    picLabel4.setBounds(0, 0, 351, 4);
	    picLabel5.setBounds(0, 0, 463, 5);
	    picLabel6.setBounds(0, 0, 64, 86);
	    picLabel7.setBounds(0, 0, 104, 41);
	    background.setBounds(0, 0, 1367, 769);
	    plateau.setBounds(20, 20, 731, 730);
	    saturne.setBounds(770, 240, 64, 39);
	    score.setBounds(840, 250, 110, 26);
	    barrescore.setBounds(1000, 261, 351, 4);
	    barrejoueur.setBounds(761, 745, 463, 5);
	    pioche.setBounds(1220, 664, 64, 86);
	    menu.setBounds(1247, 20, 104, 41);
	    
	    //myPannel.setLocation(20, 20);
	    fenetre.setVisible(true);
	  }   

public static void main(String[] args){
    
    Affichage test = new Affichage();
  


}
}
