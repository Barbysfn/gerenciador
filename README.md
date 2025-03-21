# Gerenciador de Tarefas

### 📜 **Sobre o Desafio**

Este projeto tem como objetivo o desenvolvimento de um gerenciador de tarefas. A aplicação permite que os usuários criem, editem e excluam tarefas, além de gerenciar seu status de forma simples e eficiente. A solução foi construída utilizando Java, JSF, JPA (Java Persistence API), Hibernate e PostgreSQL.



https://github.com/user-attachments/assets/e6c54c4f-e1b9-4177-884e-ad9894319b59



-------------------------------------
### ⚙️ **Pré-requisitos**
Para rodar o projeto localmente, é necessário que as seguintes ferramentas estejam instaladas:

- **Java**: Para compilar e rodar o código.
- **Maven 3.x**: Para gerenciamento de dependências e build do projeto.
- **PostgreSQL**: Banco de dados utilizado para persistir as informações.
- **IDE** (IntelliJ IDEA, Eclipse, ou similar): Para facilitar o desenvolvimento e execução do projeto.

Além disso, é necessário configurar o banco de dados com as credenciais que podem ser encontradas no arquivo `persistence.xml`.

-------------------------------------
### 🛠️ **Tecnologias Usadas**
- **Java 1.8**: Linguagem de programação utilizada no backend.
- **JPA (Java Persistence API)**: Para mapeamento objeto-relacional e comunicação com o banco de dados.
- **Hibernate**: Framework para implementar a JPA.
- **PostgreSQL 15**: Banco de dados relacional utilizado para armazenar as tarefas.
- **Maven**: Para gerenciamento de dependências e automação de build.
- **Apache Tomcat 9.0.102**: Servidor de aplicação utilizado para hospedar e executar a aplicação web.
- **IntelliJ IDEA**: IDE utilizada para o desenvolvimento do projeto.

---------------------------------
### ▶️ **Testes Implementados**

O _TarefaServiceTest_ é responsável por validar o serviço de criação de tarefas (_TarefaService_). Este teste garante que o método criarTarefa está funcionando corretamente, criando uma instância de tarefa com título e descrição fornecidos.

**Importância do Teste**:

- <ins>Confiabilidade</ins>: Garante que a funcionalidade de criação de tarefas está correta.

- <ins>Prevenção de Erros</ins>: Detecta problemas na lógica antes de chegar ao ambiente de produção.

- <ins>Manutenção</ins>: Facilita a manutenção do código, garantindo que mudanças futuras não quebrem funcionalidades existentes.

O que o Teste Verifica:
- A tarefa criada não é nula.
- O título da tarefa é "Nova Tarefa".
- A descrição da tarefa é "Descrição da Tarefa".

✅ **Os testes foram bem-sucedidos, validando os comportamentos esperados nas principais funcionalidades do TarefaService.**

--------------------------------------


🚀 **Contribuições** são sempre bem-vindas! Se você encontrou algum erro ou gostaria de sugerir melhorias, fique à vontade para abrir uma *issue* ou enviar um *pull request*. :)
