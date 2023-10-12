package br.com.dio.entidades;

import java.util.List;

public abstract class AparelhoTelefonico implements Ipod, Navegador {

    public abstract void ligar(Pessoa pessoa);

    public abstract void atender(Pessoa pessoa);

    public abstract void iniciarCorreioVoz(Pessoa pessoa);

}
