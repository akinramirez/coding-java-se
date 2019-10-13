package A13_StreamDeDatos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class aAccesoLecturaFichero {

  public static void main(String[] args) {
    LeerFichero leerFichero = new LeerFichero();
    leerFichero.leeDatos();
  }

}

class LeerFichero {

  public void leeDatos() {
    try {
      FileReader entrada = new FileReader("C:/Users/Akin Ramirez/Documents/NetBeansProjects/coding-java-se/src/primerfichero.txt");
      int caracter = entrada.read();
      
      char letra = (char)caracter;
      
      while(caracter !=-1){
        
        System.out.print(letra);
        caracter = entrada.read();
        letra = (char)caracter;
      }
      System.out.println("");
      entrada.close();
      
    } catch (IOException ex) {
      //ex.printStackTrace();
      System.out.println("No se ha encontrado el archivo");
      
    }
  }
  
  

}
