package javones_y_mazmorras;

public class Ladron extends Personaje {
  boolean invisible;

  public Ladron(String nombre) {
    super(nombre, 80);
    invisible = false;
  }

  public void robar() {
    if (invisible) {
      System.out.println(nombre + " roba en las sombras sin ser visto.");
    } else {
      System.out.println(nombre + " roba, pero lo pueden ver.");
    }
  }
  public void hacerseInvisible() {
    invisible = !invisible;
    if (invisible) {
      System.out.println(nombre + " ahora es invisible");
    } else {
      System.out.println(nombre + " ahora es visible");
    }
  }
}
   





  
}
