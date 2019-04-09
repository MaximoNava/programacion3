
public class Funciones {

	public  ListaVinculada ejercicio6(ListaVinculada a, ListaVinculada b) {
		ListaVinculada c = new ListaVinculada();
		for (int i = 0; i < a.size(); i++) {
			Object tmp = a.get(i);
			if (!b.contains(tmp)) {
				c.insertFront(tmp);
			}
		}
		return c;
	}
}

