package br.com.dio.entidades;

import br.com.dio.enums.Genero;

public class Iphone extends AparelhoTelefonico {
    @Override
    public void ligar(Pessoa pessoa) {
        System.out.println("Ligando para " + pessoa.getNome());
        System.out.println("Discando..." + pessoa.getTelefone());
    }

    @Override
    public void atender(Pessoa pessoa) {
        System.out.println("Alô " + pessoa.getNome() + ". Tudo bem?");
    }

    @Override
    public void iniciarCorreioVoz(Pessoa pessoa) {
        if (pessoa.getGenero() == Genero.MASCULINO) {
            System.out.println("Correio de Voz ativo, aqui é o " + pessoa.getNome() +
                    ", favor deixar sua mensagem após o bip...");
        } else if (pessoa.getGenero() == Genero.FEMININO) {
            System.out.println("Correio de Voz ativo, aqui é a " + pessoa.getNome() +
                    ", favor deixar sua mensagem após o bip...");
        } else {
            System.out.println("Correio de Voz ativo, aqui é o(a) " + pessoa.getNome() +
                    ", favor deixar sua mensagem após o bip...");
        }
    }

    @Override
    public void exibirPagina() {
        System.out.println("Página iniciada!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova Aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pressione F5 para atualizar a página...");
        System.out.println("Página atualizada");
    }

    @Override
    public void tocar(String musica) {
        System.out.println("Tocando " + musica);
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música " + musica + " selecionada.");
    }

}



