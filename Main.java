/**
 * Este Programa fue desarrollado por (Alejandro Escandon Sanchez)
 * version v1.0
 */
public class Main {
    public static void main(String[]args){
        ProductoCongelado beef = new ProductoCongelado("20-11-2016","L1611001 ");
        ProductoFresco apple = new ProductoFresco("01-09-2016","L1609005");
        ProductoRefrigerado milk = new ProductoRefrigerado("12-12-2016","L1612003");
        
        beef.PorNitrogeno(30);
        beef.PorOxigeno(50);
        beef.PorCO2(0.54);
        beef.PorVaporDeAgua(80);
        beef.setTemperaturaRecomendada(10);
        beef.setSalinidad(0.12);
        beef.setMetodoDeCongelacion("Punto de Fucion");
        beef.setTiempoDeEsposicion(30.43);
        apple.setFechaEnvasado("03-10-2015");
        apple.setPaisDeOrigen("Panamá");
        milk.setTemperaturaRecomendada(12);
        milk.setCodigoSupervisionAlimentaria("B#6745");
       
        System.out.println();
         System.out.println("Producto Fresco: ");
        System.out.println("Fecha de caducidad: " + apple.getFechaCaducidad() + "\nNumero de Lote: " + apple.getNumeroLote()
                           + "\nFecha de envasado: " + apple.getFechaEnvasado() + "\nPais de Origen: " + apple.getPaisDeOrigen());
         System.out.println();
         
        System.out.println("Producto Refrigerado: ");
        System.out.println("Fecha de caducidad: " + milk.getFechaCaducidad() + "\nNumero de Lote: " + milk.getNumeroLote()
                           + "\nCodigo de supervision alimentaria: " + milk.getCodigoSupervisionAlimentaria() + 
                             "\nTemperatura Recomendada: " + milk.getTemperaturaRecomendada() + " °C");
                           
        System.out.println();
        System.out.println("carne. \nProducto Congelado: ");
        System.out.println("Fecha de caducidad: " + beef.getFechaCaducidad() + "\nNumero de Lote: " + beef.getNumeroLote()
                           + "\nTemperatura Recomendada: " + beef.getTemperaturaRecomendada() + "C°");
        System.out.println("Datos. \nNivel de Aire ");
        System.out.println("Nivel de Nitrogeno: " +beef.getPorNitrogeno() + "%" +
                           "\nNivel de Oxigeno: " + beef.getPorOxigeno() + "%" +
                           "\nNivel de CO2 " + beef.getPorCO2() + "%" + 
                           "\nNivel de Vapor de Agua " + beef.getPorVaporDeAgua() + "%");
        System.out.println("Nivel de Agua");
        System.out.println("Salinidad: " + beef.getSalinidad() + "%" );
        System.out.println("Nivel de Nitrogeno" +
                           "\nMetodo de Congelacion: " + beef.getMetodoDeCongelacion() + "\nTiempo de Exposicion: " + beef.getTiempoDeEsposicion() + " segundos" );
       
       
    }
}