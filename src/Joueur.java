import java.util.ArrayList;

public class Joueur {
		  private int score;
		  private ArrayList<Jetons>j;

		  public Joueur(){
		    this.score=0;
		    this.j = new ArrayList<Jetons>();
		  }

		  public Joueur(ArrayList<Jetons>tab){
		    this.score=0;
		    this.j = new ArrayList<Jetons>();
		    int i=0;

		    while(i<tab.size()){
		      this.j.add(tab.get(i));
		      i++;
		    }
		  }
		  
		  public void setScore(int nb) {
			  this.score = nb;
		  }
		  
		  public int getScore() {
			  return this.score;
		  }
		  
		  public void ajoutScore(int nb) {
			  this.score = this.score + nb;
		  }
		  
		  public ArrayList<Jetons> getJetonsjoueur(){
			  return this.j;
		  }
		  
		  public Jetons getJetonsjoueur(int i){
			  return this.j.get(i);
		  }
		  
		  public ArrayList<Jetons> supprimerMainjoueur() {
			  ArrayList<Jetons>res;
			  res = new ArrayList<Jetons>();
			  int i;
			  i=0;
			  while(i<this.j.size()) {
				  res.add(this.j.get(i));
				  i++;
			  }
			  while(!this.j.isEmpty()){
				  this.j.remove(this.j.size()-1);
			  }
			  
			  return res;
		  }
		  
		  public void setMainDuJoueur(ArrayList<Jetons>tab) {
			  int i=0;
			  
			  while(!this.j.isEmpty()) {
				  this.j.remove(this.j.size()-1);
			  }
			  
			  while(i<tab.size()) {
				  this.j.add(tab.get(i));
				  i++;
			  }
				  }
			  
			  public void ajoutJeton(Jetons jeton) {
				 j.add(jeton);
			  }
		  }
		  
		  /*public static void main(String []args) {
			  Joueur p1;
			  ArrayList<Jetons> j1, recup;
			  Jetons je1,je2,je3,je4,je5,je6,je7;
			  int i=0;
			  
			  je1 = new Jetons();
			  je2 = new Jetons();
			  je3 = new Jetons();
			  je4 = new Jetons();
			  je5 = new Jetons();
			  je6 = new Jetons();
			  je7 = new Jetons();
			  
			  j1 = new ArrayList<Jetons>();
			  j1.add(je1);
			  j1.add(je2);
			  j1.add(je3);
			  j1.add(je4);
			  j1.add(je5);
			  j1.add(je6);
			  j1.add(je7);
		  
			  p1 = new Joueur(j1);
			
			  while(i<j1.size()) {
				  System.out.println(j1.get(i));
				  i++;
			  }
			  
			  recup = new ArrayList<Jetons>();
			  recup = p1.supprimerMainjoueur();	  
			  
			  if (p1.getJetonsjoueur().isEmpty()){
				  System.out.println("Vide !");
			  }
			  else if (!p1.getJetonsjoueur().isEmpty()) {
				  System.out.println("Non vide");
			  }
			  
			  i=0;
			  while(i<recup.size()) {
				  System.out.println(recup.get(i));
				  i++;
			  }
			  
			  p1.setScore(17);
			  p1.ajoutScore(3);
			  System.out.println(p1.getScore());
		  }*/
