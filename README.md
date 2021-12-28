# Catálogo de Fundos de Investimentos

## Descrição do Projeto

Um exemplo de implementação de API REST utilizando o framework Spring Boot.

## Configuração e execução

* Baixe o código-fonte
* Importe o projeto em uma IDE com suporte ao Maven
* Execute a aplicação

### Exemplos de requisições HTTP

> As instruções abaixo funcionam em um sistema Linux ou Unix. Se utiliza Windows, você conseguirá executar as mesmas instruções utilizando o [Git BASH][GB] ou se preferir uma interface gráfica pode utilizar o [Postman][PM].


#### Adicionar um recurso (método POST)

```bash
curl -v -H 'Content-Type:application/json' -d '{"nome" : "XYZ MULTI", "aplicacaoMinima" : 10000.00, "risco" : "ALTO", "categoria" : "MULTIMERCADOS", "taxaAdministracao" : 2.5, "gestor" : "XYZ ASSET"}' http://localhost:8080/fundos

curl -v -H 'Content-Type:application/json' -d '{"nome" : "XYZ DI", "aplicacaoMinima" : 5000.00, "risco" : "BAIXO", "categoria" : "RENDA_FIXA", "taxaAdministracao" : 0.5, "gestor" : "XYZ ASSET"}' http://localhost:8080/fundos

curl -v -H 'Content-Type:application/json' -d '{"nome" : "XYZ INFLAÇÃO", "aplicacaoMinima" : 1000.00, "risco" : "MEDIO", "categoria" : "RENDA_FIXA", "taxaAdministracao" : 0.5, "gestor" : "XYZ ASSET"}' http://localhost:8080/fundos
```

#### Atualizar um recurso (método PUT)

```bash
curl -v -X PUT -H 'Content-Type:application/json' -d '{"nome" : "XYZ DOLAR", "aplicacaoMinima" : 500.00, "risco" : "ALTO", "categoria" : "CAMBIAL", "taxaAdministracao" : 0.1, "gestor" : "XYZ ASSET"}' http://localhost:8080/fundos/3
```

#### Obter uma lista de recursos (método GET)

```bash
curl -v http://localhost:8080/fundos

curl -v http://localhost:8080/fundos?categoria=CAMBIAL

curl -v http://localhost:8080/fundos?risco=BAIXO

curl -v 'http://localhost:8080/fundos?risco=ALTO&categoria=MULTIMERCADOS'

curl -v 'http://localhost:8080/fundos?risco=ALTO&categoria=CAMBIAL'

curl -v 'http://localhost:8080/fundos?risco=MEDIO&categoria=CAMBIAL'
```

#### Obter um recurso com um ID específico (método GET)

```bash
curl -v -X GET http://localhost:8080/fundos/1

curl -v -X GET http://localhost:8080/fundos/3
```

#### Excluir um recurso (método DELETE)

```bash
curl -v -X DELETE http://localhost:8080/fundos/3
```


[GB]:https://gitforwindows.org/

[PM]:https://www.postman.com/