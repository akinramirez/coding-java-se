package A18_Colecciones;

public class UsoLibro {
  public static void main(String[] args) {
    Libro libro1 = new Libro("Akin Ramirez", "Akin Ramirez", 10);
    Libro libro2 = new Libro("Akin Ramirez", "Akin Ramirez", 11);
    //libro1 = libro2;
    
    if(libro1.equals(libro2)){
      System.out.println("Son iguales!");
      System.out.println(libro1.hashCode());
      System.out.println(libro2.hashCode());
    }else{
      System.out.println("NO son iguales!");
      System.out.println(libro1.hashCode());
      System.out.println(libro2.hashCode());
    }
  }
}
