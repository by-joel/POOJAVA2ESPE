package newpackage;
/**
 *
 * @author Joel Collaguazo
 */
//IMPLEMENTACION DE HERENCIA
public class Utensilio extends ElementoInventario {
    public String tipo;
    private String material;

    public Utensilio(int identificador, int Cantidad, String tipo) {
        super(identificador, Cantidad);
        this.tipo = tipo;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    @Override// estoy sobrescribiendo el metodo abstracto de ElementoInventario para uso propio de clase Utensilio
    public void mostrarInformacion(){
        System.out.println("\n\tUtensilio: "+identificador+" - "+Cantidad+" - \n"); 
    }
    public void descripcionUtensilio(){
        System.out.println("\n\tDescripcion: Su utensilio "+tipo+" es de material "+getMaterial()+"\n");
    }    
}
