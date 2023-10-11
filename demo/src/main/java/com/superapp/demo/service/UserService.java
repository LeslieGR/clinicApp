package com.superapp.demo.service;

import com.superapp.demo.model.MedicalHistory;
import com.superapp.demo.model.User;
import com.superapp.demo.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

//Contiene toda la lógica del negocio

@Slf4j// viene de lombok y es para poner logs, que es lo equivalente a las lines de progreso del programa
@Service
public class UserService {
    @Autowired
//Es para inyectar o te habilita que puedas usar propiedades y métodos de la clase que esté debajo de esta anotación,
    // una especie de importación, va dentro de la clase
    private UserRepository userRepository;// Se pone private para que solo se use en esta clase

    // Esto es un bean, aún no sabemos que es
    public ResponseEntity<?> createUser(User user) {
        if (userRepository.findByEmail(user.getEmail()).isEmpty()) {
            userRepository.save(user);
            return ResponseEntity.status(HttpStatus.CREATED).body(user);
        } else {
            return ResponseEntity.status(HttpStatus.OK).body("El correo ya está registrado con otro usuario");
        }//if

    } // createUser
    public ResponseEntity<?> getUserByEmail(String email) {
        User user;
        if (userRepository.findByEmail(email).isPresent()) {
            user = userRepository.findByEmail(email).get();
            return ResponseEntity.status(HttpStatus.OK).body("Tu información es la siguiente: " + user);
        } else {
            return ResponseEntity.status(HttpStatus.OK).body("Ese usuario no existe");//investigar como regresar el reponse entity, va a ser un String y un http status, cual es el http code que va a regreser, tenog que regresar un 200 pero investigar uno que se parezca
        }//getUserByEmail

    }

    public ResponseEntity<?> updateUser(User user) {
            userRepository.save(user);
            return ResponseEntity.status(HttpStatus.OK).body("Tu información actualizada es la siguiente: " + user);
    }//updateUser
    public ResponseEntity<String> deleteUser(Integer id) {
        userRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Se eliminó el usuario correctamente");
    }
}
