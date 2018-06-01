package traveller.dominio;

import traveller.excepciones.viaje.ViajeException;
import traveller.excepciones.viaje.LargoNombreViajeInvalidoException;
import traveller.excepciones.viaje.NombreViajeVacioException;
import traveller.excepciones.fecha.FechaVaciaException;
import traveller.excepciones.fecha.FechaEventoFueraViajeException;
import traveller.excepciones.fecha.FechaException;
import traveller.excepciones.fecha.FormatoFechaInicioException;
import traveller.excepciones.evento.EventoException;
import traveller.excepciones.evento.EventoExistenteException;
import traveller.excepciones.comentario.ComentarioException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import traveller.utill.Utilidades;

public final class Viaje implements Serializable {

    private String nombre;
    private String destino;
    private Date fechaInicio;
    private Date fechaFin;
    private String descripcion;
    private ArrayList<Evento> listaEventos;
    private ArrayList<Comentario> listaComentarios;
    private ArrayList<ReporteLog> log;

    public Viaje(String nombre) {
        this.nombre = nombre;
    }

    public Viaje(String nombre, String destino, Date fechaInicio, Date fechaFin, String descripcion) throws ViajeException {
        this.setNombre(nombre);
        this.setDestino(destino);
        this.setFechaInicio(fechaInicio);
        this.setFechaFin(fechaFin);
        this.setDescripcion(descripcion);
        this.listaEventos = new ArrayList<Evento>();
        this.listaComentarios = new ArrayList<Comentario>();
        this.log = new ArrayList<ReporteLog>();
    }

    public void agregarComentario(String autor, String fecha, String contenido) throws ComentarioException {
        Comentario nuevoComentario = new Comentario(fecha, contenido, autor);
        this.listaComentarios.add(0,nuevoComentario);
    }

    public ArrayList<Comentario> getListaComentarios() {
        return this.listaComentarios;
    }

    public void agregarLogAViaje(String accion, String fecha) {
        ReporteLog nuevoReporte = new ReporteLog(accion, fecha);
        this.log.add(0,nuevoReporte);
    }

    public ArrayList<ReporteLog> obtenerLog() {
        return this.getLog();
    }

    public boolean existeEvento(Evento evento) {
        return this.getListaEventos().contains(evento);
    }

    public void altaEvento(String nombreEvento, Date fecha, String lugar,
            String descripcion, String tipoEvento) throws EventoException, FechaException {

        if (this.existeNombreEvento(nombreEvento)) {
            throw new EventoExistenteException();
        }
       /* Validaciones fecha */
        if (fecha == null) {
            throw new FechaVaciaException();
        }
        
        if (fecha.after(this.getFechaFin()) || fecha.before(this.getFechaInicio())) {
            throw new FechaEventoFueraViajeException();
        } 

        Evento nuevoEvento = new Evento(nombreEvento, tipoEvento, fecha, lugar, descripcion);
        this.agregarEventos(nuevoEvento);
    }

    public boolean existeNombreEvento(String nombreEvento) {
        return this.getListaEventos().contains(new Evento(nombreEvento));
    }

    public void bajaEvento(Evento evento) {
        this.getListaEventos().remove(evento);
    }

    public ArrayList<ReporteLog> getLog() {
        return this.log;
    }

    public ArrayList<Comentario> getComentarios() {
        return this.listaComentarios;
    }

    public ArrayList<Evento> getListaEventos() {
        return this.listaEventos;
    }

    public void agregarEventos(Evento evento) {
        this.listaEventos.add(evento);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws ViajeException {
        if (nombre.isEmpty()) {
            throw new NombreViajeVacioException();
        }
        if (!Utilidades.largoValido(nombre, 4, 20)) {
            throw new LargoNombreViajeInvalidoException(4, 20);
        }

        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object obj) {
        return this.getNombre().equals(((Viaje) obj).getNombre());
    }

    @Override
    public String toString() {
        return nombre;
    }
}
