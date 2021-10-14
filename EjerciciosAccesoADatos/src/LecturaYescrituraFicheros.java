	import java.io.*;

public class LecturaYescrituraFicheros {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Leer el alumnos-dam2-nuevo.txt
					
		 File archivo = null;
		 archivo = new File ("C:\\Users\\usuario\\eclipse-workspace\\EjerciciosAccesoADatos\\src\\Recursos\\alumnos-dam2-nuevos.txt");
		 
		 FileReader fr = new FileReader (archivo);
		
		 BufferedReader br = new BufferedReader(fr);
		 
		String linea = br.readLine();
		while((linea=br.readLine())!=null)
            System.out.println(linea);
		
		try {
			if (null!= fr)
				fr.close();
		}
		catch(IOException error)
		{
			error.printStackTrace();
		}
	}

}
