/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Policia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePolicia extends Reporte {

    double promedioEdades;
    ArrayList<Policia> lista;

    public ReportePolicia(String c) {
        super(c);
    }

    public void calcularPromedioEdades() {
        double sum = 0;
        for (int i = 0; i < lista.size(); i++) {
            sum += lista.get(i).getEdad();
        }
        promedioEdades = sum / lista.size();
    }

    public void establecerLista(ArrayList<Policia> c) {
        lista = c;
    }

    public ArrayList<Policia> obtenerLista() {
        return lista;
    }

    public double obtenerPromedioEdades() {
        return promedioEdades;
    }

    @Override
    public String toString() {
        String cadena2 = "";
        for (int i = 0; i < lista.size(); i++) {
            cadena2 = String.format("%s\n%s", cadena2, lista.get(i));
        }
        String cadena = String.format("Reporte Policia\n%s",
                 super.toString());
        cadena = String.format("%sLista de Estudiantes%s\n"
                + "Promedio Edades: %.2f\n",
                cadena, cadena2, obtenerPromedioEdades());
        return cadena;
    }
}
