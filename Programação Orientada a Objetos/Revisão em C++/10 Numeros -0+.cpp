// Framework C++

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/* leia 10 numeros inteiros e ao final informe a qtdd de positivos, negativos e zeros;
*/

int main()
{								// INÍCIO DO PROGRAMA

int i; num;
int NumPos =0 ; NumZero =0; NumNeg=0;

for (i=1; i<=10; i++) {
	printf(" Digite o numero:  %i",&num);
	scanf("%i", &num)
	
	if (num>0) {
		NumPos++
	}
	else if (num=0){
		NumZero++
	}
	else {
		NumNeg
	}
	
	printf ("Quantidade de positivos: %i\n", NumPos);
	printf ("Quantidade de zeros: %i\n", NumZero);
	printf ("Quantidade de negativos: %i\n", NumNeg);

	
	return 0;
}