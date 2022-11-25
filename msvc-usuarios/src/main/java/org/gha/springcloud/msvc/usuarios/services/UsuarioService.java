package org.gha.springcloud.msvc.usuarios.services;

import java.util.List;
import java.util.Optional;

import org.gha.springcloud.msvc.usuarios.models.entity.Usuario;

public interface UsuarioService {
    List<Usuario> listar();
    Optional<Usuario> porId(Long id);
    Usuario guardar(Usuario usuario);
    void eliminar(Long id);
}
