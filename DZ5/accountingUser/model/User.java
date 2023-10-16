package DZ5.accountingUser.model;

public class User {
    private String id = "";
    private String name;
    private String surname;
    private String phone;

    public User(String name, String surname, String phone) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    public User(String id, String name, String surname, String phone) {
        this(name, surname, phone);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return String.format("id: %s, Name: %s, Surname: %s, Phone: %s", id, name, surname, phone);
    }
}
