package tp2;

public class NodeBinario {
	private int valor;
	private NodeBinario izquierdo;
	private NodeBinario derecho;
	
	public NodeBinario(int valor) {
		this.valor = valor;
		this.izquierdo = null;
		this.derecho = null;
	}
	public int getValor() {
		return this.valor;
		}
	
	public NodeBinario getIzquierdo(){
		return this.izquierdo;
	}
	public NodeBinario getDerecho() {
		return this.derecho;
		
	}
	public void setIzquierdo(int a) {

		this.izquierdo= new NodeBinario(a);
	}
	public void setDerecho(int a) {

		this.derecho= new NodeBinario(a);
	}
}
