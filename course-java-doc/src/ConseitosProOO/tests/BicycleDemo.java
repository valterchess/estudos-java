package ConseitosProOO.tests;

import ConseitosProOO.CaloyBicycle;

/***
 * Classe para representar a construção de um objeto
 */
public class BicycleDemo {
    public static void main(String[] args) {

        CaloyBicycle bike1 = new CaloyBicycle();
        CaloyBicycle bike2 = new CaloyBicycle();

        //invocando os métodos
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
    }
}
