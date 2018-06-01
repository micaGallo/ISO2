package traveller.excepciones.evento;

public class TipoEventoInvalidoException extends EventoException{
     private String tipoEvento;
 
    public TipoEventoInvalidoException(String tipoEvento){
        this.tipoEvento = tipoEvento;
    }
 
    @Override
    public String toString(){
        return "Error. Tipo de evento inválido.";
    }
}
