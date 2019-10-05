package StreamDeDatos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class dLeyendoEscribiendoArchivoBytes {

  public static void main(String[] args) {
    int contador = 0;
    int byteImagen[] = new int[275553];

    try {
      FileInputStream lecturaArchivo = new FileInputStream("C:/Users/Akin Ramirez/Documents/NetBeansProjects/coding-java-se/src/externo/digitalocean-shark.png");

      boolean finaArchivo = false;

      while (!finaArchivo) {
        int byteImagenEntrada = lecturaArchivo.read();

        if (byteImagenEntrada != -1) {
          byteImagen[contador] = byteImagenEntrada;
        } else {
          finaArchivo = true;
        }

        System.out.println(byteImagen[contador]);
        contador++;
      }
      lecturaArchivo.close();
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    CreaFichero(byteImagen);
    //System.out.println(contador);
  }

  static void CreaFichero(int arrayExterno[]) {

    try {
      FileOutputStream ficheroExterno = new FileOutputStream("C:/Users/Akin Ramirez/Documents/NetBeansProjects/coding-java-se/src/externo/escritura/digitalocean-shark-copia.png");
      for (int i = 0; i < arrayExterno.length; i++) {
        ficheroExterno.write(arrayExterno[i]);
      }
      ficheroExterno.close();
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

}
