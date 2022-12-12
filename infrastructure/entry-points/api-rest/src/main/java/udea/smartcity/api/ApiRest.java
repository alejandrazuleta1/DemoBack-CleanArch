package udea.smartcity.api;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import udea.smartcity.usecase.managmentuser.ManagmentUserUseCase;

import java.io.IOException;

@RestController
@RequestMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {

    private final ManagmentUserUseCase useCase;

    @GetMapping("/existe/{dato}")
    @ResponseStatus(HttpStatus.FOUND)
    public UserDto usernameUsuarioExiste(@PathVariable("dato") String dato) throws IOException {
        try {
            return Mapper.toDto(useCase.buscarUsuario(dato));
        } catch (Exception e2) {
            throw new IOException("Error al encontrar usuario: " + e2.getMessage());
        }
    }
}
