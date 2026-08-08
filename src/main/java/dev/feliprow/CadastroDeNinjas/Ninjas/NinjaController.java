package dev.feliprow.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninja")
public class NinjaController {

    private final NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    //    ADICIONAR NINJA (create)
    @PostMapping("/criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninjaModel) { // @ResquestBody vai pedir para o user mandar
        return ninjaService.criarNinja(ninjaModel);
    }

    //    MOSTRAR NINJAS (READ)
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    //    PROCURAR NINJA POR ID (READ )
    @GetMapping("/listar/{id}")// {} path variable
    public NinjaModel listarPorId(@PathVariable Long id) {
        return ninjaService.listarPorId(id);
    }

    //    DELETAR NINJA (DELETE)
    @DeleteMapping("/deletar/{id}")
    public void deletarPorId(@PathVariable Long id) {
        ninjaService.deletar(id);
    }

    //    ALTERAR DADOS DOS NINJAS (UPDATE)
//    put = post + get, basicamente uma junção de métodos com 2 requisitos
    @PutMapping("/alterar/{id}")
    public NinjaModel alterarNinja(@PathVariable Long id, @RequestBody NinjaModel ninjaAtualizado) {
        return ninjaService.atualizarNinja(id, ninjaAtualizado);
    }

}
