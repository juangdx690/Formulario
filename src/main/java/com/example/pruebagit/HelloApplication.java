package com.example.pruebagit;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        /*FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();*/

        stage.setTitle("Formulario java");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));

        Scene scene = new Scene (grid, 300, 275);

        stage.setScene(scene);

        Text titulo = new Text("Bienvenido");
        titulo.setFont(Font.font("Calibri", FontWeight.BOLD, 20));
        grid.add(titulo, 0, 0, 2,1);

        Label usuario = new Label("Usuario");
        grid.add(usuario, 0, 1);

        TextField txtUsuario = new TextField();
        grid.add(txtUsuario,1,1);

        Label clave = new Label("Clave");
        grid.add(clave, 0, 2);

        TextField txtClave = new TextField();
        grid.add(txtClave,1,2);

        Button btn = new Button("Iniciar Sesión");
        HBox hbtn = new HBox(10);
        hbtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbtn.getChildren().addAll(btn);
        grid.add(hbtn, 1,4);

       btn.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
           @Override
           public void handle(MouseEvent mouseEvent) {
               Stage stage2 = new Stage();
               VBox pijo = new VBox();
               Scene pija = new Scene (pijo, 300, 275);
               stage2.setScene(pija);

               Text txt = new Text();

               if (txtUsuario.getLength() == 0 && txtClave.getLength() == 0){
                   txt.setText("No tienes nombre de usuario ni clave");
               }else {

                       if (txtUsuario.getText().length()==0){
                           txt.setText("No tienes nombre de usuario");
                       }
                       else {
                           if (txtClave.getText().length()==0){
                               txt.setText("No tienes clave");
                           }
                           else {
                               txt.setText("Tu usuarioa es: "+ txtUsuario.getText()+ " y tu contraseña es: " +txtClave.getText());

                       }
                   }
               }

               pijo.getChildren().addAll(txt);

               stage2.show();

           }
       });

        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}