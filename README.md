## 💻 Sobre o projeto

FórumHub é uma API REST desenvolvida em Spring Boot para um fórum de discussão, permitindo a criação, listagem, atualização e exclusão de tópicos.

---

## ⚙️ Funcionalidades

- [x] CRUD de tópicos;
- [x] Validação de tópicos duplicados (mesmo título e mensagem);
- [x] Verificação de ID ao detalhar um tópico.

---

## 🎥 Demonstração

Aqui está um vídeo demonstrativo do projeto:

[Assista ao vídeo demo](https://github.com/LaviniaBDantas/ForumHub/assets/104510782/e87d4f80-f9cb-4ebc-988d-f3a9c1903e1d)

---

## 🛠 Tecnologias

As seguintes tecnologias foram utilizadas no desenvolvimento da API Rest do projeto:

- **[Java 17](https://www.oracle.com/java)**
- **[Spring Boot 3](https://spring.io/projects/spring-boot)**
- **[Spring Security](https://spring.io/projects/spring-security)**
- **[JWT (JSON Web Token)](https://jwt.io)**
- **[Maven](https://maven.apache.org)**
- **[MySQL](https://www.mysql.com)**
- **[Hibernate](https://hibernate.org)**
- **[Flyway](https://flywaydb.org)**
- **[Lombok](https://projectlombok.org)**

---

## 🔒 Autenticação

Para interagir com a API, é necessário autenticar-se. Implementamos um sistema de autenticação utilizando tokens JWT (JSON Web Token):

- Acesse a rota [http://localhost:8080/login](http://localhost:8080/login) para obter um token JWT válido.
- O token JWT deve ser incluído no cabeçalho de autorização de todas as requisições subsequentes.
- Utilize a biblioteca JWT.io para gerenciar tokens JWT na sua aplicação.

---

## 📄 Documentação

A estrutura das funcionalidades da aplicação pode ser acessada em: [Trello - ForumHub](https://trello.com/b/OKIUKgxe/alura-f%C3%B3rum-challenge-one-sprint-01)

---

## 🏗️ Funcionalidades Opcionais

- Implementação de rotas adicionais para gerenciamento de usuários e respostas: `/usuario`, `/respostas`.
- Documentação interativa da API utilizando Swagger.

---

## 🏛️ História

Bem-vindo ao desafio Challenge Back End!

Um fórum é um espaço onde todos os participantes de uma plataforma podem colocar suas perguntas sobre determinados assuntos.

Já sabemos para que serve o fórum e sabemos sua aparência, mas sabemos como ele funciona por trás dos panos? Isto é, onde se armazenam as informações? Como são tratados os dados para que se relacione um tópico com uma resposta, ou como se relacionam os usuários com as respostas de um tópico?

Este é o nosso desafio, chamado de FórumHub: nele, vamos replicar este processo no nível do back end e, para isso, criaremos uma API REST usando Spring.

Nossa API se concentrará especificamente nos tópicos, e deve permitir aos usuários:

- Criar um novo tópico;
- Mostrar todos os tópicos criados;
- Mostrar um tópico específico;
- Atualizar um tópico;
- Eliminar um tópico.

É o que conhecemos normalmente como CRUD (CREATE, READ, UPDATE, DELETE)* e é muito parecido com o que desenvolvemos no LiterAlura, mas agora de forma completa, agregando as operações de UPDATE e DELETE, e usando um framework que facilitará muito o nosso trabalho.

*Tradução livre (em ordem): Criar, Consultar, Atualizar e Deletar.

Em resumo, nosso objetivo com este challenge é implementar uma API REST com as seguintes funcionalidades:

- API com rotas implementadas seguindo as melhores práticas do modelo REST;
- Validações realizadas segundo as regras de negócio;
- Implementação de uma base de dados relacional para a persistência da informação;
- Serviço de autenticação/autorização para restringir o acesso à informação.

---

## 📝 Licença

Projeto desenvolvido por [Lavínia Barbosa](https://github.com/LaviniaBDantas). Utilizado como aprendizado nos cursos de Spring Boot da Alura.

---