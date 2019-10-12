package XVI_programacionGenerica;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;

public class usoEmpleado {

  public static void main(String[] args) {
//    Empleados[] losEmpleados = new Empleados[4];
//    losEmpleados[0] = new Empleados("Antonio", 2300.5, 2005, 7, 5);
//    losEmpleados[1] = new Empleados("Carlos", 5000.5, 2007, 6, 5);
//    losEmpleados[2] = new Empleados("Maria", 2500.5, 2006, 11, 7);
//    losEmpleados[3] = new Empleados("Ana", 7000, 2009, 5, 3);

    ArrayList<Empleados> listaEmpleados = new ArrayList<Empleados>();
    listaEmpleados.ensureCapacity(12);

    listaEmpleados.add(new Empleados("Antonio", 2300.5, 2005, 7, 5));
    listaEmpleados.add(new Empleados("Carlos", 5000.5, 2007, 6, 5));
    //listaEmpleados.trimToSize();
    listaEmpleados.add(new Empleados("Maria", 2500.5, 2006, 11, 7));
    listaEmpleados.add(new Empleados("Ana", 7000, 2009, 5, 3));
//    listaEmpleados.add(new Empleados("Antonio", 2300.5, 2005, 7, 5));
//    listaEmpleados.add(new Empleados("Carlos", 5000.5, 2007, 6, 5));
//    listaEmpleados.add(new Empleados("Maria", 2500.5, 2006, 11, 7));
//    listaEmpleados.add(new Empleados("Ana", 7000, 2009, 5, 3));
//    listaEmpleados.add(new Empleados("Antonio", 2300.5, 2005, 7, 5));
//    listaEmpleados.add(new Empleados("Carlos", 5000.5, 2007, 6, 5));
//    listaEmpleados.add(new Empleados("Maria", 2500.5, 2006, 11, 7));
//    listaEmpleados.add(new Empleados("Ana", 7000, 2009, 5, 3));
//    listaEmpleados.add(new Empleados("Maria", 2500.5, 2006, 11, 7));

    //Reemplazo de elemento
    listaEmpleados.set(1, new Empleados("Jorge", 15000.5, 2019, 10, 10));
    listaEmpleados.add(new Empleados("Carlos", 5000.5, 2007, 6, 5));
    listaEmpleados.remove(0);
    //System.out.println(listaEmpleados.size());
//    for (Empleados obj : listaEmpleados) {
//      System.out.println(obj.getDatosEmpleado() + " y un salario de: " + obj.getSueldo());
//    }
//    for (int i = 0; i < listaEmpleados.size(); i++) {
//      Empleados e = listaEmpleados.get(i);
//      System.out.println(e.getDatosEmpleado() + " y un salario de: " + e.getSueldo());
//    }
    //System.out.println(listaEmpleados.get(3).getDatosEmpleado());

    //ARRAYLIST TO ARRAY
//    Empleados EmpleadosArray[] = new Empleados[listaEmpleados.size()];
//    listaEmpleados.toArray(EmpleadosArray);
//    
//    for (int i = 0; i < EmpleadosArray.length; i++) {
//      System.out.println(EmpleadosArray[i].getDatosEmpleado());
//    }
    // ITERADOR
    Iterator<Empleados> iteradorEmpleados = listaEmpleados.iterator();
    while (iteradorEmpleados.hasNext()) {
      System.out.println(iteradorEmpleados.next().getDatosEmpleado());
    }

  }

}

class Empleados {

  private String nombre;
  private double sueldo;
  private Date fechaContrato;
  private int id;
  private static int IdSiguiente = 1;

  public Empleados(String n, double s, int agno, int mes, int dia) {
    nombre = n;
    sueldo = s;
    GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
    id = IdSiguiente;
    IdSiguiente++;
  }

  public String getDatosEmpleado() {

    return "El empleado " + nombre + " tiene el Id " + id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getSueldo() {
    return sueldo;
  }

  public void setSueldo(double sueldo) {
    this.sueldo = sueldo;
  }

  public Date getFechaContrato() {
    return fechaContrato;
  }

  public void setFechaContrato(Date fechaContrato) {
    this.fechaContrato = fechaContrato;
  }

  public void SubirSueldo(double porcentaje) {
    double aumento = sueldo * porcentaje / 100;
    sueldo += aumento;
  }

  public String toString() {
    return "Noombre = " + nombre + " ,sueldo = " + sueldo + " , fecha de contrato: " + fechaContrato;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getIdSiguiente() {
    return IdSiguiente;
  }

  public void setIdSiguiente(int IdSiguiente) {
    this.IdSiguiente = IdSiguiente;
  }

}
