package com.logback.nttdatatallerlogback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Clase Main
 * 
 * @author Pablo Alvarez
 *
 */

public class Main {

	/** LOGGER */

	private static final Logger LOG = LoggerFactory.getLogger(Main.class);

	/**
	 * Metodo principal del programa
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

	/**
	 * Inicio array
	 */

		LOG.info("INICIO");

	/**
	 * Array por defecto
	 */

		int[] array = {1, 2, 3, 4, 5};

		LOG.debug("Array {}", array);

		array = insertarValor(array, 7, 10);

		LOG.info("FINAL");

	}

	/**
	 * Insertar el valor
	 * 
	 * @param args
	 */

	public static int[] insertarValor(int[] array, int dato, int posicion) {

		int[] resultado = new int[array.length + 1];

		for (int i = 0; i < array.length; i++) {
			
			if (i < posicion) {
				
				resultado[i] = array[i];
				
			} else {
				
				resultado[i + 1] = array[i];
			}
		}

		resultado[posicion] = dato;
		
		LOG.debug("El resultado es {}", resultado);
		
		return resultado;
	}

}
