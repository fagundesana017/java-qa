# Relatório de Testes

## 1. Testes de Caixa Preta

### Objetivo
Testar o fluxo de cadastro de usuário via Swagger sem conhecer o código do sistema.

### Problemas Encontrados
- O Swagger não exibia os dados necessários para realizar o cadastro do usuário.
- O campo do token não estava visível para autenticação.
- Não era possível cadastrar no banco devido a erros de configuração.

### Ações Realizadas
- Alteração no arquivo `SwaggerConfigurations` para exibir:
  - Campo do token.
  - Campos de entrada do usuário na requisição.
- Ajuste no arquivo `application.properties`:
  - Corrigida a connection string para conectar com o banco de dados *cleberleao_oficina* (a instância do banco de dados e o nome do servidor.).
  - Corrigido o nome do usuario do banco de dados.

## 2. Testes de Caixa Branca

### Objetivo
Testar o comportamento interno das classes de serviço (`Service`) com conhecimento do código-fonte.

### Classe Testada: `AutenticacaoService`

### Problema Encontrado
- Erro no método `getEmail()`, que estava inexistente no Service `AutenticacaoService`.
- Erro no metodo `getPassword()`, que estava inexistente no Service `UserService`.
- Erro no método `getId()`, que estava inexistente do Service `TokenService`

### Ação Realizada
- Criação e implementação do método `getEmail()` para solucionar o erro e permitir o funcionamento correto .
- Criação e implementação do método `getPassword()` para solucionar o erro e permitir o funcionamento correto .
- Criação e implementação do método `getId()` para solucionar o erro e permitir o correto funcionamento da autenticação.

## Conclusão

As correções permitiram:
- Exibição correta dos campos no Swagger.
- Cadastro de usuários diretamente pela interface do Swagger.
- Funcionamento correto da autenticação e inserção de usuarios no dados no banco (DBeaver).
