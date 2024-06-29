package newpackage;
/**
 *
 * @author Joel Collaguazo
 *///IMPLEMENTACION DE ABSTRACCION
public abstract class ElementoInventario { //super clase abstracta
    public int identificador;//atributos
    public int Cantidad;

    public ElementoInventario(int identificador, int Cantidad) { //constructor de super clase
        this.identificador = identificador;
        this.Cantidad = Cantidad;
    }    
    public abstract void mostrarInformacion();//metodo abstracto 
}
