package com.segundoexercico.segundoexercicio.Service;

import org.springframework.stereotype.Service;

@Service
public class QuintoService {

    public String numeroDivisivel(Integer numero1, Integer numero2){

        if(numero1 % numero2 == 0){
            return numero1 + " É divisivel por " + numero2 ;
        } else{
            return numero1 + " Não é divisivel " + numero2;
        }
    }
}
