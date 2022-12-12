package udea.smartcity.api;

import udea.smartcity.model.user.User;

public class Mapper {
    public static UserDto toDto(User user) {
        return user!= null ? new UserDto(user.getId(), user.getName(), user.getEmail(), user.getName()): null;
    }
}
