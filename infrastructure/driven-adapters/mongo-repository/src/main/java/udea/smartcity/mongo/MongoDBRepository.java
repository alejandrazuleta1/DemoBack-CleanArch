package udea.smartcity.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import udea.smartcity.mongo.user.UserData;

public interface MongoDBRepository extends MongoRepository<UserData, String> , QueryByExampleExecutor<UserData> {
    UserData findByUsername(@Param("username") String username);

    UserData findByUsernameOrEmail(@Param("username") String username, @Param("username") String email);

    Boolean existsByUsername(@Param("username") String username);

    Boolean existsByEmail(@Param("email") String email);

    Boolean existsByUsernameOrEmail(@Param("username") String username, @Param("username") String email);

    void deleteByUsername(@Param("username") String username);
}
