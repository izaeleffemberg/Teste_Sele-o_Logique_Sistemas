import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BuscarNumerosREGEX {
	
	private List<String> listaNumeros;
	
	private String documento;
	
	private LeitorDeArquivo leitor;
	
	private long inicio;
	private long fim;
	
	public BuscarNumerosREGEX(String caminho){
		
		leitor = new LeitorDeArquivo(caminho);
		documento = leitor.getConteudo();
		
		inicio = System.currentTimeMillis();
		extrairNumeros();
		fim = System.currentTimeMillis()-inicio;
		
		System.out.println("Tempo de execução: "+fim+"ms \n");
	}
	
	/**
	 * Método de busca dos números implementado com expressões regulares.
	 * */
	private void extrairNumeros(){
				
		listaNumeros = new ArrayList<String>();		

		Matcher combinacao = Pattern.compile("\\d+").matcher(documento);
		
		while (combinacao.find()){
			listaNumeros.add(combinacao.group());
		}
		
	}

	public List<String> getListaNumeros() {
		return listaNumeros;
	}
	
	public void exibirLista(){
		
		if (listaNumeros != null){
			for (String string : listaNumeros) {
				System.out.print(string+"; ");
			}
		} else {
			System.out.println("Lista vazia!");
		}
	}
	
}
