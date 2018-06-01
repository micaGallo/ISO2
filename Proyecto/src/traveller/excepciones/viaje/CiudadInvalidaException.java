package traveller.excepciones.viaje;

public class CiudadInvalidaException extends ViajeException{
     private String ciudad;
 
    public CiudadInvalidaException(String ciudad){
        this.ciudad = ciudad;
    }
 
    @Override
    public String toString(){
        return "Error. Destino inválido.";
    }
}
