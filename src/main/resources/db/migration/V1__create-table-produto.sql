create table produtos(

    id bigint not null auto_increment,
    nome varchar(100) not null,
    descricao varchar(100) not null unique,
    preco double not null unique,

    primary key(id)

);