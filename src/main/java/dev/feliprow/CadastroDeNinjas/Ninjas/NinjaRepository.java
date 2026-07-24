package dev.feliprow.CadastroDeNinjas.Ninjas;

import org.springframework.data.jpa.repository.JpaRepository;
//JpaRepository<Classe que vai ser escaneada, Tipo do id (pk)>
//JPA - simplificador para banco de dados
public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {

}
