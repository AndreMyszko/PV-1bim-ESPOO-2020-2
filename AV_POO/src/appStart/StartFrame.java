package appStart;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import view.produto.ProdutoController;

public class StartFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("OK");
		
		new ProdutoController().execute();
		
	}

}
