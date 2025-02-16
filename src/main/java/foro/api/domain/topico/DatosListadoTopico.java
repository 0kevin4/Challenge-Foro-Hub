package foro.api.domain.topico;

import java.time.LocalDateTime;

public record DatosListadoTopico(Long id, String titulo, String mensaje, LocalDateTime fecha_creacion, String nombreCurso, String autor) {

    public DatosListadoTopico(Topico topico) {
        this(topico.getId(),topico.getTitulo(), topico.getMensaje(),topico.getFecha_creacion(), topico.getNombreCurso(), topico.getAutor() );
    }
}


