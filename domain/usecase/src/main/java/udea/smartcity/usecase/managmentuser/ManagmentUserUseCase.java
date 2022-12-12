package udea.smartcity.usecase.managmentuser;

import lombok.RequiredArgsConstructor;
import udea.smartcity.model.user.User;
import udea.smartcity.model.user.gateways.UserRepository;

@RequiredArgsConstructor
public class ManagmentUserUseCase {
    private final UserRepository userRepository;

    public User buscarUsuario(String username) {
        return userRepository.findByUsername(username);
    }
}
