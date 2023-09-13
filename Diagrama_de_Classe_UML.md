<h1 align='center'> Diagrama de Classe UML </h1>

<h3 align='center'> Diagrama de classes trta da estrutura estática do sistema. </h3>

Objetivo: Descrever o que deve estar presente no sistema que você esta modelando, ou seja o que tem que eestar presente no sistema.

O que é um diagrama: É uma representação gráfica.

O que é uma classe: é a representação de um item do mundo real, seja ele um item físico ou abstrato, na forma de um tipo de dados personalzado.

Estruturas: as classes contém estruturas que podem ser atributos e métodos.

Atributos: são usados para armazenar dados dos objetos de uma classe.

Métodos: são as operações ou funções que a instância de classes pode executar, coisas que o sistema é capaz de fazer, ele pode não executar.

Objetos: são instância de classe, estamos falando de um item específico, um exemplar específico daquela classe, como por exemplo Classe Pessoa

Instânciar: pode ser visto com "Interligar" uma classe com a outra ou "Chamar" uma classe na outra.

Exemplo: Implementação de uma sistema onde pessoas são representadas.

Classe: Pessoa

Atributos: Altura, nome, idade, peso

Métodos: Andar, comer, falar, estudar, dormir, trabalhar.

Objeto da classe (Instância): Nome: Fábio, Altura: 1,75m, Idade: 42, Peso: 79kg.

Modificador de acesso: mostra a visibilidade + privado, # protegido, - privado, ~ pacote, / Derivado.

Parâmetros: Utilizado para método set.

O Diagrama é dividido em três compartimentos:
Classe, Atributos e Métodos.

Fromato: Retangulo dividido em três compartimentos.

Classe: Nome com Letra Maiúscula.

Atributos: Modificador de acesso nome:tipo = valor.

Métodos: Modificador de acesso Método (Parametros) : tipo_retorno/void.

Relacionamentos: São conecções entre os itens.

Multiplicidade É um valor numérico que determina o número mínimo e número maximo dos objetos que podem estar envolvidos na associação.

E também é utilizada para especificar o nível da dependencia entre os objetos.

São eles: Dependência, associação, agregação, composição e generalização.

Dependência: Relacionamento fraco (Seta tracejada) indica que uma classe usualmente usa informações ou serviços de outra classe em algum momento, dependendo dela. ex: Classe Carro depende da Classe Roda.

A classe Carro pode existir sem a classe Roda, porém precisa dela para funcionaer corretamente.

Associação: Relacionamento mais forte (Seta cheia) que a depedência, indica qua a classe mantém uma referência a outra classe ao longo do tempo. As associações podem se conectar a mais de duas classes.

Ex: Classe Pessoa está associada a Classe Revista.

A associação pode receber um nome, como por exemplo "assina", logo:

A Classe Pessoa assina a Classe Revista.

A associação pode possuir multiplicidade, que é representado por * (asterisco), o que indica que A Classe Pessoa se refere a muitas (muitas pessoas), e o mesmo para revista.

Onde: Muitas Pessoas assinam muitas Revistas.

Navegabilidade: é representado pela seta, identifica o sentido em que as informações são transmitidas entre os objetos das classes relacionadas (relacionamento unidirecional). 

Navegabilidade não é obrigatória no diagrama, pois é possivel existir relacionamentos bidirecionais.

Ex: Classe Pessoa está associada com seta em direção a Classe Revista, o que indica que a associação é unidirecional, ou seja Pessoa assina Revista, mas Revista não assina Pessoa.

Associação Ternária: Que conecta três classes. Um losango indica o ponto de convergência (conecxão) das classes envolvidas.

Exemplo: Um Professor leciona uma turma e utiliza uma sala. 

Obs: É possivel existir diagramas com associação entre mais classes! 
Associação entre uma unica classe é denominada Unária, com duas Binária, com três Ternária, com mais n-árias.

Relacionamento de Agregação: Neste indicamos que a classe é um contêiner ou uma coleção de outras classes. As classes não dependem do contêiner, então quando o contêiner é destruído as classes continuam existindo.

Relacionamento de composição: Variação mais específico da agregação, este relacionamento indica uma dependência de ciclo de vida forte entre as classes, de modo que quando um contêinder é destruido seu conteúdo também é.

Relacionamento de Generalização ou Especialização: Indica Herança.

Classe associativa: Quando ocorrem associações com multipliciadade muitos (*) em todas as extremidades. No geral, existem atributos da associação que não podem ser armazenados em nenhuma das classes envolvidas.

Exemplo: Papel de um personagem, não possui apenas ao filme ou ao ator, deve ser associado aos dois e por isso é criada uma nova classe e interligada como classe associativa.


















