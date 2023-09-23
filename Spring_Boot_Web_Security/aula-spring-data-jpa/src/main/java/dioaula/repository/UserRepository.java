package dioaula.repository;

import dioaula.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<Usuario, Integer> {
    //Query Method
    List<Usuario> findByNameContaining(String name);
    //Query Method
    Usuario findByUsername(String username);
    //Query Override
    @Query("SELECT u FROM Usuario u WHERE u.username LIKE %:username%")
    List<Usuario> filtrarPorUserName(@Param("username") String username);
}
