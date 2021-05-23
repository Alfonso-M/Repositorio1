package paquete2;

public class Entidad {
	String nombre;
	double altura;
	int vida;
	int da�o;
	double velocidad;
	String sprite;
	int defensa;
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getDa�o() {
		return da�o;
	}
	public void setDa�o(int da�o) {
		this.da�o = da�o;
	}
	public double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	public String getSkin() {
		return sprite;
	}
	public void setSkin(String skin) {
		this.sprite = skin;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	@Override
	public String toString() {
		return "Entidad [nombre=" + nombre + ", vida=" + vida + ", da�o=" + da�o + ", sprite=" + sprite + ", defensa="
				+ defensa + "]";
	}
}
