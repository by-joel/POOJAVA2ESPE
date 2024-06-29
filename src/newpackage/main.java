
package newpackage;
/**
 *
 * @author Joel Collaguazo
 */
public class main {
     public static void main(String[]args){
         System.out.println("\tEXAMEN 1 PARCIAL: ");
         System.out.println("INGREDIENTE 1:");
         //INSTANCIAS DE OBJETOS IG1
         Ingrediente ig1 = new Ingrediente(12,10,"pimienta");
         ig1.mostrarInformacion();
         ig1.setFechaCaducidad("12/10/2024");
         ig1.verificarCaducidad();
         
         System.out.println("INGREDIENTE 2:");
         Ingrediente ig2 = new Ingrediente(13,121,"curcuma");
         ig2.mostrarInformacion();
         ig2.setFechaCaducidad("26/08/2024");
         ig2.verificarCaducidad();
         
         //INSTANCIAS DE OBJETOS UT1
         System.out.println("UTENSILIO 1:");
         Utensilio ut1 = new Utensilio(002,9833,"cuchillo");
         ut1.setMaterial("plata");
         ut1.mostrarInformacion();         
         ut1.descripcionUtensilio();
         
         System.out.println("UTENSILIO 2:");
         Utensilio ut2 = new Utensilio(0232,983120931,"tenedor");
         ut2.setMaterial("plastic");
         ut2.mostrarInformacion();         
         ut2.descripcionUtensilio();
     }
}
