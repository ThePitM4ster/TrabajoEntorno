package com.mipaquetemaven.alexander.proyectoGitDeMiGrupoAlex;

import java.util.ArrayList;
import java.util.SortedMap;
import java.util.TreeMap;

public class CalculosMatematicos {
	public static boolean esPar(int numero) {
		return numero % 2 == 0;
	}
	
	public static int MCD(int num,int num2){
		        int u = Math.abs(num); 
		        int v = Math.abs(num2);
		        int aux;
		        if(u<v){
		        	aux=v;
		        	v=u;
		        	u=aux;
		        }
		        if (v == 0) {
		            return u;
		        }
		        int r;
		        while (v != 0) {
		            r = u % v;
		            u = v;
		            v = r;
		        }
		        return u;
		    }
	public static int mcm(int num1, int num2) {
		int mcm=0;
		int a=Math.max(num1, num2);
		int b=Math.min(num1, num2);
		mcm = (a/MCD(a, b))*b;
		return mcm;
	}

	/*
	 * 
	 * Este método se usa para descomponer un número en sus factores primos Genera
	 * un mapa ordenado donde cada clave es un divisor primo del número y cuyo valor
	 * es el número de veces que incluye ese divisor primo.
	 * 
	 */
	public static SortedMap<Integer, Integer> divisores(int numero) {
		SortedMap<Integer, Integer> divisores = new TreeMap<Integer, Integer>();
		int numeroIntermedio = numero;
		Integer divisor = 2;
		while (numeroIntermedio >= divisor) {
			while (numeroIntermedio % divisor == 0) {
				Integer clave = divisor;
				divisores.putIfAbsent(divisor, 0);
				divisores.computeIfPresent(clave, (key, val) -> (val + 1));
				numeroIntermedio = numeroIntermedio / divisor;
			}

			divisor++;
		}
		return divisores;
	}

	public static ArrayList<Integer> listaDePrimosHasta(int numero) {
		ArrayList<Integer> listaDePrimos = new ArrayList<Integer>();
		listaDePrimos.add(1);
		listaDePrimos.add(2);
		listaDePrimos.add(3);
		for (int i = 5; i <= numero; i += 2) {
			if (esPrimo(i))
				listaDePrimos.add(i);
		}
		return listaDePrimos;
	}

	public static int potencia(int base, int exponente) {

		int resul = 1;
		if (exponente > 0)
			resul = base * potencia(base, exponente - 1);
		return resul;
	}

	public static boolean esPrimo(int numero) {

		boolean primo = true;
		int divisor = 3;
		if (numero != 2 && numero % 2 == 0)
			primo = false;
		while (primo && divisor <= Math.sqrt(numero)) {
			if (numero % divisor == 0)
				primo = false;
			divisor += 2;
		}
		return primo;
	}

	
}