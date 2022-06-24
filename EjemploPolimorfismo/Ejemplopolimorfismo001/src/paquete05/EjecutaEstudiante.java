package paquete05;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de docentes. 
        El usuario decide de manera prevía cuantos objetos
        de tipo EstudiantePresencial y EstudianteDistancia
        quiere ingresar.
        
         */
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);// permitimos el uso de puntos para numeros decimales
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        String continuar;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        // inicio de solución
        // Ciclo para que se repita hasta que el usuario decida salir.
        do {
            System.out.println("Tipo de Estudiante a ingresar\n"
                    + "Ingrese (1) para Estudiante Presencial\n"
                    + "Ingrese (2) para Estudiante Distancia");
            // Se pregunta que tipo de estudiante quiere ingresar
            tipoEstudiante = entrada.nextInt();
            // se comprueba si la opcion elegida esta dentro o fuera del rango
            if (tipoEstudiante < 1 || tipoEstudiante > 2) {
                System.out.println("Opción fuera de rango");
            } else {
                /* se solicita el ingreso de valores para las siguientes variables
            nombresEst, apellidosEst, identificacionEst, edadEst*/
                entrada.nextLine();
                System.out.println("Ingrese los nombres del estudiante");
                nombresEst = entrada.nextLine();
                System.out.println("Ingrese los apellidos del estudiante");
                apellidosEst = entrada.nextLine();
                System.out.println("Ingrese la identificación del estudiante");
                identificacionEst = entrada.nextLine();
                System.out.println("Ingrese la edad del estudiante");
                edadEst = entrada.nextInt();

                // Se comprueba si se quiere ingresae un estudiante Presecial o Distancia
                if (tipoEstudiante == 1) {

                    // Se Declara, se crea y se inicializa objeto tipo EstudiantePresencial
                    EstudiantePresencial estudianteP = new EstudiantePresencial();
                    /* se solicita el ingreso de los valores para las variables 
                Solicitar numeroCreds, costoCred*/
                    System.out.println("Ingrese el número de créditos");
                    numeroCreds = entrada.nextInt();
                    System.out.println("Ingrese el costo de cada créditos");
                    costoCred = entrada.nextDouble();
                    /* se usan de los métodos establecer para asignar valores
                a los atributos del objeto EstudiantePresencial*/
                    estudianteP.establecerNombresEstudiante(nombresEst);
                    estudianteP.establecerApellidoEstudiante(apellidosEst);
                    estudianteP.establecerIdentificacionEstudiante(identificacionEst);
                    estudianteP.establecerEdadEstudiante(edadEst);
                    estudianteP.establecerNumeroCreditos(numeroCreds);
                    estudianteP.establecerCostoCredito(costoCred);
                    /* Se agrega el objeto de tipo EstudiantePresencial al arraylist de 
                tipo estudiante*/
                    estudiantes.add(estudianteP);
                } else {
                    // Se Declara, se crea y se inicializa objeto tipo EstudianteDistancia
                    EstudianteDistancia estudianteD = new EstudianteDistancia();
                    /* se solicita el ingreso de los valores para las variables  
                    numeroAsigs, costoAsig*/
                    System.out.println("Ingrese el número de asignaturas");
                    numeroAsigs = entrada.nextInt();
                    System.out.println("Ingrese el costo de cada cada asignatura");
                    costoAsig = entrada.nextDouble();
                    /* se usan de los métodos establecer para asignar valores
                    a los atributos del objeto EstudianteDistancia*/
                    estudianteD.establecerNombresEstudiante(nombresEst);
                    estudianteD.establecerApellidoEstudiante(apellidosEst);
                    estudianteD.establecerIdentificacionEstudiante(identificacionEst);
                    estudianteD.establecerEdadEstudiante(edadEst);
                    estudianteD.establecerNumeroAsginaturas(numeroAsigs);
                    estudianteD.establecerCostoAsignatura(costoAsig);
                    /* Se agrega el objeto de tipo EstudianteDistancia al arraylist de 
                    tipo estudiante*/
                    estudiantes.add(estudianteD);
                }
            }
            entrada.nextLine();
            // Se pregunta si se desea ingresar más estudiante
            System.out.println("Desea ingresar más estudiante. Digite la "
                    + "letra S para continuar o digite la letra N para salir "
                    + "del proceso");

            // se lee el valor que el usuario elija para salir o no del programa
            continuar = entrada.nextLine();
        } while ((continuar.toUpperCase()).equals("S"));// Se comprueba si salimos o no del ciclo

        // Aqui se crea el ciclo que permite comprobar el polimorfismo
        // el Ciclo no debe ser modificado
        for (int i = 0; i < estudiantes.size(); i++) {
            /*  1.  Al ya tener los datos ingresados, se usa el metodo calcularMatricula
                para que se efectue la operación necesaria para obtener el costo total
                de la matricula Distancia o Matricula Presencial*/
            estudiantes.get(i).calcularMatricula();

            System.out.printf("Datos Estudiante\n"
                    + "%s\n",
                    estudiantes.get(i));

        }
    }

}
