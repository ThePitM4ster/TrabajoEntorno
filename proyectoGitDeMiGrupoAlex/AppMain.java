package com.mipaquetemaven.alexander.proyectoGitDeMiGrupoAlex;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;


public class AppMain {

	public static void main(String[] args) {
//		/*
//		 * Ejemplo de uso del método CalculosMatematicos.divisores
//		 * Este método descompone un número en factores primos
//		 * Retornando un mapa con los factores primos
//		 */
//		int num = 180;
//		SortedMap<Integer,Integer> divisores = new TreeMap<>();
//		divisores=CalculosMatematicos.divisores(num);
//		for(Map.Entry<Integer, Integer> entrada: divisores.entrySet()) {
//			int divisor=entrada.getKey();
//			int numeroVeces=entrada.getValue();
//			for(int i=1;i<=numeroVeces;i++) {
//			System.out.println(num+"\t|\t"+divisor);
//			num=num/divisor;
//			}
//		}
//				
		Fraccion ejemploFraccion = new Fraccion(2,4);
		Fraccion ejemploFraccion2=new Fraccion(1,2);
		Fraccion suma=ejemploFraccion.sumar(ejemploFraccion2);
		ejemploFraccion.Simplificar();
		System.out.println(CalculosMatematicos.MCD(4,2));
		System.out.println("\n\nPara ver como funciona toString en Fraccion:\t"+ejemploFraccion);
		System.out.println("\n\nPara ver como funciona toString en Fraccion:\t"+suma);
	}

}
