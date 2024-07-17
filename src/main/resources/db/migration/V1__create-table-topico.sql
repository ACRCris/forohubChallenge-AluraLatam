CREATE table topico(
    id bigint not null auto_increment,
    titulo varchar(100) not null,
    mensagem varchar(255) not null,
    fecha_creacion datetime not null,
    nombre_autor varchar(100) not null,
    status tinyint not null,
    curso varchar(100) not null,

    primary key(id)
);
