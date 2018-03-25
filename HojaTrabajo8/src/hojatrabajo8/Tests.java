package hojatrabajo8;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Clase que se utiliza para probar los métodos más importantes de VectorHeap
 * 
 * @author Javier Anleu - 17149
 * @author Andres Urizar - 17632
 * @since March 23, 2018
 * @version 1.0
 *
 */
public class Tests {

	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test para probar el funcionamiento del método para agregar pacientes
	 */
	@Test
	public void testAdd() {
		VectorHeap<Paciente> p = new VectorHeap<Paciente>();
		Paciente patient = new Paciente("John Doe", "Cancer", "B");
		p.add(patient);
		assertEquals(patient, p.getFirst());
	}

	/**
	 * Test para probar el funcionamiento del método para eliminar pacientes
	 */
	@Test
	public void testRemove() {
		VectorHeap<Paciente> p = new VectorHeap<Paciente>();
		Paciente patient = new Paciente("John Doe", "Cancer", "B");
		p.add(patient);

		assertEquals(patient, p.remove());
	}

	/**
	 * Test para probar el método para imprimir la información de los pacientes
	 */
	@Test
	public void testPrint() {
		VectorHeap<Paciente> p = new VectorHeap<Paciente>();
		Paciente patient = new Paciente("John Doe", "Cancer", "B");
		p.add(patient);
		String result = "Nombre del paciente: John Doe, descripción del síntoma: Cancer, Tipo: B\n";
		assertEquals(result, p.print());
	}

}
