package com.MathStore.tiendita_online.backend.domain.port;

import com.MathStore.tiendita_online.backend.domain.model.User;



public interface IUserRepository {
   User save(User user);
   User findByEmail(String email);
   User findById (Integer id);
}
