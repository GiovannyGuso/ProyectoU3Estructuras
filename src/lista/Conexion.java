package lista;

class Conexion {
    private Nodo ciudadA;
    private Nodo ciudadB;
    private double kilometros;
    private String tipoVia;

    public Conexion(Nodo ciudadA, Nodo ciudadB, double kilometros, String tipoVia) {
        this.ciudadA = ciudadA;
        this.ciudadB = ciudadB;
        this.kilometros = kilometros;
        this.tipoVia = tipoVia;
    }
    public Nodo getCiudadA() {
        return ciudadA;
    }
    public Nodo getCiudadB() {
        return ciudadB;
    }
    public double getKilometros() {
        return kilometros;
    }
    public void setCiudadA(Nodo ciudadA) {
		this.ciudadA = ciudadA;
	}
	public void setCiudadB(Nodo ciudadB) {
		this.ciudadB = ciudadB;
	}
	public void setKilometros(double kilometros) {
		this.kilometros = kilometros;
	}
	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}
	public String getTipoVia() {
        return tipoVia;
    }
}
