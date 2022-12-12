package udea.smartcity.mongo.contact;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "contacts")
@Data
@NoArgsConstructor
public class ContactData {
    @Id
    private String id;
}
