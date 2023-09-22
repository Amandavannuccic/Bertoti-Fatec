22/09/2023

Desafio: 

Ao criar uma função, foi escrito o código errado, como descobrir o erro? (como descobrir o valor que resultaria em valores diferentes?
(Tentar resolver sem funções, sem automatizar, ou seja, de forma intuitiva)

Função (int a)
b= a+1 // que deveria ser a-1 (este é o erro)
c= b/30000
return c

- Considere apenas inteiros de -32567 à 32568.
- Quais entradas mostram defeito? 
- É possível testar todas as entradas?

Resolução e explicação:

O que fazer?
Usar técnicas de teste!

Qual pode ser indicada?
Análise de valor limite.

Técnicas de teste conhecidas: 
Análise de valor limite.
Classes de equivalência.

Lembrando que JUNIT não resolve "Testa" o Software, ele só automatiza!
Para testar você precisa de técnicas de teste.

Respondendo as perguntas:
- Considere apenas inteiros de -32567 à 32568.
R: OK

- Quais entradas mostram defeito? 
R: -29999, 29999, -30000, 30000.

- É possível testar todas as entradas?
Não! 

Técnica de Teste: Análise do valor Limite

O que é ?
De forma resumida, é um técnica que reduz as opções de teste e usa os números mais próximos do valor limite.



