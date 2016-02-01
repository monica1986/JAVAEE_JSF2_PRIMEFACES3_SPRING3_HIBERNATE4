package com.otv.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 

@Entity
@Table(name="PRODUCTO")
public class Producto {
 
    private int id;
    private String nombre;
    private String descripcion;
    private int precio;
    
    /**
     * Get id Producto
     * 
     * @return id_producto 
     */
    @Id
    @Column(name="id_producto", unique = true, nullable = false)
    public int getId() {
        return id;
    }
    
    /**
     * Set  id producto
     * 
     * @param int - codigo id_producto
     */
    public void setId(int id) {
        this.id = id;
    }
    
    
    /**
     * Get nombre producto
     * 
     * @return nombre producto 
     */
    @Id
    @Column(name="nombre", unique = true, nullable = false)
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    
    /**
     * Set  nombre producto
     * 
     * @param String - nombre producto
     */
    public String getNombre() {
		return nombre;
	}
    
    
    /**
     * Get descripcion producto
     * 
     * @return descripcion producto 
     */
    @Id
    @Column(name="descripcion", unique = true, nullable = false)
	public String getDescripcion() {
		return descripcion;
	}

    /**
     * Set  descripcion producto
     * 
     * @param String - descripcion producto
     */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	
	 /**
     * Get precio producto
     * 
     * @return precio producto 
     */
    @Id
    @Column(name="precio", unique = true, nullable = false)
	public int getPrecio() {
		return precio;
	}

    /**
     * Set  precio producto
     * 
     * @param String - precio producto
     */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
    public String toString() {
        StringBuffer strBuff = new StringBuffer();
        strBuff.append("codigo producto : ").append(getId());
        strBuff.append("nombre producto : ").append(getNombre());
        strBuff.append("descripcion producto : ").append(getDescripcion());
        strBuff.append("precio producto : ").append(getPrecio());
        return strBuff.toString();
    }
}