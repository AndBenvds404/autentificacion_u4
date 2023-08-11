package com.example.pw_autorizacion_u4_ab.repository;

import org.springframework.stereotype.Repository;

import com.example.pw_autorizacion_u4_ab.repository.entidad.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UsuarioRepositoryImpl implements IUsuarioRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Usuario consultarPorUserName(String userName) {

        var usu = this.entityManager.createQuery("SELECT u FROM Usuario u WHERE u.userName=:datoUserName",
                Usuario.class);
        usu.setParameter("datoUserName", userName);
        return usu.getSingleResult();
    }

}
