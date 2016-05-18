/**
 * Super Clase que tendra solo dos Metodos
 */
public class Producto {
    String fechaCaducidad, numeroLote;
          //Este objeto 
    public Producto(String fechaCaducidad, String numeroLote){ //Mientas fechaCaducidad solo es parte de este construvtor
     this.fechaCaducidad = fechaCaducidad;
     this.numeroLote = numeroLote;
       //Se refiere al atrubuto del objeto 
    }
   
    public void setFechaCaducidad(String fecha){
        fechaCaducidad = fecha; 
    }
   
    public void setNumeroLote(String num){
        numeroLote = num;
    }
   
    public String getFechaCaducidad(){
        return fechaCaducidad; //me regresa el valor de fecha de caducidad
    }
   
    public String getNumeroLote(){
        return numeroLote;
    }
}
