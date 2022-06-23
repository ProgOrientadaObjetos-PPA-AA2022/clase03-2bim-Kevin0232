/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import java.util.ArrayList;
import herencia2.Estudiante;

/**
 *
 * @author reroes
 */
public class ReporteEstudiante extends Reporte {

    double promedioMatriculas;
    ArrayList<Estudiante> lista;

    public ReporteEstudiante(String c) {
        super(c);
    }

    public void calcularPromedioMatriculas() {
        double sum = 0;
        for (int i = 0; i < lista.size(); i++) {
            sum += lista.get(i).getMatricula();
        }
        promedioMatriculas = sum / lista.size();
    }

    public void establecerLista(ArrayList<Estudiante> c) {
        lista = c;
    }

    public ArrayList<Estudiante> obtenerLista() {
        return lista;
    }

    public double obtenerPromedioMatriculas() {
        return promedioMatriculas;
    }

    @Override
    public String toString() {
        String cadena2 = "";
        for (int i = 0; i < lista.size(); i++) {
            cadena2 = String.format("%s\n%s", cadena2, lista.get(i));
        }
        String cadena = String.format("Reporte Estudiante\n%s",
                 super.toString());
        cadena = String.format("%sLista de Estudiantes%s\n"
                + "Promedio Matriculas: %.2f\n",
                cadena, cadena2, obtenerPromedioMatriculas());
        return cadena;
    }
}
