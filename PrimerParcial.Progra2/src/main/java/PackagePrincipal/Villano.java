package PackagePrincipal;

public class Villano extends Fuente{
    protected int vidas;
    protected int ofensiva;

    public int getVida() {
        return vidas;
    }

    public void setVida(int vidas) {
        this.vidas = vidas;
    }

    public int getOfensiva() {
        return ofensiva;
    }

    public void setOfensiva(int ofensiva) {
        this.ofensiva = ofensiva;
    }
    
    public void AddOffensiva(int x){
        ofensiva += x;
    }
}