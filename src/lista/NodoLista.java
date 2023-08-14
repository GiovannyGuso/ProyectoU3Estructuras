package lista;

class NodoLista<T> {
    T elemento;
    NodoLista<T> siguiente;
    public NodoLista(T elemento) {
        this.elemento = elemento;
        this.siguiente = null;
    }
}



