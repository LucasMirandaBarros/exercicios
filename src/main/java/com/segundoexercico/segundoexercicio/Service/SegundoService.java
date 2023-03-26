package com.segundoexercico.segundoexercicio.Service;

import org.springframework.stereotype.Service;

@Service
public class SegundoService {
    public String identificadorDeNumero(Integer numero){

        if(numero % 2 == 0){
            return "Esse numero é par";
        } else {
            return "Esse numero é impar";
        }
    }
}
