package com.MathStore.tiendita_online.backend.infrastucture.adapter;

import com.MathStore.tiendita_online.backend.infrastucture.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserCrudRepository extends CrudRepository<UserEntity,Integer> {

}
