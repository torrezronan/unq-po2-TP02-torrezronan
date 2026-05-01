package ar.unq.tp02;

import java.time.LocalDate;

public class EmpleadoPermanente extends Empleado {
	
	private int cantidadDeHijos;
	private int antiguedad;
	
	public EmpleadoPermanente(String nombre,String direccion,String estadoCivil, LocalDate fechaDeNacimiento, int cantidadDeHijos, int antiguedad) {
		super(nombre,direccion,estadoCivil,fechaDeNacimiento);
		this.cantidadDeHijos = cantidadDeHijos;
		this.antiguedad = antiguedad;
	}
	
	

}
