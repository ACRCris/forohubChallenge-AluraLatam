package com.alurachallenge.forohub.topico;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record DatosDetallesTopico(
        Long id,
        String titulo,
        String mensagem,
        LocalDateTime fecha_creacion,
        String nombre_autor,
        int status,
        String curso
) {
    public DatosDetallesTopico(Topico topico) {
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensagem(),
                topico.getFecha_creacion(),
                topico.getNombre_autor(),
                topico.getStatus(),
                topico.getCurso()
        );
    }
}
