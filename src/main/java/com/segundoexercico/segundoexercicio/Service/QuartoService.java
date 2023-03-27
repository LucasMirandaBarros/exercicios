package com.segundoexercico.segundoexercicio.Service;

import org.springframework.stereotype.Service;

@Service
public class QuartoService {

    public String verificarvogalOuConsoante(Character caractere){


        if (caractere == 'a' || caractere == 'A' || caractere == 'e' || caractere == 'E'
                || caractere == 'i' || caractere == 'I' || caractere == 'o'
                || caractere == 'O' || caractere == 'u' || caractere == 'U'){
            return "Esse Caractere é uma volgal!";
        } else if (caractere == '1' || caractere == '2' || caractere == '3' ||
                caractere == '4' || caractere == '5' || caractere == '6' ||
                caractere == '7' || caractere == '8' ||  caractere == '9') {
            return "Esse caractere é um numeral";
        }else {
             return "Esse caractere é uma consoante";
            }

    }
}
