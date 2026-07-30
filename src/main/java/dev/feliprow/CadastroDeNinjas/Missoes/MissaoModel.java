package dev.feliprow.CadastroDeNinjas.Missoes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.feliprow.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity // tudo após isso é uma entidade ou algo para o BD
@Table(name = "tb_missoes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MissaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_id_missao")
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "rank")
    @Enumerated(EnumType.STRING)
    private RankMissao rank;

    //List
    @OneToMany(mappedBy = "missao") // Uma missão pode ter vários ninjas ONE to MANY...
    @JsonIgnore // Ignora a serialização para nao bugar o loop de serialização
    private List<NinjaModel> ninjas;
}
