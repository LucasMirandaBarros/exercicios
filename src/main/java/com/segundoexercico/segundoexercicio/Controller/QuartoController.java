package com.segundoexercico.segundoexercicio.Controller;

import com.segundoexercico.segundoexercicio.Service.QuartoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quarto-controller")
public class QuartoController {

    @Autowired
    private QuartoService quartoService;

    @GetMapping("/identificador")
    public String identificarVolgalOuConsoante(@RequestParam("caractere")Character caractere){
        return quartoService.verificarvogalOuConsoante(caractere);
    }
}
