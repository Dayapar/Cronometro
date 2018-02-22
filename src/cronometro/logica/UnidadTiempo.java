/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronometro.logica;

/**
 *
 * @author Estudiantes
 */
public class UnidadTiempo {
    private int max;
    private int valor;

    public UnidadTiempo(int max) {
        this.max = max;
        this.valor = 0;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public void sumar (){
     valor ++;
     if (valor == max){
        valor = 0;
         }
    
    
    
}
