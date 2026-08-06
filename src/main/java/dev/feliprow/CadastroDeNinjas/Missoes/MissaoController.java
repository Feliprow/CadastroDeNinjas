package dev.feliprow.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissaoController {

    private MissaoService missaoService;

    public MissaoController(MissaoService missaoService) {
        this.missaoService = missaoService;
    }

    //    MANDAR REQUISIÇÃO PARA CRIAR MISSÃO
    @PostMapping("/criar") //Quando o usuário que mandar informações
    public MissaoModel criarMissao(@RequestBody MissaoModel missaoModel) {
        return missaoService.criarMissao(missaoModel);
    }

    //    MANDAR REQUISIÇÃO PARA ALTERAR
    @PutMapping("/alterar") // alterações
    public String alterarMissao() {
        return "Missão alterada com sucesso";
    }

    //    MANDAR REQUISIÇÃO PARA DELETAR
    @DeleteMapping("/deletar/{id}")
    public void deletarMissao(@PathVariable Long id) {
        missaoService.deletarMissao(id);
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
