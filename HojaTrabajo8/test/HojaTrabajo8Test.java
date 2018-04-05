/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import hojatrabajo8.Paciente;
import hojatrabajo8.VectorHeap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alber
 */
public class HojaTrabajo8Test {
    
    public HojaTrabajo8Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
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
