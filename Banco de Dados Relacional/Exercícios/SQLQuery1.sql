use lista

select avg (salario_fixo) AS media_salario from vendedor

select count(*) from vendedor Where salario_fixo > 2500.00

select num_pedido, total_produtos = count (*) from item_pedido
group by num_pedido

select num_pedido, total_produtos = count (*) from item_pedido
where quantidade> 5
group by num_pedido
having count (*) > 1

select min (salario_fixo) as 'menor salario', max(salario_fixo) as 'maior salario'
from vendedor

select sum (quantidade) from item_pedido where cod_produto = 3

select getdate()
select datename(yy,getdate())
select datename(month,getdate())
select datepart(month,getdate())
select day (getdate())
select month(getdate())
select year(getdate())

select datediff(dd,'10-01-1926', '10-01-1928')
select datediff(yy, getdate(, getdate()+720)

select dateadd(yy,1,getdate())
select datename(month, dateadd(month, 3, getdate()))

select isdate('27-02-2023')