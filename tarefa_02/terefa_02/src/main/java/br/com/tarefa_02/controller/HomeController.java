package br.com.tarefa_02.controller;

import br.com.tarefa_02.model.selecaoAgentesValorant.Agente;
import br.com.tarefa_02.model.selecaoAgentesValorant.AgenteDados;
import br.com.tarefa_02.model.selecaoAgentesValorant.Selecao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class HomeController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/meuPlayer")
    public String meuPlayer() {return "meuPlayer";  }

    @GetMapping("/pg2")
    public String pg2() {
        return "pg2";
    }

    @GetMapping("/{funcao}&{mapa}")
    public String pg3(@PathVariable String funcao, @PathVariable String mapa, ModelMap model) {

        //Carregando os dados dos Agentes cadastrados no AgenteDados.java
        List<Agente> agentes = AgenteDados.getDadosAgentes();

        //Selecionando os Dados de acordo com o que é passado pela Rota
        Selecao novaSelecao = new Selecao(funcao, mapa, agentes);

        String agenteSelecionado = novaSelecao.selecionarAgente(funcao, mapa);
        String agenteBiografia = novaSelecao.selecionarBiografia(agenteSelecionado);
        String caminhoMapa = novaSelecao.selecionarCaminhoDoMapa(mapa);
        String caminhoAgente = novaSelecao.selecionarCaminhoDoAgente(agenteSelecionado);
        double porcentagemDeVitoria = novaSelecao.selecionarPorcentagemDeVitoria(agenteSelecionado, mapa);

        model.addAttribute("agenteSelecionado", agenteSelecionado);
        model.addAttribute("agenteBiografia", agenteBiografia);
        model.addAttribute("caminhoImgDoMapa", caminhoMapa);
        model.addAttribute("caminhoImgDoAgente", caminhoAgente);
        model.addAttribute("porcentagemDeVitoria", porcentagemDeVitoria);
        model.addAttribute("agenteFuncao", funcao);

        return "pg3";
    }

    @GetMapping("/agente={nomeDoAgente}")
    public String p4(@PathVariable String nomeDoAgente, ModelMap model){
        //Carregando os dados dos Agentes cadastrados no AgenteDados.java
        List<Agente> agentes = AgenteDados.getDadosAgentes();

        //Selecionando os Dados dos Agentes
        Selecao novaSelecao = new Selecao(agentes);

        //Preciso do Nome, Função e a Biografia
        String agenteSelecionado = nomeDoAgente;
        String agenteFuncao = novaSelecao.selecionarFuncao(agenteSelecionado);
        String agenteBiografia = novaSelecao.selecionarBiografia(agenteSelecionado);
        String caminhoAgente = novaSelecao.selecionarCaminhoDoAgente(agenteSelecionado);


        model.addAttribute("agenteSelecionado", agenteSelecionado);
        model.addAttribute("agenteFuncao", agenteFuncao);
        model.addAttribute("agenteBiografia", agenteBiografia);
        model.addAttribute("caminhoImgDoAgente", caminhoAgente);

        return "pg4";
    }
}