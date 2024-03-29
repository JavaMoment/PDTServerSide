package com.services;

import java.util.List;

import javax.ejb.Remote;

import com.entities.Usuario;

@Remote
public interface UsuarioBeanRemote extends CRUDRemote<Usuario, Long> {

	String selectPasswBy(String mail);
	boolean isUserRegistered(String username);

	Usuario selectUserBy(String mailOrUsername);

	int logicalDeleteByUsername(String username);

	int activeUserBy(String username);
	List<Usuario> selectAllStudents();

}
