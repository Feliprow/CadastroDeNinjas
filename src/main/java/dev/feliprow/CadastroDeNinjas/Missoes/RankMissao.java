package dev.feliprow.CadastroDeNinjas.Missoes;

public enum RankMissao {

    S("Missão quase impossível."),
    A("Missão muito difícil."),
    B("Missão difícil."),
    C("Missão mediana."),
    D("Missão fácil."),
    E("Missão muito fácil.");

    private final String descricao;

    RankMissao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
