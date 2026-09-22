#include <stdio.h>

//Função opcionalmente inverte o vetor e depois soma os valores positivos nos primeiros 'limite' elementos
//Exemplos de entrada e saida:
//v = {1, -2, 3, 4}, n = 4, limite = 3, inverter = 0 -> Saida: 4
//v = {1, -2, 3, 4}, n = 4, limite = 3, inverter = 1 -> Saida: 7
int processar_valores(int v[], int n, int limite, int inverter) {
    int soma = 0;
    int inicio = 0, fim = n - 1;

    //Inverte o vetor se o parametro inverter for verdadeiro
    if (inverter) {
        while (inicio < fim) {
            int tmp = v[inicio];
            v[inicio] = v[fim];
            v[fim]   = tmp;
            inicio++;
            fim--;
        }
    }

    //Percorre ate 'limite' (ou n) e acumula apenas os valores positivos
    for (int i = 0; i < limite && i < n; i++) {
        if (v[i] > 0)
            soma += v[i];
    }

    //Retorna a soma dos positivos encontrados
    return soma;
}
