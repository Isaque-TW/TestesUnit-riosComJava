# Automated Tests with Java

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


