package C18_Colecciones;

import java.util.HashSet;
import java.util.*;

public class ClientesBancarios {

  public static void main(String[] args) {
    Cliente cliente1 = new Cliente("Antonio Lopez", "001", 20000);
    Cliente cliente2 = new Cliente("Rafael Gomez", "002", 15000);
    Cliente cliente3 = new Cliente("Ana Martinez", "003", 200000);
    Cliente cliente4 = new Cliente("Juan Wong", "004", 20);
    Cliente cliente5 = new Cliente("Antonio Lopez", "001", 20000);

    Set<Cliente> clientesDelBanco = new HashSet<Cliente>();

    clientesDelBanco.add(cliente1);
    clientesDelBanco.add(cliente2);
    clientesDelBanco.add(cliente3);
    clientesDelBanco.add(cliente4);
    clientesDelBanco.add(cliente5);

//    for (Cliente cliente : clientesDelBanco) {
//      if(cliente.getNombre().equals("Ana Martinez")){
//        clientesDelBanco.remove(cliente);
//      }
//    }
//    
//    for (Cliente cliente : clientesDelBanco) {
//      System.out.println(cliente.getNombre() + " " + cliente.getnCuenta() + " " + cliente.getSaldo() );
//    }
    // ITERADOR
    Iterator<Cliente> it = clientesDelBanco.iterator();

    while (it.hasNext()) {
      String nombreCliente = it.next().getNombre();
      if (nombreCliente.equals("Ana Martinez")) {
        it.remove();
      }
    }

    for (Cliente cliente : clientesDelBanco) {
      System.out.println(cliente.getNombre() + " " + cliente.getnCuenta() + " " + cliente.getSaldo());
    }

  }
}
