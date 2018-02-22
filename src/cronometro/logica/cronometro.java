/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronometro.logica;

import java.util.ArrayList;//para crear arreglo
import java.util.Iterator;

/**
 *
 * @author Estudiantes
 */
public class cronometro{
    private UnidadTiempo decimas, segundos, minutos, horas;
    
    private ArrayList<Memoria>memorias;
    
public cronometro(){
    decimas = new UnidadTiempo(10);
    segundos = new UnidadTiempo (60);
    minutos = new UnidadTiempo (60);
    //horas no porque no tiene tope
}

    public UnidadTiempo getDecimas() {
        return decimas;
    }

    public void setDecimas(UnidadTiempo decimas) {
        this.decimas = decimas;
    }

    public UnidadTiempo getSegundos() {
        return segundos;
    }

    public void setSegundos(UnidadTiempo segundos) {
        this.segundos = segundos;
    }

    public UnidadTiempo getMinutos() {
        return minutos;
    }

    public void setMinutos(UnidadTiempo minutos) {
        this.minutos = minutos;
    }

    public UnidadTiempo getHoras() {
        return horas;
    }

    public void setHoras(UnidadTiempo horas) {
        this.horas = horas;
    }


    public void sumar(){
        decimas.sumar();
        if(decimas.getValor()==0){
            segundos.sumar();
            if (segundos.getValor()==0){
                minutos.sumar();
                if(minutos.getValor()==0){
                    horas.sumar();
                }
            }
        }
    }

public String obtenerTiempo(){
    return horas.getValor() + " : " +
            minutos.getValor() + " : " +
            segundos.getValor() + " : " +
            decimas.getValor();
}


public void guardar(){

}








    
public void guardarMemoria(){
    Memoria m = new Memoria();
    m.setDecimas (decimas);
    m.setSegundos (segundos);
    m.setMinutos (minutos);
    m.setHoras (horas);
    memorias.add(m);
    System.out.println("memoria:" +m.obtenerTiempo());
    mostrarMemorias();
}

//metodo que recorre el arreglo
public void mostrarMemoria(){
for(iterator<Memoria> iterator = memorias.iterator(); iterator.hasNext();){
    
}

}


}
