package entidade;

import java.util.Date;

public class Produto {
	public int codProduto;
	public String nomeProduto;
	public int qtdProduto;
	public float kgProduto;
	public float puProduto;
	public Date uvProduto;
	public Date ucProduto;
	
	public Produto(){
		
	}
	
	public Produto(String text, String text2, String text3, String text4, String text5, String text6) {
		// TODO Auto-generated constructor stub
		
	}
	
	public int getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public int getQtdProduto() {
		return qtdProduto;
	}
	public void setQtdProduto(int qtdProduto) {
		this.qtdProduto = qtdProduto;
	}
	public float getKgProduto() {
		return kgProduto;
	}
	public void setKgProduto(float kgProduto) {
		this.kgProduto = kgProduto;
	}
	public float getPuProduto() {
		return puProduto;
	}
	public void setPuProduto(float puProduto) {
		this.puProduto = puProduto;
	}
	public Date getUvProduto() {
		return uvProduto;
	}
	public void setUvProduto(Date uvProduto) {
		this.uvProduto = uvProduto;
	}
	public Date getUcProduto() {
		return ucProduto;
	}
	public void setUcProduto(Date ucProduto) {
		this.ucProduto = ucProduto;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codProduto;
		result = prime * result + Float.floatToIntBits(kgProduto);
		result = prime * result + ((nomeProduto == null) ? 0 : nomeProduto.hashCode());
		result = prime * result + Float.floatToIntBits(puProduto);
		result = prime * result + qtdProduto;
		result = prime * result + ((ucProduto == null) ? 0 : ucProduto.hashCode());
		result = prime * result + ((uvProduto == null) ? 0 : uvProduto.hashCode());
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (codProduto != other.codProduto)
			return false;
		if (Float.floatToIntBits(kgProduto) != Float.floatToIntBits(other.kgProduto))
			return false;
		if (nomeProduto == null) {
			if (other.nomeProduto != null)
				return false;
		} else if (!nomeProduto.equals(other.nomeProduto))
			return false;
		if (Float.floatToIntBits(puProduto) != Float.floatToIntBits(other.puProduto))
			return false;
		if (qtdProduto != other.qtdProduto)
			return false;
		if (ucProduto == null) {
			if (other.ucProduto != null)
				return false;
		} else if (!ucProduto.equals(other.ucProduto))
			return false;
		if (uvProduto == null) {
			if (other.uvProduto != null)
				return false;
		} else if (!uvProduto.equals(other.uvProduto))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Produto [codProduto=" + codProduto + ", nomeProduto=" + nomeProduto + ", qtdProduto=" + qtdProduto
				+ ", kgProduto=" + kgProduto + ", puProduto=" + puProduto + ", uvProduto=" + uvProduto + ", ucProduto="
				+ ucProduto + "]";
	}
	

}
