/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.universidad_gui.notas_estudiante.modelo;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class EstudianteTest {
    Estudiante testEstudiante;
    
    public EstudianteTest() {
        testEstudiante = new Estudiante("JEsus", "Alvarez", 52);
    }

   
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        try{
        //Estudiante instance = new Estudiante("JEsus", "Alvarez", 52);
        String expResult = "JEsus";
        String result = testEstudiante.getNombre();
        assertEquals(expResult, result);
        }catch (Exception error){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
       } 
    
    @Test
    public void testGetNotasCaso1() {
        System.out.println("getNotasCaso1");
        try{
        //Estudiante instance = new Estudiante("JEsus", "Alvarez", 52);
        double[] expResult = {0, 0, 0, 0, 0};
        double[] result = testEstudiante.getNotas();
        System.out.println(testEstudiante.getNotas()[0]);
        assertArrayEquals(expResult, result);
        }catch (Exception error){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
       }
    
    @Test
    public void testGetNotasCaso2() {
        System.out.println("getNotasCaso2");
        try{
        //Estudiante instance = new Estudiante("JEsus", "Alvarez", 52);
        double[] expResult = {1, 2, 3, 4, 5};
        //for (int i = 0; i < testEstudiante.getNotas().length; i++){   
        //}
        testEstudiante.setNotas(expResult);   
        double[] result = testEstudiante.getNotas();
        assertArrayEquals(expResult, result);
        }catch (Exception error){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
       } 
    
    @Test
    public void testGetNotasCaso3() {
        System.out.println("getNotasCaso2");
        try{
        //Estudiante instance = new Estudiante("JEsus", "Alvarez", 52);
        double[] expResult = {4.2, 4.2, 4.2, 4.2, 5};
        for (int i = 0; i < testEstudiante.getNotas().length; i++){
            if(i == testEstudiante.getNotas().length - 1){
                testEstudiante.setNota(5, i);
            }else{
                testEstudiante.setNota(4.2, i);
            }  
        }
        testEstudiante.setNotas(expResult);   
        double[] result = testEstudiante.getNotas();
        assertArrayEquals(expResult, result);
        }catch (Exception error){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        }
       }
    
    @Test
    public void calcularPromedioNotasCaso1(){
        System.out.println("CalcularPromedioCaso1");
        double expResult = 4.36;
        double result = testEstudiante.calcularPromedioNotas();
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void calcularPromedioNotasCaso2(){
        System.out.println("CalcularPromedioCaso2");
        double expResult = 4.0;
        double result = testEstudiante.calcularPromedioNotas();
        assertNotEquals(expResult, result);
        
    }
}
