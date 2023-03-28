# Gerenciador-de-quadras
 Sistema para fazer o gerenciamento de quadras esportivas

 
 Este sistema foi criado com intuito de automatizar o processo de cadastro e controle das locações de uma empresa fictícia de locação de quadras esportivas.
 Neste sistemas são manipuladas informações das quadras, dos locatários e das locações realizadas.

 Funcionalidades:

- Cadastro de Quadra - método que faz a leitura e armazena os dados no objeto.
- Cadastro de Locatário - método que faz a leitura e armazena os dados no objeto.
- Locatário Maior de Idade - método que verifica se o usuário é maior de idade ou faz 18 anos no ano corrente.
- Cálculo de Locação - método que multiplica o valor do minuto da quadra, pela quantidade de minutos da locação
    - Regras adicionais
   	 - Para mais de 2 horas completas (120 minutos) de locação, adiciona 10% de desconto no valor do minuto;
   	 - Caso o locatário necessite de equipamento adiciona o valor de 50 reais no valor final da locação.
- Mostrar Resumo Locação - método que pega todos os dados de locação e escreve na tela, exemplo:
   	 
   	 Nome: Rogério
   	 CPF: 111.111.111-22
   	 Telefone: (21) 1234-1234
   	 Ano de Nascimento : 1985
   	 Nome da Quadra: Areia 1
   	 Tipo : Areia
   	 Valor do Minuto: 5
   	 Tempo em Minutos: 60
   	 Necessita Equipamento: S
   	 Valor Calculado: 350

Cadastro de Locação - Este método é onde tudo acontece, segue as seguintes regras
   	- Chama o método cadastrar quadra
   	- Chama o método cadastrar locatário
   	- Chama o método verifica idade, se for de menor, finalizar o programa informando que o locatário é de menor.
   	- Faz leitura do tempo em minutos da locação e se necessita equipamento (S - Sim, N - Não)
   	- Chama o método mostrar resumo locação

Esta é a versão inicial do projeto e não possui quaisquer tratativas de erro embora futuramente serão implementadas.
