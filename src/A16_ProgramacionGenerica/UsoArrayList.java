package A16_ProgramacionGenerica;

import java.io.File;

public class UsoArrayList {
  public static void main(String[] args) {
    MiArrayList archivos = new MiArrayList(5);
    archivos.agregaElemento("Maria");
    archivos.agregaElemento("Jose");
    archivos.agregaElemento("Alberto");
    archivos.agregaElemento("Junior");
    archivos.agregaElemento("Franklin");
    
    //String nombrePersona = (String)archivos.getObjeto(2);
    archivos.agregaElemento(new File("ejemplo.xlsx"));
    File nombrePersona = (File)archivos.getObjeto(1);
    System.out.println(nombrePersona);
  }
}
