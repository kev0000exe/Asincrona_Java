package com.tarea13.springboot_web.servicio;

import com.tarea13.springboot_web.modelo.Usuario;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class UsuarioServicio {

    public List<Usuario> obtenerUsuarios() {
        return Arrays.asList(
            new Usuario("Juan", "Pérez", "juan@example.com"),
            new Usuario("Laura", "Ramírez", null),
            new Usuario("Carlos", "Sánchez", "carlos@example.com")
        );
    }
}
