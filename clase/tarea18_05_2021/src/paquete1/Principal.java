package paquete1;

import paquete2.Entidad;

public class Principal {

	public static void main(String[] args) {
		Entidad pollo=new Entidad();
		pollo.setNombre("Pollo");
		pollo.setAltura(0.5);
		pollo.setDaño(0);
		pollo.setDefensa(0);
		pollo.setSkin("/home/almip/Images/skins");
		pollo.setVelocidad(10);
		pollo.setVida(10);
		
		System.out.println(pollo);
	}
}
