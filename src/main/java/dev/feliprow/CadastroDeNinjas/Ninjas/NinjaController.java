package dev.feliprow.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninja")
public class NinjaController {

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
    public String mostarNinjas() {
        return "mostrando ninjas";
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
