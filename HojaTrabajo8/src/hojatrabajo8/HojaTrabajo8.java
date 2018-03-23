/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojatrabajo8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author alber
 */
public class HojaTrabajo8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File f;
        FileReader fr;
	BufferedReader br;
        Paciente paciente;
        VectorHeap vector = new VectorHeap();
        try{
           f = new File("./pacientes.txt");
           fr = new FileReader(f);
           br = new BufferedReader(fr);
           String linea;
           while((linea = br.readLine())!= null){
               String nombre="";
               String enfermedad = "";
               String tipo="";
               String temporal="";
               int pos = linea.indexOf(",");
               nombre = linea.substring(0,pos);
               temporal = linea.substring(pos+1, linea.length());
               pos = temporal.indexOf(",");
               enfermedad = temporal.substring(0,pos);
               tipo = temporal.substring(pos+1,temporal.length());
               paciente = new Paciente(nombre,enfermedad,tipo);
           }
           br.close();
           fr.close();
        }catch(Exception e){
             System.err.println("Se produjo un error");
        }
        
        
    }
    
}
