package com.mipaquetemaven.alexander.proyectoGitDeMiGrupoAlex;
public class Fraccion {
	private int numerador;
	private int denominador;

	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}
/*
 * 	Añadir las siguientes operaciones a Fracción
 * 
 * 
 * 
	public static Fraccion simplifica(Fraccion entrada) {
	}
	
	public static Fraccion suma(Fraccion sumando1, Fraccion sumando2) {
	}
	public static Fraccion multiplicacion(Fraccion sumando1, Fraccion sumando2) {
	}
	public static Fraccion division(Fraccion sumando1, Fraccion sumando2) {
	}
*/
	public int getNumerador() {
		return numerador;
	}

	public int getDenominador() {
		return denominador;
	}


	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	public Fraccion sumar(Fraccion f) {
		int mcm=CalculosMatematicos.mcm(this.getDenominador(),f.getDenominador());
		Fraccion aux=new Fraccion(this.numerador*mcm/this.denominador+f.numerador*mcm/f.denominador,mcm);
		//aux=aux.Simplificar();
		//return aux.Simplificar();
		aux.Simplificar();
		return aux;
		
	}
	public Fraccion restar(Fraccion f) {
		int mcm=CalculosMatematicos.mcm(this.getDenominador(),f.getDenominador());
		Fraccion aux=new Fraccion(this.numerador*mcm/this.denominador-f.numerador*mcm/f.denominador,mcm);
		//aux=aux.Simplificar();
		//return aux.Simplificar();
		aux.Simplificar();
		return aux;
	}
	public void Simplificar() {
		int mcd=CalculosMatematicos.MCD(this.numerador,this.denominador);
		Fraccion aux=new Fraccion(this.numerador/mcd,this.denominador/mcd);
		//return new Fraccion(this.numerador/mcd,this.denominador/mcd);
		//return aux;
		this.setNumerador(aux.numerador);
		this.setDenominador(aux.denominador);
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(numerador).append(" / ").append(denominador);
		return sb.toString();
	}

}
