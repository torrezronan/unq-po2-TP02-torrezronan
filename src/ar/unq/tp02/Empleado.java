package ar.unq.tp02;

import java.time.LocalDate;

public class Empleado {
	
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private LocalDate fechaDeNacimiento;
	private double sueldoBasico;
	 
	
	
	public Empleado(String nombre,String direccion,String estadoCivil, LocalDate fechaDeNacimiento, double sueldoBasico) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaDeNacimiento = fechaDeNacimiento ;
		this.sueldoBasico = sueldoBasico;
	}
	
	public int edad() {
		
		final LocalDate fechaActual= LocalDate.now();
		
		return fechaActual.getYear()- fechaDeNacimiento.getYear();
	}
	
	public double getSueldoBasico() {
		return sueldoBasico;
	}

}












