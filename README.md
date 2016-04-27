#AED III - Algoritmos de Ordenação
>Instituto Federal de Ciência e Tecnologia de Minas Gerais (IFMG), Campus Sabará

Resumo. Utilizando a linguagem Java, este trabalho apresenta comparações de forma prática entre os vários algoritmos de ordenação. 
##1. Informações Gerais
Os algoritmos a serem comparados são: BubbleSort, InsertionSort, SelectionSort, QuickSort e MergeSort. 

Para os testes, todos os conjuntos de dados foram criados de forma aleatória (usando a biblioteca ‘java.util.Random’ e sempre com a seed igual a 1) e com tamanho variando de dez elementos a um milhão, todos do tipo Inteiro.
##2. Implementação
A classe de Teste foi a primeira a ser construída, já que ela possibilitaria um desenvolvimento mais prático das demais classes. 

Os algoritmos de ordenação foram feitos em arquivos separados, melhorando a organização do código. Além disso, todos eles(algoritmos) herdam da classe Algoritmo, tornando possível a existência de apenas um método de testes para todos, de forma a evitar repetição de código.
##3. Testes
Os testes foram divididos em três etapas principais. Na primeira, o array de tamanho 100 foi impresso após ser ordenado, além de mostrar o tempo de execução. Já na segunda e terceira etapa, apenas o tempo foi exibido devido a inviabilidade de imprimir arrays com mais de 10.000 elementos.
##4. Resultados
A partir dos dados de entrada, cada algoritmo teve determinado desempenho, que foi obtido através do tempo médio de 5 execuções. 

É importante destacar que apenas um resultado de cada etapa estará listado abaixo, porém a análise dos dados considerou resultados de todos os testes.

###4.1. Primeira Etapa: Array de tamanho 100
* Algoritmo ->  Tempo médio de execução
* BubbleSort -> 0.0065 segundos
* SelectionSort -> 0.00195 segundos
* InsertionSort -> 0.00119 segundos
* QuickSort -> 0.00095 segundos
* MergeSort -> 0.0015 segundos

###4.2. Segunda Etapa: Array de tamanho 50.000
* Algoritmo ->  Tempo médio de execução
* BubbleSort -> 6.5 segundos
* SelectionSort -> 1.3 segundos
* InsertionSort -> 0.42 segundos
* QuickSort -> 0.005 segundos
* MergeSort -> 0.01 segundos

###4.3. Terceira Etapa: Array de tamanho 1.000.000
* Algoritmo ->  Tempo médio de execução
* BubbleSort -> 2190 segundos
* SelectionSort -> 345 segundos
* InsertionSort -> 144 segundos
* QuickSort -> 0.15 segundos
* MergeSort -> 0.33 segundos

##5. Avaliação dos Algoritmos

###5.1. BubbleSort
Foi o algoritmo que se  comportou de pior forma em todas as situações. Precisou de quase 35 minutos para ordenar um array de tamanho 1 milhão, enquanto o QuickSort o fez em um décimo de segundo.
É bastante utilizado em situações em que performance não importa, já que é o algoritmo de ordenação com a implementação mais simples.

###5.2. SelectionSort
Em todos os testes, este algoritmo superou o BubbleSort. Para arrays com tamanhos reduzidos, superou o InsertionSort. Porém na maioria dos testes, foi o segundo pior algoritmo, segundo o desempenho apresentado. 
O BubbleSort tem sempre a complexidade de O(n²),  portanto apesar de estável e previsível, é bastante custoso, principalmente para arrays muito grandes.

###5.3. InsertionSort
Para arrays muito grandes, este algoritmo superou o SelectionSort. Porém teve um desempenho extremamente abaixo dos demais (MergeSort e QuickSort).
A complexidade deste algoritmo pode variar, O(n) no melhor caso e O(n²) no pior caso e médio caso.

###5.4. QuickSort
Obteve os melhores resultados. Sempre superou todos os outros algoritmos, com folga. 
Apesar de ter complexidade de O(n²) em seu pior caso, possui complexidade de O(n log n) no caso médio. Fato este que torna o QuickSort um dos melhores algoritmos de ordenação, em termos de performance. 

###5.5. MergeSort
É um algoritmo extremamente popular, usa a recursividade além do método chamado de “divisão e conquista”. Apesar de chegar a resultados próximos ao QuickSort, não obteve resultados superiores ao mesmo. De forma geral, foi os segundo algoritmo mais eficiente.
Em seu pior caso chega a ter complexidade de O(n log 2n), mas na maioria das vezes a complexidade não passa de O(n log n), por isso o MergeSort é considerado extremamente eficiente.
















