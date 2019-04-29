package tp2;

public class Main {

	public static void main(String[] args) {
		
		ArbolBinario arbol=new ArbolBinario();
		arbol.Insert(5);
		arbol.Insert(3);
		arbol.Insert(8);
		arbol.Insert(6);
		arbol.Insert(10);
	
		arbol.getFrontera().print();
		
	}

}
