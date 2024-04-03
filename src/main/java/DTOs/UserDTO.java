package DTOs;

import model.UserType;

public record UserDTO(String name, String email, int phoneNumber, UserType userType) {

}
