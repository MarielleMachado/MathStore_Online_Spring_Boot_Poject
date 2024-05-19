package com.MathStore.tiendita_online.backend.infrastucture.adapter;

import com.MathStore.tiendita_online.backend.infrastucture.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface IUserCrudRepository extends CrudRepository<UserEntity,Integer> {

}
