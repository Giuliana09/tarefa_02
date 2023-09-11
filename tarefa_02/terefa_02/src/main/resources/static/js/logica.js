//Declarando as variáveis
const play = document.querySelector("#play");
const nomeMusica = document.querySelector("#nomeMusica");
const botaoPlayPause = document.querySelector("#botaoPlayPause");
const botaoVoltar = document.querySelector("#botaoVoltar");
const botaoAvancar = document.querySelector("#botaoAvancar");

//Importação das músicas
import musicas from "./musicas.js";

//Variáveis play e pause
const iconBotaoPlay = "<i class='bx bx-play-circle'></i>";
const iconBotaoPause = "<i class='bx bx-pause-circle'></i>";

//Variável para o index da música atual que irá percorrer a array de músicas
let index = 0;

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
}

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
}
voltarAvancarMusica("init");