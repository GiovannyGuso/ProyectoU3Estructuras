	package lista;

import java.util.Iterator;
import java.util.NoSuchElementException;

class Lista<T> {
	private NodoLista<T> primero;
	public Lista() {
		this.primero = null;
	}
	public void agregar(T elemento) {
		NodoLista<T> nuevoNodo = new NodoLista<>(elemento);
		nuevoNodo.siguiente = primero;
		primero = nuevoNodo;
	}       
	public void recorrer() {
		NodoLista<T> actual = primero;
		while (actual != null) {
			System.out.println(actual.elemento);
			actual = actual.siguiente;
		}
	}
	public boolean vacio() {
		if(primero==null) {
			return true;
		}
		else {
			return false;
		}
	}
	public NodoLista<T> getPrimero() {
		return primero;
	}
	public void setPrimero(NodoLista<T> primero) {
		this.primero = primero;
	}
    // Método para obtener un iterable de la lista
    public Iterable<T> iterable() {
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    private NodoLista<T> actual = primero;

                    @Override
                    public boolean hasNext() {
                        return actual != null;
                    }

                    @Override
                    public T next() {
                        if (hasNext()) {
                            T elemento = actual.elemento;
                            actual = actual.siguiente;
                            return elemento;
                        } else {
                            throw new NoSuchElementException();
                        }
                    }
                };
            }
        };
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        NodoLista<T> current = primero;
        boolean first = true;
        while (current != null) {
            if (!first) {
                result.append(", ");
            }
            result.append(current.elemento);
            first = false;
            current = current.siguiente;
        }
        result.append("]");
        return result.toString();
    }
}
