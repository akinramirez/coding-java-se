package A14_Serialización;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RecuperandoObjSerial {
  public static void main(String[] args) {
    try {
      ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream("C:/Users/Akin Ramirez/Documents/NetBeansProjects/coding-java-se/src/extSerializado/miObjetoSerializado.dat"));
      Empleado [] entradaObjeto = (Empleado[])flujoEntrada.readObject();
      flujoEntrada.close();
      
      for(Empleado e: entradaObjeto){
        System.out.println(e.toString());
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    
  }
}
