package es.studium.Ejercicio7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class PadreEjercicio7
{
	public static void main(String[] args) throws IOException 
	{ 
		try
		{
			//Origen de los datos en el proyecto anterior 
			FileReader fr = new FileReader("in.txt"); 
			//Buffer de lectura 
			BufferedReader entrada = new BufferedReader(fr); 
			String s;
			String arg1 = "java"; 
			String arg2 = "-jar"; 
			String arg3 = "D:\\gradoSup\\Segundo\\ProgServiciosyProcesos\\Mayusculas.jar"; 
			String[] param = { arg1, arg2, arg3 }; 
			Process process = new ProcessBuilder(param).start(); 
			OutputStream os = process.getOutputStream(); 
			OutputStreamWriter osw = new OutputStreamWriter(os); 
			PrintWriter pw = new PrintWriter(osw);
			//Bucle para sacar la información del archivo 
			while((s=entrada.readLine())!=null) 
			{ 
				System.out.println(s);
				pw.print(s);
			} 
			//Cerrar el objeto entrada
			entrada.close(); 
			fr.close(); 
		} 
		catch(FileNotFoundException e) 
		{ 
			System.out.println("Archivo NO encontrado"); 
		} 
		catch(IOException i) 
		{ 
			System.out.println("Se produjo un error de Archivo"); 
		}
	}

}
