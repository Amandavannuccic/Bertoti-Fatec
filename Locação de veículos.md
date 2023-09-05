Exercício 06

<h3 align="center"> Locação de Veículos <h3/>

Objetivo do sistema:
- Para realizar uma locação, o locador informa seu código. 
- Se o código não estiver cadastrado, a locação é cancelada e o cliente é informado sobre como proceder.
- Se o código estiver cadastrado, verificar se o locador não possui pendências.
- Se o locador não possuir pendências, o funcionário deve registrar a locação e fornecer o carro.
- O funcionário deve realizar a manutenção, como por exemplo realizar atualizações de cadastro ou novos cadastros.

Especificações:

Nome do sistema: Locação de veículos.
Atores: Locador e Funcionário.
Pré-condições: Existir carro disponível.
Pós-condições: Pagamento do valor efetuado.

Fluxo Principal: Cenário ideal.
Ordem das ações | Ações dos Atores | Ações do Sistema | Retorno
---| --- | ---| ---
1º | Informar código | Verificar código | Código existente
2º | | Verificar situação do locador | Cliente sem débitos
3º | | Locar Carro para Locador | Registro de locação.

Fluxo Alternativo 1: Cliente não cadastrado.
Ordem das ações | Ações dos Atores | Ações do Sistema | Retorno
---| --- | --- | ---
1º | Informar código | Verificar Código | Código não existente
2º | Realizar cadastro do cliente | Gerar código de cadastro | Código de cadastro
3º | Informar código | Verificar código | Código existente
4º | | Verificar situação do locador | Cliente sem débitos
5º | | Locar Carro para Locador | Registro de locação.

Fluxo Alternativo 2: Cliente em débito.
Ordem das ações | Ações dos Atores | Ações do Sistema | Retorno
---| --- | --- | ---
1º | Informar código | Verificar Código| Código  existente
2º | | Verificar situação do locador | Cliente em débito.
3º | Informar pendência financeira e como efetuar o pagamento | Cancelar locação | Locação não efetuada
4º | Aguardar regularização financeira para iniciar novamente o processo de locação| Cancelar locação | Locação não efetuada

Diagrama de Caso de Uso:

![DCU Locação de Veículos](https://github.com/Amandavannuccic/Bertoti_Engenharia_de_Software/assets/127263243/86c42406-3ad0-4be6-9eb8-00da9dc183b8)

