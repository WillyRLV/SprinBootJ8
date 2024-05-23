//package com.example.demo.services;
//
//import com.example.demo.dao.UsuarioDao;
//import com.example.demo.domain.Rol;
//import com.example.demo.domain.Usuario;
//import java.util.ArrayList;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service("userDetailService")
//public class UsuarioService implements UserDetailsService{
//    
//    @Autowired
//    private UsuarioDao usuarioDao;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Usuario usuario = (Usuario) usuarioDao.findbyUsername(username);
//        
//        if (usuario ==null) {
//            throw new UsernameNotFoundException(username);
//        }
//        
//        ArrayList<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
//        
//        for (Rol rol : usuario.getRoles()) {
//            roles.add(new SimpleGrantedAuthority(rol.getNombre()));
//        }
//        
//        return new User(usuario.getUsername(),usuario.getPassword(),roles);
//    }
//    
//}
