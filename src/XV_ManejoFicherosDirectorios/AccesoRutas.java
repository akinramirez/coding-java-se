package XV_ManejoFicherosDirectorios;

import java.io.File;

public class AccesoRutas {

  public static void main(String[] args) {
    File directorio = new File("C:" + File.separator + "Users" + File.separator + "Akin Ramirez" + File.separator + "Documents" + File.separator + "NetBeansProjects" + File.separator + "coding-java-se" + File.separator + "src" + File.separator + "externo");
    System.out.println(directorio.getAbsolutePath());
    //System.out.println(directorio.exists());
    String[] nombres = directorio.list();

    for (int i = 0; i < nombres.length; i++) {
      System.out.println(nombres[i]);

      File f = new File(directorio.getAbsolutePath(), nombres[i]);

      if (f.isDirectory()) {
        String[] archivosSubCarpeta = f.list();

        for (int j = 0; j < archivosSubCarpeta.length; j++) {
          System.out.print(" ");
          System.out.println(archivosSubCarpeta[j]);
        }
      }
    }
  }

}
