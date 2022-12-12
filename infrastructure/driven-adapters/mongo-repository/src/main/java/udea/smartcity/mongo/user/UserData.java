package udea.smartcity.mongo.user;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import udea.smartcity.mongo.contact.ContactData;

import java.util.List;

@Document(collection = "users")
@Data
@NoArgsConstructor
public class UserData {
    @Id
    private String id;
    @Indexed(unique = true)
    private String username;
    @Indexed(unique = true)
    private String email;
    private String name;
    private String lastName;
    private String fechaVerificacion;
    private List<ContactData> contacts;
    private String cellPhone;
    private Boolean firstSession;
    private String colour;
}
