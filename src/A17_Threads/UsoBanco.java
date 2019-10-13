package A17_Threads;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsoBanco {

  public static void main(String[] args) {
    Banco b = new Banco();
    for (int i = 0; i < 100; i++) {
      EjecutandoTransferencia r = new EjecutandoTransferencia(b, i, 2000);
      Thread t = new Thread(r);
      t.start();
    }
  }
}

class Banco {

  private final double[] cuentas;
  private Lock bloqueaBanco = new ReentrantLock();
  private Condition saldoSuficiente;

  public Banco() {
    cuentas = new double[100];

    for (int i = 0; i < 100; i++) {
      cuentas[i] = 2000;
    }
    saldoSuficiente = bloqueaBanco.newCondition();
  }

  public void tranferencia(int cuentaOrigen, int cuentaDestino, double cantidad) throws InterruptedException {

    bloqueaBanco.lock();

    try {
      //if (cuentas[cuentaOrigen] < cantidad) {
      //return; //Evitar que se haga la transferencia
      //}
      while ((cuentas[cuentaOrigen] < cantidad)) {
        saldoSuficiente.await();
      }

      System.out.println(Thread.currentThread());
      cuentas[cuentaOrigen] -= cantidad;
      System.out.println();
      //System.out.println("Se realizo la transferencia " + cantidad + " Lempiras de la cuenta " + cuentaOrigen + " a la cuenta " + cuentaDestino);
      System.out.printf("Se realizo la transferencia de %10.2f de la cuenta %d para la cuenta %d", cantidad, cuentaOrigen, cuentaDestino);
      System.out.println();
      //System.out.println("El saldo del banco xxxx es : Lps: " + getSaldoTotal());
      cuentas[cuentaDestino] += cantidad;
      System.out.printf("Saldo total: Lps. %10.2f%n", getSaldoTotal());

      saldoSuficiente.signalAll();
    } finally {
      bloqueaBanco.unlock();
    }

  }

  public double getSaldoTotal() {
    double sumaSaldoBanco = 0;

    for (double a : cuentas) {
      sumaSaldoBanco += a;
    }

    return sumaSaldoBanco;
  }

}

class EjecutandoTransferencia implements Runnable {

  private Banco miBanco;
  private int cuentaDeOrigen;
  private double cantidadMaxima;

  public EjecutandoTransferencia(Banco miBanco, int cuentaDeOrigen, double cantidadMaxima) {
    this.miBanco = miBanco;
    this.cuentaDeOrigen = cuentaDeOrigen;
    this.cantidadMaxima = cantidadMaxima;
  }

  @Override
  public void run() {
    while (true) {
      int cuentaDeDestino = (int) (Math.random() * 100);
      double cantidadATransferir = cantidadMaxima * Math.random();
      try {
        miBanco.tranferencia(cuentaDeOrigen, cuentaDeDestino, cantidadATransferir);
        Thread.sleep(30);
      } catch (InterruptedException ex) {
        ex.printStackTrace();
      }
    }
  }

}
