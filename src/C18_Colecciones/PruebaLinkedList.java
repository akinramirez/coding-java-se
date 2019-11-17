package C18_Colecciones;

import java.util.LinkedList;
import java.util.ListIterator;

public class PruebaLinkedList {
  public static void main(String[] args) {
    LinkedList<String> personas = new LinkedList<String>();
    personas.add("Akin");
    personas.add("Arturo");
    personas.add("Sara");
    personas.add("Carlos");
    personas.add("Carmen");
    personas.add("Hector");
    
    System.out.println(personas.size());
    
    ListIterator<String> it = personas.listIterator();
    it.next();
    it.add("Rodolfo");
    
    for (String persona : personas) {
      System.out.println(persona);
    }
  }
}
