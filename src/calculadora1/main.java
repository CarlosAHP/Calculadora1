/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora1;
import static calculadora1.Archivo_temp.*;
import java.io.FileInputStream;
import java.io.InputStream;


/**
 *
 * @author Carlos Alfonso
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
         
         visual fm = new visual();
        fm.show();
        
    crearArchivo("Historial\\bitacora.txt");
    }
    
}
