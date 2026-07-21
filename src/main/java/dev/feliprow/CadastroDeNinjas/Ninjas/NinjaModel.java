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
    private long id;
    private String nome;

    @Column(unique = true) // Usa-se em cpf, rg, passaporte etc..
    private String email;
    private int idade;

    //@ManyToOne Muitas missoes para um unico ninja
    @ManyToOne // Varios para Um
    @JoinColumn(name = "missoes_id") // Foreing key / chave estrangeria
    private MissaoModel missoes;
    // join column é a coluna de junção
    }
