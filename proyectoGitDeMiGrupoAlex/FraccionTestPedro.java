/**
 * 
 */
package com.mipaquetemaven.alexander.proyectoGitDeMiGrupoAlex;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;

/**
 * @author pedro
 *
 */
public class FraccionTestPedro {

	@Test
	public void prueba_mcm() {
		int num1=1;
		int num2=4;
		
		assertEquals((double)4,(double)CalculosMatematicos.mcm(num1, num2));
		
	}
	@Test
	public void prueba_mcm2() {
		int num1=2;
		int num2=3;
		assertEquals((double)6,(double)CalculosMatematicos.mcm(num1, num2));
	}
	@Test
	public void prueba_mcm3() {
		int num1=6;
		int num2=1;
		assertEquals((double)6,(double)CalculosMatematicos.mcm(num1, num2));
	}
	@Test
	public void prueba_MCD() {
		int num1=8;
		int num2=4;
		assertEquals((double)4,(double)CalculosMatematicos.MCD(num1, num2));
	}
	@Test
	public void prueba_MCD2() {
		int num1=1;
		int num2=2;
		assertEquals((double)1,(double)CalculosMatematicos.MCD(num1, num2));
	}
	@Test
	public void prueba_MCD3() {
		int num1=15;
		int num2=30;
		assertEquals((double)15,(double)CalculosMatematicos.MCD(num1, num2));
	}

}
