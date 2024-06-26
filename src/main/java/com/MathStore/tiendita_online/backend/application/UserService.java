package com.MathStore.tiendita_online.backend.application;

import com.MathStore.tiendita_online.backend.domain.model.User;
import com.MathStore.tiendita_online.backend.domain.port.IUserRepository;


public class UserService {
    private final IUserRepository iUserRepository;

    public UserService(IUserRepository iUserRepository) {
        this.iUserRepository = iUserRepository;
    }
    public User save(User user){
        return this.iUserRepository.save(user);
    }
    public User findById(Integer id){
        return  this.iUserRepository.findById(id);
    }
}
