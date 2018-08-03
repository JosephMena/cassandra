package org.zer0.pocs.cassandrademo.dto;

import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Persona {
	
	@Column 
	private String nombres;
	@Column
	private String apellidos;
	@PrimaryKeyColumn(
		      name = "dni", 
		      ordinal = 2, 
		      type = PrimaryKeyType.PARTITIONED, 
		      ordering = Ordering.DESCENDING)
	private Integer dni;
	
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	
}
