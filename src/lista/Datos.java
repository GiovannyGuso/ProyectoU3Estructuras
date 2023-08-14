package lista;

public class Datos {
	//------------------------------------------------------
	//				Atributos de la clase
	//------------------------------------------------------
	String nombreCiudad;
	String provincia;
	String alcalde;
	String region;
	Integer numeroHabitantes; 
	//------------------------------------------------------
	// 					Constructor Vacio
	//------------------------------------------------------
	public Datos() {
		nombreCiudad=null;
		provincia=null;
		alcalde=null;
		region=null;
		numeroHabitantes=null;
	}
	//------------------------------------------------------
	// 					Constructor sobre cargado
	//------------------------------------------------------
	public Datos(String nombreCiudad, String provincia, String alcalde, String region, Integer numeroHabitantes) {
		this.nombreCiudad = nombreCiudad;
		this.provincia =provincia;
		this.alcalde= alcalde;
		this.region= region;		
		this.numeroHabitantes=numeroHabitantes;
	}


    @Override
    public String toString() {
        return "Datos{" +
                "Ciudad='" + nombreCiudad + '\'' +
                '}';
    }
	//------------------------------------------------------
	// 					GETTERS Y SETTERS
	//------------------------------------------------------
	public String getNombreCiudad() {
		return nombreCiudad;
	}
	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getAlcalde() {
		return alcalde;
	}
	public void setAlcalde(String alcalde) {
		this.alcalde = alcalde;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public Integer getNumeroHabitantes() {
		return numeroHabitantes;
	}
	public void setNumeroHabitantes(Integer numeroHabitantes) {
		this.numeroHabitantes = numeroHabitantes;
	}
	
}
