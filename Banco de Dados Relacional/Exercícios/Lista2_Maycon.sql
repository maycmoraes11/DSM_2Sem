use Lista2

--MAYCON MORAES SOUZA

--1
create table tbl_clientes (
id int primary key,
nome varchar(50),
email varchar(100),
telefone varchar(15))

--2
insert into tbl_clientes values
(1, 'João Silva', 'joao@email.com', '(11) 1234-5678')

--3
insert into tbl_clientes values
(2, 'João Miguel', 'jm@email.com', '(12) 1234-0000'),
(3, 'João Lucas', 'jl@email.com', '(13) 4002-8922'),
(4, 'João Vitor', 'jv@email.com', '(14) 1234-1111'),
(5, 'João Guilherme', 'jg@email.com', '(15) 1234-2222'),
(6, 'João Pedro', 'jp@email.com', '(16) 1234-3333'),
(7, 'João Gustavo', 'jgv@email.com', '(17) 1234-4444'),
(8, 'João Carlos', 'jc@email.com', '(18) 1234-5555'),
(9, 'João Gabriel', 'jg@email.com', '(19) 1234-6666'),
(10, 'João Souza', 'js@email.com', '(41) 1234-7777'),
(11, 'João Felipe', 'jf@email.com', '(43) 1234-8888')

--4
update tbl_clientes
set telefone = '(11) 8765-4321'
where id = 1

--5
create table tbl_produtos (
id int primary key,
nome varchar(50),
preco decimal,
estoque int
)

--6
insert into tbl_produtos values
(1, 'Camiseta', '29.99', '100')

--7
insert into tbl_produtos values
(2, 'Bermuda', '49.99', '10'),
(3, 'Short', '39.99', '150'),
(4, 'Meia', '9.99', '40'),
(5, 'Tenis', '89.99', '30'),
(6, 'Sapatenis', '99.99', '3'),
(7, 'Cueca', '14.99', '43'),
(8, 'Moleton', '44.99', '2'),
(9, 'Calça', '299.99', '11'),
(10, 'Touca', '19.99', '33'),
(11, 'Sueter', '79.99', '22')

--8
update tbl_produtos
set preco = '39.99'
where id = 1

--9
create table tbl_pedidos (
id int primary key,
quantidade int,
DataPedido date,
clienteId int,
ProdutoId int,
constraint FK_clientes foreign key (clienteId) references tbl_clientes(Id),
constraint FK_produtos foreign key (produtoId) references tbl_produtos(Id)
)

--10
insert into tbl_pedidos values
(1, 2, '2026-09-01', 1, 1)

--11
update tbl_pedidos
set quantidade = 3
where id = 1

--12
insert into tbl_pedidos values
(2, 5, '2026-09-01', 2, 2),
(3, 7, '2026-08-31', 3, 3),
(4, 8, '2026-07-28', 4, 4),
(5, 3, '2026-06-27', 5, 5),
(6, 1, '2026-05-23', 6, 6),
(7, 10, '2026-04-18', 7, 7),
(8, 4, '2026-03-17', 8, 8),
(9, 9, '2026-02-08', 9, 9),
(10, 8, '2026-01-07', 10, 10),
(11, 6, '2025-12-01', 11, 11)

--13

create table tbl_funcionarios (
id int primary key,
nome varchar(50),
cargo varchar (50),
salario decimal(10,2))

--14
insert into tbl_funcionarios values
(1,'Maria Santos', 'Gerente', '5000')

--15
update tbl_funcionarios
set salario = '6000'
where id = 1

--16
insert into tbl_funcionarios values
(2, 'Juliana Martins', 'Fisioterapeuta', '4000'),
(3, 'Edileusa Silva', 'Auxiliar Geral', '2000'),
(4, 'Maria Oliveira' , 'Cozinheira','2300'),
(5, 'Kleber Guedes', 'Massagista', '5000'),
(6, 'Juan Peixoto', 'Auxiliar de Chefia', '7000'),
(7, 'Wender Silva', 'Educador', '9000'),
(8, 'Eduardo Souza', 'Roupeiro', '3400'),
(9, 'Rogerio Micale', 'Monitor', '9000'),
(10, 'Lucas Magalhaes', 'Diretor', '10000'),
(11, 'Guilherme Bellintani', 'Chefe', '15000')

--17
create table tbl_vendas (
id int primary key,
produtoId int,
quantidade int,
valorTotal decimal (10,2),
dataVenda date,
constraint FK_Produtos_vendas foreign key (produtoId) references tbl_produtos(id)
)

--18
insert into tbl_vendas (id, produtoId, quantidade, ValorTotal, DataVenda) values
(1, 1, 2, 79.98, '2026-09-08')

--19
insert into tbl_vendas values 
(2, 2, 2, 159.98, '2026-09-08'),
(3, 3, 1, 89.98, '2026-09-04'),
(4, 4, 4, 79.98, '2026-09-05'),
(5, 5, 4, 49.98, '2026-09-07'),
(6, 6, 7, 69.98, '2026-09-08'),
(7, 7, 8, 89.98, '2026-09-01'),
(8, 8, 4, 49.98, '2026-09-03'),
(9, 9, 6, 49.98, '2026-09-05'),
(10, 10, 3, 109.98, '2026-09-02'),
(11, 11, 5, 199.98, '2026-09-06')

--20
delete from tbl_vendas
where id = 1

select * from tbl_clientes
select * from tbl_produtos
select * from tbl_pedidos
select * from tbl_funcionarios
select * from tbl_vendas
