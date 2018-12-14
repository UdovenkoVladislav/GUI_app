package sample;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.TableColumn;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Controller {
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;

    @FXML
    private TableView tableView1;
    @FXML
    private TableView tableView2;
    @FXML
    private TableView tableView3;

    @FXML
    public void initialize(){
        button1.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                TableColumn col_1 = new TableColumn();
                tableView1.getColumns().add(col_1);
                col_1.prefWidthProperty().bind(tableView1.widthProperty().multiply(0.15));
                col_1.setResizable(false);
                TableColumn col_2 = new TableColumn();
                tableView2.getColumns().add(col_2);
                col_2.prefWidthProperty().bind(tableView2.widthProperty().multiply(0.15));
                col_2.setResizable(false);
                TableColumn col_3 = new TableColumn();
                tableView3.getColumns().add(col_3);
                col_3.prefWidthProperty().bind(tableView3.widthProperty().multiply(0.15));
                col_3.setResizable(false);
            }
        });
        button2.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                ObservableList<String> row = FXCollections.observableArrayList();
                row.add("df");
                tableView1.getItems().add(row);

                ObservableList<String> row2 = FXCollections.observableArrayList();
                row2.add("df");
                tableView2.getItems().add(row2);

                ObservableList<String> row3 = FXCollections.observableArrayList();
                row3.add("df");
                tableView3.getItems().add(row3);
            }
        });
        button3.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

            }
        });
    }

}
