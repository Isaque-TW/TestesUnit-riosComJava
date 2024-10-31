# Testes Automatizados com Java

## Introdução

Este projeto demonstra como configurar e executar testes automatizados em Java, utilizando o JUnit e o Maven.

## Configuração do Ambiente

Para subir a aplicação em um terminal, como em um servidor na Amazon ou em uma ferramenta de Integração Contínua, é necessário adicionar o Maven Surefire Plugin.

1. **Acesse o terminal:**
    - Clique com o botão direito na pasta do projeto: `isaque@MacBook-Pro-de-Isaque automated-tests-with-java-isaque`.
    - Abra o terminal e use `ls` para listar os arquivos do diretório.

2. **Execute o Maven:**
    - Certifique-se de estar no diretório do `pom.xml` para executar o próximo comando:
   ```bash
   mvn package
Este comando compila e executa os testes, mas na verdade, apenas faz o build.

Rodando os Testes:
- Para executar os testes, use:
``` 
mvn test
```
Para pular os testes e rodar apenas a aplicação, utilize:
```
mvn package -Dmaven.test.skip=true
```
_______________________________________________________________________________________________________________________
### Testes Unitários
#### Criando Testes
Vamos criar um método para testar uma classe que realiza cálculos simples de matemática.

```@Test
void test() {
SimpleMath math = new SimpleMath(); // Definindo a instância
Double result = math.sum(6.2D, 2D); // Chama o SimpleMath, realiza a operação
Assertions.assertEquals(8.2D, result); // Verifica se o resultado está correto
}
```
_______________________________________________________________________________________________________________________
### Assertivas e Mensagens de Falha
As Assertion Messages ajudam a entender o que aconteceu no código em caso de falha. 
#### Utilize Lazy Assert Messages para economizar recursos, executando a função somente quando ocorre uma falha.

##### Nomenclatura de Testes Unitários
##### Para nomear os testes, siga este padrão:
```
@Test
void testSum_When_SixDotTwoIsAddedByTwo_ShouldReturnEightDotTwo() 
```
#### Para evitar nomes muito longos, utilize a anotação @DisplayName:
```
@DisplayName("Test 6.2 + 2 = 8.2")
```
_______________________________________________________________________________________________________________________
### BDD Style - Given, When and Then
#### O Behavior Driven Development (BDD) foca em critérios de aceitação. Cada teste deve seguir a estrutura:

- #### Given: Define o contexto inicial.
- #### When: Executa a ação.
- #### Then: Verifica o resultado.
### Exemplo de User Story
#### Título: Devoluções e trocas vão para o estoque.


#### Cenário 1: Itens devolvidos para reembolso devem ser adicionados ao estoque.

- #### Given: Um cliente comprou um suéter preto e há três no estoque.
- #### When: Ele devolve o suéter.
- #### Then: O estoque deve ter quatro suéteres pretos.

### Conclusão

#### A estrutura BDD e o uso de frameworks como Mockito ajudam a manter o código dos testes organizado, fácil de manter e entender.

## Ciclo de Vida dos Testes no JUnit 5

Quando executamos testes unitários no JUnit, por padrão, ele cria uma nova instância da classe de testes para cada execução. Isso significa que a ordem de execução dos métodos não é garantida e, na prática, é considerada aleatória. Para gerenciar melhor o ciclo de vida dos testes, o JUnit oferece métodos específicos para configurar e limpar recursos antes e depois dos testes, o que ajuda a manter o código organizado e modular.

### Anotações de Ciclo de Vida do JUnit

1. **@Test**: Uma anotação padrão que indica um método de teste unitário. Se um método não está anotado com `@Test`, ele é tratado como um método comum e não será executado como um teste pelo JUnit.

2. **@BeforeAll**: Executa o método antes de todos os testes da classe. Geralmente, é usado para configuração inicial, como a criação de um banco de dados ou a configuração de recursos que precisam estar prontos antes de qualquer teste. Esse método deve ser estático.

3. **@AfterAll**: Executa o método após todos os testes da classe. É usado para limpeza final, como excluir ou fechar recursos que foram configurados no `@BeforeAll`. Assim como o `@BeforeAll`, esse método também deve ser estático.

4. **@BeforeEach**: Executa o método antes de cada teste individual na classe. Ideal para inicializar objetos ou definir pré-condições comuns a todos os testes, evitando duplicação de código nos métodos de teste.

5. **@AfterEach**: Executa o método após cada teste individual. Usado para limpar recursos alocados durante o teste, como fechar conexões com bancos de dados ou limpar dados temporários.

### Exemplo de Ciclo de Vida dos Testes no JUnit

O diagrama a seguir ilustra como cada uma das anotações de ciclo de vida se relaciona com os testes:

1. **@BeforeAll**: Executado uma única vez antes de todos os testes unitários.
2. **@BeforeEach**: Executado antes de cada método de teste.
3. **@Test**: O método principal que contém a lógica do teste.
4. **@AfterEach**: Executado após cada método de teste.
5. **@AfterAll**: Executado uma única vez após todos os testes unitários.

### Exemplo de Uso das Anotações

```java
@BeforeAll
static void setUpAll() {
    // Configurações iniciais, como a criação de um banco de dados
}

@BeforeEach
void setUp() {
    // Configurações para cada teste, como instanciar objetos necessários
}

@Test
void testExample() {
    // Teste unitário usando a lógica e as variáveis configuradas no setup
}

@AfterEach
void tearDown() {
    // Limpeza após cada teste, como fechar conexões de banco de dados
}

@AfterAll
static void tearDownAll() {
    // Limpeza final, como excluir o banco de dados
}
________________________________________________________________________________________________________________________
```

###### Ao seguir essas práticas e usar o ciclo de vida do JUnit, podemos organizar melhor nossos testes e garantir que todos os recursos estejam configurados e liberados de maneira eficiente e segura.

