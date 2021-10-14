package es.iestetuan.ngg.Aplicacion;

import es.iestetuan.ngg.Alumno;
import es.iestetuan.ngg.implementada.AlumnoCompleta;
import es.iestetuan.ngg.interfaz.IAlumno;

public class AplicacionAlumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IAlumno llamadametodos = new AlumnoCompleta();
		
		Alumno alumno = llamadametodos.getAlumno(318);

		
		System.out.println(alumno.getNombre());
		System.out.println(alumno.getApellido1());
		System.out.println(alumno.getApellido2());
		
		
	}

}
