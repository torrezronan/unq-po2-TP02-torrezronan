package test;


import java.time.LocalDate;

import ar.unq.tp02.Empleado;
import ar.unq.tp02.EmpleadoPermanente;
import ar.unq.tp02.EmpleadoTemporario;

public class Test_tp02{

	public static void main(String[] args) {
		Empleado gustavo = new Empleado("ronan","colombia 1650","Soltero",LocalDate.of(1998, 12, 18),1000);
		
		EmpleadoPermanente gustavoPermanente = new EmpleadoPermanente("ronan","colombia 1650","Soltero",LocalDate.of(1998, 12, 18),1000,1,1,false);
		
		EmpleadoTemporario gustavoTemporario = new EmpleadoTemporario("ronan","colombia 1650","Soltero",LocalDate.of(1998, 12, 18),1000,LocalDate.of(1990, 8, 20),10);
	
		System.out.println("El sueldo bruto es " + gustavoPermanente.sueldoBruto());
		System.out.println("El sueldo burto es "+ gustavoTemporario.sueldoBruto());
	

	}
}