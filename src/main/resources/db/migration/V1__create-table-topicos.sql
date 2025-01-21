
create table topico(
    id bigint not null auto_increment,
    titulo varchar(100) not null ,
    mensaje varchar(100) not null,
    fecha_creacion DATETIME DEFAULT CURRENT_TIMESTAMP,
    nombre_curso varchar(100) not null,
    autor varchar(100) not null ,
    activo tinyint not null,

    primary key(id)

);
