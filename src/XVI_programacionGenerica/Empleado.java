/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XVI_programacionGenerica;

/**
 *
 * @author Akin Ramirez
 */
public class Empleado {

  private String nombre;
  private int edad;
  private double salario;

  public Empleado(String nombre, int edad, double salario) {
    this.nombre = nombre;
    this.edad = edad;
    this.salario = salario;
  }

  public String dameDatos() {
    return "El empleado se llama " + nombre + ". Tiene " + edad + " años." + " y un salario de " + salario;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

}
