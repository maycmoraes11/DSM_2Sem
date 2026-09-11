// Framework C++

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/* faça um programa que leia um numero inteiro e informe se ele é positivo, negativo ou zero.
*/

int main()
{								// INÍCIO DO PROGRAMA
		
// Declaração de variáveis 

 int numero;
 
 printf ('Digite um numero aqui');
 scanf ("%i",&numero);
 
 if (numero >0) {
 	printf("\n O múmero %i é positivo! \n", numero)
 }
 else if (numero = 0) {
 		printf("\n O número é zero! \n")
 }
 else {
 	printf("\n O numero %i é negativo! \n", numero)
 }
	
	return 0;					// Fim dos comandos
	
}								// FIM DO PROGRAMA
