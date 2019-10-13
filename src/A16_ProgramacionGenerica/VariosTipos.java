package A16_ProgramacionGenerica;

public class VariosTipos<T> {

  private T primero;

  public VariosTipos() {
    primero = null;
  }
  
  public static void imprimirTrabajador(VariosTipos<? extends Empleado> e){
    Empleado primero = e.getPrimero();
    System.out.println(primero);
  }  
  
  public T getPrimero() {
    return primero;
  }

  public void setPrimero(T primero) {
    this.primero = primero;
  }

}
