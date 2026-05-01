package test;


import java.time.LocalDate;

import ar.unq.tp02.Empleado;

public class Test_tp02{

	public static void main(String[] args) {
		Empleado gustavo = new Empleado("ronan","colombia 1650","Soltero",LocalDate.of(1998, 12, 18));
	
		System.out.println(gustavo.edad());
	

	}
}