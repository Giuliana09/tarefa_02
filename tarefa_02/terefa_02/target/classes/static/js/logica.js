// Declarando as variáveis
const play = document.querySelector("#play");
const nomeMusica = document.querySelector("#nomeMusica");
const botaoPlayPause = document.querySelector("#botaoPlayPause");
const botaoVoltar = document.querySelector("#botaoVoltar");
const botaoAvancar = document.querySelector("#botaoAvancar");
const barraProgresso = document.querySelector(".barraProgresso");
const progresso = document.querySelector(".progresso");
const inicio = document.querySelector("#inicio");
const duracao = document.querySelector("#duracao");

// Importando as músicas a partir do arquivo musicas.js
import musicas from "./musicas.js";

// Variáveis play e pause
const iconBotaoPlay = "<i class='bx bx-play-circle'></i>";
const iconBotaoPause = "<i class='bx bx-pause-circle'></i>";

// Função para obter o nome da música da URL
function getNomeDaMusicaDaURL() {
    const urlParams = new URLSearchParams(window.location.search);
    return urlParams.get("nomeDaMusica");
}

// Função para encontrar a música correspondente na lista de músicas
function encontrarMusicaPorNome(nome) {
    return musicas.find((musica) => musica.name === nome);
}

// Variável para o índice da música atual que irá percorrer a array de músicas
let index = -1;

const nomeDaMusica = "Ringside_Dyalla";

// Função para configurar o player com uma música específica
function setNomeDaMusica(nomeDaMusica) {
    const musicaEncontrada = encontrarMusicaPorNome(nomeDaMusica);

    if (musicaEncontrada) {
        index = musicas.indexOf(musicaEncontrada);
        play.src = musicaEncontrada.src;
        nomeMusica.innerHTML = musicaEncontrada.name;
        playPause();
        updateTime();
    } else {
        console.error('Música não encontrada:', nomeDaMusica);
    }
}
setNomeDaMusica(nomeDaMusica);

// Função para configurar o player com a música especificada na URL
async function configurarPlayerComMusicaDaURL() {
    const nomeDaMusicaDaURL = getNomeDaMusicaDaURL();

    if (nomeDaMusicaDaURL) { // Verifique se não é nulo
        const musicaEncontrada = encontrarMusicaPorNome(nomeDaMusicaDaURL);

        if (musicaEncontrada) {
            index = musicas.indexOf(musicaEncontrada);
            nomeMusica.innerHTML = musicaEncontrada.name;

            // Aguarde até que a música seja carregada antes de dar play
            await carregarMusica(musicaEncontrada.src);
            play.src = musicaEncontrada.src;
            playPause();
            updateTime();
        } else {
            console.error('Música não encontrada:', nomeDaMusicaDaURL);
        }
    } else {
        console.error('Nome da música não especificado na URL.');

        // Se o nome da música não estiver especificado, você pode configurar manualmente a música
        const musicaInicial = encontrarMusicaPorNome("Ringside_Dyalla");
        if (musicaInicial) {
            index = musicas.indexOf(musicaInicial);
            nomeMusica.innerHTML = musicaInicial.name;

            // Aguarde até que a música seja carregada antes de dar play
            await carregarMusica(musicaInicial.src);
            play.src = musicaInicial.src;
            playPause();
            updateTime();
        } else {
            console.error('Música inicial não encontrada.');
        }
    }
}

// Função para carregar a música e aguardar a conclusão do carregamento
function carregarMusica(src) {
    return new Promise((resolve, reject) => {
        play.src = src;
        play.load();
        play.addEventListener('canplaythrough', () => {
            resolve();
        });
        play.addEventListener('error', () => {
            reject(new Error('Erro ao carregar a música.'));
        });
    });
}

// Chamando a função para configurar o player com a música da URL
configurarPlayerComMusicaDaURL();

// Função para dar play ou pause na música
function playPause() {
    if (play.paused) {
        play.play().catch((error) => {
            // Ignora o erro "play() failed because the user didn't interact with the document first"
            if (error.name !== "NotAllowedError") {
                console.error("Erro ao reproduzir a música:", error);
            }
        });
        botaoPlayPause.innerHTML = iconBotaoPause;
    } else {
        play.pause();
        botaoPlayPause.innerHTML = iconBotaoPlay;
    }
}

// Função para formatar o tempo da música
function formataZero(n) {
    return n < 10 ? "0" + n : n.toString();
}

// Função para avançar ou dar play na música
function voltarAvancarMusica(type = "next") {
    if (type === "next") {
        index = (index + 1) % musicas.length;
    } else {
        index = (index - 1 + musicas.length) % musicas.length;
    }

    const musica = musicas[index];
    nomeMusica.innerHTML = musica.name;

    // Aguarde até que a música seja carregada antes de dar play
    carregarMusica(musica.src).then(() => {
        play.src = musica.src;
        playPause();
        updateTime();
    }).catch((error) => {
        console.error('Erro ao carregar a música:', error);
    });
}

// Chamando as funções para voltar ou avançar a música
botaoAvancar.onclick = () => voltarAvancarMusica("next");
botaoVoltar.onclick = () => voltarAvancarMusica("prev");

// Chamando a função para atualizar o progresso da música
play.addEventListener("timeupdate", updateTime);

// Função de atualização do progresso da música
function updateTime() {
    const progressoMinuto = Math.floor(play.currentTime / 60);
    const progressoSegundo = Math.floor(play.currentTime % 60);
    inicio.textContent = progressoMinuto + ":" + formataZero(progressoSegundo);

    const duracaoMinutos = Math.floor(play.duration / 60);
    const duracaoSegundos = Math.floor(play.duration % 60);
    duracao.textContent = duracaoMinutos + ":" + formataZero(duracaoSegundos);

    const tamanhoProgresso = (play.currentTime / play.duration) * 100;
    progresso.style.width = tamanhoProgresso + "%";
}
