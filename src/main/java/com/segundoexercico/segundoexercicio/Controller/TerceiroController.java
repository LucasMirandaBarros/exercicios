package com.segundoexercico.segundoexercicio.Controller;

import com.segundoexercico.segundoexercicio.Service.TerceiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/terceiro-controller")
public class TerceiroController {

    @Autowired
    private TerceiroService terceiroService;

    @GetMapping("/verificar-idade")
    public String verificarIdade(@RequestParam("idade")Integer idade){
        return terceiroService.verificarIdade(idade);
    }

}
