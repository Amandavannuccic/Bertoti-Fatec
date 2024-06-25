const express = require('express');
const path = require('path');
const axios = require('axios'); // Para fazer requisições HTTP

const app = express();
const PORT = process.env.PORT || 3000;

// Middleware para analisar solicitações JSON
app.use(express.json());

// Rota para listar alunos cadastrados
app.get('/api/alunos', async (req, res) => {
    try {
        // Fazer uma requisição GET para o backend Java/Spring Boot
        const response = await axios.get('http://localhost:8080/users'); // Substitua pela URL correta do seu backend
        
        // Dados dos alunos estão no response.data
        const alunos = response.data;

        // Exibir os alunos no console do servidor para fins de debug
        console.log('Alunos cadastrados:', alunos);

        // Enviar os alunos como resposta para o cliente
        res.json(alunos);
    } catch (error) {
        console.error('Erro ao obter alunos:', error.message);
        res.status(500).json({ error: 'Erro ao obter alunos' });
    }
});

// Rota para servir o front-end estático
app.use(express.static(path.join(__dirname, 'public')));

// Iniciar o servidor
app.listen(PORT, () => {
    console.log(`Servidor Node.js rodando na porta ${PORT}`);
});
