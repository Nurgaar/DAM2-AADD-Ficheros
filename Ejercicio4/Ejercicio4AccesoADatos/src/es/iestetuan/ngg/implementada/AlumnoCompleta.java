package es.iestetuan.ngg.implementada;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

import es.iestetuan.ngg.Alumno;
import es.iestetuan.ngg.interfaz.IAlumno;

public class AlumnoCompleta implements IAlumno {

	public Alumno getAlumno(long nia) {
		// TODO Auto-generated method stub
		
		File fichero = new File ("C:\\Users\\usuario\\git\\repository\\Ejercicio4AccesoADatos\\src\\alumnos-dam2-nuevos.txt");
		FileReader fr =null;
		BufferedReader br = null;
		String linea;
		boolean leerLineaUno = true;
		Alumno alumno = new Alumno();
		
		
		try {
			 fr = new FileReader(fichero, Charset.forName("UTF-8"));
			 br = new BufferedReader(fr);
			 while ((linea= br.readLine())!=null)
					 {
				 		
				 		if(leerLineaUno)
				 		{
				 			leerLineaUno=false;
				 		}
				 		else
				 		{
				 			
				 			String[] partes = linea.split(",");
				 			
				 			long NiaIgual = Integer.parseInt(partes[0]);
							if(nia==NiaIgual)
				 			{
								
								alumno.setNombre(partes[1]);
				 				alumno.setApellido1(partes[2]);
				 				alumno.setApellido2(partes[3]);
				 				break;
				 			}
				 		}
					 }
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return alumno;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
