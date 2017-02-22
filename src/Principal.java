
public class Principal {

	public static void main (String[] args){
		
		
		System.out.println("- CASO 1: Extra��o dos n�meros analisando cada caractere do arquivo -");
		BuscarNumerosPorCaractere numerosCasoI = new BuscarNumerosPorCaractere("texto.txt");
		System.out.println("Quantidade total de n�meros: "+numerosCasoI.getListaNumeros().size());
		System.out.println("Lista de n�meros: ");
		numerosCasoI.exibirLista();
		
		System.out.println("\n");
		
		System.out.println("- CASO 2: Extra��o dos n�meros com express�o regular -");
		BuscarNumerosREGEX numerosCasoII = new BuscarNumerosREGEX("texto.txt");
		System.out.println("Quantidade total de n�meros: "+numerosCasoII.getListaNumeros().size());
		System.out.println("Lista de n�meros: ");
		numerosCasoII.exibirLista();
		
	}
	
}
