package XV_ManejoFicherosDirectorios;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreadoDirectorio {
  public static void main(String[] args) {
    //File directorio = new File("C:" + File.separator + "Users" + File.separator + "Akin Ramirez" + File.separator + "Documents" + File.separator + "NetBeansProjects" + File.separator + "coding-java-se" + File.separator + "src" + File.separator + "creaDirectorio");
    File rutaArchivo = new File("C:" + File.separator + "Users" + File.separator + "Akin Ramirez" + File.separator + "Documents" + File.separator + "NetBeansProjects" + File.separator + "coding-java-se" + File.separator + "src" + File.separator + "creaDirectorio"+ File.separator + "creaExcel.xls" );
    //directorio.mkdir();
    try {
      rutaArchivo.createNewFile();
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }
}
