package dev.feliprow.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

//    @PostMapping Enviar informações
//    @PutMapping Alterar informações
//    @PatchMapping Alterar informações
//    @DeleteMapping Deletar informações.
    @GetMapping("/boasvindas")// puxar informações
    public String boasVindas() {
        return "Essa é minha primeira menssagem nessa rota";
    }

}
