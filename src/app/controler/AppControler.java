package app.controler;

import app.model.AppUsersModel;
import app.view.AppView;

import java.util.ArrayList;

public class AppControler {
    AppView view = new AppView();

    public void runApp() {

        ArrayList<AppUsersModel> users;
        users = getUsers();

        showUsers(users);
        showAllInfoUser(users, view.chooseUser());
    }

    public ArrayList<AppUsersModel> getUsers() {
        ArrayList<AppUsersModel> users = new ArrayList<>();

        AppUsersModel user1 = new AppUsersModel("Сергій", "sergiy@gmail.com", "55");
        AppUsersModel user2 = new AppUsersModel("Іван", "ivan@gmail.com", "37");
        AppUsersModel user3 = new AppUsersModel("Олександр", "sashok@gmail.com", "26");
        AppUsersModel user4 = new AppUsersModel("Владислав", "vlad95@gmail.com", "27");
        AppUsersModel user5 = new AppUsersModel("Ярослав", "ba4okpotik@gmail.com", "19");

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        return users;

    }

    public void showUsers(ArrayList<AppUsersModel> users) {
        int cnt = 0;
        String output;

        for (AppUsersModel user : users) {
            cnt++;
            output = cnt + ") " + user.getName();
            view.showText(output);
        }
    }

    public void showAllInfoUser(ArrayList<AppUsersModel> users, int indx) {

        try {
            String output = users.get(indx).toString();
            view.showText(output);
        } catch (IndexOutOfBoundsException e) {
            view.showText("Неіснуючий індекс!!!");

        } catch (NumberFormatException e) {
            view.showText("Введіть число!!!");
        }

    }
}
