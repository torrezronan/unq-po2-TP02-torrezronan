package test;


import java.time.LocalDate;

import ar.unq.tp02.Empleado;
import ar.unq.tp02.EmpleadoPermanente;

public class Test_tp02{

	public static void main(String[] args) {
		Empleado gustavo = new Empleado("ronan","colombia 1650","Soltero",LocalDate.of(1998, 12, 18));
		
		EmpleadoPermanente gustavoPermanente = new EmpleadoPermanente("ronan","colombia 1650","Soltero",LocalDate.of(1998, 12, 18),5,3);
	
		System.out.println(gustavoPermanente.edad());
	

	}
}