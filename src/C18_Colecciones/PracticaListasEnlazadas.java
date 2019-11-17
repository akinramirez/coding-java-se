package C18_Colecciones;

import java.util.LinkedList;
import java.util.ListIterator;

public class PracticaListasEnlazadas {

  public static void main(String[] args) {
    LinkedList<String> paises = new LinkedList<String>();
    paises.add("España");
    paises.add("Colombia");
    paises.add("Mexico");
    paises.add("Peru");

    LinkedList<String> capitales = new LinkedList<String>();
    capitales.add("Madrid");
    capitales.add("Bogota");
    capitales.add("DF");
    capitales.add("Lima");

    ListIterator<String> itPaises = paises.listIterator();
    ListIterator<String> itCapitales = capitales.listIterator();

    while (itCapitales.hasNext()) { 
      if (itPaises.hasNext()) {
        itPaises.next();
      }
      itPaises.add(itCapitales.next());
    }
    System.out.println(paises);
    itCapitales = capitales.listIterator();
    while(itCapitales.hasNext()){
      itCapitales.next();
      if(itCapitales.hasNext()){
        itCapitales.next();
        itCapitales.remove();
      }
    }
    System.out.println(capitales);
  }
}
