package javones_y_mazmorras;

class Personaje {
String nombre;
  int vida:
Inventario inventario;

  public Personaje(String nombre, int vida){
    this.nombre = nombre;
    this.vida=vida;
    this.inventario = new inventario();
  }
  public void bajarVida(int cantidad) {
  if(cantidad>0) {
 vida-= cantidad ;
    if (vida <0){
      vida = 0;
    }
  }
  }
  public String getNombre() {
    return nombre;
  }
}

