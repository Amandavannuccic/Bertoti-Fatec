$(document).ready(function() {
    // Função para carregar a lista de usuários
    function carregarUsuarios() {
        $.ajax({
            url: '/api/users',
            method: 'GET',
            success: function(data) {
                $('#user-list').empty();
                data.forEach(function(usuario) {
                    $('#user-list').append('<li>' + usuario.nome + ' - ' + usuario.email + '</li>');
                });
            }
        });
    }
    
    // Carregar lista de usuários ao carregar a página
    carregarUsuarios();
    
    // Manipular o envio do formulário de adição de usuário
    $('#add-user-form').submit(function(event) {
        event.preventDefault();
        
        var usuario = {
            nome: $('#nome').val(),
            email: $('#email').val()
        };
        
        $.ajax({
            url: '/api/users',
            method: 'POST',
            contentType: 'application/json',
            data: JSON.stringify(usuario),
            success: function(data) {
                $('#nome').val('');
                $('#email').val('');
                carregarUsuarios();
            }
        });
    });
});
$(document).ready(function() {
    // Carregar lista de alunos ao carregar a página
    carregarAlunos();

    // Função para carregar a lista de alunos
    function carregarAlunos() {
        $.ajax({
            url: '/api/alunos',
            method: 'GET',
            success: function(alunos) {
                console.log('Alunos recebidos:', alunos);
                exibirAlunos(alunos);
            },
            error: function(xhr, status, error) {
                console.error('Erro ao carregar alunos:', error);
                // Tratar o erro, como exibir uma mensagem para o usuário
            }
        });
    }

    // Função para exibir os alunos na página
    function exibirAlunos(alunos) {
        var $listaAlunos = $('#lista-alunos'); // Elemento HTML onde os alunos serão exibidos

        $listaAlunos.empty(); // Limpar a lista antes de adicionar os novos alunos

        alunos.forEach(function(aluno) {
            var $item = $('<li>').text(`ID: ${aluno.id}, Nome: ${aluno.nome}, Email: ${aluno.email}`);
            $listaAlunos.append($item);
        });
    }
});
