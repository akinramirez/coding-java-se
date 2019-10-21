package A18_Colecciones;

public class Libro {

  private String autor;
  private String titulo;
  private int isbn;

//  public boolean equals(Object obj) {
//    Libro otroLibro = (Libro) obj;
//    if (obj instanceof Libro) {
//      if (this.isbn == otroLibro.isbn) {
//        return true;
//      } else {
//        return false;
//      }
//    } else {
//      return false;
//    }
//  }

  @Override
  public int hashCode() {
    int hash = 3;
    hash = 13 * hash + this.isbn;
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
    final Libro other = (Libro) obj;
    if (this.isbn != other.isbn) {
      return false;
    }
    return true;
  }
  

  public Libro(String autor, String titulo, int isbn) {
    this.autor = autor;
    this.titulo = titulo;
    this.isbn = isbn;
  }

  public String getDatos() {
    return "El titulo es: " + titulo + ". El autor es: " + autor + ". y el ISBN es : " + isbn;
  }

  public int getIsbn() {
    return isbn;
  }

  public void setIsbn(int isbn) {
    this.isbn = isbn;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

}
