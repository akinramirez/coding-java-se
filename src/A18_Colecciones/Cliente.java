package A18_Colecciones;

import java.util.Objects;

public class Cliente {

  private String nombre;
  private String nCuenta;
  private double saldo;

  public Cliente(String nombre, String nCuenta, double saldo) {
    this.nombre = nombre;
    this.nCuenta = nCuenta;
    this.saldo = saldo;
  }

  @Override
  public int hashCode() {
    int hash = 3;
    hash = 97 * hash + Objects.hashCode(this.nCuenta);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Cliente other = (Cliente) obj;
    if (!Objects.equals(this.nCuenta, other.nCuenta)) {
      return false;
    }
    return true;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getnCuenta() {
    return nCuenta;
  }

  public void setnCuenta(String nCuenta) {
    this.nCuenta = nCuenta;
  }

}
