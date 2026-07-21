package dev.feliprow.CadastroDeNinjas.Ninjas;

import dev.feliprow.CadastroDeNinjas.Missoes.MissaoModel;
import jakarta.persistence.*;

import java.util.List;

//JPA = java Persistence ApI

@Entity // Transforma classe em entidade em DB
@Table(name = "tb_cadastro") // Nome da tabela com as boas práticas.
public class NinjaModel {

    @Id // Identificador
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment
    private long id;
    private String nome;
    private String email;
    private int idade;

    //@ManyToOne Muitas missoes para um unico ninja
    @ManyToOne // Varios para Um
    @JoinColumn(name = "missoes_id") // Foreing key / chave estrangeria
    private MissaoModel missoes;
    // join column é a coluna de junção

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }
}
