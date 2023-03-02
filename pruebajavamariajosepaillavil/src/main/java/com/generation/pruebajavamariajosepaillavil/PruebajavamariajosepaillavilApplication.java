package com.generation.pruebajavamariajosepaillavil;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.generation.pruebajavamariajosepaillavil.models.Alumno;
import com.generation.pruebajavamariajosepaillavil.models.Curso;
import com.generation.pruebajavamariajosepaillavil.models.Materia;
import com.generation.pruebajavamariajosepaillavil.models.Profesores;

@SpringBootApplication
public class PruebajavamariajosepaillavilApplication {
/* 
STEPS: PREVIOS
1.CREAR CARPETAS API, MODELS, REPOSITORIES Y SERVICES
2.EN LA CARPETA MODELS CREAR ARCHIVO.JAVA QUE CONTENGA LA "CLASE PADRE"
3.EN CARPETA MODELS, CREAR ARCHIVOS.JAVA QUE CONTENGAN "CLASES HIJAS", QUE HEREDARÁN ATRIBUTOS DESDE "CLASE PADRE"
4.AVANZAR CON DESAFÍOS DE LA PRUEBA, BAJO EL APARTADO  "VOID MAIN"

********************* Caso Práctico *********************

Te contactaron desde un colegio municipal para que los ayudes a generar un software
pensando en ordenar su funcionamiento, este colegio siempre a funcionado de manera análoga
por 20 años y esto ha generado errores de pérdidas de datos de alumnos antiguos,
documentos estropeados y nula posibilidad de generar estadísticas de rendimiento del colegio.

En esta instancia tu tarea será generar los objetos necesarios para cubrir las necesidades del
colegio, utilizando herencia.
Además debes generar 3 funciones distintas que te ayudarán a los distintos procesos del
colegio
Puntos a considerar:
● El colegio cuenta con distintos cursos, profesores, materias y alumnos
● Se debe crear una función que permita al profesor ingresar notas por estudiante y que
luego permita obtener el promedio de cada estudiante.
● Se debe crear una función que permita guardar un arreglo de una cierta cantidad de
alumnos por curso y que luego los muestre.
● Se debe crear una función que dado un arreglo de notas obtenga la mejor nota, la peor
nota y el promedio de notas.
Puntos a evaluar:
● Creación de objetos pertinentes al caso.
● Creación de funciones.
● Proyecto funcional.
● Debes enviar el link de tu repositorio con el script correspondiente al correo
generation.chilec4@gmail.com con el siguiente asunto
○ Evaluación JAVA Objetos - <Nombre Apellido

*************************************************************
IMPORTANTE:

STEPS: PRUEBA 
1.CREAR FUNCIÓN QUE PERMITA QUE EL PROFESOR INGRESE NOTAS POR ESTUDIANTE // MEDIANTE UN SCANNER
2.OBTENER PROMEDIO POR ESTUDIANTE EN BASE A LAS NOTAS ANTERIORMENTE INGRESADAS POR EL PROFESOR // CREAR ARRAYLIST QUE CONTENGA LOS REGISTROS DEL USUARIO
3.CREAR FUNCIÓN QUE CONTENGA ARREGLO NOTAS DE CIERTA CANTIDAD DE ALUMNOS POR CURSO // LA LONGITUD DEL ARRAYLIST ESTARÁ DETERMINADA POR LA CANTIDAD DE NOTAS INGRESADAS INICIALMENTE POR EL USUARIO
4.IMPRIMIR EN PANTALLA, EL ARREGLO RESULTANTE // CON UN SYSTEM.OUT.PRINTINT(); --> EQUIVALENTE A CONSOLE.LOG () DE JAVASCRIPT
5.IDENTIFICAR E IMPRIMIR LA MEJOR NOTA DEL ARREGLO // SE INTENTARÁ CON MATH.MAX  
6.IDENTIFICAR E IMPRIMIR LA PEOR NOTA DEL ARREGLO // SE INTENTARÁ CON MATH.MIN
7.CALCULAR E IMPRIMIR EL PROMEDIO DE NOTAS DEL CURSO // SUMATORIA DE LAS NOTAS DE CADA ESTUDIANTE, DIVIDIDA EN EL TOTAL DE ALUMNOS REGISTRADOS POR EL USUARIO

PD: QUE LA FUERZA NOS ACOMPAÑE!! D:

*/

static String nombreAlumno;
static Double promedioAlumno;

public static Double promedioNotas(ArrayList<Double> notas){
	Double suma = 0.0;
	for (int i = 0; i < notas.size(); i++) {
		suma = suma + notas.get(i);
	}
	return suma/notas.size();
}
/*funcion que verifica si el promedio del alumno está aprobado o reprobado */
public static Boolean aprobado(ArrayList<Double> notas, Double notaAprobatoria){
	Double promedio = promedioNotas(notas);
	if(promedio >= notaAprobatoria){
		return true;
	}else{
		return false; 
	}
}

/*funcion que verifica si el promedio del alumno es mayor al promedio general */
public static void sobrePromedio(Double promedioGeneral, ArrayList<Double> notas, String nombreAlum){
	Double promedioAlumno = promedioNotas(notas);
	if(promedioAlumno>promedioGeneral){
		System.out.println("El alumno "+nombreAlumno+" está sobre el promedio");
	}else if(promedioAlumno == promedioGeneral){
		System.out.println("El alumno "+nombreAlumno+" es igual al promedio general");
	}else{
		System.out.println("El alumno "+nombreAlumno+" está bajo el promedio");
	}
} 


