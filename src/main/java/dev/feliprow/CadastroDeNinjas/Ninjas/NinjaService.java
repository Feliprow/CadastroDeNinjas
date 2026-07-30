package dev.feliprow.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService   {

    private NinjaRepository ninjaRepository;
    private NinjaModel ninjaModel;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    //Listar todos os ninjas
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }

//    public List<NinjaModel> mostrarId(){
//        return ninjaRepository.findById(ninjaModel.getId());
//    }
}
