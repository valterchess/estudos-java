package ConseitosProOO;

import ConseitosProOO.interfaces.Bicycle;

/***
 * Classe para representar as caracteristicas comuns do objeto bicicleta
 * base para a construção de objetos deste tipo em suas carácteristicas básicas
 * podendo ter suas carácteristicas herdadas para objetos semelhantes,
 * mas com algumas carácteristicas diferentes.
 */
public class CaloyBicycle implements Bicycle {

    private int cadence = 0; //
    private int speed = 0;
    private int gear = 1;

    public void changeCadence(int newValue) {
        cadence = newValue;
    }
    public void changeGear(int newValue) {
        gear = newValue;
    }
    public void speedUp(int increment) {
        speed += increment;
    }
    public void applyBrakes(int decrement){
        speed -= decrement;
    }
    public void printStates() {
        System.out.println("cadence:" + cadence +
                " speed:" + speed +
                " gear:" + gear);
    }
}
