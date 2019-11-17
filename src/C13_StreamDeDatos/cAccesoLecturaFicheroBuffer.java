package C13_StreamDeDatos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class cAccesoLecturaFicheroBuffer {

  public static void main(String[] args) {
    LeerFicheroBuffer leerFichero = new LeerFicheroBuffer();
    leerFichero.leeDatos();
  }

}

class LeerFicheroBuffer {

  public void leeDatos() {
    try {
      FileReader entrada = new FileReader("C:/Users/Akin Ramirez/Documents/NetBeansProjects/coding-java-se/src/primerfichero.txt");
      BufferedReader miBuffer = new BufferedReader(entrada);
      String linea = "";
      while (linea != null) {
        linea = miBuffer.readLine();
        if (linea != null) {
          System.out.println(linea);
        };
      }
      entrada.close();

    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

}
