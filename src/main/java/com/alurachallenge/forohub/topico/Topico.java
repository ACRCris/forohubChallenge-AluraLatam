package com.alurachallenge.forohub.topico;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity(name = "Topico")
@Table(name = "topicos")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Getter
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime fecha_creacion;
    private String nombre_autor;
    private int status;
    private String curso;

    public Topico(DatosRegistroTopico datos) {
        this.titulo = datos.titulo();
        this.mensagem = datos.mensagem();
        this.fecha_creacion = datos.fecha_creacion();
        this.nombre_autor = datos.nombre_autor();
        this.status = datos.status();
        this.curso = datos.curso();
    }

}
