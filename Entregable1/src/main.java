
public class main {

	public static void main(String[] args) {

		Funciones f=new Funciones();
		//creo lista a
		ListaVinculada a=new ListaVinculada();
		a.insertFront(3);
		a.insertFront(4);
		a.insertFront(5);
		a.insertFront(6);
		a.insertFront(8);
		a.insertFront(9);
		
		
		//creo lista b
		ListaVinculada b=new ListaVinculada();
		b.insertFront(3);
		b.insertFront(4);
		b.insertFront(5);
	
	
		
		ListaVinculada c= new ListaVinculada();
		//creo lista c y llamo a la funcion de f
		c=f.ejercicio6(a, b);
		c.print();
		
	}

}
