package dev.feliprow.CadastroDeNinjas.Missoes;

import dev.feliprow.CadastroDeNinjas.Ninjas.NinjaModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissaoService {

    private MissaoRepository missaoRepository;
    private MissaoModel missaoModel;

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

    //Criar um modelo
    public MissaoModel criarMissao(MissaoModel missaoModel){
        return missaoRepository.save(missaoModel);
    }

    // Deletar missão
    public void deletarMissao(Long id){
        missaoRepository.deleteById(id);
    }

    public MissaoModel alterarMissao(Long id, MissaoModel missaoAtualizada){

        if(missaoRepository.existsById(id)){
            missaoAtualizada.setId(id);
            return missaoRepository.save(missaoAtualizada);
        }

        return null;
    }


}
