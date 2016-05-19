
/**
  Clase de Productos refigerados Heredando de Producto  
 */
public class ProductoRefrigerado extends Producto {
    private String codigoSupervisionAlimentaria;
    private String fechaDeEnvasado;
    public String paisDeOrigen;
    public double tempCongelacionRecomendada;
       
    public ProductoRefrigerado(String fechaCaducidad, String numeroLote){
        super(fechaCaducidad, numeroLote);
        codigoSupervisionAlimentaria = "L000000";
         fechaDeEnvasado = "00-00-000";
         paisDeOrigen = "Pais";
         
    }
    
   
    public void setCodigoSupervisionAlimentaria(String codigo){
        codigoSupervisionAlimentaria = codigo;
    }
   
    public String getCodigoSupervisionAlimentaria(){
        return codigoSupervisionAlimentaria;
    }
    
    public void setTemperaturaRecomendada(double temperatura){
        tempCongelacionRecomendada = temperatura;
    }
   
    public double getTemperaturaRecomendada(){
        return tempCongelacionRecomendada;
    }
}