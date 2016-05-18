/**
 * Clase que hereda de Producto que Implementa de Aire agua y Nitrogeno
 */
import java.util.*;
import javax.swing.*;
import java.awt.*;
public class ProductoCongelado extends Producto implements Aire, Agua, Nitrogeno 
{
    private double TemperaturaRecomendada;
    private String PaisDeOrigen;
    private String FechaDeEnvasado;
    private double PorNitrogeno;
    private double PorOxigeno;
    private double PorCO2;
    private double PorVaporDeAgua;
    private double Salinidad;
    private double TiempoDeEsposicion;
    private String MetodoDeCongelacion;
    public ProductoCongelado(String fechaCaducidad, String numeroLote){
        super(fechaCaducidad, numeroLote);
        TemperaturaRecomendada = 0;
        PaisDeOrigen = "Pais";
        FechaDeEnvasado = "00-00-00";
        PorNitrogeno = 0.0;
        PorOxigeno = 0.0;
        PorCO2 = 0.0;
        PorVaporDeAgua = 0.0;
        Salinidad = 0.0;
        MetodoDeCongelacion = "Metodo de Congelcion";
    }
    
    public void PorNitrogeno(double porcentaje){
        PorNitrogeno = porcentaje;
    }
    public double getPorNitrogeno()
    {
        return PorNitrogeno;
    }
    
    public void PorOxigeno(double porcentaje){
        PorOxigeno = porcentaje;
    }
    public double getPorOxigeno()
    {
        return PorOxigeno;
    }
    
    public void PorCO2(double porcentaje){
        PorCO2 = porcentaje;
    }
    public double getPorCO2()
    {
        return PorCO2;
    }
    
   public void PorVaporDeAgua(double porcentaje){
       PorVaporDeAgua = porcentaje;
    }
    public double getPorVaporDeAgua()
    {
        return PorVaporDeAgua;
    }
    
    public void setSalinidad(double Salinidad){
        this.Salinidad = Salinidad;
    }
    public double getSalinidad()
    {
        return Salinidad;
    }
    
    public void setMetodoDeCongelacion(String MetodoDeCongelacion){
        this.MetodoDeCongelacion = MetodoDeCongelacion;
    }
    public String getMetodoDeCongelacion()
    {
        return MetodoDeCongelacion;
    }
    
    public void setTiempoDeEsposicion(double TiempoDeEsposicion ){//en Segundos
        this.TiempoDeEsposicion = TiempoDeEsposicion;
    }
    public double getTiempoDeEsposicion()
    {
        return TiempoDeEsposicion;
    }
   
    public void setTemperaturaRecomendada(double temperatura){
        TemperaturaRecomendada = temperatura;
    }
   
        public double getTemperaturaRecomendada(){
        return TemperaturaRecomendada;
    }
    
    public void setPaisDeOrigen(String PaisDeOrigen)
    {
        this.PaisDeOrigen = PaisDeOrigen;
    }
    
     public void setFechaDeEnvasado(String FechaDeEnvasado)
    {
        this.FechaDeEnvasado = FechaDeEnvasado;
    }
    
     public String PaisDeOrigen()
    {
        return PaisDeOrigen;
    }
    
    public String getFechaDeEnvasado()
    {
        return FechaDeEnvasado;
    }
        
}