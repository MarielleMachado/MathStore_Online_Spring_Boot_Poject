package com.MathStore.tiendita_online.backend.infrastucture;

import com.MathStore.tiendita_online.backend.domain.model.User;
import com.MathStore.tiendita_online.backend.domain.port.IUserRepository;
import com.MathStore.tiendita_online.backend.infrastucture.adapter.IUserCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserCrudRepositoryImpl implements IUserRepository {
    private final IUserCrudRepository iUserCrudRepository;

    public UserCrudRepositoryImpl(IUserCrudRepository iUserCrudRepository) {
        this.iUserCrudRepository = iUserCrudRepository;
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public User findByEmail(String email) {
        return null;
    }

    @Override
    public User findById(Integer id) {
        return null;
    }
}
