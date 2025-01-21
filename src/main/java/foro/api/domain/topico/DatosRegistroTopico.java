package foro.api.domain.topico;

import java.time.LocalDateTime;

public record DatosRegistroTopico(
        String titulo,
        String mensaje,
        String nombreCurso,
        String autor

)
{
}
