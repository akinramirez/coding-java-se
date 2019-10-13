package A16_ProgramacionGenerica;

public class UsoClaseGenerica {

  public static void main(String[] args) {
    ClassGenerica<String> objetoGenerico1 = new ClassGenerica<String>();
    objetoGenerico1.setObjeto("Akin Ramirez String");
    System.out.println(objetoGenerico1.getObjeto());

    ClassGenerica<Persona> objetoGenerico2 = new ClassGenerica<Persona>();
    Persona persona = new Persona("Arturo Ramirez Objeto");
    objetoGenerico2.setObjeto(persona);
    System.out.println(objetoGenerico2.getObjeto());
  }
}

class Persona {

  private String nombre;

  public Persona(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public String toString() {
    return nombre;
  }
}
