package dev.feliprow.CadastroDeNinjas.Missoes;

import dev.feliprow.CadastroDeNinjas.Ninjas.NinjaModel;

import java.util.List;
import java.util.Optional;

public class MissaoService {

    private MissaoRepository missaoRepository;

    public MissaoService(MissaoRepository missaoRepository) {
        this.missaoRepository = missaoRepository;
    }

    //Listar missoes
    public List<MissaoModel> listarMissoes() {
        return missaoRepository.findAll();
    }

    // Busca por id
    public MissaoModel listarPorId(Long id){
        Optional<MissaoModel> missaoModel = missaoRepository.findById(id);
        return missaoModel.orElse(null);
    }

}
