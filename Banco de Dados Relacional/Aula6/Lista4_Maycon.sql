use bdfatura

--1
select f.nrfatura, f.datafatura, c.codcliente, c.nome
from fatura f join cliente c on c.codcliente = f.codcliente
order by c.nome asc

--2
select p.codproduto, p.descricao, p.preco, p.desconto, forn.codforn, p.saldo
from produto p join fornecedor forn on p.codforn = forn.codforn
order by p.descricao asc;
