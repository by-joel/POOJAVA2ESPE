package newpackage;
/**
 *
 * @author Joel Collaguazo
 */
public class Ingrediente extends ElementoInventario {
    public String nombre;
    private String fechaCaducidad; //IMPLEMENTACION DE ENCAPSULAMIENTO
    
    public Ingrediente(int identificador, int Cantidad, String nombre){
        super(identificador,Cantidad);
        this.nombre = nombre;                
    }
    //IMPLEMENTACION DE ENCAPSULAMIENTO
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }
    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }    
    @Override // estoy sobrescribiendo el metodo abstracto de ElementoInventario para uso propio de la clase ingrediente
    public void mostrarInformacion(){
        System.out.println("\n\tIngrediente: "+identificador+" - "+Cantidad+" - "+nombre+ " - \n");             
    }
    public void verificarCaducidad(){     
        System.out.println("\tSu producto se encuentra apto para su consumo hasta: fcdu. "+getFechaCaducidad());
    }
}
