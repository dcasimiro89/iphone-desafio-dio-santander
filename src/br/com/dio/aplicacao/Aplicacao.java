package br.com.dio.aplicacao;

import br.com.dio.entidades.Iphone;
import br.com.dio.entidades.Pessoa;
import br.com.dio.enums.Genero;

public class Aplicacao {

    public static void main(String[] args) {

        Pessoa joao = new Pessoa("João", Genero.MASCULINO, 955554444, new Iphone());
        Pessoa maria = new Pessoa("Maria", Genero.FEMININO, 977776666, new Iphone());
        Pessoa joana = new Pessoa("Joana", Genero.OUTROS, 933332222, new Iphone());

        String musica = "Stairway To Heaven";

        joao.getAparelhoTelefonico().selecionarMusica(musica);
        joao.getAparelhoTelefonico().tocar(musica);
        joao.getAparelhoTelefonico().pausar();
        joao.getAparelhoTelefonico().ligar(maria);
        joao.getAparelhoTelefonico().atender(maria);
        joao.getAparelhoTelefonico().exibirPagina();
        joao.getAparelhoTelefonico().atualizarPagina();
        joao.getAparelhoTelefonico().adicionarNovaAba();

        System.out.println();

        musica = "Still Loving You";
        maria.getAparelhoTelefonico().selecionarMusica(musica);
        maria.getAparelhoTelefonico().tocar(musica);
        maria.getAparelhoTelefonico().pausar();
        maria.getAparelhoTelefonico().ligar(joao);
        maria.getAparelhoTelefonico().iniciarCorreioVoz(joao);
        maria.getAparelhoTelefonico().ligar(joana);
        maria.getAparelhoTelefonico().iniciarCorreioVoz(joana);
        maria.getAparelhoTelefonico().exibirPagina();
        maria.getAparelhoTelefonico().atualizarPagina();
        maria.getAparelhoTelefonico().adicionarNovaAba();

    }
}
