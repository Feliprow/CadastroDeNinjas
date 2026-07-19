package dev.feliprow.CadastroDeNinjas;
import jakarta.persistence.*;

//JPA = java Persistence ApI

@Entity // Transforma classe em entidade em DB
@Table(name = "tb_cadastro") // Nome da tabela com as boas práticas.
public class NinjaModel {

    @Id // Identificador
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment
    long id;
    private String nome;
    private String email;
    private int idade;

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
