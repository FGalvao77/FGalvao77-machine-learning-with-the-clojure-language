# Projeto de Classificação com Clojure

Este é um projeto de exemplo que demonstra como construir um classificador de aprendizado de máquina usando a linguagem Clojure e bibliotecas do ecossistema Scicloj. O projeto utiliza o famoso dataset Iris para treinar um modelo Random Forest e avaliar sua acurácia.

## Pré-requisitos

Antes de começar, garanta que você tenha as seguintes ferramentas instaladas:

- **Java (JDK 11 ou superior)**
- **[Clojure CLI Tools](https://clojure.org/guides/getting_started)**
- **Git**
- **VS Code** (recomendado) com a extensão **[Calva](https://calva.io/)**.

## Configuração

1. Clone o repositório:
   ```bash
   git clone https://github.com/SEU-USUARIO/SEU-REPOSITORIO.git
   ```

2. Navegue até o diretório do projeto:
   ```bash
   cd meu-projeto-clojure
   ```

As dependências são gerenciadas pelo arquivo `deps.edn` e serão baixadas automaticamente na primeira execução.

## Como Executar

Existem duas maneiras principais de executar o código: através da linha de comando ou de forma interativa com o REPL no VS Code.

### Método 1: Linha de Comando

Você pode executar o script principal diretamente do seu terminal. Este comando irá carregar as dependências, compilar o código e executar a função `-main`.

```bash
clojure -M -m meu_projeto.core
```

A saída esperada será a acurácia do modelo:
```
Iniciando projeto de classificação com Clojure!
Acurácia do modelo: 96.66666666666667 %
```

### Método 2: Ambiente Interativo (REPL com Calva)

Esta é a forma recomendada para desenvolvimento em Clojure, pois permite uma experiência interativa e avaliação de código em tempo real.

1.  Abra a pasta do projeto no VS Code.
2.  Inicie o REPL do Calva (Jack-in) com o comando `Ctrl+Alt+C Ctrl+Alt+J`.
3.  Abra o arquivo `src/meu_projeto/core.clj`.
4.  Com o REPL conectado, você pode avaliar o código. Para carregar o namespace atual no REPL, use `Ctrl+Alt+C Enter`.
5.  Para executar a função principal, digite na janela do REPL que apareceu:
    ```clojure
    (-main)
    ```

## Estrutura do Projeto

```
meu-projeto-clojure/
├── .gitignore         # Arquivos ignorados pelo Git
├── .vscode/           # Configurações do VS Code (Calva)
│   └── settings.json
├── deps.edn           # Definição de dependências do Clojure
├── README.md          # Este arquivo
├── resources/         # Datasets e outros recursos
│   └── dados_iris.csv
└── src/               # Código-fonte
    └── meu_projeto/
        └── core.clj   # Lógica principal do classificador
```

## Tecnologias Utilizadas

- **Clojure**: A linguagem de programação.
- **[tech.ml.dataset](https://github.com/techascent/tech.ml.dataset)**: Para manipulação de dados de forma eficiente.
- **[scicloj/smile.classification](https://github.com/scicloj/scicloj-smile)**: Wrapper da biblioteca Smile para algoritmos de classificação.
- **Calva**: Extensão do VS Code para desenvolvimento interativo em Clojure.
