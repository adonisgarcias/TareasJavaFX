package application;
	
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage){
		AnchorPane root= new AnchorPane();
		root.setPadding(new Insets(10));
		
		ListView<String> listV= new ListView<>();
		listV.setItems(FXCollections.observableArrayList());
		root.getChildren().add(listV);
		AnchorPane.setTopAnchor(listV, 20.0);
		AnchorPane.setLeftAnchor(listV, 300.0);
		AnchorPane.setBottomAnchor(listV, 50.0);
		AnchorPane.setRightAnchor(listV, 20.0);
		
		TextField textF = new TextField();
		textF.setPromptText("Ingrese....");
		root.getChildren().add(textF);
		AnchorPane.setBottomAnchor(textF, 20.0);
		AnchorPane.setLeftAnchor(textF, 300.0);
		AnchorPane.setRightAnchor(textF, 20.0);
		textF.setPrefWidth(180);
		
        Image imagen1 = new Image("https://s.yimg.com/ny/api/res/1.2/kKV2PgJAUx31yY1ansALog--/YXBwaWQ9aGlnaGxhbmRlcjt3PTY0MDtoPTY0MA--/https://media.zenfs.com/en/homerun/feed_manager_auto_publish_494/82f09e36d36dc1ee7ffc20f1effb53d0");
        ImageView imageV1 = new ImageView(imagen1);
        imageV1.setFitWidth(50);
        imageV1.setFitHeight(50);
        root.getChildren().add(imageV1);
        AnchorPane.setTopAnchor(imageV1, 10.0);
        AnchorPane.setLeftAnchor(imageV1, 10.0);

        Label nomL1 = new Label("Marco Pepe Perez Torres");
        root.getChildren().add(nomL1);
        AnchorPane.setTopAnchor(nomL1, 20.0);
        AnchorPane.setLeftAnchor(nomL1, 70.0);

        Image imagen2 = new Image("https://media.licdn.com/dms/image/D5603AQFuvDCRcLqQVA/profile-displayphoto-shrink_400_400/0/1688808785010?e=2147483647&v=beta&t=VcsMBYps_-2eTRmBsMUaMxSik_0p_hLBVSfWk06-fvw");
        ImageView imageV2 = new ImageView(imagen2);
        imageV2.setFitWidth(50);
        imageV2.setFitHeight(50);
        root.getChildren().add(imageV2);
        AnchorPane.setTopAnchor(imageV2, 70.0);
        AnchorPane.setLeftAnchor(imageV2, 10.0);

        Label nomL2 = new Label("Juan Felipe Pilataxis González");
        root.getChildren().add(nomL2 );
        AnchorPane.setTopAnchor(nomL2 , 80.0);
        AnchorPane.setLeftAnchor(nomL2, 70.0);

        Image imagen3 = new Image("https://f.rpp-noticias.io/2019/02/15/753297descarga-8jpg.jpg");
        ImageView imageV3 = new ImageView(imagen3);
        imageV3.setFitWidth(50);
        imageV3.setFitHeight(50);
        root.getChildren().add(imageV3);
        AnchorPane.setTopAnchor(imageV3, 130.0);
        AnchorPane.setLeftAnchor(imageV3, 10.0);

        Label nomL3 = new Label("Ana Cristel Vargas Suarez");
        root.getChildren().add(nomL3);
        AnchorPane.setTopAnchor(nomL3, 140.0);
        AnchorPane.setLeftAnchor(nomL3, 70.0);

        Image imagen4 = new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQw7GfPFgzaecgVqoPTdjq1lk9UX-JOk5cS12QvbHViQoUK9-gilSMXbkgDonNsLHhxii4&usqp=CAU");
        ImageView imageV4 = new ImageView(imagen4);
        imageV4.setFitWidth(50);
        imageV4.setFitHeight(50);
        root.getChildren().add(imageV4);
        AnchorPane.setTopAnchor(imageV4, 190.0);
        AnchorPane.setLeftAnchor(imageV4, 10.0);

        Label nomL4 = new Label("Alejandro Dennis Martinez Velez");
        root.getChildren().add(nomL4);
        AnchorPane.setTopAnchor(nomL4, 200.0);
        AnchorPane.setLeftAnchor(nomL4, 70.0);
        
        Image imagen5 = new Image("https://i0.wp.com/www.diarlu.com/wp-content/uploads/2019/09/rostro-mujer-adulta.jpg?resize=500%2C500&ssl=1");
        ImageView imageV5 = new ImageView(imagen5);
        imageV5.setFitWidth(50);
        imageV5.setFitHeight(50);
        root.getChildren().add(imageV5);
        AnchorPane.setTopAnchor(imageV5, 250.0);
        AnchorPane.setLeftAnchor(imageV5, 10.0);

        Label nomL5= new Label("Laura Julieta Vite Zambrano");
        root.getChildren().add(nomL5);
        AnchorPane.setTopAnchor(nomL5, 260.0);
        AnchorPane.setLeftAnchor(nomL5, 70.0);
        
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Listado de Clientes Ingresados");
        primaryStage.show();
    }


	public static void main(String[] args) {
		launch(args);
	}
}
