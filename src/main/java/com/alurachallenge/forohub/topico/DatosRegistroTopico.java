package com.alurachallenge.forohub.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosRegistroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensagem,
        @NotNull
        LocalDateTime fecha_creacion,
        @NotBlank
        String nombre_autor,
        @NotNull
        int status,
        @NotBlank
        String curso
) {
}
