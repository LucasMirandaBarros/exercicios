package com.segundoexercico.segundoexercicio.Service;

import org.springframework.stereotype.Service;

@Service
public class PrimeiroService {

    public String identificadorDeNumero(Integer numero){

        if (numero > 0) {
            return "Numero positivo";
        } else if (numero < 0) {
            return "Numero negativo";
        } else {
            return "O numero é 0";
        }

    }
}
