package udea.smartcity.model.contact;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Contact {
    private String id;
}
