package A16_ProgramacionGenerica;

public class MiArrayList {

  private Object[] datosElementos;
  private int i = 0;
  
  public MiArrayList(int z) {
    datosElementos = new Object[z];
  }

  public Object getObjeto(int i) {
    return datosElementos[i];
  }
  
  public void agregaElemento(Object o){
    datosElementos[i]= o;
    i++;
  }

}
