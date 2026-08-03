package dev.feliprow.CadastroDeNinjas.Missoes;

import dev.feliprow.CadastroDeNinjas.Ninjas.NinjaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissaoController {

    private MissaoService missaoService;

    //    MANDAR REQUISIÇÃO PARA CRIAR MISSÃO
    @PostMapping("/criar") //Quando o usuário que mandar informações
    public String criarMissao() {
        return "Missão criada com sucesso";
    }

    //    MANDAR REQUISIÇÃO PARA ALTERAR
    @PutMapping("/alterar") // alterações
    public String alterarMissao() {
        return "Missão alterada com sucesso";
    }

    //    MANDAR REQUISIÇÃO PARA DELETAR
    @DeleteMapping("/deletar")
    public String deletarMissao() {
        return "Missão deletada com sucesso";
    }

    //    GET - MANDAR UMA REQUISIÇÃO PARA MOSTAR MISSÕES
    @GetMapping("/listar")
    public List<MissaoModel> listarMissoes() {
        return missaoService.listarMissoes();
    }

    // Buscar por id
    @GetMapping("/listar/{id}")
    public MissaoModel listarPorId(@PathVariable Long id){
        return missaoService.listarPorId(id);
    }
}
