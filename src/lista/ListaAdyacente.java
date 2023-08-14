package lista;

public class ListaAdyacente<T> {
	   private Lista<Lista<T>> listas;

	    public ListaAdyacente() {
	        this.listas = new Lista<>();
	    }

	    public void agregarLista(Lista<T> lista) {
	        listas.agregar(lista);
	    }

	    public void recorrerListas() {
	        listas.recorrer();
	    }
}

