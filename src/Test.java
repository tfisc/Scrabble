import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		boolean found =false;
        String mot="yoga";
		BufferedReader br;
        String motLu;
        try{
        		
            br = new BufferedReader(new FileReader(new File("images/ListeMots.txt")));
            while(br.readLine() != null )
            {
                motLu = br.readLine();
                System.out.println(motLu);
               if (motLu==mot) {
            	   		found=true;
               }
            }
            br.close();
            if(found)
            {
            	 System.out.println("le mot existe");
            }
            else {
            	System.out.println("le mot n'existe pas");
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
	}


