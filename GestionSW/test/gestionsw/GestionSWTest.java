/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionsw;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author EST_1F_GC1_010
 */
public class GestionSWTest {
    
//    public GestionSWTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }

    /**
     * Test of main method, of class GestionSW.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        GestionSW.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of reporte method, of class GestionSW.
     */
//    @Test
//    public void testReporte() {
//        System.out.println("reporte");
//        int _numCaracteres = 0;
//        int _numPalabras = 0;
//        int _numEspacios = 0;
//        
//        //GestionSW.reporte(_numCaracteres, _numPalabras, _numEspacios);
//        testContarCaracteres(); 
//        testContarPalabras();
//        testContarEspacios(); 
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of contarCaracteres method, of class GestionSW.
     */
    @Test
    public void testContarCaracteres() {
        System.out.println("contarCaracteres");
        String _cadena = "hola tu";
        int expResult = 7;
        int result = GestionSW.contarCaracteres(_cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of contarPalabras method, of class GestionSW.
     */
    @Test
    public void testContarPalabras() {
        System.out.println("contarPalabras");
        String _cadena = "hola t";
        int expResult = 2;
        int result = GestionSW.contarPalabras(_cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of contarEspacios method, of class GestionSW.
     */
    @Test
    public void testContarEspacios() {
        System.out.println("contarEspacios");
        String _cadena = "prueba uno";
        int expResult = 1;
        int result = GestionSW.contarEspacios(_cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
