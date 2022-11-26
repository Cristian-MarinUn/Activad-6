package formularioPersonas;

import java.io.*;

public class manejoArchivo {
    
    public static void CrearArchivo(String nombreArchivo) {
       File archivo = new File(nombreArchivo);
       
       try {
           PrintWriter salida = new PrintWriter(archivo);
           
           salida.close();
           System.out.println("se creo el archivo");
       }catch(FileNotFoundException ex){
           ex.printStackTrace(System.out);
       }
       
        
    }
    
   
    public static void EscribirArchivo(String nombreArchivo, String contenido) {
       File archivo = new File(nombreArchivo);
       
       try {
           PrintWriter salida = new PrintWriter(new FileWriter(archivo,true));
           salida.println(contenido);
           salida.close();
           System.out.println("se escribio en el archivo");
       }catch(FileNotFoundException ex){
           ex.printStackTrace(System.out);
       }catch(IOException ex){
           ex.printStackTrace(System.out);
       }
       
        
        }
}
