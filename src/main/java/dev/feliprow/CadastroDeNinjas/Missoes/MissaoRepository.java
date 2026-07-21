package dev.feliprow.CadastroDeNinjas.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;

// JPA simplificador de banco de dados
//Jpa repository <Classe para scanear, tipo do id>
public interface MissaoRepository extends JpaRepository<MissaoModel, Long> {
}
