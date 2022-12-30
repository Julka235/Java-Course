package org.futurecollars.lesson4.notes;

import java.util.Objects;

public class User {

    public static void main(String[] args) {
        User admin = new User("admin", "admin@admin.com", "admin", Permission.ADMIN);
        User admin2 = new User("admin", "admin@admin.pl", "admin", Permission.NONE);
      //  User admin3 = new User("admin", "admin@admin.pl", "admin", );
        String adminAsText = admin.toString();
        System.out.println(adminAsText);

        boolean equals = admin.equals(admin2);
        System.out.println(equals);

        int hashCode = admin.hashCode();
        System.out.println(hashCode);//9131692

        System.out.println(Permission.ADMIN);

        // toString()
        // hashcode
        // equals
    }

    private final String name;
    private final String email;
    private final String password;
    private final Permission permissions;

    public User(String name, String email, String password, Permission permissions) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.permissions = permissions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(email, user.email) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    private enum Permission {
        ADMIN, NONE
    }
}
