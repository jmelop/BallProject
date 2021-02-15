public class Bola {

    public BolaColor color;

    public Bola(BolaColor color){
        this.color = color;
    }

    public BolaColor getColor(){
        return this.color;
    }

    public String getColorString(){
        return this.color.toString();
    }

    public String toString(){
        return "Bola de color "+ this.color +" ";
    }

    public void esBlanca(){
        this.color = BolaColor.WHITE;
    }

    public void esNegra(){
        this.color = BolaColor.BLACK;
    }


}
