package com.comp301.a08dungeon.view;

import com.comp301.a08dungeon.controller.Controller;
import com.comp301.a08dungeon.controller.ControllerImpl;
import com.comp301.a08dungeon.model.Model;
import com.comp301.a08dungeon.model.ModelImpl;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLauncher extends Application {

    @Override
    public void start(Stage stage) {
        Model appModel = new ModelImpl(128,32);
        Controller controller = new ControllerImpl(appModel);
        View view = new View(controller, appModel);
        appModel.addObserver(view);


        Scene scene = new Scene(view.render(), 128,32);
        scene.getStylesheets().add("dungeon.css");

        stage.setScene(scene);
        stage.setTitle("Celestial Denizen"); // knockoff star citizen lol
        stage.show();
    }
}
