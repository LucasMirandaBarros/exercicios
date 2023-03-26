package com.segundoexercico.segundoexercicio.Controller;

import com.segundoexercico.segundoexercicio.Service.PrimeiroService;
import com.segundoexercico.segundoexercicio.Service.SegundoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/segundo-controller")
public class SegundoController {

    @Autowired
    private SegundoService segundoService;

    @GetMapping("/identificador")
    public String identificador(@RequestParam("numero")Integer numero){
        return segundoService.identificadorDeNumero(numero);
    }
}
