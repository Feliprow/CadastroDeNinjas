package dev.feliprow.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninja")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    //    @PostMapping Enviar informações
//    @PutMapping Alterar informações
    //    @PatchMapping Alterarq informações.
    @GetMapping("/boasvindas")// puxar informações
    public String boasVindas() {
        return "Essa é minha primeira menssagem nessa rota";
    }

    //    ADICIONAR NINJA (create)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja Criado";
    }

    //    MOSTRAR NINJAS (READ)
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    //    PROCURAR NINJA POR ID (READ )
    @GetMapping("/mostrarID")
    public String mostrarPorId() {
        return "Mostrando por id";
    }

//    ALTERAR DADOS DOS NINJAS (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinja(){
        return "ninja alterado";
    }


//    DELETAR NINJA (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId(){
        return "Ninja deletado";
    }
}
