package tp2;
public class ListaVinculada {
	protected Nodo first;

	public ListaVinculada() {
		first = null;
	}

	public void insertFront(Object o) {
		Nodo tmp = new Nodo(o, null);
		tmp.setNext(first);
		first = tmp;
	}

	
	//recuperar tamaño de la lista
	public int size() {
		int contador = 0;
		if (this.first != null) {
			Nodo tmp = first;
			contador++;
			while (tmp.getNext() != null) {
				contador++;
				tmp = tmp.getNext();
			}
		}
		return contador;
	}
    //devuelve true en caso de que la lista este vacia, caso contrario devuelve false
	public boolean isEmpty() {
		if(this.first==null) {
			return true;
		}
		return false;
	}
	
	//recupero el objeto del nodo perteneciente a la lista con un indice
	public Object get(int a) {

		Nodo tmp = first;
		int contador = 0;
		while (contador < a) {
			tmp = tmp.getNext();
			contador++;
		}
		return tmp.getInfo();
	}

	//devuelve true en caso de que el objeto pertenezca a un nodo de la lista
	public boolean contains(Object a) {
		Nodo tmp = first;
		for (int i = 0; i < this.size(); i++) {
			if (tmp.getInfo().equals(a)) {
				return true;
			} else
				tmp = tmp.getNext();
		}
		return false;
	}
	//imprime el contenido de los nodos de la lista
	public void print() {
		if(this.size()==0) {
			System.out.println("La lista esta vacia");
		}
		else {
			for(int i=0;i<this.size();i++) {
				System.out.println(this.get(i));
			}
		}
	
	}

}