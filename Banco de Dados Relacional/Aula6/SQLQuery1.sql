use SUBCONSULTA

begin transaction;
--att com erro
update Produto set categoriaID = 100 where ProdutoID = 3;
if @@ERROR = 0
commit
else
rollback; -- Detectou um erro, então desfaz as operações
print 'Atualização na tabela Produto foi Cancelada';

select NomeProduto, Preco,
	case
		when Preco <100 then 'Barato'
		when Preco >= 100 and Preco <1000 then 'Médio'
		else 'Caro'
	end as CategoriaPreco
From Produto
Order by CategoriaPreco

select NomeProduto, CategoriaID, Preco,
	case CategoriaID
		when 1 then Preco*0.9 -- Categoria Eletrônicos (10% de desconto)
		when 2 then Preco * 0.95 -- Categoria Roupas (5% de desconto)
		else Preco
	end as PrecoComDesconto
from Produto;

select PedidoID, DataPedido,
		case
		when DataPedido <'2023-06-01' then 'Antigo'
		else 'novo'
	end as StatusPedido
From Pedido;

declare @CategoriaDesejada INT = 1; --Categoria desejada
if @CategoriaDesejada = 1
begin
	insert into Produto(ProdutoID,NomeProduto, CategoriaID, Preco)
	values (13, 'Tablet', @CategoriaDesejada, 1500);
end

declare @CategoriaID int = 1; --Categoria desejada
declare @NomeCategoria NVARCHAR(50);
if exists (select * from Categoria where CategoriaID = @CategoriaID)
begin
select @NomeCategoria = NomeCategoria From Categoria where CategoriaID = @CategoriaID;
print 'Nome da Categoria: ' + @NomeCategoria;
end
else
begin
	print 'Categoria não encontrada.';
end

select * from Produto