import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeitorDeArquivo {
	
	private String conteudo;
	
	public LeitorDeArquivo(String caminho){
	
		try {
			
			conteudo =  new Scanner(new File(caminho)).useDelimiter("\\Z").next();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	public String getConteudo() {
		return conteudo;
	}
	
}


