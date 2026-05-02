package ar.unq.tp02;

import java.time.LocalDate;

public class EmpleadoTemporario extends Empleado {
	private LocalDate fechaFinDesignacion;
	private int horasExtra ;
	
	public EmpleadoTemporario(String nombre,String direccion,String estadoCivil, LocalDate fechaDeNacimiento, LocalDate fechaFinDesignacion, int horasExtra) {
		super(nombre,direccion,estadoCivil,fechaDeNacimiento);
		this.fechaFinDesignacion = fechaFinDesignacion;
		this.horasExtra = horasExtra;
	}

}
