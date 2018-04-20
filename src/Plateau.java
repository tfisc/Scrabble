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

	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
