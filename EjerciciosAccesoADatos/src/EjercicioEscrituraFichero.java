
import java.io.*;
import java.util.Scanner;

public class EjercicioEscrituraFichero {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Crear un nuevo fichero y la ruta es donde est� ubicado dentro de la carpeta Recursos
	//File ficheroescritura = new File ("C:\\Users\\usuario\\Downloads\\CursoAccesoDatos\\Recursos\\escribir.txt");
	
		//FileWriter fw  = new FileWriter(ficheroescritura);
		
		
		Scanner read = new Scanner (System.in);
		EjercicioEscrituraFichero cuaderno = new EjercicioEscrituraFichero();
		String nuevo;
		System.out.println("A�ade una nueva l�na");
		nuevo=read.nextLine();
		
		cuaderno.Anadir(nuevo);
		
		
	}
		
		//Sirve para que me escriba texto dentro de un fichero
		
//		 BufferedWriter bw = new BufferedWriter(fw);
//		
//		 bw.write("Nombre, Apellidos, Curso");
//		 bw.newLine();
//		bw.write( "Nuria, Garz�n Garc�a, 2�DAM");
//		
//
//		 bw.close();
	//}
	
	public void Anadir(String nuevo) throws IOException 
	{
		
		BufferedWriter escribir = null;
		escribir=  new BufferedWriter(new FileWriter ("C:\\Users\\usuario\\eclipse-workspace\\EjerciciosAccesoADatos\\src\\Recursos\\escribir.txt", true));
		
		escribir.write(nuevo);
		
		escribir.newLine();
		
		try
		{
			if (escribir!=null)
			{
				escribir.close();
			}
		}
		catch (IOException error)
		{
			error.printStackTrace();
		}
		
		
		
	}

}
