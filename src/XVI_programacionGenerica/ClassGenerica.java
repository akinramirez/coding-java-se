package XVI_programacionGenerica;

public class ClassGenerica<T> {

  private T objeto;

  public ClassGenerica() {
    objeto = null;
  }

  public void setObjeto(T nuevoValor) {
    objeto = nuevoValor;
  }

  public T getObjeto() {
    return objeto;
  }
  
}
