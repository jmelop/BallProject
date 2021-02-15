import java.util.ArrayList;
import java.util.Iterator;

public class Urna {

    ArrayList<Bola> urnaDeBolas = new ArrayList<>();
    CalcularPosicion cp = new CalcularPosicion();

    public void meterBola(Bola bola){

        urnaDeBolas.add(bola);
    }

    public Bola sacarBola(){
        if(urnaDeBolas.isEmpty()){
            throw new IllegalArgumentException("Error, la urna se encuentra vacia!");
        }else {
            return urnaDeBolas.remove(cp.obtenerPosicionAleatoria(urnaDeBolas.size()));
        }
    }

    private int obtenerPosicionAleatoria(int hasta){
        return (int)(Math.random()*hasta);
    }
    
    public int cuantasBlancas(){
        int numBlancas = 0;
        int index = 0;
        for (Bola bola: urnaDeBolas
             ) {
            if (urnaDeBolas.get(index).getColor().toString().equals("WHITE")) {
                numBlancas += 1;
            }
            index += 1;
        }
        return numBlancas;
    }

    public int cuantasNegras(){
        int numNegras = 0;
        for(int i = 0; i < urnaDeBolas.size(); i++){
            if (urnaDeBolas.get(i).getColor().toString().equals("BLACK")) {
                numNegras += 1;
            }
        }
        return numNegras;
    }

    public void mostrarUrna(){
        int i = 0;
        while(i < urnaDeBolas.size()){
            System.out.println(urnaDeBolas.get(i).getColorString());
            i += 1;
        }
    }

    public void borrarBlancas(){

        urnaDeBolas.removeIf(bola -> bola.getColor().toString().equals("WHITE"));
    }

    public int sizeOfUrna(){
        return urnaDeBolas.size();
    }
}
