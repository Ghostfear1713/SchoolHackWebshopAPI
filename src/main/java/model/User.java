package model;
import DTOs.UserDTO;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@NoArgsConstructor
//Takes all properties
@AllArgsConstructor
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String name;
    String email;
    int phoneNumber;
    UserType userType;
    String password;








    public UserDTO convertToDTO(){
        UserDTO userDTO = new UserDTO(this.name, this.email, this.phoneNumber, this.userType);
        return userDTO;
    }





}
