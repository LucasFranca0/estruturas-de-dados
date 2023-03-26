# Estrutura-de-dados

Repositório para documentar meu aprendizado em estruturas de dados, tanto teorico quanto prático e também pequenos projetos para fixação do conteúdo. Utilizei algumas imagens para fins de estudo do módulo de Estrutura de dados do Bootcamp Banco PAN Java Developers da Digital Innovation One.

## Tópicos:

- Nó
- Pilha
- Fila
- Lista encadeada
- Lista duplamente encadeada
- Lista circular

## Nó

Ele é um espaço em memória que armazena tanto um **dado** que queremos armazenar tanto uma **referência** **para outro Nó**.

![download](https://user-images.githubusercontent.com/111810585/219543806-a1204f7d-2a06-4bbe-92e1-d19a6671db55.png)
![Captura de Tela (53)](https://user-images.githubusercontent.com/111810585/219546197-91125ca3-05ac-4d12-b941-721077c5e3d3.png)

## Conceito de Nó

Na memória ram, quando você cria uma variável, ela é armazenada em uma região da memória que representará o valor da variável por bits/byte

A memória ram possui algumas regiões onde são armazenadas temporariamente nossas variáveis. Uma variável do tipo primitivo ela armazena um valor, por isso é uma variável do tipo valor. Já um variável do tipo Classe, é chamada tipo referência pois a variável irá armazenar um endereço de memória que apontará para um Objeto. Ou seja, a variável em si, não é um objeto, mas sim uma referência para um Objeto, por exemplo:

![boxing_unboxing](https://user-images.githubusercontent.com/111810585/219544246-cc121629-3229-4ba7-8a9d-38269c424c4b.jpg)


Se eu tiver uma variável do **tipo Classe** **Funcionário** chamada **funcionario1**, essa variável **funcionário1** terá uma referência para o **Objeto Funcionario**. E se eu fizer uma outra variável chamada **funcionario2** e falar que ela recebe o **funcionario1**, então esta variável terá a mesma referência da **funcionário1** e as duas apontam para o mesmo Objeto. Ou seja, se eu alterar o objeto em qualquer uma das duas variáveis, então quando eu chamar o objeto em qualquer uma das duas terá o mesmo resultado da  operação.

No caso da variável tipo valor, ela é armazenada como uma **"caixa"** que recebe o valor da variável na região da memória chamada **Stack**, já uma variável do tipo valor é armazenada na região **Stack** como um **ponteiro** que guarda um **endereço** **de** **memória** que apontará para um **Objeto** na região da memória chamada **Heap**.


# Pilha

**O último item que foi colocado é sempre o primeiro a sair. É sempre manipulado do último elemento**  

- **LIFO**
- **Last in First Out**
- **O último elemento que entra é o primeiro a sair**

![download](https://user-images.githubusercontent.com/111810585/219546379-cf1a6d2b-d944-4c53-8aa1-310978d13431.png)


## Estrutura da Pilha

- **A referência do segundo aponta para o primeiro, o terceiro para o segundo e por ai vai...**
- **Tem uma referência de entrada que aponta para o topo da pilha**
- **O primeiro Elemento aponta pra Null**

****

# Fila

- **FIFO**
- **First in First Out**
- **O primeiro elemento que entra é o primeiro a sair**
![Captura de Tela (59)](https://user-images.githubusercontent.com/111810585/219547080-fa7640d6-e39f-4485-835f-dd2b67bd14bb.png)
****
# Estrutura da Lista Encadeada

- **A referência de entrada da Lista aponta para o primeiro Nó que aponta para o segundo... e o último aponta para Null, ou seja, aponta para ninguém**
- **E tem uma referência de Entrada na Lista que aponta para o primeiro Nó**

![Captura de Tela (72)](https://user-images.githubusercontent.com/111810585/219547424-095d758f-9680-42d1-b184-0ba220d3f762.png)
****
## Nó da Lista Duplamente Encadeada

- **Cada Nó tem duas referências uma ao Nó anterior e outra ao Nó posterior**
- **E a lista tem duas referências, uma para o primeiro nó e outra para o último nó**

![download](https://user-images.githubusercontent.com/111810585/219826461-552e75ab-6fba-4ee4-b37d-b355c76ba869.png)
****

## Estrutura da Lista Circular

- **O último Nó aponta para o primeiro Nó da Lista, assim fazendo um círculo**

![Captura de Tela (73)](https://user-images.githubusercontent.com/111810585/219826611-c19dc827-5be2-465c-93d1-7726839503c7.png)
