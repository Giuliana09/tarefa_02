package br.com.tarefa_02.model.selecaoAgentesValorant;

import java.util.ArrayList;
import java.util.List;

public class AgenteDados {
    private static List<Agente> dadosAgentes;

    /*
    Lista de Instancias da Classe Agente, como os Agentes São fixos e preciso de um lugar para controlar
    todos os dados deles que são enormes e infelizmente estou sem Banco de Dados, então essa foi a Solução.
    Como o Static é chamado assim que se tem a classe AgenteDados, então ele automaticamente cria as instancias, ou seja
    Carrega minha Base de Dados dos Agentes
    */
    static {
        dadosAgentes = new ArrayList<>();

        //Adicionando os Agentes e suas Estatisticas por Mapa
        Agente brimstone = new Agente("Brimstone", "Vindo diretamente dos EUA, o arsenal orbital do " +
                "Brimstone garante que o esquadrão dele sempre esteja em vantagem. Sua capacidade de oferecer " +
                "utilitários com precisão e segurança faz dele um comandante inigualável na linha de frente.",
                "Controlador");
        brimstone.adicionarEstatisticas("Lotus", 50.4, 0.6);
        brimstone.adicionarEstatisticas("Pearl", 50.6, 0.5);
        brimstone.adicionarEstatisticas("Fracture", 51.0, 1.2);
        brimstone.adicionarEstatisticas("Bind", 50.7, 1.1);
        brimstone.adicionarEstatisticas("Haven", 50.6, 0.7);
        brimstone.adicionarEstatisticas("Split", 50.2, 0.7);
        brimstone.adicionarEstatisticas("Ascent", 51.1, 0.8);
        dadosAgentes.add(brimstone);

        Agente phoenix = new Agente("Phoenix", "Chegando com tudo diretamente do Reino Unido, o poder " +
                "estelar de Phoenix reluz em seu estilo de luta, incendiando o campo de batalha com luz e estilo. " +
                "Tendo ajuda ou não, ele entra na luta como e quando achar que deve.", "Duelista");
        phoenix.adicionarEstatisticas("Lotus", 49.7, 0.5);
        phoenix.adicionarEstatisticas("Pearl", 50.4, 0.6);
        phoenix.adicionarEstatisticas("Fracture", 49.8, 0.5);
        phoenix.adicionarEstatisticas("Bind", 49.8, 0.5);
        phoenix.adicionarEstatisticas("Haven", 50.3, 0.6);
        phoenix.adicionarEstatisticas("Split", 49.4, 0.5);
        phoenix.adicionarEstatisticas("Ascent", 50.5, 0.6);
        dadosAgentes.add(phoenix);

        Agente sage = new Agente("Sage", "Como uma verdadeira fortaleza chinesa, Sage traz segurança " +
                "para si mesma e para a equipe aonde quer que vá. Capaz de reviver aliados e rechaçar investidas " +
                "agressivas, ela oferece um centro de calmaria em meio ao caos da batalha.", "Sentinela");
        sage.adicionarEstatisticas("Lotus", 50.0, 1.0);
        sage.adicionarEstatisticas("Pearl", 49.7, 1.1);
        sage.adicionarEstatisticas("Fracture", 49.8, 1.0);
        sage.adicionarEstatisticas("Bind", 50.3, 1.0);
        sage.adicionarEstatisticas("Haven", 50.0, 1.1);
        sage.adicionarEstatisticas("Split", 50.7, 1.4);
        sage.adicionarEstatisticas("Ascent", 49.9, 1.0);
        dadosAgentes.add(sage);

        Agente sova = new Agente("Sova", "Nascido sob o eterno inverno das tundras russas, Sova rastreia, " +
                "encontra e elimina inimigos com eficiência e precisão implacáveis. Seu arco personalizado e suas " +
                "habilidades inigualáveis de reconhecimento garantem que nenhuma presa escape.", "Iniciador");
        sova.adicionarEstatisticas("Lotus", 48.4, 0.4);
        sova.adicionarEstatisticas("Pearl", 48.4, 0.4);
        sova.adicionarEstatisticas("Fracture", 48.0, 0.3);
        sova.adicionarEstatisticas("Bind", 49.2, 0.5);
        sova.adicionarEstatisticas("Haven", 49.7, 0.9);
        sova.adicionarEstatisticas("Split", 48.4, 0.4);
        sova.adicionarEstatisticas("Ascent", 50.4, 1.22);
        dadosAgentes.add(sova);

        Agente viper = new Agente("Viper", "Viper, a química dos Estados Unidos, emprega uma variedade " +
                "de dispositivos químicos venenosos para controlar o campo de batalha e prejudicar a visão do " +
                "inimigo. Se as toxinas não matarem a presa, seus jogos mentais certamente o farão", "Controlador");
        viper.adicionarEstatisticas("Lotus", 48.9, 0.4);
        viper.adicionarEstatisticas("Pearl", 49.6, 0.6);
        viper.adicionarEstatisticas("Fracture", 48.9, 0.4);
        viper.adicionarEstatisticas("Bind", 49.2, 0.4);
        viper.adicionarEstatisticas("Haven", 48.1, 0.2);
        viper.adicionarEstatisticas("Split", 48.6, 0.4);
        viper.adicionarEstatisticas("Ascent", 48.5, 0.2);
        dadosAgentes.add(viper);

        Agente cypher  = new Agente("Cypher", "Cypher, um vendedor de informações do Marrocos, é uma " +
                "verdadeira rede de vigilância de um homem só que fica de olho em cada movimento dos inimigos. " +
                "Nenhum segredo está a salvo. Nenhuma manobra passa despercebida. Cypher está sempre vigiando.",
                "Sentinela");
        cypher.adicionarEstatisticas("Lotus", 48.5, 0.4);
        cypher.adicionarEstatisticas("Pearl", 49.5, 0.5);
        cypher.adicionarEstatisticas("Fracture", 49.1, 0.5);
        cypher.adicionarEstatisticas("Bind", 49.1, 0.7);
        cypher.adicionarEstatisticas("Haven", 49.2, 0.5);
        cypher.adicionarEstatisticas("Split", 49.1, 0.7);
        cypher.adicionarEstatisticas("Ascent", 49.2, 0.5);
        dadosAgentes.add(cypher);

        Agente reyna  = new Agente("Reyna", "Criada no coração do México, Reyna domina o combate " +
                "individual, destacando-se a cada abate efetuado. Sua capacidade só é limitada por sua própria " +
                "perícia, tornando-a bastante dependente de desempenho.", "Duelista");
        reyna.adicionarEstatisticas("Lotus", 50.2, 1.4);
        reyna.adicionarEstatisticas("Pearl", 50.2, 1.2);
        reyna.adicionarEstatisticas("Fracture", 50.4, 1.2);
        reyna.adicionarEstatisticas("Bind", 50.2, 1.4);
        reyna.adicionarEstatisticas("Haven", 50.1, 1.5);
        reyna.adicionarEstatisticas("Split", 50.1, 1.2);
        reyna.adicionarEstatisticas("Ascent", 49.3, 1.3);
        dadosAgentes.add(reyna);

        Agente killjoy  = new Agente("Killjoy", "Killjoy, uma alemã genial, defende posições-chave no " +
                "campo de batalha facilmente com seu arsenal de invenções. Se o dano causado por seu equipamento não " +
                "der cabo dos inimigos, os efeitos negativos de seus queridos robôs darão conta do recado.",
                "Sentinela");
        killjoy.adicionarEstatisticas("Lotus", 50.4, 0.8);
        killjoy.adicionarEstatisticas("Pearl", 50.7, 1.2);
        killjoy.adicionarEstatisticas("Fracture", 50.6, 0.8);
        killjoy.adicionarEstatisticas("Bind", 50.0, 1.1);
        killjoy.adicionarEstatisticas("Haven", 50.3, 0.8);
        killjoy.adicionarEstatisticas("Split", 50.0, 0.7);
        killjoy.adicionarEstatisticas("Ascent", 50.1, 1.2);
        dadosAgentes.add(killjoy);

        Agente breach  = new Agente("Breach", "Breach, o homem-biônico sueco, dispara poderosos " +
                "jatos cinéticos para forçar a abertura de um caminho pelo território inimigo. O dano e a interrupção " +
                "que ele causa garantem que nenhuma luta seja justa.", "Iniciador");
        breach.adicionarEstatisticas("Lotus", 49.2, 0.7);
        breach.adicionarEstatisticas("Pearl", 48.0, 0.3);
        breach.adicionarEstatisticas("Fracture", 49.2, 0.9);
        breach.adicionarEstatisticas("Bind", 47.6, 0.3);
        breach.adicionarEstatisticas("Haven", 48.7, 0.5);
        breach.adicionarEstatisticas("Split", 48.3, 0.4);
        breach.adicionarEstatisticas("Ascent", 50.1, 1.2);
        dadosAgentes.add(breach);

        Agente omen  = new Agente("Omen", "Omen, uma lembrança fantasmagórica, caça nas sombras. Ele " +
                "cega os inimigos, teleporta-se pelo campo e deixa a paranoia assumir o controle enquanto o " +
                "adversário tenta descobrir de onde virá seu próximo ataque.", "Controlador");
        omen.adicionarEstatisticas("Lotus", 49.1, 1.3);
        omen.adicionarEstatisticas("Pearl", 48.1, 0.7);
        omen.adicionarEstatisticas("Fracture", 47.3, 0.7);
        omen.adicionarEstatisticas("Bind", 48.0, 1.0);
        omen.adicionarEstatisticas("Haven", 49.0, 1.4);
        omen.adicionarEstatisticas("Split", 49.0, 1.3);
        omen.adicionarEstatisticas("Ascent", 48.8, 1.5);
        dadosAgentes.add(omen);

        Agente jett  = new Agente("Jett", "Representando a Coreia do Sul, sua terra natal, Jett " +
                "tem um estilo de luta ágil e evasivo que permite que ela assuma riscos como ninguém. Ela corre " +
                "em meio a qualquer confronto, cortando os inimigos antes mesmo que eles percebam quem ou o que " +
                "os atingiu.", "Duelista");
        jett.adicionarEstatisticas("Lotus", 49.4, 1.2);
        jett.adicionarEstatisticas("Pearl", 49.2, 1.3);
        jett.adicionarEstatisticas("Fracture", 49.7, 1.1);
        jett.adicionarEstatisticas("Bind", 49.0, 1.3);
        jett.adicionarEstatisticas("Haven", 49.5, 1.4);
        jett.adicionarEstatisticas("Split", 49.1, 1.2);
        jett.adicionarEstatisticas("Ascent", 49.4, 1.4);
        dadosAgentes.add(jett);

        Agente raze  = new Agente("Raze", "Raze chega do Brasil com uma explosão de carisma e armas " +
                "enormes. Com seu estilo de jogo \"porradeiro\", ela é craque em desentocar inimigos entrincheirados " +
                "e limpar espaços apertados com uma bela dose de BUUUM!", "Duelista");
        raze.adicionarEstatisticas("Lotus", 50.3, 1.2);
        raze.adicionarEstatisticas("Pearl", 49.6, 0.7);
        raze.adicionarEstatisticas("Fracture", 49.5, 0.9);
        raze.adicionarEstatisticas("Bind", 49.9, 1.44);
        raze.adicionarEstatisticas("Haven", 49.5, 0.9);
        raze.adicionarEstatisticas("Split", 50.0, 1.3);
        raze.adicionarEstatisticas("Ascent", 49.6, 0.9);
        dadosAgentes.add(raze);

        Agente skye  = new Agente("Skye", "Mandando um salve direto da Austrália, Skye e sua equipe " +
                "de feras desbravam territórios hostis. Com seus poderes de cura e suas criações que partem pra " +
                "cima dos inimigos, qualquer equipe ficará mais forte e mais segura tendo Skye como aliada.",
                "Iniciador");
        skye.adicionarEstatisticas("Lotus", 49.4, 0.9);
        skye.adicionarEstatisticas("Pearl", 49.3, 0.8);
        skye.adicionarEstatisticas("Fracture", 49.1, 0.7);
        skye.adicionarEstatisticas("Bind", 49.5, 1.1);
        skye.adicionarEstatisticas("Haven", 49.1, 0.9);
        skye.adicionarEstatisticas("Split", 49.6, 1.0);
        skye.adicionarEstatisticas("Ascent", 48.7, 0.7);
        dadosAgentes.add(skye);

        Agente yoru  = new Agente("Yoru", "Yoru, nativo do Japão, abre fendas na realidade para " +
                "infiltrar as linhas inimigas sem ser visto. Ele usa tanto artimanhas quanto táticas agressivas, e " +
                "os alvos são abatidos sem saber de onde o ataque veio.",
                "Duelista");
        yoru.adicionarEstatisticas("Lotus", 46.3, 0.3);
        yoru.adicionarEstatisticas("Pearl", 47.0, 0.3);
        yoru.adicionarEstatisticas("Fracture", 46.5, 0.3);
        yoru.adicionarEstatisticas("Bind", 46.9, 0.4);
        yoru.adicionarEstatisticas("Haven", 46.9, 0.3);
        yoru.adicionarEstatisticas("Split", 46.6, 0.3);
        yoru.adicionarEstatisticas("Ascent", 46.4, 0.3);
        dadosAgentes.add(yoru);

        Agente astra  = new Agente("Astra", "Yoru, nativo do Japão, abre fendas na realidade para " +
                "infiltrar as linhas inimigas sem ser visto. Ele usa tanto artimanhas quanto táticas agressivas, e " +
                "os alvos são abatidos sem saber de onde o ataque veio.",
                "Controlador");
        astra.adicionarEstatisticas("Lotus", 49.8, 0.3);
        astra.adicionarEstatisticas("Pearl", 50.4, 0.5);
        astra.adicionarEstatisticas("Fracture", 47.9, 0.2);
        astra.adicionarEstatisticas("Bind", 48.5, 0.2);
        astra.adicionarEstatisticas("Haven", 49.0, 0.2);
        astra.adicionarEstatisticas("Split", 49.5, 0.3);
        astra.adicionarEstatisticas("Ascent", 49.7, 0.2);
        dadosAgentes.add(astra);

        Agente kayo  = new Agente("Kayo", "KAY/O é uma máquina de guerra construída com um único " +
                "propósito: neutralizar Radiantes. Ele é capaz de Suprimir habilidades inimigas, anulando a " +
                "capacidade de contra-ataque dos adversários e dando a si e a seus aliados uma vantagem " +
                "essencial em combate.", "Iniciador");
        kayo.adicionarEstatisticas("Lotus", 45.5, 0.3);
        kayo.adicionarEstatisticas("Pearl", 45.6, 0.3);
        kayo.adicionarEstatisticas("Fracture", 46.1, 0.3);
        kayo.adicionarEstatisticas("Bind", 45.3, 0.3);
        kayo.adicionarEstatisticas("Haven", 45.8, 0.3);
        kayo.adicionarEstatisticas("Split", 45.8, 0.3);
        kayo.adicionarEstatisticas("Ascent", 45.9, 0.5);
        dadosAgentes.add(kayo);

        Agente chamber  = new Agente("Chamber", "Bem-vestido e armado até os dentes, o criador de " +
                "armas francês Chamber coloca os inimigos para correr com precisão mortal. Use e abuse do arsenal " +
                "personalizado dele para segurar posições e abater inimigos de longe, criando a defesa perfeita " +
                "para qualquer plano.", "Sentinela");
        chamber.adicionarEstatisticas("Lotus", 49.4, 0.7);
        chamber.adicionarEstatisticas("Pearl", 48.4, 0.7);
        chamber.adicionarEstatisticas("Fracture", 48.8, 0.5);
        chamber.adicionarEstatisticas("Bind", 48.8, 0.7);
        chamber.adicionarEstatisticas("Haven", 48.5, 0.6);
        chamber.adicionarEstatisticas("Split", 47.9, 0.5);
        chamber.adicionarEstatisticas("Ascent", 48.6, 0.5);
        dadosAgentes.add(chamber);

        Agente neon  = new Agente("Neon", "Neon, nossa Agente filipina, avança em velocidades " +
                "incríveis, descarregando surtos de radiância bioelétrica tão rapidamente quanto seu corpo " +
                "consegue gerá-los. Ela corre à frente para pegar os inimigos de surpresa, abatendo-os mais " +
                "rápido do que um raio.", "Duelista");
        neon.adicionarEstatisticas("Lotus", 48.0, 0.3);
        neon.adicionarEstatisticas("Pearl", 47.9, 0.3);
        neon.adicionarEstatisticas("Fracture", 48.6, 0.4);
        neon.adicionarEstatisticas("Bind", 47.2, 0.3);
        neon.adicionarEstatisticas("Haven", 47.7, 0.3);
        neon.adicionarEstatisticas("Split", 47.4, 0.3);
        neon.adicionarEstatisticas("Ascent", 47.0, 0.3);
        dadosAgentes.add(neon);

        Agente fade  = new Agente("Fade", "Fade, uma caçadora de recompensas turca, usa o poder " +
                "dos pesadelos para capturar os segredos dos inimigos. Personificando o próprio terror, ela " +
                "persegue os alvos e revela seus medos mais profundos para, depois, destruí-los na escuridão.",
                "Iniciador");
        fade.adicionarEstatisticas("Lotus", 49.0, 0.4);
        fade.adicionarEstatisticas("Pearl", 49.4, 0.5);
        fade.adicionarEstatisticas("Fracture", 49.0, 0.4);
        fade.adicionarEstatisticas("Bind", 49.0, 0.4);
        fade.adicionarEstatisticas("Haven", 49.1, 0.3);
        fade.adicionarEstatisticas("Split", 48.7, 0.3);
        fade.adicionarEstatisticas("Ascent", 48.8, 0.3);
        dadosAgentes.add(fade);

        Agente harbor  = new Agente("Harbor", "Vindo do litoral indiano, Harbor entra em campo " +
                "com a força da tormenta, empunhando tecnologia ancestral com domínio sobre a água. Ele " +
                "libera corredeiras espumantes e ondas esmagadoras para proteger seus aliados ou atacar " +
                "aqueles que se opõem a ele.", "Controlador");
        harbor.adicionarEstatisticas("Lotus", 46.6, 0.2);
        harbor.adicionarEstatisticas("Pearl", 46.8, 0.3);
        harbor.adicionarEstatisticas("Fracture", 45.9, 0.1);
        harbor.adicionarEstatisticas("Bind", 45.5, 0.1);
        harbor.adicionarEstatisticas("Haven", 45.1, 0.1);
        harbor.adicionarEstatisticas("Split", 45.1, 0.1);
        harbor.adicionarEstatisticas("Ascent", 45.6, 0.1);
        dadosAgentes.add(harbor);

        Agente gekko  = new Agente("Gekko", "Gekko, de Los Angeles, lidera um grupo muito unido " +
                "de criaturas caóticas. Seus amigos atropelam tudo, tirando os inimigos do caminho. Depois, " +
                "Gekko corre atrás deles para reagrupá-los e reiniciar o processo.", "Iniciador");
        gekko.adicionarEstatisticas("Lotus", 49.8, 0.4);
        gekko.adicionarEstatisticas("Pearl", 50.3, 0.6);
        gekko.adicionarEstatisticas("Fracture", 49.3, 0.4);
        gekko.adicionarEstatisticas("Bind", 49.5, 0.4);
        gekko.adicionarEstatisticas("Haven", 49.4, 0.4);
        gekko.adicionarEstatisticas("Split", 49.0, 0.4);
        gekko.adicionarEstatisticas("Ascent", 47.8, 0.3);
        dadosAgentes.add(gekko);

        Agente deadlock  = new Agente("Deadlock", "A agente norueguesa Deadlock posiciona uma " +
                "gama de nanofios de alta tecnologia para proteger o campo de batalha até mesmo do ataque mais " +
                "letal. Ninguém escapa do seu olhar vigilante. Ninguém sobrevive à sua ferocidade implacável.",
                "Sentinela");
        deadlock.adicionarEstatisticas("Lotus", 48.7, 0.4);
        deadlock.adicionarEstatisticas("Pearl", 48.8, 0.3);
        deadlock.adicionarEstatisticas("Fracture", 48.8, 0.3);
        deadlock.adicionarEstatisticas("Bind", 49.0, 0.4);
        deadlock.adicionarEstatisticas("Haven", 48.9, 0.3);
        deadlock.adicionarEstatisticas("Split", 48.9, 0.4);
        deadlock.adicionarEstatisticas("Ascent", 48.5, 0.3);
        dadosAgentes.add(deadlock);

    }

    public static List<Agente> getDadosAgentes() {

        return dadosAgentes;
    }
}
