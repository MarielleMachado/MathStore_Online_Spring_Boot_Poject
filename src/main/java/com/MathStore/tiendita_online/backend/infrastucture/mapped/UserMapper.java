package com.MathStore.tiendita_online.backend.infrastucture.mapped;

import com.MathStore.tiendita_online.backend.domain.model.User;
import com.MathStore.tiendita_online.backend.infrastucture.UserEntity;
import org.mapstruct.*;

@Mapper(componentModel =  "spring")
public interface UserMapper {
    @Mappings(
            {
                    @Mapping(source = "id", target = "id"),
                    @Mapping(source = "username", target = "username"),
                    @Mapping(source = "lastname", target = "lastname"),
                    @Mapping(source = "email", target = "email"),
                    @Mapping(source = "address", target = "address"),
                    @Mapping(source = "cellphone", target = "cellphone"),
                    @Mapping(source = "password", target = "password"),
                    @Mapping(source = "userType", target = "userType"),
                    @Mapping(source = "dateCreated", target = "dateCreated"),
                    @Mapping(source = "dateUpdated", target = "dateUpdated"),
            }
    )
    User toUser(UserEntity userEntity);
    Iterable<User> toUser (Iterable<UserEntity> userEntity);

   @InheritInverseConfiguration
    UserEntity toUserEntity (User user);
}
