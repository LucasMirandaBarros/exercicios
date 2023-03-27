package com.segundoexercico.segundoexercicio.Service;

import org.springframework.stereotype.Service;

@Service
public class TerceiroService {

    public String verificarIdade(Integer idade){

        if (idade >= 16){
            return "Você tem idade para votar!";
        }else {
            return "Você não tem idade para votar!";
        }
    }
}
