/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prgitejemplo;

/**
 * @author Enrique Fernandez Galvez
 */
public class GitAux {

	public void testGitAux(){
	// metodo rama testing
	System.out.println("Metodo de testing");
	}
    
    public void metodoAlumno1(){
        System.out.println("metodo 1");
	System.out.println("modificado por Enrique Fernandez Galvez");//insertado por Enrique Fernandez Galvez
    }
    
    public void metodoAlumno2(){
        System.out.println("metodo 2");
		System.out.println("modificado por Francisco Fernandez"); // insertado por Francisco Fernandez
    }
    
    public void metodoComunitario(){
        System.out.println("Aqui escribimos todos");
		// modificaciones Francisco Fernandez
		System.out.println("Francisco Fernandez inserta esta sentencia");
	//modificaciones Enrique Fernandez Galvez
	System.out.println("Enrique Fernandez Galvez inserta esta sentencia");
    }
}
