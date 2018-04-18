
import java.util.ArrayList; 

public class Pioche{
	
	 ArrayList<String> listejeton = new ArrayList<String>();
	 

	public Pioche() {
		//this.listejeton.add("*");
		//this.listejeton.add("*");
		
		for(int i=0;i<=8;i++)
		{
			this.listejeton.add("A");
		}
		for(int i=0;i<=1;i++)
		{
			this.listejeton.add("B");
		}
		for(int i=0;i<=1;i++)
		{
			this.listejeton.add("C");
		}
		for(int i=0;i<=2;i++)
		{
			this.listejeton.add("D");
		}
		for(int i=0;i<=14;i++)
		{
			this.listejeton.add("E");
		}
		for(int i=0;i<=1;i++)
		{
			this.listejeton.add("F");
		}
		for(int i=0;i<=1;i++)
		{
			this.listejeton.add("G");
		}
		for(int i=0;i<=1;i++)
		{
			this.listejeton.add("H");
		}
		for(int i=0;i<=7;i++)
		{
			this.listejeton.add("I");
		}

		this.listejeton.add("J");
		
		this.listejeton.add("K");
		
		for(int i=0;i<=4;i++)
		{
			this.listejeton.add("L");
		}
		for(int i=0;i<=2;i++)
		{
			this.listejeton.add("M");
		}
		for(int i=0;i<=5;i++)
		{
			this.listejeton.add("N");
		}
		for(int i=0;i<=5;i++)
		{
			this.listejeton.add("O");
		}
		for(int i=0;i<=1;i++)
		{
			this.listejeton.add("P");
		}

		this.listejeton.add("Q");
		
		for(int i=0;i<=5;i++)
		{
			this.listejeton.add("R");
		}
		for(int i=0;i<=5;i++)
		{
			this.listejeton.add("S");
		}
		for(int i=0;i<=5;i++)
		{
			this.listejeton.add("T");
		}
		for(int i=0;i<=5;i++)
		{
			this.listejeton.add("U");
		}
		for(int i=0;i<=1;i++)
		{
			this.listejeton.add("V");
		}
		
		this.listejeton.add("W");
		this.listejeton.add("X");
		this.listejeton.add("Y");
		this.listejeton.add("Z");
		
	}
	
	public String piochejeton() {
		int nb = (int) (Math.random() * listejeton.size() );
		
		String jetonpioche = listejeton.get(nb);
		listejeton.remove(nb);
		return(jetonpioche);
	}
	
	public ArrayList<String> piocheplusieur(int n) {
		
		ArrayList<String> jetons = new ArrayList<String>();
		
		for (int i=0;i<n;i++)
		{
		int nb = (int) (Math.random() * listejeton.size() );
		
		String jetonpioche = listejeton.get(nb);
		jetons.add(jetonpioche);
		listejeton.remove(nb);
		
		}
		return(jetons);
	
	}
	
	public void remetunjeton(String jeton) {
		this.listejeton.add(jeton);
	}
	
	public void remetplusieursjeton(ArrayList<String> jetons,int n) {
		for (int i=0;i<n;i++)
		{
		String jetonpioche = jetons.get(0);
		listejeton.remove(0);
		this.listejeton.add(jetonpioche);
		}
	}
	
	public boolean piochevide()
	{
		return(listejeton.isEmpty());
	}
	
	 
}

