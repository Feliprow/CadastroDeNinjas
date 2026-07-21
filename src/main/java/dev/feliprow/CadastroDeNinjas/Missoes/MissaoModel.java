package dev.feliprow.CadastroDeNinjas.Missoes;

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
    private Long id;

    private String nome;

    private RankMissao rank;

    @OneToMany(mappedBy = "missoes") // Uma missão pode ter vários ninjas ONE to MANY...
    private List<NinjaModel> ninjas;
}
