# SCORE WIZARD

<h1>Projeto Integrador 3º Semestre BD - Grupo Java Hype</h1>

![img1_javahype](/uploads/3af170f1cf52220384ad369aaf783563/img1_javahype.jpg)<h1> Em parceria com ![img_spc](/uploads/6857783e3815331197ff74e74a95a480/img_spc.png)</h1>


# VISANDO SEU SCORE!!

<h5>Em parceria com o SPC, trazemos aqui uma inovadora aplicação, a Score Wizard.</h5>



A Score Wizard veio para facilitar, onde qualquer consumidor contribuinte poderá cadastrar seu acesso e consultar seus dados, com previsões e análises, sendo pessoa física ou jurídica.


# DIFERENCIAIS DO SCORE WIZARD
Itens que serão os diferenciais da aplicação:

 * Cadastro e acesso extremamente rápido e fácil;
 * Análise automática de possíveis motivos de baixo score;
 * Análise do que seria necessário realizar para melhorar score;
 * Média de pontos por idade;
 * Compensador de contas (mostrar ao usuário quais contas precisam de mais atenção);


# ARQUITETURA

 * MySql Community;
 * Java 1.8;
 * Spring 2.3.0;
 * Maven/Gradle;
 * Hibernate; 
 * Bootstrap 4;
 * Html5;
 * JavaScript;
 * CSS;
 
# INTEGRANTES

 * SABRINA RAFAELA CALADO MARIANO (Product Owner)
 * GABRIEL DE QUEIROZ CORDEIRO
 * ARTHUR CARDOSO RINALDI DA SILVA 
 * GUSTAVO RIBEIRO DOS SANTOS 
 * GIOVANNI GUIDACE MARASSI TANURI (Master)

# CRONOGRAMA DE ENTREGA - SCORE WIZARD

  * Entregas Sprint 0:

        - Visão do Produto;

        - Requisitos funcionais e não funcionais;

        - Diferenciais do Score Wizard;

        - Levantamento de Arquitetura;

        - User Story;

        - Wireframe;

        - Backlog;

        - Analise completa do que compõe o Score;

  * Entregas Sprint 1:
  
        - BurnDown;

        - Modelo conceitual (Dataset);

        - Modelo lógico (Dataset);

        - Tela de Login (Front-End); 

        - Cadastro de acesso (Front-End); 

        - DashBoard (Front-End);

        - Models (Back-End);

        - Fluxograma;

        - Caso de Uso;


      Burndown sprint 1:

      
![Captura_de_tela_em_2020-10-18_16-41-46](/uploads/6be50d0bbc703de5286db001f700ecba/Captura_de_tela_em_2020-10-18_16-41-46.png)



  * Entregas Sprint 2:

        - BurnDown;

        - Tela de acesso (Login) integrado ao Back-End;

        - DashBoard integrado ao Back-End;

        - Cadastro de acesso integrado ao Back-End;

        - Tela de DashBoard para o SteakHolder (Front-End);

        - Tela de acesso privativo aos SteakHolders (Front-End);

        - Deploy Heroku;

        - Documentação aplicação - Parte 1/2

  * Entregas Sprint 3 (Final):

        - BurnDown;

        - Tela de DashBoard dos SteakHolders integrada ao Back-End;

        - Tela de acesso privativo dos SteakHolders integrada ao Back-End;

        - Deploy Heroku;
        
        - Documentação aplicação - Parte 2/2

 # ENTENDA O QUE COMPÕE O CÁLCULO DO SCORE:


