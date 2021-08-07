package mainPackage;
import PackagePrincipal.*;

public class mainClass {
    public static void main(String[] args){
        //Creando Instancias de todas las clases que cree...
        Arma arma = new Arma();
        Fuente fuente = new Fuente();
        Heroe heroe = new Heroe();
        Inmueble inmueble = new Inmueble();
        Mueble mueble = new Mueble();
        Objeto objeto = new Objeto();
        Villano villano = new Villano();
        
        //Probando la funcionalidad del Arma
        arma.Potenciador(villano);
        
        //Probando guardar un mueble en la mochila
        heroe.GuardarMochila(mueble, 0);
        
        //TODO FUNCIONA BIEN :D
    }
}