	public static void main(String[] args) {

	String respuestaProfesor = "S";
		System.out.println("Bienvenido a la Plataforma Estudiantil ");

		Scanner teclado = new Scanner(System.in);

		//Definiendo variables globales
		Double notaAprobatoria=4.0;
		
		
		
		// Se genera un hashmap, donde se registrarán los datos 		
		HashMap <String, ArrayList<Double>> libroClase = new HashMap<String, ArrayList<Double>>();
		//Las variables cantidad de alumnos y cantidad de notas (base para los cálculos) se declaran de la siguiente manera:
		//Se declara fuera del do...while ya que si la declaramos adentro
		//la variable pasa a ser local por ende no podríamos ocuparla fuera de este
		String nomAlumno="";
		int cantAlum;
		int cantNotas;
		
	
		//Comenzamos el búcle, solicitando la cantidad de alumnos mediante un do...while, para que siempre que el usuario ingrese
		//estudiantes mayores a "0", luego solicite la cantidad de notas asociada a cada alumno
		do{
			System.out.print("Indique la cantidad de alumnos que va a ingresar: ");
			cantAlum = teclado.nextInt();
		//Utilizamos un condicional if, ya que, el búcle se repetirá siempre y cuando el número de alumnos sea superior a 0.	
			if(cantAlum <= 0){
				System.out.print("La cantidad de alumnos debe ser mayor a cero, porfavor intente denuevo");
			}
		}while(cantAlum <= 0);
		//Replicamos la lógica anterior, pero está vez aplicada a las notas por alumno
		do{
			System.out.print("Indique la cantidad de notas por alumnos: ");
			cantNotas = teclado.nextInt();
			if(cantNotas <= 0){
				System.out.print("La cantidad de notas debe ser mayor a cero, por favor entente mas tarde");
			}
		}while(cantNotas <= 0);
		
	

		//------------------------------------------- INICIO DE MENÚ -------------------------------------------
		//Establecer las restricciones de la página principal de menú
		//Definir tipo de variable para "opción 1"
		int opcion = 1; 
		while(opcion != 0){



		do{
			teclado.nextLine();

			System.out.println("Si desea visualizar información sobre estudiantes, favor marque la letra 's', de lo contrario seleccione la letra 'n' ");
			respuestaProfesor = teclado.nextLine();
			if(respuestaProfesor.equals("s")){
				System.out.println("Ingrese '1' para ingresar notas de los estudiantes y promedio, y '2' para identificar rendimiento del alumno");
				String opciones = teclado.nextLine();
				if(opciones.equals("1")){

			//INICIO OBJETO: ALUMNO (CLASE PADRE)		
					Alumno alumnoColegio = new Alumno();

					System.out.println("Favor ingrese curso del estudiante");
					Integer cursoAlumno=teclado.nextInt();
					alumnoColegio.setCurso(cursoAlumno);
					teclado.nextLine();
					System.out.println("Favor ingrese nombre del alumno");
					String nombreAlumno=teclado.nextLine();
					alumnoColegio.setNombre(nombreAlumno);
					System.out.println("Favor indique apellido del alumno");
					String apellidoAlumno = teclado.nextLine();
					alumnoColegio.setApellido(apellidoAlumno);
					System.out.println("Favor indique materia a visualizar ");
					String materiaAlumno = teclado.nextLine();
					alumnoColegio.setMateria(materiaAlumno);
					System.out.println("Favor indique nombre del Profesor jefe");
					String profesorAlumno=teclado.nextLine();
					alumnoColegio.setProfesor(profesorAlumno);
					

					
		     // INICIO OBJETO: CURSO (CLASE HIJA)
					Curso cursoColegio = new Curso();
					System.out.println("Favor ingrese la jornada de estudios en la que asiste el estudiante");
					String jornadaCurso=teclado.nextLine();
					cursoColegio.setJornada(jornadaCurso);

			//INICIO OBJETO:MATERIA	(CLASE HIJA)	
					Materia materiaColegio = new Materia();
					System.out.println("Favor indique las veces por semana que tiene la materia antes indicada");
					Integer vecesPorSemanaCurso=teclado.nextInt();
					materiaColegio.setVecesPorSemana(vecesPorSemanaCurso);

			//INICIO OBJETO: PROFESORES (CLASE HIJA)		
				Profesores profesoresColegio = new Profesores();
				System.out.println("Favor indique en números la edad del/x profesor/x");
				Integer edadProfesorCurso=teclado.nextInt();
				profesoresColegio.setEdadProfesor(edadProfesorCurso);

			System.out.println("Favor ingrese arreglo de notas");
					teclado.nextLine();	

					Double sumaNota=0.0;
					Double sumaPromedioGeneral=0.0;
					Double promedioGeneralOk=0.0;
		

					
		for(int i = 1; i <= cantAlum; i++){
			//Luego de ingresar los parámetros del búcle "for", ingresar "teclado.nextLine();" para establecer un salto de línea	
				//teclado.nextLine();
			//Crear un array que contenga, nombres de alumnos y notas asociadas a cada quien	
				ArrayList <Double> notasAlumnos = new ArrayList<Double>();
				//System.out.print("Ingresa nombre del alumno: ");
			//Luego de ingresar los parámetros del búcle "for", ingresar "teclado.nextLine();" para establecer un salto de línea	
				//nomAlum = teclado.nextLine();
			//Iniciamos un búcle "for", que nos permita ir recorriendo el arreglo que engloba las notas de estudiantes ingresados por el usuario	
				for(int x = 1; x <= cantNotas; x++){
			//Imprimir un mensaje al usuario			
					System.out.print("Ingresa nota " +x+ " del alumno "+ i +": ");
			//Luego de solicitar al usuario ingresar notas de estudiantes, se añade un bloque que permita ir incorporando notas
			//según el límite ingresado inicialmente por el usuario, y siempre que se cumpla con el tipo de dato requerido. Ej: Double para calificaciones			
					Double notaAlumnos = teclado.nextDouble();
					notasAlumnos.add(notaAlumnos);
					sumaNota= sumaNota + notaAlumnos;
					alumnoColegio.setNotas(sumaNota/cantAlum);
					System.out.println("Notas contenidas en arreglo: " + notasAlumnos);
					
					//System.out.println("***************************ATENCIÓN || INTENTO DE OBTENER RENDIMIENTO DEL ALUMNO ****************************");

					/* NO LOGRÉ QUE PROMEDIO GENERAL FUESE FUNCIONAL E ITERARA ENTRE LOS DISTINTOS ALUMNOS INGRESADOS :(

					sumaPromedioGeneral=sumaPromedioGeneral + promedioNotas(notasAlumnos);

					promedioGeneralOk= (sumaPromedioGeneral/cantAlum);
					System.out.println(" PROMEDIO GENERAL OK " + promedioGeneralOk);

					*/

				}
				
			
						for (int y = 0; i < notasAlumnos.size(); y++) {
   							 System.out.println(notasAlumnos.get(y));
								;

				//Consolidar la totalidad de información ingresada en un pseudo "Libro de clases"		
				libroClase.put(nombreAlumno, notasAlumnos);
				System.out.println("***************************ATENCIÓN || INTENTO DE OBTENER PROMEDIO ****************************");

				System.out.println("El promedio de notas de: " + nombreAlumno + " es: " + promedioNotas(notasAlumnos));	
				
				System.out.println("***************************  RESUMEN ****************************");
	
				System.out.println("Este es el detalle obj. alumno del estudiante Número: " + i + " " + alumnoColegio.toString());
				System.out.println("Este es el detalle obj. curso del estudiante Número: " + i + " " + cursoColegio.toString());
				System.out.println("Este es el detalle obj. materia del estudiante Número: " + i + " " + materiaColegio.toString());
				System.out.println("Este es el detalle obj. profesores del estudiante Número: " + i + " " + profesoresColegio.toString());
							 
				System.out.println("************* ATENCIÓN: SE INTENTÓ OBTENER LA NOTA MÁXIMA Y MÍNIMA DEL ARREGLO MEDIANTE MATH.MAX | MIN *************");
				
				int[] arregloNotas = new int[cantNotas];

        for (int k = 0; k < cantNotas; k++) {
            arregloNotas[k]= teclado.nextInt();
        }

        int numeroMayor = arregloNotas[0];
		
        for (int k = 1; k < cantNotas; k++) {
			int notaMayor=teclado.nextInt();
            notaMayor = Math.max(notaMayor, arregloNotas[k]);

			System.out.println("El número mayor en el arreglo es: " + notaMayor);
        }

				} 
	
			
			} 
				

				} else if (opciones.equals("2")){

					System.out.println("Se ve la opcion 2 del menú");
				
				
				//} else if (!respuestaProfesor.equals("n")){
					//System.out.println("Ingresa la letra 's' o 'n' para avanzar en el menú.");
			
				}else {
					System.out.println("La opción ingresada no es válida, por tanto, no será posible visualizar el menú.");
			
				}
			
			} else if (!respuestaProfesor.equals("n")){
				System.out.println("Ingresa la letra 's' o 'n' para avanzar en el menú.");
			
			} else {
				System.out.println("Entendido, no se mostrará el menú. Gracias por su respuesta ");

			}

				/* 
				Double sumaPromedio = 0.0;
				for(String i : libroClase.keySet()){
					sumaPromedio = sumaPromedio + promedioNotas(libroClase.get(i));

				}
				Double promedioGeneral = sumaPromedio / cantAlum;
				for(String i : libroClase.keySet()){
					sobrePromedio(promedioGeneral, libroClase.get(i), i);
				}
					*/
					
			
		} while(!respuestaProfesor.equals("n"));
} 



}

}

	
