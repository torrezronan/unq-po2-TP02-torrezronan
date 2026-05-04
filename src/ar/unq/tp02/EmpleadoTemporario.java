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
	
	@Override
	double sueldoBruto() {
		return this.getSueldoBasico() + this.sueldoExtra() ;
		
	}
	
	public double sueldoExtra() {
		
		return this.horasExtra * this.dineroPorHoraExtra;
	}
	
	
	@Override
	public double totalRetenciones () {
		return this.totalPorObraSocial()+ this.extraPorSuperarEdad()+ this.aportesJubilatorios()+this.totalPorHorasExtra();
	}
	
	public double totalPorObraSocial() {
		final double coeficienteDiezPorciento = 0.10;
		return this.porcentajeDeSueldoBruto(coeficienteDiezPorciento) ;
	}
	
	public int extraPorSuperarEdad(){
		
		if(this.esMayorDe(50)) {return 20;}
		return 0;
		
	}
		
	
	public boolean esMayorDe(int edad) {
		if(this.edad() > edad) {
			return true;
		} else {return false;}
	}
	
	public double aportesJubilatorios() {
		final double coeficienteQuincePorciento = 0.10;
		return this.porcentajeDeSueldoBruto(coeficienteQuincePorciento);
	}
	
	public double totalPorHorasExtra() {
		final int pagoPorHora = 5;
		return this.horasExtra * pagoPorHora;
	}

}