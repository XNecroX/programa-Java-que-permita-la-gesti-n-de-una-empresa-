/**
 * Clase De Productos frescos Heredando de Producto
 */
public class ProductoFresco extends Producto {
    private String fechaEnvasado;
    private String paisDeOrigen;
    
  
    public ProductoFresco(String fechaCaducidad, String numeroLote){
        super(fechaCaducidad, numeroLote);
        fechaEnvasado = "00-00-000";
        paisDeOrigen = "pais";
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



