package javones_y_mazmorras;

import java.util.Scanner;

public class Juego {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(Systme.in);
    Guerrero guerrero = new Guerrero("Arthur");
    Ladron ladron = new Ladron("Robin");
    Personaje mago = new Personaje("Merlin", 70);

    Equipamiento espada = new Equipamiento("Espada", "arma");
    Equipamiento escudo = new Equipamiento("Escudo", "armadura");

    guerrero.inventario.agregarEquipamiento(espada);
    ladron.inventario.agregarEquipamiento(escudo);

    while (true) {
      System.out.println("\n¿Qué quieres hacer?");
      System.out.println("1. Proteger a Merlin");
      System.out.println("2. Dejar de proteger");
      System.out.println("3. Hacerse invisible");
      System.out.println("4. Robar");
      System.out.println("5. Mostrar Inventarios");
      System.out.println("6. Salir");
      System.out.print("Elige una opción: ");

      int opcion = scanner.nextInt();
      
      if (opcion == 1) {
             guerrero.proteger(mago);
      } else if (opcion == 2) {
             guerrero.dejarDeProteger();
      } else if (opcion == 3) {
             ladron.hacerseInvisible();
      } else if (opcion == 4) {
             ladron.robar();
      } else if (opcion == 5) {
             guerrero.inventario.mostrarInventario();
             ladron.inventario.mostrarInventario();
      } else if (opcion == 6) {
             System.out.println("Saliendo del juego...");
             break;
      } else {
             System.out.println("Opcion no valida.");
      }
    }
    scanner.close();
  }
}



        
}
