package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entidade.Produto;

import db.conSQL;

public class Produto_dao extends conSQL{
	
	final String SQL_INSERT_PRODUTO = "INSERT INTO TB_Produto(nomeProduto, qtdProduto, kgProduto, puProduto, uvProduto, ucProduto) VALUES(?, ?, ?, ?, ?, ?)";
	final String SQL_SELECT_PRODUTO = "SELECT * FROM TB_Produto";		
	final String SQL_SELECT_PRODUTO_ID = "SELECT * FROM TB_Produto WHERE cod_produto = ?";
	final String SQL_UPDATE_PRODUTO = "UPDATE TB_Produto SET nomeProduto=?, qtdProduto=?, kgProduto=?, puProduto=?, uvProduto=?, ucProduto=? WHERE codProduto=?";
	final String SQL_DELETE_PRODUTO ="DELETE FROM TB_Produto WHERE cod_produto=?";

	PreparedStatement pst = null;
	
	
	public int Inserir(Produto produto) {
		int qtd = 0;
		
		try(Connection connection = this.conectar()) {
			pst = connection.prepareStatement(SQL_INSERT_PRODUTO);
			pst.setString(1, produto.getNomeProduto());
			pst.setInt(2, produto.getQtdProduto());
			pst.setFloat(3, produto.getKgProduto());
			pst.setFloat(4, produto.getPuProduto());
			pst.setDate(5, (java.sql.Date) produto.getUvProduto());
			pst.setDate(6, (java.sql.Date) produto.getUcProduto());
			
			qtd = pst.executeUpdate();			
			//System.out.println("Quantidade" + qtd);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return qtd;
	}
		
	public List<Produto> Listar() {
		List<Produto> listaProd = new ArrayList<Produto>();
	
		try(Connection connection = this.conectar()) {
			pst = connection.prepareStatement(SQL_SELECT_PRODUTO);
			ResultSet rs = pst.executeQuery();
							
			while(rs.next()) {
				Produto produto = new Produto();
				
				produto.setCodProduto(rs.getInt("codProduto"));
				produto.setNomeProduto(rs.getString("nomeProduto"));
				produto.setQtdProduto(rs.getInt("qtdProduto"));
				produto.setKgProduto(rs.getFloat("kgProduto"));
				produto.setPuProduto(rs.getFloat("puProduto"));
				produto.setUvProduto(rs.getDate("uvProduto"));
				produto.setUcProduto(rs.getDate("ucProduto"));
				
				//System.out.println(codProduto + " " + " " + nomeProduto + " " + qtdProduto + " " + kgProduto + " " + puProduto + " " + uvProduto + " " + ucProduto);
			}	
							
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listaProd;
	}
	
	public Produto FindByCod(int cod) {
		Produto produto = null;
		try(Connection connection = this.conectar()){
			pst = connection.prepareStatement(SQL_SELECT_PRODUTO_ID);
			pst.setInt(1, cod);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				produto = new Produto();
				
				produto.setCodProduto(rs.getInt("codProduto"));
				produto.setNomeProduto(rs.getString("nomeProduto"));
				produto.setQtdProduto(rs.getInt("qtdProduto"));
				produto.setKgProduto(rs.getFloat("kgProduto"));
				produto.setPuProduto(rs.getFloat("puProduto"));
				produto.setUvProduto(rs.getDate("uvProduto"));
				produto.setUcProduto(rs.getDate("ucProduto"));
				
			}
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return produto;
	}
	
	public int Update(Produto produto) {
		int qtd = 0;
		
		try (Connection connection = this.conectar()){
			PreparedStatement pst = connection.prepareStatement(SQL_UPDATE_PRODUTO);
			
			pst.setString(1, produto.getNomeProduto());
			pst.setInt(2, produto.getQtdProduto());
			pst.setFloat(3, produto.getKgProduto());
			pst.setFloat(4, produto.getPuProduto());
			pst.setDate(5, (java.sql.Date) produto.getUvProduto());
			pst.setDate(6, (java.sql.Date) produto.getUcProduto());
			
			pst.executeQuery();
			
		} catch (SQLException e) {
			// TODO: Auto-generated catch block
			e.printStackTrace();
		}
		
		return qtd;
	}
	
	public int Delete(int cod) {
		int qtd = 0;
		try (Connection connection = this.conectar()){
			pst = connection.prepareStatement(SQL_DELETE_PRODUTO);
			pst.setInt(1, cod);
			pst.executeQuery();
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return qtd;
	}
	

}
