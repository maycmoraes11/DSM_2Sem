use FBD

select convert(char, getdate(), 103)
select convert(char, getdate(), 113)

select round(123.3467, 3)
select round(123.3467, 2)
select round(123.3467, 1)
select round(123.5467, 1)
select round(123.3467, 0)
select round(123.3467, -1)
select round(123.3467, -2)

select floor(123.45)

select power(4,2)
select power(2,2)

select ASCII('A'), ASCII('AMANDA')

select char(65), char(66)

select charindex ('Mundo', 'Ola Mundo Bonito')
select charindex ('Mundo', 'Ola Mundo Bonito', 3)
select charindex ('Mundo', 'Ola Mundo Bonito', 6)

select replace ('abcdefghicde', 'cde', 'xxx')
select replace(primeiro_nome,'c','z') from Funcionario

select stuff ('abcdef', 2, 3, '_ijklmn_')

select left ('abcdefgh', 5)
select right ('abcdefgh', 4)

select replicate ('abc',3)

select substring('ABCDEFGHIJ', 2, 3)

select len('abcd')
select len('abcd   ')

select lower('AbCD')
select lower(primeiro_nome) from Funcionario

select upper('AbCD')
select upper(primeiro_nome) from Funcionario

select '_' + ltrim('  AbCD  ')+ '_'
select '_' + rtrim('  AbCD  ')+ '_'