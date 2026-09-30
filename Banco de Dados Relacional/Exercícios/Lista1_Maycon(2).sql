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
where id= 1

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
update alunos
set nome = 'Maria da Silva'
where id = 1

--12
insert into alunos
values ('2', 'Nicole', '2012-05-13','2'),
('3', 'Rafael', '2012-09-11','3'),
('4', 'Gabriela', '2012-04-04','4'),
('5', 'Rodrigo', '2012-05-03','5'),
('6', 'Bruna', '2012-01-22','6'),
('7', 'Victor', '2012-12-23','7'),
('8', 'André', '2012-11-10','8'),
('9', 'Valentina', '2012-09-07','9'),
('10', 'Enzo', '2012-03-28','10'),
('11', 'Eduarda', '2012-04-17','11')

--13
delete from alunos
where id = 2

--14
create table notas(
id int primary key,
alunoId int, 
disciplina varchar(15),
nota decimal(5,2),
constraint FK_alunos foreign key (alunoId) references alunos(Id)
)

--15
insert into notas (id, alunoId, disciplina, nota)
values 
(1, 1, 'Matematica', 8.5)

--16
update notas
set nota = 9.0
where id = 1

--17
insert into notas values
(2, 1,'Ed.Financeira', 7.5),
(3, 3,'Português', 7.8),
(4, 4,'Inglês', 10.0),
(5, 5,'Geografia', 10.0),
(6, 6,'Historia', 9.1),
(7, 7,'Ciências', 8.2),
(8, 8,'Ed.Física', 9.8),
(9, 9,'Literatura', 8.6),
(10, 10,'Artes', 9.7),
(11, 11,'Espanhol', 8.0)

--18
delete from notas
where disciplina = 'Matematica' and id = 1

--19
create table matriculas (
id int primary key,
DataMatricula date,
alunoId int, 
constraint FK_matricula_alunos foreign key (alunoId) references alunos(id),
turmaId int,
constraint FK_matricula_turmas foreign key (turmaId) references turmas(id))

--20
insert into matriculas values (1,'2022-02-15', 1, 1)



--21
insert into matriculas values
(2, '2024-11-24', 3, 3),
(4, '2025-10-26', 4, 4),
(5, '2021-09-11', 5, 5),
(6, '2023-04-09', 6, 6),
(7, '2023-01-14', 7, 7),
(8, '2022-06-13', 8, 8),
(9, '2025-04-08', 9, 9),
(10, '2026-06-30', 10, 10),
(11, '2026-09-01', 11, 11),
(11, '2026-09-01', 11, 11)

select * from professores
select * from turmas
select * from alunos
select * from notas
select * from matriculas
select id, nome from alunos;