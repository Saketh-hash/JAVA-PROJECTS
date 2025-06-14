package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class SimpleFormApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Labels
        Label nameLabel = new Label("Name:");
        Label phoneLabel = new Label("Phone:");
        Label emailLabel = new Label("Email:");

        // TextFields
        TextField nameField = new TextField();
        TextField phoneField = new TextField();
        TextField emailField = new TextField();

        // Submit Button
        Button submitButton = new Button("Submit");

        // Handle button click
        submitButton.setOnAction(e -> {
            String name = nameField.getText();
            String phone = phoneField.getText();
            String email = emailField.getText();

            // Basic action: Print input values
            System.out.println("Submitted Info:");
            System.out.println("Name: " + name);
            System.out.println("Phone: " + phone);
            System.out.println("Email: " + email);
        });

        // Layout
        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);

        // Add components to Grid
        grid.add(nameLabel, 0, 0);
        grid.add(nameField, 1, 0);
        grid.add(phoneLabel, 0, 1);
        grid.add(phoneField, 1, 1);
        grid.add(emailLabel, 0, 2);
        grid.add(emailField, 1, 2);
        grid.add(submitButton, 1, 3);

        // Scene
        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setTitle("Simple Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}