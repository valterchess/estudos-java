package ConseitosProOO.Exr;

public class UltraWild implements Ultra{
    private int speed = 0;
    private char moviment = 'd';

    @Override
    public void speedUp(int newSpeed) {
        speed += newSpeed;
    }
    @Override
    public void onMoviment() {
        if (speed > 0){
        moviment = 'l';
        }
    }
}

