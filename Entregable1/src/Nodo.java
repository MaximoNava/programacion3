
public class Nodo {
	
		private Object info;
		
		private Nodo next;
		
		public Nodo() {
		info = null;
		next = null;
		}
		
		public Nodo(Object o, Nodo n) {
		setInfo(o);
		setNext(n);
		}
		
		public void setInfo(Object o) {
		info = o;
		}
		
		public void setNext(Nodo n) {
		next = n;
		}
		
		public Object getInfo() {
		return info;
		}
		
		public Nodo getNext() {
		return next;
		}
}
