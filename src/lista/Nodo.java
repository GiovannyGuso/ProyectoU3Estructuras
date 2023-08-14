package lista;
class Nodo {
    Datos datos;  // Datos del vértice
    Lista<Nodo> vecinos;  // Lista de vértices vecinos (lista de adyacencia)
    
    public Nodo(Datos datos) {
        this.datos = datos;
        this.vecinos = new Lista<>();
    }
    // Método para agregar un vecino (vértice adyacente)
    public void agregarVecino(Nodo vecino) {
        vecinos.agregar(vecino);
    }
    
    @Override
    public String toString() {
        return "Nodo{" +
                "datos=" + datos +
                '}';
    }
	public Datos getDatos() {
		return datos;
	}
	public void setDatos(Datos datos) {
		this.datos = datos;
	}
	public Lista<Nodo> getVecinos() {
		return vecinos;
	}
	public void setVecinos(Lista<Nodo> vecinos) {
		this.vecinos = vecinos;
	}
}