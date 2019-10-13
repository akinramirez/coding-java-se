package A15_ManejoFicherosDirectorios;

import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class ejercicioFicheros {

  public static void main(String[] args) {
    String nDirectorio = JOptionPane.showInputDialog("Introduce el nombre del directorio");
    String nArchivo = JOptionPane.showInputDialog("Introduce el nombre del archivo");
    String frase = JOptionPane.showInputDialog("Introduce la frase");

    File directorio = new File("C:" + File.separator + "Users" + File.separator + "Akin Ramirez" + File.separator + "Documents" + File.separator + "NetBeansProjects" + File.separator + "coding-java-se" + File.separator + "src" + File.separator + "ejercicioDirectorio" + File.separator + nDirectorio);
    //Creacion de directorio
    directorio.mkdir();
    File rutaArchivo = new File("C:" + File.separator + "Users" + File.separator + "Akin Ramirez" + File.separator + "Documents" + File.separator + "NetBeansProjects" + File.separator + "coding-java-se" + File.separator + "src" + File.separator + "ejercicioDirectorio" + File.separator + nDirectorio + File.separator + nArchivo + ".txt");
    //Creacion y escritura
    try {
      rutaArchivo.createNewFile();
      //Escritura
      FileWriter escritura = new FileWriter("C:" + File.separator + "Users" + File.separator + "Akin Ramirez" + File.separator + "Documents" + File.separator + "NetBeansProjects" + File.separator + "coding-java-se" + File.separator + "src" + File.separator + "ejercicioDirectorio" + File.separator + nDirectorio + File.separator + nArchivo + ".txt", true);
      
      for (int i = 0; i < frase.length(); i++) {
        escritura.write(frase.charAt(i));
      }
      escritura.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
