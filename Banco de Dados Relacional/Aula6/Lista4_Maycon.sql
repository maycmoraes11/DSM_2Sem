use bdfatura

--1
select f.nrfatura, f.datafatura, c.codcliente, c.nome
from fatura f join cliente c on c.codcliente = f.codcliente
order by c.nome asc

--2
select p.codproduto, p.descricao, p.preco, p.desconto, forn.codforn, p.saldo
from produto p join fornecedor forn on p.codforn = forn.codforn
order by p.descricao asc;

--3
select f.nrfatura, sum (itens_fatura.qtde * itens_fatura.valor) as valor_total
from Fatura f join itens_fatura on f.nrfatura = itens_fatura.nrfatura
group by f.nrfatura;

--4
select forn.nomeforn, count (p.codproduto) as qtd_produtos
from fornecedor forn
join produto p on forn.codforn = p.codforn
group by forn.nomeforn;

--5
select nrfatura, sum(qtde) as total_itens
from itens_fatura
group by nrfatura;

--6
select c.nome, 
sum (it.qtde * it.valor) as valor_total
from cliente c join fatura f on c.codcliente = f.codcliente
join itens_fatura it on f.nrfatura = it.nrfatura
group by c.nome

--7
select area, count(codcliente) as qtd_clientes
from cliente
group by area;

--8
select codforn, count (codproduto) as qtd_produtos
from produto
group by codforn;

--9
select sum (qtde * valor) / count (*) as media_valor
from itens_fatura

--10
select nrfatura, sum (qtde) as total_itens
from itens_fatura
group by nrfatura
having sum(qtde) > 2;