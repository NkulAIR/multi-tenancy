package service;

import model.Admin;
import model.Type;
import model.User;

import java.util.UUID;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        UUID uuid = UUID.randomUUID();
        User admin = new Admin(uuid, "Nkululeko", "Tshaka", "nktshjhb025@student.wethinkcode.co.za", "********", Type.Admin);

        System.out.println(admin.getUser_id());
        System.out.println(admin.getEmail());
    }
}
