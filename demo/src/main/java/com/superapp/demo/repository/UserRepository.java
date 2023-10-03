package com.superapp.demo.repository;
import com.superapp.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository //Es un objeto de acceso de datos, que accesa a la base de datos directamente,
// hace todas  las operaciones relacionadas a la base de datos
//siempre va a ser interfaz, métodos sin implementación, sólo con los párametros que va a llevar.

public interface UserRepository extends JpaRepository <User, Integer> {//<tipo de objeto de tu clase, tipo de Id de es clase u objeto>
    Optional<User> findByEmail (String email);
    void deleteByEmail (String email);
}
