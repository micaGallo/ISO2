package traveller.excepciones.viaje;

public class CiudadExistenteException extends ViajeException{
     private String ciudad;
 
    public CiudadExistenteException(String ciudad){
        this.ciudad = ciudad;
    }
 
    @Override
    public String toString(){
        return "El nombre de ciudad ' " + this.ciudad.toLowerCase() + " ' ya fue tomado.";
    }
}
