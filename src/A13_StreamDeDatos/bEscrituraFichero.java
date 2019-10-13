package A13_StreamDeDatos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class bEscrituraFichero {

  public static void main(String[] args) {
    Escritura creaEscribeFichero = new Escritura();
    creaEscribeFichero.escribirFichero();
  }
}

class Escritura {

  public void escribirFichero() {
    
    String texto = "Estamos escribiendo a traves de stream de datos";
    
    try {
      FileWriter escritura = new FileWriter("C:/Users/Akin Ramirez/Documents/NetBeansProjects/coding-java-se/src/streamNuevo.txt");
      
      for(int i=0; i < texto.length(); i++){
        escritura.write(texto.charAt(i));
      }
      
      escritura.close();
    } catch (IOException ex) {
      ex.printStackTrace();
    }

  }
}
