package javones_y_mazmorras;

import java.util.ArrayList;

class Inventario {

  ArrayList<Equipamiento>equipamiento;

  public Inventario() {
    equipamiento = new ArrayList<>();
  }
  public void agregarEquipamiento(Equipamiento e){
    equipamiento add (e);
  }
  public void mostrarInventario() {
    Sstem.out.println("Inventario");
    int i =0;
    while(i<equipamiento.size()) {
      Equipamiento item=equipamiento.get(i);
      System.out.println(item.getNombre() + "-" + item.getTipo());
      i++;
    }
  }
}
