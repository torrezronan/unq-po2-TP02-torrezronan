package ar.unq.tp02;

import java.time.LocalDate;

public class EmpleadoTemporario extends Empleado {
	private LocalDate fechaFinDesignacion;
	private int horasExtra ;
	private int dineroPorHoraExtra = 40;
	
	public EmpleadoTemporario(String nombre,String direccion,String estadoCivil, LocalDate fechaDeNacimiento, double sueldoBasico, LocalDate fechaFinDesignacion, int horasExtra) {
		super(nombre,direccion,estadoCivil,fechaDeNacimiento,sueldoBasico);
		this.fechaFinDesignacion = fechaFinDesignacion;
		this.horasExtra = horasExtra;
	}
	
	public double sueldoBruto() {
		return this.getSueldoBasico() + this.sueldoExtra() ;
		
	}
	
	public double sueldoExtra() {
		
		return this.horasExtra * this.dineroPorHoraExtra;
	}

}
