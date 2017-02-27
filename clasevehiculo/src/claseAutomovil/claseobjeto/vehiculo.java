/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseAutomovil.claseobjeto;

/**
 *
 * @author alvaroandres
 */
public class vehiculo {
    private String placa;
    private String modelo;
    private String numeroSoat;
    private String Color;
    
 public String getPlaca(){
     return placa;   
}
public void setPlaca(String placa){
    this.placa = placa;
}

public String getModelo(){
    return modelo;
    
}
public void setModelo(String modelo){
    this.modelo = modelo;
}
public  String getnumeroSoat(){
    return numeroSoat;
   
}
public void setNumeroSoat(String numeroSoat){
    this.numeroSoat = numeroSoat;
}
public String getColor() {
    return Color;
}
public void setColor(String Color){
    this.Color = Color;
}

    public void setModelo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setColor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
 
}
