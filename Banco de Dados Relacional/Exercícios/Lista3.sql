use FBD

create table Setor (
Cod_setor int identity (1,1),
nome_setor varchar (30) not null,
constraint PK_Setor primary key (Cod_setor)
)

create table Funcionario (
NR_matricula int identity (1,1),
primeiro_nome varchar(20),
ultimo_nome varchar (50),
email varchar (200),
telefone varchar (20),
data_admissao datetime,
salario float,
Cod_setor int,
foreign key (Cod_setor) references Setor(Cod_setor),
constraint PK_Funcionario primary key (NR_matricula)
)

insert into Setor (nome_setor) values 
('TI'),
('Compras'),
('Produção'),
('RH'),
('Contabilidade')


insert into Funcionario (primeiro_nome, ultimo_nome, 
email, telefone, data_admissao, salario, Cod_setor)
values
('João', 'Silva', 'joao.silva@email.com', '(11) 1234-5678', '20-09-2019', 5000.00, 1),
('Maria', 'Santos', 'maria.santos@email.com', '(11) 2345-6789', '15-12-2008', 5500.00, 2),
('Carlos', 'Ferreira', 'carlos.ferreira@email.com', '(11) 3456-7890', '21-03-2015', 6000.00, 3),
('Ana', 'Oliveira', 'ana.oliveira@email.com', '(11) 4567-8901', '18-05-2010', 5200.00, 4),
('Rafael', 'Costa', 'rafael.costa@email.com', '(11) 5678-9012', '21-12-2023', 5800.00, 5),
('Fernanda', 'Gomes', 'fernanda.gomes@email.com', '(11) 6789-0123', '11-12-2013', 5300.00, 1),
('Luiz', 'Rodrigues', 'luiz.rodrigues@email.com', '(11) 7890-1234', '25-11-2025', 6200.00, 2),
('Mariana', 'Machado', 'mariana.machado@email.com', '(11) 8901-2345', '26-09-2020', 5400.00, 3)

--1
select primeiro_nome, ultimo_nome, salario from Funcionario
where salario > 2500.00

--2
select primeiro_nome, ultimo_nome, Cod_Setor from Funcionario 
where NR_matricula = 7

--3
select primeiro_nome, ultimo_nome, salario from Funcionario
where salario not between 1500.00 and 3000.00

--4
select primeiro_nome, ultimo_nome, Cod_Setor, data_admissao from Funcionario
where data_admissao >= '01-01-2009'
order by data_admissao asc

--5
select f.primeiro_nome from funcionario f inner join setor s
on f.Cod_setor = s.Cod_setor where s.nome_setor in ('TI', 'RH')
order by f.NR_matricula asc

--6
select primeiro_nome from Funcionario
where primeiro_nome like '_a%'

--7
select primeiro_nome from Funcionario
where primeiro_nome like '%a%' and primeiro_nome like '%e%'

--8
select * from funcionario where Cod_setor = 2
order by primeiro_nome asc

--9
select * from funcionario f inner join setor s 
on f.Cod_setor =  s.Cod_setor where s.Cod_setor in ('2', '5')

--10
select primeiro_nome, salario from Funcionario 
where salario > 2300 and Cod_setor = 3

--11 A
select distinct Cod_setor from Funcionario

--11 B
select concat (ultimo_nome, ', ', Cod_setor) as [Empregado e Setor]
from Funcionario;

