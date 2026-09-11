// Framework C++

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/* faça um programa que leia 5 notas e calcule a média da turma. Acima de 7 é aprovado, 5 e 7 rec e menos de 5 reprovado. Utilize acumulador + for + if/else
*/

int main()
{								// INÍCIO DO PROGRAMA

int i, 
int nota[5];
int soma = 0; 
int media;

for (i=0; i<5; i++) {
	printf("Digite a nota: ");
	scanf("%i", &nota[i]);
	soma+=nota[i];
	}
	media=soma/5;
	
	printf ("\n A média da turma é %i", media);
	
	if (nota[i]>7){
	printf("\n Nota %i: Aprovado \n", nota[i]);
	
	} else if (nota[i]=>5 && nota[i]<7) {
	printf("\n Nota %i: Em Recuperação \n", nota[i]);
	{
	else (nota[i]<5) {
	printf("\n Nota %i: Reprovado \n", nota[i]);
	}
	
	printf ("\n ")
	return 0;
}
