/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imeicode;

/**
 *
 * @author Ian Ducloux
 */
public class Principios {
    //Clase en donde se pondran los digitos del codigo SIN los ultimos 4 digitos 
    //351991074125472--->35199107412
    private String principio;
    
    public Principios(String nuevoPrincipio){
        principio = nuevoPrincipio;
    }

    Principios() {
        
    }
    public void setPrincipio(String nuevoprincipio)
    {
        //Este ya esta bien!!!
        //Encuentra el error
     principio=nuevoprincipio;
            
        
    }
}
