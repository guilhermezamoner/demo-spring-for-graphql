# Descrição

%{source_branch} -> %{target_branch}

## O que esse Merge Request faz e por quê?

Tarefa do JIRA Relacionado: [#123](https://...)

[comment]: # (Descreva em detalhes o que sua solicitação de mesclagem faz e por quê)

## Tipo de mudança:
[comment]: # (Remover opções abaixo não relevantes ao MR)
- [ ] ``fix`` (mudanças sem quebra de compatibilidade que resolve um problema)
- [ ] ``feat`` (mudanças que incluem novas funcionalidades)
- [ ] ``refactor`` (mudanças com refatoração de código sem impacto nas regras de negócio)
- [ ] ``docs`` (mudanças na documentação do projeto)
- [ ] ``chore`` (mudanças de regras de desenvolvimento. Ex: spotless, .gitignore, etc..)
- [ ] ``build`` (mudanças que afetam o processo de build ou dependências)
- [ ] ``test`` (mudanças criando ou alterando códigos de teste)
- [ ] ``perf`` (mudanças de melhora de performance)
- [ ] ``ci`` (mudanças nos arquivos de configuração de CI)
- [ ] ``revert`` (mudança com reversão de um commit anterior)

## Como posso testar? 
[comment]: # (Descrever abaixo como realizar os testes manuais quando possível, incluíndo evidências do funcionamento ou comandos necessários para a execução dos testes)

```sh
curl https://google.com.br
```

## Checklist: 

- [ ] O branch está atualizado com o ``main``
- [ ] Meus commits seguem as boas práticas de [Conventional Commits](https://www.conventionalcommits.org/en/v1.0.0/#specification)
- [ ] As alterações estão cobertas por testes de unidade ou integração
- [ ] Foram realizados os testes no ambiente de QA
- [ ] O Quality gate do [SonarQube](https://sites) foi atendido
- [ ] Após a análise do [SonarQube](https://sites), o merge request não gerou issues a serem corrigidas, como: bug, vulnerabilidade, débito técnico, duplicação, novo código sem cobertura, etc..
- [ ] As boas práticas de [Segurança de informação foram adotadas](https://sites)
