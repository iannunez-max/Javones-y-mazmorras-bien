package javones_y_mazmorras;

class Guerrero extends Personaje{
Personaje companeroProtegido;

  public Guerrero(String nombre) {
    super (nombre,100);
  }
  public void proteger(Personaje companero){
    if(companeroProtegido == null){
      companeroProtegido= companero;
      System.out.println(nombre + "esta protegiendo a" + companero.getNombre());
    }else{
      System.out.println(nombre + "ya esta protegiendo a" + companeroProtegido.getNombre());
    }
  }
  public void dejarDeProteger() {
    if(companeroProtegido != null) {
      System.out.println(nombre+ "dejo de proteger a " + companeroProtegido.getNombre());
      companeroProtegido =null;
    }
  }
}