![](/uploads/9c3fa75408db5c3b2b61ba930b8bad3e/notion.png)<h1>[Clique aqui](https://www.notion.so/Entenda-o-que-comp-e-o-c-lculo-do-Score-1348e1d22dbb49098a775e9d973c86e4)</h1>

#


# VISÃO DO PRODUTO

O SPC, em parceria com os alunos do 3º semestre do curso de Banco de Dados da Fatec de SJC, necessita de um software para obter uma análise estatística da evolução do consumidor em relação ao histórico de pagamentos e também da evolução da nota de score. Esse software é usado por qualquer pessoa física ou jurídica, que possua cadastro positivo e que, ao utilizá-lo, espera melhorar seu score de uma forma melhor do que as outras alternativas existentes no mercado. Espera também, obter dados de sua evolução financeira, afim de contribuir para uma melhora de seu score, e, possivelmente, efetuar novas solicitações de crédito para as instituições financeiras.


# REQUISITOS FUNCIONAIS E NÃO FUNCIONAIS

<h3>Requisitos Funcionais:</h3> 

De acordo com o Setor de Negócio/MVP sugerido, verificar as possibilidades de cadastros e relatórios;

• Importação e tratamento de dados disponibilizados devem ser utilizados.

• Poderão utilizar de outras fontes de dados para compor produto

• Sistema deve possibilitar o registro de novos usuários no sistema de cadastro positivo,
assumindo-se perfis diferentes como os dois exemplos abaixo, mas não limitando-se a este:

    - Empresas que têm o objetivo de consulta do cadastro positivo de consumidores e seu score de crédito  
    - Consumidores que desejam consultar seu score de crédito, histórico de pagamentos e também revogar o acesso de alguma empresa



<h3>Requisitos Não Funcionais:</h3>

• Linguagem de Programação e Stack Java (requisito Fatec);

• Banco de Dados Relacional (requisito Fatec);

• Documentações do produto;

• Plano de negócio (forma de venda e monetização da informação);

• Sistema estruturado para tratar grandes volumes de dados;

• Regras de negócio parametrizáveis para adequação de forma rápida a novas normas;

• Camadas de integração explicitas no projeto;

• Atender à Legislação do Cadastro Positivo;

• As informações devem ser apresentadas de forma organizada, amigável e intuitiva;

• Os relatórios não poderão apresentar informações pessoais, confidenciais e sigilosas;



 # BACKLOG


![Captura_de_tela_de_2020-09-25_16-14-46](/uploads/a889bd8eb61d6e422d5771247640f801/Captura_de_tela_de_2020-09-25_16-14-46.png)



<h3>Lista de requisitos (BackLog):</h3>

- Calcular e demonstrar baixo score;
- Prever o que poderia melhorar o score;
- Informar boas práticas de forma dinâmica para obter um bom score;
- Decisão de escolher se aceita ou não Score;
- Cadastro de acesso pessoa física e jurídica;
- Prever o futuro do score;
- Mostrar visualmente o que compõe o score;

- Se já foi negativado ou não;
- Ajuda financeira;
- Opção de sistema mobile;
- Envio de e-mail com detalhes do score;
- Envio de sms;
- Porcentagem de probabilidade de aprovação de crédito;
- Pontos negativos;
- Pontos positivos;
- Telas fáceis de manusear;
- Telas com resultados já calculados;
- Disponibilizar download de relatórios em PDF;
- Média de pontos por idade;
- Compensador de contas (mostrar ao usuário quais contas precisam de mais atenção);

<h3>Para o SPC:</h3>

- Mostrar quantidade de acesso;
- Mostrar análises efetuadas de clientes que fizeram acesso;
- Gerar relatórios estatísticos para uma visão ampla do que o sistema entrega;
- Gerar relatório de quantidade de scores altos e baixos;
- Filtrar clientes com baixo score;
- Filtrar clientes com alto score;
- Quantidade de cadastros de acesso por período;

#

# USER STORY
![Untitled_Diagram](/uploads/94085ee0bc7062af878b22eeeb220407/Untitled_Diagram.png)

![img2_1_](/uploads/08fb69458dce5b181a2d96f9e95ba45a/img2_1_.png)

![Untitled_Diagram_3_](/uploads/548b9ab94b5d43563e28650ea36be486/Untitled_Diagram_3_.png)

#

# WIREFRAME

Tela de Login

![Captura_de_tela_em_2020-09-27_20-28-08](/uploads/f0d0152d475010989b3c10a330010f26/Captura_de_tela_em_2020-09-27_20-28-08.png)

#

DashBoard


![Captura_de_tela_em_2020-09-27_20-27-21](/uploads/d44c55e0a3cb090ea842639d9581f99f/Captura_de_tela_em_2020-09-27_20-27-21.png)

#
Cadastro de acesso


![Captura_de_tela_em_2020-09-27_20-26-59](/uploads/269b7879380546c8d80610cdb840641d/Captura_de_tela_em_2020-09-27_20-26-59.png)

#

# CASO DE USO - SCORE WIZARD 


![CASO_DE_USO_-_SCORE_WIZARD__3_](/uploads/f20e716a081edc21bbe86301d5f21a81/CASO_DE_USO_-_SCORE_WIZARD__3_.png)

#

# MODELAGEM DE BANCO DE DADOS

 * Modelo Conceitual

![WhatsApp_Image_2020-10-19_at_20.19.18](/uploads/942c0cdae25e731f61bbf70d64544f5b/WhatsApp_Image_2020-10-19_at_20.19.18.jpeg)

* Modelo Lógico


![WhatsApp_Image_2020-10-20_at_19.00.14](/uploads/15fc1d1f1914f30d4f20ee70bc96e728/WhatsApp_Image_2020-10-20_at_19.00.14.jpeg)

#

# FLUXOGRAMA 


 * ### CADASTRO DE PESSOA FÍSICA

![Untitled__1_](/uploads/3dc6e9a6d03dca035a3b373b50abfaff/Untitled__1_.png)

#

 * ### CADASTRO DE PESSOA JURÍDICA

 ![Untitled__2_](/uploads/55a603700a82f9c5ac6240ec6d2a3ae9/Untitled__2_.png)

 #

 * ### LOGIN

![Untitled__3_](/uploads/4d96ffa0717698e3700ac27f83767739/Untitled__3_.png)

 #

 * ### BAIXAR ESTATÍSTICAS DO SISTEMA PARA O SPC EM PDF

![Untitled__4_](/uploads/91bcb7777b90ee80544c38a6fa0d2211/Untitled__4_.png)

