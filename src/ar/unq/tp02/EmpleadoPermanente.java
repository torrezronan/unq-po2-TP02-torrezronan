package ar.unq.tp02;

import java.time.LocalDate;

public class EmpleadoPermanente extends Empleado {
	
	private int cantidadDeHijos;
	private int antiguedad;
	private int dineroPorHijo =150 ;
	private boolean tieneConyuge;
	private int dineroPorAñoDeAntiguedad = 50;
	
	public EmpleadoPermanente(String nombre,String direccion,String estadoCivil, LocalDate fechaDeNacimiento, int cantidadDeHijos, int antiguedad) {
		super(nombre,direccion,estadoCivil,fechaDeNacimiento);
		this.cantidadDeHijos = cantidadDeHijos;
		this.antiguedad = antiguedad;
	}
	
	public double sueldoBruto(){
		return this.getSueldoBasico() + this.salarioFamiliar() ;
	}
	
	public double salarioFamiliar() {
		return this.totalSalarioPorhijo() + this.totalAsignacionPorConyuge()+ this.totalPorAntiguedad() ;
	}
	
	public double totalSalarioPorhijo() {
		
		return this.cantidadDeHijos * dineroPorHijo;
	}
	
	public double totalAsignacionPorConyuge() {
		
		 final double totalPorConyuge = 100;
		
		if(this.tieneConyuge) { return totalPorConyuge;} else { return 0;}
		
	}
	
	public double totalPorAntiguedad(){
		return this.antiguedad * this.dineroPorAñoDeAntiguedad;
	}

}
