package PackagePrincipal;

public class Heroe extends Villano{
    protected Mueble[] mochila = new Mueble[3];
    
    public Mueble[] getMochila(){
        return mochila;
    }
    public void GuardarMochila(Mueble m, int x){
        mochila[x] = m;
    }
}
