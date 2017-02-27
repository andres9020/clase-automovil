/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseAutomovil;
import claseAutomovil.claseobjeto.Vehiculo;
/**
 *
 * @author alvaroandres
 */
public class claseAutomovil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vehiculo chevrolet = new Vehiculo();
        
        chevrolet.setModelo();
        chevrolet.setNumeroSoat();
        chevrolet.setColor();
        chevrolet.setPlaca();
        
        System.out.println(chevrolet.getnumeroSoat()
                +"Placa:"+chevrolet.getPlaca()+"numeroSoat:"+"modelo:"+chevrolet.getModelo()+"color:"+chevrolet.getcolor());
    }
    
}
