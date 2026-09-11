use FBD

CREATE TABLE PESSOA (
id_pessoa integer primary key,
nome varchar(20),
cpf varchar(14)
);

CREATE TABLE PESSOA_FISICA
(
id_pessoa integer primary key,
nome varchar(20),
cpf varchar(14)
);

insert into pessoa values (1, 'Pedro Cabral', '12345678991');

insert into pessoa_fisica select id_pessoa, nome, cpf from pessoa;

select nome_vendedor, salario_fixo from vendedor order by nome_vendedor ASC
select nome_vendedor, salario_fixo from vendedor order by nome_vendedor DESC
select * from PESSOA
select * from PESSOA_FISICA



