package dev.feliprow.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
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
    @GetMapping("/todos")
    public String mostarNinjas() {
        return "Ninja Criado";
    }

    //    PROCURAR NINJA POR ID (READ )
    @GetMapping("/todos")
    public String mostrarPorId() {
        return "Ninja Criado";
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
