package dev.feliprow.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissaoController{

//    MANDAR REQUISIÇÃO PARA CRIAR MISSÃO
    @PostMapping("/criar") //Quando o usuário que mandar informações
    public String criarMissao(){
        return "Missão criada com sucesso";
    }

//    MANDAR REQUISIÇÃO PARA ALTERAR
    @PutMapping("/alterar") // alterações
    public String alterarMissao(){
        return "Missão alterada com sucesso";
    }

//    MANDAR REQUISIÇÃO PARA DELETAR
    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "Missão deletada com sucesso";
    }

//    GET - MANDAR UMA REQUISIÇÃO PARA MOSTAR MISSÕES
    @GetMapping("/listar")
    public String listarMissao(){
        return "Missões listadas com sucesso";
    }
}
