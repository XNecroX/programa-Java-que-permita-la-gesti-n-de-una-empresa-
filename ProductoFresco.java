import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.ActiveEvent;
import java.awt.event.ActionListener; 

public class ProductoFresco extends Producto {
    private String fechaEnvasado, paisDeOrigen;
    
  
    public ProductoFresco(String fechaCaducidad, String numeroLote){
        super(fechaCaducidad, numeroLote);
        fechaEnvasado = "13/09/1990";
        paisDeOrigen = "Narnia";
    }
     
    public void setFechaEnvasado(String fecha){
        fechaEnvasado = fecha;
    }
   
    public void setPaisDeOrigen(String pais){
        paisDeOrigen = pais;
    }
   
    public String getFechaEnvasado(){
        return fechaEnvasado;
    }
   
    public String getPaisDeOrigen(){
        return paisDeOrigen;
    }
}



