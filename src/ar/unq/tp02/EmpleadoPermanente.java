package ar.unq.tp02;

import java.time.LocalDate;

public class EmpleadoPermanente extends Empleado {
	
	private int cantidadDeHijos;
	private int antiguedad;
	private int dineroPorHijo =150 ;
	private boolean tieneConyuge;
	private int dineroPorConyuge = 100;
	private int dineroPorAñoDeAntiguedad = 50;
	private int retencionPorHijo=20;
	
	public EmpleadoPermanente(String nombre,String direccion,String estadoCivil, LocalDate fechaDeNacimiento,double sueldoBasico, int cantidadDeHijos, int antiguedad,boolean tieneConyuge) {
		super(nombre,direccion,estadoCivil,fechaDeNacimiento,sueldoBasico);
		this.cantidadDeHijos = cantidadDeHijos;
		this.antiguedad = antiguedad;
		this.tieneConyuge = tieneConyuge;
	}
	
	@Override
	double sueldoBruto(){return this.getSueldoBasico() + this.salarioFamiliar() ;}
	
	public double salarioFamiliar() {
		return this.totalSalarioPorhijo() + this.totalAsignacionPorConyuge()+ this.totalPorAntiguedad() ;
	}
	
	public double totalSalarioPorhijo() { return this.cantidadDeHijos * dineroPorHijo;}
	
	public double totalAsignacionPorConyuge() {
		
		if(this.tieneConyuge) { return this.dineroPorConyuge;} else { return 0;}
		
	}
	
	public double totalPorAntiguedad(){ return this.antiguedad * this.dineroPorAñoDeAntiguedad;}
	
	
	@Override
	public double totalRetenciones() {
		return this.totalPorObraSocial()+ this.totalPorHijo()+ this.aportesJubilatorios();
	}
	
	public double totalPorObraSocial() {
		final double coeficienteDiezPorciento = 0.10;
		return this.porcentajeDeSueldoBruto(coeficienteDiezPorciento) ;
	}
	
	public double totalPorHijo() {
		return this.cantidadDeHijos * this.retencionPorHijo;
	}
	
	public double aportesJubilatorios() {
		final double coeficienteQuincePorciento = 0.15;
		return this.porcentajeDeSueldoBruto(coeficienteQuincePorciento);
	}
	
	

}
