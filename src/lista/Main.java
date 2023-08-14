package lista;

public class Main {
    public static void main(String[] args) {
        // Crear un nuevo grafo
        Grafo grafo = new Grafo();

        // Crear nodos con datos                           
        Datos datos1 = new Datos("Santo domingo", "SantoDomingo", "Rigoberto Pacheco", "Costa", 123456789);
        Nodo ciudad1 = new Nodo(datos1);

        Datos datos2 = new Datos("Quito", "Pichincha", "Luis Guachilema", "Sierra", 123);
        Nodo ciudad2 = new Nodo(datos2);
        
        Datos datos3 = new Datos("Esmeraldas", "Esmeraldas", "Erickson", "Costa", 1332);
        Nodo ciudad3 = new Nodo(datos3);

        //----------------------------------------------------
        //Agrego un nuevo nodo a la lista de grafos
        //----------------------------------------------------
        grafo.agregarNodo(ciudad1);
        grafo.agregarNodo(ciudad2);
        grafo.agregarNodo(ciudad3);
//        // Conectar nodos (grafo no dirigido)
        grafo.conectarNodos(ciudad1, ciudad3,100.0, "Autopista");
        grafo.conectarNodos(ciudad1, ciudad2,200, "Roca");     
        grafo.conectarNodos(ciudad2, ciudad1,200, "Roca");     
        
        System.out.println("---------------------------------------------");   
        grafo.mostrarCiudadesConectadas();
    }
}
