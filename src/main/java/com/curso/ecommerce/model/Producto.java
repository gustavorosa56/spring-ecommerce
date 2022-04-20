package com.curso.ecommerce.model;

public class Producto {
	
	private Integer id;
	private String nombre;
	private String despcripcion;
	private String imagen;
	private double precio;
	private int cantidad;
	
	
	public Producto() {
	
	}


	public Producto(Integer id, String nombre, String despcripcion, String imagen, double precio, int cantidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.despcripcion = despcripcion;
		this.imagen = imagen;
		this.precio = precio;
		this.cantidad = cantidad;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDespcripcion() {
		return despcripcion;
	}


	public void setDespcripcion(String despcripcion) {
		this.despcripcion = despcripcion;
	}


	public String getImagen() {
		return imagen;
	}


	public void setImagen(String imagen) {
		this.imagen = imagen;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", despcripcion=" + despcripcion + ", imagen=" + imagen
				+ ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
	
	

}
