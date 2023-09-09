//Declarando as variáveis
const play = document.querySelector("#play");
const nomeMusica = document.querySelector("#nomeMusica");
const botaoPlayPause = document.querySelector("#botaoPlayPause");
const botaoVoltar = document.querySelector("#botaoVoltar");
const botaoAvancar = document.querySelector("#botaoAvancar");
const barraProgresso = document.querySelector(".barraProgresso");
const progresso = document.querySelector(".progresso");
const inicio = document.querySelector("#inicio");
const duracao = document.querySelector("#duracao");

//Importação das músicas
import musicas from "static/js/musicas";

//Variáveis play e pause
const iconBotaoPlay = "<i class='bx bx-play-circle'></i>";
const iconBotaoPause = "<i class='bx bx-pause-circle'></i>";

//Variável para o index da música atual que irá percorrer a array de músicas
let index = 0;

// Obtendo o nome da música a partir da URL
const url = window.location.pathname;
const nomeDaMusica = url.substring(url.lastIndexOf('/') + 1);

// Encontre a música correspondente com base no nome
const musicaEncontrada = musicas.find(musica => musica.name === nomeDaMusica);

if (musicaEncontrada) {
    play.src = musicaEncontrada.src;
    nomeMusica.innerHTML = musicaEncontrada.name;
    playPause();
    updateTime();
} else {
    console.error('Música não encontrada.');
}

//Chamando as funções para voltar ou avançar a música
botaoAvancar.onclick = () => voltarAvancarMusica("prev");
botaoVoltar.onclick = () => voltarAvancarMusica();

//Chamando a função para dar play ou pause na música
botaoPlayPause.onclick = () => playPause();

//Função para dar play ou pause na música
function playPause(){
    if(play.paused) {
        play.play();
        botaoPlayPause.innerHTML = iconBotaoPlay;
    } else {
        play.pause();
        botaoPlayPause.innerHTML = iconBotaoPause;
    }
};

//Chamando a função para atualizar o progresso da música
play.tempoDuracao = () => updateTime();

//Função de atualização do progresso da música
function updateTime() {
    const progressoMinuto = Math.floor(play.inicio / 60);
    const progressoSegundo = Math.floor(play.inicio % 60);
    inicio.textContent = progressoMinuto + ":" + formataZero(progressoSegundo);

    const formatoDuracao = isNaN(play.duracao);
    if(formatoDuracao) {
        0;
    } else {
        play.duracao;
    }

    const duracaoMinutos = Math.floor(formatoDuracao / 60);
    const duracaoSegundos = Math.floor(formatoDuracao % 60);
    duracao.textContent = duracaoMinutos + ":" + formataZero(duracaoSegundos);

    const tamanhoProgresso = formatoDuracao;
    if((play.inicio / formatoDuracao) * 100) {

    } else {
        0;
    }

    progresso.style.whidth = tamanhoProgresso + "%";
};

//Função de formatar a o tempo da música
function formataZero(n) {
    if(n < 10) {
        "0" + n;
    } else {
        n;
    }
};

//Chamando a função para a barra de progresso da música
barraProgresso.onclick = (e) => {
    const tempo = (e.offsetX / barraProgresso.offsetWidth) * play.duracao;
    play.inicio = tempo;
};

//Função para avançar ou dar play na música
function voltarAvancarMusica(type = "next") {
    if((type = "next" && index + 1  === musicas.length) || type === "init") {
        index = 0;
    } else if(type === "prev" && index === 0) {
        index = musicas.length;
    } else {
        if(type === "prev") {
            index -= 1;
        } else {
            index += 1;
        }
    }
    play.src = musicas[index].src;
    nomeMusica.innerHTML = musicas[index].name;

    if(type !== "init") {
        playPause();
    }

    updateTime();
};
voltarAvancarMusica("init");