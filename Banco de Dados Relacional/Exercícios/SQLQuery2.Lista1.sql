--create DATABASE Lista1
--go
use Lista1


--1
create table professores (
id int primary key,
nome varchar(50),
disciplina varchar(15))

--2
insert into professores
values('1','Ana Oliveira','Português')

--3
update professores
set nome='Ana Silva'
where nome='Ana Oliveira'

--4
insert into professores
values ('2','Marcus','Ed.Financeira'),
('3','Mauro','Matemática'),
('4','Joyce','Literatura'),
('5','Eduardo','História'),
('6','Maycon','Geografia'),
('7','Josi','Ed. Física'),
('8','Valéria','Inglês'),
('9','Jane','Espanhol'),
('10','Lilian','Ciências'),
('11','Mara','Artes')

--5
delete from professores
where id='2'

--6
create table turmas (
id int primary key,
nome varchar(50),
ProfessorResponsavel int,
constraint FK_professores foreign key (ProfessorResponsavel) references professores (id))

--7
insert into turmas
values ('1','9A','1');

--8
insert into turmas
values ('2','9B','3'),
('3','8A','4'),
('4','8B','5'),
('5','7A','6'),
('6','7B','7'),
('7','7C','8'),
('8','7D','9'),
('9','6A','10'),
('10','6B','11'),
('11','6C','11')

--9 
create table alunos (
id int primary key,
nome varchar(50),
DataNascimento date,
TurmaId int,
constraint FK_turmas foreign key (TurmaId) references turmas (id))

--10
insert into alunos (id, nome, DataNascimento, TurmaId)
values ('1','Maria Souza','2005-10-05','1')

--11
insert into alunos
values ('2', 'Nicole', '2012-05-13','2')
('3', 'Rafael', '2012-09-11','3')
('4', 'Gabriela', '2012-04-04','4')
('5', 'Rodrigo', '2012-05-03','5')
('6', 'Bruna', '2012-01-22','6')
('7', 'Victor', '2012-12-23','7')
('8', 'André', '2012-11-10','8')
('9', 'Valentina', '2012-09-07','9')
('10', 'Enzo', '2012-03-28','10')
('11', 'Eduarda', '2012-04-17','11')

--12

select * from professores
select * from turmas
select * from alunos
