/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Docente;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDocente extends Reporte{
    double promedioSueldos;
    ArrayList<Docente> lista;
    
    public ReporteDocente(String c){
        super(c);
    }
    public void calcularPromedioSueldos(){
       double sum = 0;
       for (int i = 0; i < lista.size(); i++) {
            sum += lista.get(i).getSueldo();
        }
       promedioSueldos = sum/lista.size();
    } 

    public void establecerLista(ArrayList<Docente> c){
        lista = c;
    }
    public ArrayList<Docente> obtenerLista(){
        return lista;
    }
    public double obtenerPromedioSueldos(){
        return promedioSueldos;
    }
   
    @Override
    public String toString(){
        String cadena2 = "";
        for (int i = 0; i < lista.size(); i++) {
             cadena2 = String.format("%s\n%s", cadena2, lista.get(i));
         }
        String cadena = String.format("Reporte Docente\n%s"
                , super.toString());
        cadena = String.format("%sLista de Docentes%s\n"
                + "Promedio Sueldos: %.2f\n",
                cadena,cadena2,obtenerPromedioSueldos());
        return cadena;
    }
}
