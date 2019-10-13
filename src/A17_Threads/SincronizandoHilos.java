package A17_Threads;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SincronizandoHilos {

  public static void main(String[] args) {
    ////////////////////////////////////////////////////    
//    SincronizaThreads hilo1 = new SincronizaThreads();
//    SincronizaThreads hilo2 = new SincronizaThreads();
//    hilo1.start();
//    try {
//      hilo1.join();
//    } catch (InterruptedException ex) {
//      ex.printStackTrace();
//    }
//    hilo2.start();
//    try {
//      hilo2.join();
//    } catch (InterruptedException ex) {
//      ex.printStackTrace();
//    }
//    System.out.println("Hemos terminado las tareas");
    ////////////////////////////////////////////////////    
    SincronizaThreads hilo1 = new SincronizaThreads();
    SincronizaThreads2 hilo2 = new SincronizaThreads2(hilo1);
    SincronizaThreads2 hilo3 = new SincronizaThreads2(hilo2);
    hilo1.start();
    hilo2.start();
    hilo3.start();
    System.out.println("Hemos terminado las tareas");
  }
}

class SincronizaThreads extends Thread {

  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Ejecutando Threads : " + getName());

      try {
        sleep(300);
      } catch (InterruptedException ex) {
        ex.printStackTrace();
      }
    }
  }
}

class SincronizaThreads2 extends Thread {

  private Thread thread;

  public SincronizaThreads2(Thread thread) {
    this.thread = thread;
  }

  public void run() {
    try {
      thread.join();
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }
    for (int i = 0; i < 20; i++) {
      System.out.println("Ejecutando Threads : " + getName());

      try {
        sleep(300);
      } catch (InterruptedException ex) {
        ex.printStackTrace();
      }
    }
  }
}
