package udea.smartcity.model.user.gateways;

import udea.smartcity.model.user.User;

public interface UserRepository {
    User findByUsername(String username);
    User findByUsernameOrEmail(String username, String email);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
    Boolean existsByUsernameOrEmail(String username, String email);
    void deleteByUsername(String username);
}
