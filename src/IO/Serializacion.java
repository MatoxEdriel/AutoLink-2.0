/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IO;

import Clases.Cliente;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author Matox
 */
public class Serializacion {
    
     public static void guardarLista(List<Cliente> lstClientes) {
    try (ObjectOutputStream objS = new ObjectOutputStream(new FileOutputStream("./src/IO/Datos.poo", true))) {
        objS.writeObject(lstClientes);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    
    
      public static List<Cliente> leerListaCliente(){
         List<Cliente> lstCliente = null;
         
          try{
        ObjectInputStream in= new ObjectInputStream(new FileInputStream("./src/IO/Datos.poo"));
        lstCliente = (List<Cliente>)in.readObject();
        in.close();
            
        }catch(IOException e) {e.printStackTrace();}
        catch(ClassNotFoundException e){e.printStackTrace();}
          
          
          return lstCliente;
       
     
     
     }
    
    
    
    
    
}
