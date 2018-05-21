
import java.util.ArrayList; 

public class Pioche{
	
	 ArrayList<Jetons> listejeton = new ArrayList<Jetons>();
	 

	public Pioche() {
		//this.listejeton.add("*");
		//this.listejeton.add("*");
		
		for(int i=0;i<=8;i++)
		{
			this.listejeton.add(new Jetons('a',1));
		}
		for(int i=0;i<=1;i++)
		{
			this.listejeton.add(new Jetons('b',3));
		}
		for(int i=0;i<=1;i++)
		{
			this.listejeton.add(new Jetons('c',3));
		}
		for(int i=0;i<=2;i++)
		{
			this.listejeton.add(new Jetons('d',2));
		}
		for(int i=0;i<=14;i++)
		{
			this.listejeton.add(new Jetons('e',1));
		}
		for(int i=0;i<=1;i++)
		{
			this.listejeton.add(new Jetons('f',4));
		}
		for(int i=0;i<=1;i++)
		{
			this.listejeton.add(new Jetons('g',2));
		}
		for(int i=0;i<=1;i++)
		{
			this.listejeton.add(new Jetons('h',4));
		}
		for(int i=0;i<=7;i++)
		{
			this.listejeton.add(new Jetons('i',1));
		}

		this.listejeton.add(new Jetons('j',8));
		
		this.listejeton.add(new Jetons('k',10));
		
		for(int i=0;i<=4;i++)
		{
			this.listejeton.add(new Jetons('l',1));
		}
		for(int i=0;i<=2;i++)
		{
			this.listejeton.add(new Jetons('m',2));
		}
		for(int i=0;i<=5;i++)
		{
			this.listejeton.add(new Jetons('n',1));
		}
		for(int i=0;i<=5;i++)
		{
			this.listejeton.add(new Jetons('o',1));
		}
		for(int i=0;i<=1;i++)
		{
			this.listejeton.add(new Jetons('p',3));
		}

		this.listejeton.add(new Jetons('q',8));
		
		for(int i=0;i<=5;i++)
		{
			this.listejeton.add(new Jetons('r',1));
		}
		for(int i=0;i<=5;i++)
		{
			this.listejeton.add(new Jetons('s',1));
		}
		for(int i=0;i<=5;i++)
		{
			this.listejeton.add(new Jetons('t',1));
		}
		for(int i=0;i<=5;i++)
		{
			this.listejeton.add(new Jetons('u',1));
		}
		for(int i=0;i<=1;i++)
		{
			this.listejeton.add(new Jetons('v',4));
		}
		
		this.listejeton.add(new Jetons('w',10));
		this.listejeton.add(new Jetons('x',10));
		this.listejeton.add(new Jetons('y',10));
		this.listejeton.add(new Jetons('z',10));
		
	}
	
	public Jetons piochejeton() {
		int nb = (int) (Math.random() * listejeton.size() );
		
		Jetons jetonpioche = listejeton.get(nb);
		listejeton.remove(nb);
		return(jetonpioche);
	}
	
	public ArrayList<Jetons> piocheplusieur(int n) {
		
		ArrayList<Jetons> jetons = new ArrayList<Jetons>();
		
		for (int i=0;i<n;i++)
		{
		int nb = (int) (Math.random() * listejeton.size() );
		
		Jetons jetonpioche = listejeton.get(nb);
		jetons.add(jetonpioche);
		listejeton.remove(nb);
		
		}
		return(jetons);
	
	}
	
	public void remetunjeton(Jetons jeton) {
		this.listejeton.add(jeton);
	}
	
	public void remetplusieursjeton(ArrayList<Jetons> jetons,int n) {
		for (int i=0;i<n;i++)
		{
		Jetons jetonpioche = jetons.get(0);
		listejeton.remove(0);
		this.listejeton.add(jetonpioche);
		}
	}
	
	public boolean piochevide()
	{
		return(listejeton.isEmpty());
	}
	
	 
}

