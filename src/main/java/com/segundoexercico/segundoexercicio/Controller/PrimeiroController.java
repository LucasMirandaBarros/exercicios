package com.segundoexercico.segundoexercicio.Controller;

import com.segundoexercico.segundoexercicio.Service.PrimeiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiro-controller")
public class PrimeiroController {

    @Autowired
    private PrimeiroService primeiroService;

    @GetMapping("/identificador")
    public String identificador(@RequestParam("numero")Integer numero){
        return primeiroService.identificadorDeNumero(numero);

    }
}
