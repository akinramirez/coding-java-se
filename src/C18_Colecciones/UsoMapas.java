package C18_Colecciones;

import java.util.HashMap;
import java.util.Map;

public class UsoMapas {
  public static void main(String[] args) {
    HashMap<String, Empleado> listaEmpleados = new HashMap<String, Empleado>();
    listaEmpleados.put("100", new Empleado("Akin"));
    listaEmpleados.put("101", new Empleado("Arturo"));
    listaEmpleados.put("102", new Empleado("Enoc"));
    listaEmpleados.put("103", new Empleado("Bilsan"));
    
    System.out.println(listaEmpleados);
    listaEmpleados.remove("100");
    System.out.println(listaEmpleados);
    listaEmpleados.put("103", new Empleado("Allan"));
    System.out.println(listaEmpleados);
    
    for(Map.Entry<String, Empleado> personaEmpleado: listaEmpleados.entrySet()){
      String clave = personaEmpleado.getKey();
      Empleado valor = personaEmpleado.getValue();
      System.out.println("Clave= " + clave + " Valor= " + valor);
    }
  }
}

class Empleado{
  private String nombre;
  private double salario;

  public Empleado(String nombre) {
    this.nombre = nombre;
    this.salario = 2000;
  }

  @Override
  public String toString() {
    return "Empleado{" + "nombre=" + nombre + ", salario=" + salario + '}';
  }
  
}
