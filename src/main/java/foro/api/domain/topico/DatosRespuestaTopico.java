package foro.api.domain.topico;

import java.time.LocalDateTime;

public record DatosRespuestaTopico(Long id,
                                   String titulo,
                                   String mensaje,
                                   LocalDateTime fecha_creacion,
                                   String nombreCurso,
                                   String autor
                                   ) {
}
