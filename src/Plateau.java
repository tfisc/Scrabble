import java.util.ArrayList;

public class Plateau {
	
	//le premier indice correspond au changmement de ligne et le second aux colonnes
	public boolean[][] remplissage;
	public int[][] bonus;
	public Jetons[][] lettres;
	
	//commentaire fait depuis git
	public Plateau(){
		int i;
		int j;
		//initialisation de remplissage
		for(i = 0; i < 15; i++)
		{
			for(j = 0; j < 15; j++) {
				remplissage[i][j]=false;
			}
			
		}
		
		//initialisation de bonus
		for(i = 0; i < 15; i++)
		{
			for(j = 0; j < 15; j++) {
				bonus[i][j]=0;
			}
			
		}
		//placement des mots compte compte triple (valeur 4 choisi arbitrairement)
		bonus[0][0]=4;
		bonus[0][15]=4;
		bonus[7][0]=4;
		bonus[7][15]=4;
		bonus[15][0]=4;
		bonus[15][7]=4;
		bonus[15][15]=4;
		//placement des mots compte double 
		bonus[1][1]=3;
		bonus[2][2]=3;
		bonus[3][3]=3;
		bonus[4][4]=3;
		bonus[1][13]=3;
		bonus[2][12]=3;
		bonus[3][11]=3;
		bonus[4][10]=3;
		bonus[14][1]=3;
		bonus[14][2]=3;
		bonus[14][3]=3;
		bonus[14][4]=3;
		bonus[13][13]=3;
		bonus[12][12]=3;
		bonus[11][11]=3;
		bonus[10][10]=3;
		
		//placement des lettres compte double
		bonus[3][0]=1;
		bonus[11][0]=1;
		bonus[6][2]=1;
		bonus[8][2]=1;
		bonus[0][3]=1;
		bonus[7][3]=1;
		bonus[14][3]=1;
		bonus[2][6]=1;
		bonus[6][6]=1;
		bonus[8][6]=1;
		bonus[12][6]=1;
		bonus[3][7]=1;
		bonus[11][7]=1;
		bonus[3][8]=1;
		bonus[6][8]=1;
		bonus[8][8]=1;
		bonus[12][8]=1;
		bonus[0][11]=1;
		bonus[7][11]=1;
		bonus[14][11]=1;
		bonus[6][12]=1;
		bonus[8][12]=1;
		bonus[11][14]=1;
		
		//placement des lettres compte triple
		bonus[5][1]=2;
		bonus[9][1]=2;
		bonus[1][5]=2;
		bonus[5][5]=2;
		bonus[9][5]=2;
		bonus[13][5]=2;
		bonus[1][9]=2;
		bonus[5][9]=2;
		bonus[9][9]=2;
		bonus[13][9]=2;
		bonus[5][13]=2;
		bonus[9][13]=2;
		
		
		
	}
	
	public boolean getRemplissage(int i,int j) {
		return remplissage[i][j];
	}
	
	@SuppressWarnings("unchecked")//ça sert juste à enlever les warnings de morts
	public ArrayList<Boolean> getRemplissages(int idebut,int jdebut, int ifin,int jfin) {
		@SuppressWarnings("rawtypes")
		ArrayList rep = new ArrayList();
		int j=jdebut;
		int i= idebut;
		if(idebut==ifin) {
			for(j = 0; j < jfin; j++) {
				rep.add(remplissage[idebut][j]);
				
			}
		}
			
			if(jdebut==jfin) {
				for(i = 0; i < ifin; i++) {
					rep.add(remplissage[i][jfin]);
					
				}
			}
		return rep;
	}

	//tout le long pour les vérifications j'estime qu'une case vide a un bonus de 0
		public boolean caseValide(int i, int j) { //j'estime que la case sélectionnée par le jour est donnée sous ses coordonnées i et j
			
			//si c'est la case de départ et qui est vide
			if(i==8 && j==8 && bonus[i][j]!=0) {
				return true;
			}
			
			//si la case est déjà prise
			if(bonus[i][j]==0) {
				return false;
			}
			
			//si case vide et sans rien autour
			if(bonus[i][j]!=0 && bonus[i+1][j]!=0 && bonus[i-1][j]!=0 && bonus[i][j-1]!=0 && bonus[i][j+1]!=0) {
				return false;
			}
			
			//si case vide et au moins une lettre autour
			if(bonus[i][j]!=0 && (bonus[i+1][j]==0 || bonus[i-1][j]==0 || bonus[i][j-1]==0 || bonus[i][j+1]==0)) {
				return true;
			}
		}
		
