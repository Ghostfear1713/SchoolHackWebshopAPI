import DTOs.UserDTO;
import model.User;

public class Main {

    public static void main(String[] args) {

        User user = new User(7, "Orhan", 28, "Uniton@live.dk");
        //We set our DTO into a variable, userDTO
        UserDTO userDTO = user.convertToDTO();


    }

}
