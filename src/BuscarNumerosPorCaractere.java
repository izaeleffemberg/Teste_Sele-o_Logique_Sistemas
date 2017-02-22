import java.util.ArrayList;
import java.util.List;

public class BuscarNumerosPorCaractere {
	
	private List<String> listaNumeros;
	
	private String documento;
	
	private LeitorDeArquivo leitor;
	
	private long inicio;
	private long fim;
	
	public BuscarNumerosPorCaractere(String caminho){
		
		leitor = new LeitorDeArquivo(caminho);
		documento = leitor.getConteudo();
		
		inicio = System.currentTimeMillis();
		extrairNumeros();
		fim = System.currentTimeMillis()-inicio;
		
		System.out.println("Tempo de execução: "+fim+"ms \n");
	}
	
	/**
	 * Método de busca dos números implementado com foco na verificação de cada caractere dentro do arquivo.
	 * */
	private void extrairNumeros(){
				
		listaNumeros = new ArrayList<String>();		
		String numero_aux = "";

		for (int i = 0; i < documento.length(); i++){
			
			if (documento.charAt(i) == '0' || documento.charAt(i) == '1' || documento.charAt(i) == '2' ||
				documento.charAt(i) == '3' || documento.charAt(i) == '4' || documento.charAt(i) == '5' ||
				documento.charAt(i) == '6' || documento.charAt(i) == '7' || documento.charAt(i) == '8' ||
				documento.charAt(i) == '9'){
				
					numero_aux += documento.charAt(i);
				
			} else {
				if (numero_aux != ""){
					listaNumeros.add(numero_aux);
				}
				numero_aux = "";
			}
			
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
