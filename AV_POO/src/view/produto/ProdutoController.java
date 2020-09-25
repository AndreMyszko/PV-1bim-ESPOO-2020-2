package view.produto;

import java.awt.Button;
import java.awt.TextArea;
import java.awt.TextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dao.Produto_dao;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import entidade.Produto;


public class ProdutoController extends Application implements Initializable{
	

	    @FXML
	    private Button btnFind;

	    @FXML
	    private Button btnRefresh;

	    @FXML
	    private Button btnNew;

	    @FXML
	    private Button btnEdit;

	    @FXML
	    private Button btnDelet;

	    @FXML
	    private TextField campoNome;

	    @FXML
	    private TextArea campoTabela;

	    @FXML
	    private TextField campoKg;

	    @FXML
	    private Label campoId;

	    @FXML
	    private TextField campoQtd;

	    @FXML
	    private TextField campoUV;

	    @FXML
	    private TextField campoUC;
	    
	    @FXML
	    private TextField campoVU;
	    
	    
	    @FXML
	    void btnInserir(ActionEvent event) {
	    	
	    }

	    @FXML
	    void btnEdit(ActionEvent event) {

	    }

	    @FXML
	    void btnDelet(ActionEvent event) {

	    }

	    @FXML
	    void btnFind(ActionEvent event) {
			String idString = campoNome.getText();
			Produto produto = null;
			if (!idString.equals("")) {
				try {
					int id = Integer.valueOf(idString);
					produto = new Produto_dao().FindByCod(id);
				} catch (Exception e) {

				}

				if (produto != null) {
					campoNome.setVisible(true);
					campoNome.setVisible(true);
					campoId.setText(produto.getCodProduto() + "");
					campoNome.setText(produto.getNomeProduto() + "");
					campoVU.setText(produto.getPuProduto() + "");
					campoQtd.setText(produto.getQtdProduto() + "");
					campoKg.setText(produto.getKgProduto() + "");
					campoUC.setText(produto.getUcProduto() + "");
					campoUV.setText(produto.getUvProduto() + "");
					
				}

			}

	    }

	    @FXML
	    void btnUpdate(ActionEvent event) {

	    }
	    	    
	    
	private Produto pegaDados() {
		
		return new Produto(campoNome.getText(), campoQtd.getText(), campoKg.getText(), campoUV.getText(), campoUC.getText(), campoUV.getText());
      
		
	}
	
	private void limpaCampos() {
		//textFielNome.clear();
		//textFielNome.clear();
		//...
		//(...).requestFocus;
	}
	
	
		
	public void start(Stage stage) {
		try {
			AnchorPane pane = (AnchorPane)FXMLLoader.load(getClass().getResource("produto.fxml"));
			Scene sc = new Scene(pane);
			stage.setScene(sc);
			stage.show();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void execute() {
		// TODO Auto-generated method stub	
		launch();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

	

	
	
}
