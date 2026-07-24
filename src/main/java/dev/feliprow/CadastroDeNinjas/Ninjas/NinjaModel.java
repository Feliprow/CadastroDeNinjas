package dev.feliprow.CadastroDeNinjas.Ninjas;

import dev.feliprow.CadastroDeNinjas.Missoes.MissaoModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//JPA = java Persistence ApI

@Entity // Transforma classe em entidade em DB
@Table(name = "tb_cadastro") // Nome da tabela com as boas práticas.
@Data
@NoArgsConstructor // Compacta a construção de construtores
@AllArgsConstructor
public class NinjaModel {

    @Id // Identificador
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment
    @Column(name = "pk_id_ninja")
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true, name = "email") // Usa-se em cpf, rg, passaporte etc..
    private String email;

    @Column(name = "idade")
    private int idade;

    //@ManyToOne Muitas missoes para um unico ninja
    @ManyToOne // Varios para Um
    @JoinColumn(name = "fk_id_missao") // Foreing key / chave estrangeria
    private MissaoModel missao;
    // join column é a coluna de junção
    }
