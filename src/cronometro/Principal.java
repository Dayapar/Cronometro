/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronometro;

/**
 *
 * @author Estudiantes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        cronometro c = new cronometro();
        
        for (int i = 0; i < 10000; i++) {
            c.avanzar();
        }
        
        
        
    }
    
}
