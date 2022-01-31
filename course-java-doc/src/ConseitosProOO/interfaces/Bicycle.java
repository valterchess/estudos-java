package ConseitosProOO.interfaces;

public interface Bicycle {

    //rotação da roda por minuto
  public void changeCadence(int newValue);

  public void changeGear(int newValue);

  public void speedUp(int increment);

  public void applyBrakes(int decrement);
}
