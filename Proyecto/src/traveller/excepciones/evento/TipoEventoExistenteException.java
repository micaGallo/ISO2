package traveller.excepciones.evento;

public class TipoEventoExistenteException extends EventoException{
     private String tipoEvento;
 
    public TipoEventoExistenteException(String tipoEvento){
        this.tipoEvento = tipoEvento;
    }
 
    @Override
    public String toString(){
        return "El tipo de evento ' " + this.tipoEvento.toLowerCase() + " ' ya fue tomado.";
    }
}