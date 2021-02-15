public class CalcularPosicion {

    public int numAleatorio;

    public int obtenerPosicionAleatoria(int max){
        numAleatorio = (int) (Math.random()*max);
        return numAleatorio;
    }
}
