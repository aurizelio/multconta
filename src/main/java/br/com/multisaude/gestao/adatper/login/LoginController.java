package br.com.multisaude.gestao.adatper.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("login")
    public  String telaDeLogin(){
        return "login";
    }
}
