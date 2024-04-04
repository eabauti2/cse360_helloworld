package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class HelloWorldCSE360 extends Application{
	private static int WINDOW_WIDTH = 1100;
	private static int WINDOW_HEIGHT = 700;
	
	public static Scene mainScene;
	
	public void start(Stage primaryStage) {
		primaryStage.setTitle("In Class GitHub Activity");
		Pane pane = new Pane();

		mainScene = new Scene(pane, WINDOW_WIDTH, WINDOW_HEIGHT);

		VBox vbox = new VBox();
		Button activity = new Button("Alex'ss second commit");
		vbox.getChildren().add(activity);
		vbox.setAlignment(Pos.CENTER);

		pane.getChildren().add(vbox);

		primaryStage.setScene(mainScene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
		
		System.out.print("Hello World!");
		
	}

}
