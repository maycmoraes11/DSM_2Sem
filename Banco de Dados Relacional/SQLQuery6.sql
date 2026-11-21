use SUBCONSULTA

CREATE TRIGGER trg_PreventCategoriaDeletion
ON Categoria
INSTEAD OF DELETE as BEGIN

if exists (select 1 from Produto Where Produto.CategoriaID IN (SELECT DELETED.CategoriaID From DELETED))
BEGIN
RAISERROR ('Não é possível excluir categorias associadas a produtos.', 16, 1) rollback transaction
end else
delete from Categoria WHERE Categoria.CategoriaID IN (SELECT DELETED.CategoriaID FROM DELETED) 
END

Delete from Categoria where CategoriaID = 1
Insert into Categoria (CategoriaID, NomeCategoria) Values (13, 'Games')
Delete from Categoria where CategoriaID = 13

CREATE TRIGGER trg_LogPrecoAlterado
ON Produto
After Update
as Begin
INSERT INTO LogPreco (ProdutoID, NovoPreco,DataAlteracao)
select ProdutoID, Preco, getdate()
from inserted 
end

create table LogPreco ( produtoID int, NovoPreco decimal(10,2), DataAlteracao DATE);

update PRODUTO SET Preco = 4100 WHERE ProdutoID = 1

create trigger trg_LimitePreco
ON Produto
INSTEAD OF INSERT
as BEGIN
if exists (select 1 from inserted where Preco > 10000)
begin
raiserror ('O preço do produto não pode exceder $10.000.', 16, 1)
rollback transaction
end
else
insert into Produto(ProdutoID, NomeProduto, CategoriaID, Preco)
select ProdutoID, NomeProduto, CategoriaID, Preco
FROM inserted
end

insert into produto values (14, 'Ultrabook', 8, 1580)

select * from LogPreco

select * from Categoria