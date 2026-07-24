package model;

import java.util.UUID;

public class Admin extends User{
    public Admin(UUID user_id, String first_name, String last_name, String email, String password_hash, Type type) {
        super(user_id, first_name, last_name, email, password_hash);
        super.setUserType(type);

    }

}
