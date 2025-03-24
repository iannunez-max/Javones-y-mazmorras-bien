package javones_y_mazmorras;

public class Equipamiento {
  String nombre;
  String tipo;

  public Equipamiento(String nombre, String tipo) {
    this.nombre = nombre;
    this.tipo = tipo;
  }

  public String getNombre() {
    return nombre;
  }

  public String getTipo() {
    return tipo;
  }
}
