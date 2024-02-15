package app.model;

public class AppUsersModel {

    private final String name;
    private final String e_mail;
    private final String age;


    public AppUsersModel(String name, String e_mail, String age) {
        this.name = name;
        this.e_mail = e_mail;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Ім'я: " + name + ", Вік: " + age + ", e-mail: " + e_mail;
    }
}
