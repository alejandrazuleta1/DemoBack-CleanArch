package udea.smartcity.model.user;
import lombok.Builder;
import lombok.Data;
import udea.smartcity.model.contact.Contact;

import java.util.List;

@Data
@Builder(toBuilder = true)
public class User {
    private final String id;
    private final String username;
    private final String email;
    private final String name;
    private final String lastName;
    private final String fechaVerificacion;
    private final List<Contact> contacts;
    private final String cellPhone;
    private final Boolean firstSession;
    private final String colour;
}