		public boolean placeDisponible(int nbLettres, int i, int j, int d) { //j'estime que la méthode récupère le nombre de lettres sélectionnées par le joueur et les coordonnées de la case de départ sélectionnée et la direction (0 pour en bas, 1 pour à droite); 			
			int caseR=0;
			int curseur=0;
			
			//si la direction sélectionnée est vers le bas
			if(d==0) {
				//initialisation du curseur au niveau de la ligne de la case de départ sélectionnée
				curseur=i;
				while(curseur!=15) {
					if(bonus[curseur][j]!=0) {
						caseR ++;
					}
					curseur ++;
				}
				//si les cases disponibles sont supérieures ou égales aux lettres sélectionnées alors retournent vraies
				if(caseR>=nbLettres) {
					return true;
				}
			}
			
			//si la direction sélectionnée est vers la droite
			if(d==1) {
				curseur=j;
				while(curseur!=15) {
					if(bonus[i][curseur]!=0) {
						caseR ++;
					}
					if(caseR>=nbLettres) {
						return true;
					}
					curseur ++;
				}
			}
			return false;
		}
		
		public boolean motValide(String mot) {
			
			if(Test(mot) == true) {
				return true;
			}
			
			else {
				return false;
			}
		}
		
		
		public boolean motAtourValide(int i, int j) {
		//on suppose qu'une case déjà utilisée par une lettre sur la plateau a un bonus égal à 0	
			String motVerif = "";
			int curseur1=0;
			
			//case de départ du mot joué (qu'on va appeler case d'origine) a une lettre voisine à gauche et pas à droite ou aussi à droite
			if (bonus[i][j-1]!=0) {
				
				//initialisation du curseur au début du mot voisin de gauche et du mot à vérifier à vide
				motVerif="";
				curseur1=j;
				while(bonus[i][curseur1]!=0) {
					curseur1=curseur1-1;
				}
				
				//parcours du mot jusqu'à la fin et construction du mot à vérifier
				while(bonus[i][curseur1]!=0) {
					motVerif = motVerif + lettreCase(i,curseur1); //lettreCase est une méthode qui permet de retourner la lettre posée sur la case sous forme de String
					curseur1=curseur1+1;
				}
				
				//si mot à vérifier faux, retourne faux
				if(Test(motVerif)==false) {
					return false;
				}
			}
			
			//case d'origine a une lettre voisine à droite et pas à gauche
			if(bonus[i][j-1]==0 && bonus[i][j+1]!=0) {
				motVerif="";
				curseur1=j;
				
				//parcours du mot jusqu'à la fin et construction du mot à vérifier
				while(bonus[i][curseur1]!=0) {
					motVerif=motVerif + lettreCase(i,curseur1);
					curseur1 ++;
				}
				
				//si mot à vérifier faux, retourne faux
				if(Test(motVerif)=false) {
					return false;
				}
			}
			
			//case d'origine a une lettre voisine en haut et pas en bas ou aussi en bas
			
			if(bonus[i-1][j]!=0) {
				motVerif="";
				curseur1=i;
				while(bonus[curseur1][j]!=0) {
					curseur1 --;
				}
				
				while(bonus[curseur1][j]!=0) {
					motVerif=motVerif + lettreCase(curseur1,j);
					curseur1 ++;
				}
				if(Test(motVerif)==false) {
					return false;
				}
			}
			
			if(bonus[i+1][j]!=0) {
				motVerif="";
				curseur1=i;
				
				while(bonus[curseur1][j]!=0) {
					motVerif=motVerif+lettreCase(cuseur1,j);
					curseur1 ++;
				}
				if(Test(motVerif)==false) {
					return false;
				}
			}
			return true;
		}
		
		public boolean poseMotValide() {
		}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
