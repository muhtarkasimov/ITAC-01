

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.ArrayList;

import static javafx.application.Application.launch;

public class ALab {

    public static void main(String[] args) throws Exception {
        ArrayList<User> list = new ArrayList<>();

        User u1 = new User();
        User u2 = new User();

        list.add(u1);
        list.add(u2);

//        launch();

        TESTController t1 = new TESTController();
        t1.test();
        u1.setUserName(Container.getName());
        System.out.println(u1.getUserName());




    }

//    @Override
//    public void start(Stage stage) throws Exception {
//        StackPane root = new StackPane();
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    }
}



class User {
    private String userName;

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}


