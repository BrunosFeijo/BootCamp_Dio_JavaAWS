package dioaula;

import dioaula.model.Usuario;
import dioaula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
//        Usuario usuario = new Usuario();
//        usuario.setName("Hegon");
//        usuario.setUsername("Hegon EU20");
//        usuario.setPassword("987654321");
//
//        repository.save(usuario);
        List<Usuario> usuarios = repository.findByNameContaining("Bruno");
        usuarios.add(repository.findByUsername("Hegon EU20"));
        for (Usuario u : usuarios) {
            System.out.println(u);
        }
    }
}
