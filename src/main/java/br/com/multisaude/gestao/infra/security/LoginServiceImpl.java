package br.com.multisaude.gestao.infra.security;

import br.com.multisaude.gestao.infra.login.LoginRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements UserDetailsService {
    @Autowired
    LoginRepositoryJPA repository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return  repository.findByUsuario(username).
                orElseThrow(() -> new UsernameNotFoundException("Usuario não encontrado: "+ username) );
    }
}
