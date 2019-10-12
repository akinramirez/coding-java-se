package XVI_programacionGenerica;

public class EjemploMetodosGenericos {

  public static void main(String[] args) {
    String nombresPersonas[] = {"Sara", "Antonio", "Maria "};

    //System.out.println(ExaminarArray.getElementos(nombresPersonas));
    System.out.println(ExaminarArray.getMenor(nombresPersonas));

    Empleados[] losEmpleados = new Empleados[6];
    losEmpleados[0] = new Empleados("Antonio", 2300.5, 2005, 7, 5);
    losEmpleados[1] = new Empleados("Carlos", 5000.5, 2007, 6, 5);
    losEmpleados[2] = new Empleados("Maria", 2500.5, 2006, 11, 7);
    losEmpleados[3] = new Empleados("Ana", 7000, 2009, 5, 3);
    losEmpleados[4] = new Empleados("Carlos", 5000.5, 2007, 6, 5);
    losEmpleados[5] = new Empleados("Maria", 2500.5, 2006, 11, 7);

    //System.out.println(ExaminarArray.getElementos(losEmpleados));

  }
}

class ExaminarArray {

  public static <T> String getElementos(T[] arrayGenerico) {
    return "El array tiene " + arrayGenerico.length + " elementos";
  }

  public static <T extends Comparable> T getMenor(T[] arrayGenerico) {
    T objetoMenor = arrayGenerico[0];

    for (int i = 1; i < arrayGenerico.length; i++) {

      if (objetoMenor.compareTo(arrayGenerico[i]) > 0) {  
        objetoMenor = arrayGenerico[i];
      }
    }
    return objetoMenor;
  }
}
