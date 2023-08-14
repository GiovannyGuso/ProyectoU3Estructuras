package lista;

class Grafo {
	Lista<Nodo> nodos;  // Lista de vértices en el grafo
	ListaAdyacente<Object> listasAdyacente;
	Lista<Conexion> conexiones;
	public Grafo() {
	    this.nodos = new Lista<>();
	    this.conexiones = new Lista<>();
	}
	// Método para agregar un nodo al grafo
	public void agregarNodo(Nodo nodo) {
		nodos.agregar(nodo);
	}
	// Método para conectar dos nodos (vértices) en el grafo
	public void conectarNodos(Nodo nodo1, Nodo nodo2) {
		nodo1.agregarVecino(nodo2);
		nodo2.agregarVecino(nodo1);
	}
	// Método para conectar dos nodos (vértices) en el grafo con atributos adicionales
	public void conectarNodos(Nodo nodo1, Nodo nodo2, double kilometros, String tipoVia) {
		nodo1.agregarVecino(nodo2);
		nodo2.agregarVecino(nodo1);

		// Crear una conexión con los atributos proporcionados y agregarla a la lista de conexiones
		Conexion conexion = new Conexion(nodo1, nodo2, kilometros, tipoVia);
		conexiones.agregar(conexion);
	}


	public void mostrarCiudadesConectadas() {
		for (Conexion conexion : conexiones.iterable()) {
			Nodo ciudadA = conexion.getCiudadA();
			Nodo ciudadB = conexion.getCiudadB();
			double kilometros = conexion.getKilometros();
			String tipoVia = conexion.getTipoVia();
			System.out.println("Conexión entre " + ciudadA.getDatos().getNombreCiudad() + " y " + ciudadB.getDatos().getNombreCiudad() + ": " +
					"Kilómetros: " + kilometros + ", Tipo de vía: " + tipoVia);
		}
	}

	//    public void mostrarCiudadesConectadas() {
	//    	// Obtener la lista de nodos del grafo
	//        Lista<Nodo> nodosDelGrafo = getNodos();
	//        // Crear una lista para las listas de vecinos
	//        Lista<Lista<Nodo>> listasVecinos = new Lista<>();        
	//        // Recorrer la lista de nodos utilizando un bucle for-each
	//        for (Nodo nodo : nodosDelGrafo.iterable()) {
	//            // Verificar si la lista de vecinos no está vacía antes de agregarla
	//            if (!nodo.getVecinos().vacio()) {
	//                listasVecinos.agregar(nodo.getVecinos());
	//            }
	//        }
	//        listasVecinos.recorrer();
	//    }
	public Lista<Nodo> getNodos() {
		return nodos;
	}
	public void setNodos(Lista<Nodo> nodos) {
		this.nodos = nodos;
	}
}