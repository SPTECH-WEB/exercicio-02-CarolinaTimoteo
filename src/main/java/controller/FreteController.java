package controller;

import org.springframework.web.bind.annotation.*;
import service.FreteService;

@RestController
@RequestMapping("/frete")
public class FreteController {
    private FreteService freteService;
    public FreteController(FreteService freteService) {
        this.freteService = freteService;
    }

    @GetMapping("/calcular-frete")
    public String calcularFrete(@RequestParam String tipo, @RequestParam double peso){
        double valor = freteService.calcular(tipo, peso);
        return "Frete (" + tipo + ") para " + peso + "Kg: R$ " + valor;
    }
}
