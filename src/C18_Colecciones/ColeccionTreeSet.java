package C18_Colecciones;

import java.util.Comparator;
import java.util.TreeSet;

public class ColeccionTreeSet {

  public static void main(String[] args) {
//    TreeSet<String> ordenaGente = new TreeSet<String>();
//    ordenaGente.add("Oscar");
//    ordenaGente.add("Maria");
//    ordenaGente.add("Pilar");
//
//    for (String g : ordenaGente) {
//      System.out.println(g);
//    }
    Productos comparadorProd = new Productos();
    //TreeSet<Productos> ordenaProductos = new TreeSet<Productos>(); // Interfaz comparable
    TreeSet<Productos> ordenaProductos = new TreeSet<Productos>(comparadorProd); // Interfaz comparator
//    Productos pr3 = new Productos(3, "Tercer producto");
//    Productos pr5 = new Productos(5, "Quinto producto");
//    Productos pr2 = new Productos(2, "Segundo producto");
    Productos pr3 = new Productos(3, "Esta es la descripcion del Tercer producto");
    Productos pr5 = new Productos(5, "Quinto");
    Productos pr2 = new Productos(2, "Segundo producto");

    ordenaProductos.add(pr3);
    ordenaProductos.add(pr5);
    ordenaProductos.add(pr2);

    for (Productos pro : ordenaProductos) {
      System.out.println(pro.getDescripcion());
    }

  }
}

class Productos implements Comparable<Productos>, Comparator<Productos> {

  private int numeroProducto;
  private String descripcion;

  public Productos() {
  }
  
  @Override
  public int compareTo(Productos pr) {
    return numeroProducto - pr.numeroProducto;
  }

  public Productos(int numeroProducto, String descripcion) {
    this.numeroProducto = numeroProducto;
    this.descripcion = descripcion;
  }

  public String getDescripcion() {
    return descripcion;
  }

  @Override
  public int compare(Productos o1, Productos o2) {
    int carac1 = o1.getDescripcion().length();
    int carac2 = o2.getDescripcion().length();
    if (carac1 < carac2) {
      return -1;
    } else if (carac1 > carac2) {
      return 1;
    } else {
      return 0;
    }
  }

}
