package com.segundoexercico.segundoexercicio.Controller;

import com.segundoexercico.segundoexercicio.Service.QuintoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quinto-controller")
public class QuintoController {

    @Autowired
    private QuintoService quintoService;

    @GetMapping("/divisor")
    public String verificarDivisor(@RequestParam("numero1")Integer numero1,@RequestParam("numero2")Integer numero2){
        return quintoService.numeroDivisivel(numero1,numero2);
    }
}
