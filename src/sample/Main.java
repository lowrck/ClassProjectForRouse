package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
       // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        int height, width;
        width = 900;
        height = 900;
        Color GlassesColor = Color.rgb(143, 45, 17);
        Circle circle = new Circle();
        circle.setCenterX(width / 2);
        circle.setCenterY(height / 2);
        circle.setRadius(250.0f);
        circle.setFill(Color.rgb(255, 255, 0));
        Arc arc = new Arc(150, 100, 80+30, 80, 50 + 180, 35);
        arc.setCenterX(width/2);
        arc.setCenterY((height / 2) + 100);
        arc.setStartAngle(135.0f);
        arc.setLength(270.0f);
        arc.setType(ArcType.CHORD);
        //Irises for eyes
        Circle Eyes1 = new Circle();
        Eyes1.setCenterX(width / 2 - 100);
        Eyes1.setCenterY(height / 2);
        Eyes1.setRadius(25.0f);
        Eyes1.setFill(Color.WHITE);
        Circle Eyes2 = new Circle();
        Eyes2.setCenterX(width / 2 + 100);
        Eyes2.setCenterY(height / 2);
        Eyes2.setRadius(25.0f);
        Eyes2.setFill(Color.WHITE);
        //Eye Centers
        Circle InnerEyes1 = new Circle();
        InnerEyes1.setCenterX(width / 2 - 100);
        InnerEyes1.setCenterY(height / 2);
        InnerEyes1.setRadius(15.0f);
        InnerEyes1.setFill(Color.rgb(0, 200,200));
        Circle InnerEyes2 = new Circle();
        InnerEyes2.setCenterX(width / 2 + 100);
        InnerEyes2.setCenterY(height / 2);
        InnerEyes2.setRadius(15.0f);
        InnerEyes2.setFill(Color.rgb(0, 200,200));
        //Glasses for eye 1
        Rectangle Glasses1 = new Rectangle();
        Glasses1.setHeight(60);
        Glasses1.setWidth(100);
        Glasses1.setX(height/2 + 50);
        Glasses1.setY(Eyes1.getCenterY() - 30);
        Glasses1.setFill(Color.TRANSPARENT);
        Glasses1.setStroke(GlassesColor);
        //Glasses for eye 2
        Rectangle Glasses2 = new Rectangle();
        Glasses2.setHeight(60);
        Glasses2.setWidth(100);
        Glasses2.setX((width/2)-100 - 50);
        Glasses2.setY(height/2 - 30);
        Glasses2.setFill(Color.TRANSPARENT);
        Glasses2.setStroke(GlassesColor);
       //Glasses nose bridge
        Rectangle noseBridge = new Rectangle();
        noseBridge.setX(399.0f);
        noseBridge.setY(443.0f);
        noseBridge.setWidth(100.0f);
        noseBridge.setHeight(464.0f-443.0f);
        noseBridge.setFill(GlassesColor);
        Rectangle Ear2 = new Rectangle(600, 439, 100, 21);
        Ear2.setFill(GlassesColor);
        Rectangle Ear1 = new Rectangle(199, 439, 100, 21);
        Ear1.setFill(GlassesColor);

        //Text field for professor name
        Text Name = new Text();
        Name.setFont(Font.loadFont("http://marxalot.com/DoubleStrike.ttf",24));
        Name.setX(236);
        Name.setY(796);
        Name.setText("Dr. Rouse by Lewis Marx");




        //Initialization of render groups
        Group root = new Group(circle);
        ObservableList<Node> child = root.getChildren();
        child.add(arc);
        child.add(Eyes1);
        child.add(Eyes2);
        child.add(InnerEyes1);
        child.add(InnerEyes2);
        child.add(Glasses1);
        child.add(Glasses2);
        child.add(noseBridge);
        child.add(Ear2);
        child.add(Ear1);
        child.add(Name);




        primaryStage.setTitle("Hello World");
        Scene scene = new Scene(root ,width, height);
        scene.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override public void handle(MouseEvent event) {
                String msg = "(x: " + event.getX() + ", y: " + event.getY() + ")";
                System.out.println(msg);
            }
        });
        primaryStage.setScene(scene);
        primaryStage.show();



    }


    public static void main(String[] args) {
        launch(args);
    }
}
