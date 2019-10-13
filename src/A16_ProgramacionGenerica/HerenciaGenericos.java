package A16_ProgramacionGenerica;

public class HerenciaGenericos {
  
  // EN LAS CLASES GENERICAS NO FUNCIONA LA HERENCIA
  public static void main(String[] args) {
    /*Empleado Empleado15248;
    Jefe Sara = new Jefe("Sara", 27, 3750);
    Empleado15248 = Sara;*/
    
    VariosTipos<Empleado> Empleado15248 = new VariosTipos<Empleado>();
    VariosTipos<Jefe> Sara = new VariosTipos<Jefe>();
    //Empleado15248 = Sara;
    VariosTipos.imprimirTrabajador(Sara);
    
  }
}
