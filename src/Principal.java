
public class Principal {

	public static void main (String[] args){
		
		
		System.out.println("- CASO 1: Extração dos números analisando cada caractere do arquivo -");
		BuscarNumerosPorCaractere numerosCasoI = new BuscarNumerosPorCaractere("texto.txt");
		System.out.println("Quantidade total de números: "+numerosCasoI.getListaNumeros().size());
		System.out.println("Lista de números: ");
		numerosCasoI.exibirLista();
		
		System.out.println("\n");
		
		System.out.println("- CASO 2: Extração dos números com expressão regular -");
		BuscarNumerosREGEX numerosCasoII = new BuscarNumerosREGEX("texto.txt");
		System.out.println("Quantidade total de números: "+numerosCasoII.getListaNumeros().size());
		System.out.println("Lista de números: ");
		numerosCasoII.exibirLista();
		
	}
	
}
