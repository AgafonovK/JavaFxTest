import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class HelloWorld extends Application {
    Stage window;
    BorderPane layout;
    @Override
    public void start(Stage primaryStage) throws Exception {

        window =primaryStage;
        window.setTitle("My program");

        //File Menu
        Menu filemenu = new Menu("File");

        //Menu items
        filemenu.getItems().add(new MenuItem("File open..."));

        //MenuBar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(filemenu);

        StackPane root = new StackPane();
        Scene scene = new Scene(root,300,250);
        primaryStage.show();

    }

    public static void main (String [] args){
        launch(args);
    }
}
