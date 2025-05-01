package com.tarea13.springboot_web.controlador;

import com.tarea13.springboot_web.servicio.UsuarioServicio;
import com.tarea13.springboot_web.modelo.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UsuarioControlador {

    @Autowired
    private UsuarioServicio usuarioServicio;

    @GetMapping("/usuarios")
    public String mostrarUsuarios(Model modelo) {
        List<Usuario> lista = usuarioServicio.obtenerUsuarios();
        modelo.addAttribute("usuarios", lista);
        return "usuarios";
    }
}
