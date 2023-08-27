package br.com.multisaude.gestao.infra.login;

import br.com.multisaude.gestao.dominio.login.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;


@Repository
public interface LoginRepositoryJPA extends JpaRepository<Login, UUID> {

       Optional<Login> findByUsuario(String username);

}
