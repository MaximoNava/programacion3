package tp2;

public class ArbolBinario {

	NodeBinario first;
	
	public ArbolBinario() {
		first=null;		
	}
	
	public void Insert(int a) {
		if(first == null) {
			first= new NodeBinario(a);
		}
		else {
			NodeBinario tmp= first;
			
			InsertPrivate(tmp,a);
			
		}		
	}
	
	private void InsertPrivate(NodeBinario a, int valor){
		
		if(a.getValor()>valor) {
			if(a.getIzquierdo()==null) {
				a.setIzquierdo(valor);
			}
			else {
				InsertPrivate(a.getIzquierdo(),valor);
			}
		}
		else {
			if(a.getValor()<valor) {
				if(a.getDerecho()==null) {
					a.setDerecho(valor);
				}
				else {
					InsertPrivate(a.getDerecho(),valor);
				}
				}
			}
		}
		
	public ListaVinculada getFrontera() {
		ListaVinculada resultado= new ListaVinculada();
		
		if(first==null) {
					return resultado;
		}
		else {
			NodeBinario tmp= first;
			getFronteraPrivate(resultado,first);
		}
		return resultado;
	}
	
	private void getFronteraPrivate(ListaVinculada resultado, NodeBinario a) {
		if((a.getDerecho()==null)&&(a.getIzquierdo()==null)) {
			resultado.insertFront(a.getValor());
		}
		else {
			if(a.getDerecho()!=null) {
				getFronteraPrivate(resultado,a.getDerecho());
			}
			if(a.getIzquierdo()!=null) {
				getFronteraPrivate(resultado,a.getIzquierdo());
			}
			
		}
	}
	}

