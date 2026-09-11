// Framework C++

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/* leia dois numeros inteiros e mostre qual deles é o maior. Caso sejam iguais, informe que os números são iguais.
*/

int main()
{								// INÍCIO DO PROGRAMA
		
// Declaração de variáveis 

 int num1; num2;
 
 printf ("Digite o primeiro número: ");
 scanf ("%i",&num1);
 printf ("Digite o segundo número: ");
 scanf("%i", &num2);
 
 if (num1 > num2) {
 	printf("\n %i é maior que %i \n", num1;n um2);
 }
 else if (num1 < num2) {
 		printf("\n O %i é maior que %i \n", num2; num1);
 }
 else {
 	printf("\n Os números são iguais! \n");
 	printf("\n O numero %i é negativo! \n", numero);
 }
	
	return 0;					// Fim dos comandos
	
}								// FIM DO PROGRAMA
 