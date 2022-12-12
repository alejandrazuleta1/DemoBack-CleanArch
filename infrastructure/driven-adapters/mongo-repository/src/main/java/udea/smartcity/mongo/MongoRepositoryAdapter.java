package udea.smartcity.mongo;

import udea.smartcity.model.user.User;
import udea.smartcity.model.user.gateways.UserRepository;
import udea.smartcity.mongo.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import udea.smartcity.mongo.user.UserData;

@Repository
public class MongoRepositoryAdapter extends AdapterOperations<User, UserData, String, MongoDBRepository>
 implements UserRepository
{

    public MongoRepositoryAdapter(MongoDBRepository repository, ObjectMapper mapper) {
        super(repository, mapper, d -> mapper.map(d, User.UserBuilder.class).build());
    }

    @Override
    public User findByUsername(String username) {
        return toEntity(repository.findByUsername(username));
    }

    @Override
    public User findByUsernameOrEmail(String username, String email) {
        return toEntity(repository.findByUsernameOrEmail(username, email));
    }

    @Override
    public Boolean existsByUsername(String username) {
        return repository.existsByUsername(username);
    }

    @Override
    public Boolean existsByEmail(String email) {
        return repository.existsByEmail(email);
    }

    @Override
    public Boolean existsByUsernameOrEmail(String username, String email) {
        return repository.existsByUsernameOrEmail(username, email);
    }

    @Override
    public void deleteByUsername(String username) {
        repository.deleteByUsername(username);
    }
}
