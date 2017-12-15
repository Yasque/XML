package api.chocolate.xml.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Chocolate {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
  @NotNull
  private String nombre;
  @NotNull
  private String costo;
  @NotNull
  private String imagen;
  @NotNull
  private String descripcion;
  @NotNull
  private int piezas;
  
  public Chocolate() {
		
  }
  
public Chocolate(String nombre, String costo, String imagen, String descripcion, int piezas) {
	this.nombre = nombre;
	this.costo = costo;
	this.imagen = imagen;
	this.descripcion = descripcion;
}
  
  
  public int getPiezas() {
	return piezas;
}

public void setPiezas(int piezas) {
	this.piezas = piezas;
}


public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getImagen() {
	return imagen;
}
public String getCosto() {
	return costo;
}

public void setCosto(String costo) {
	this.costo = costo;
}


public void setImagen(String imagen) {
	this.imagen = imagen;
}

  

  
	
	
	
}
