package POJO;


public class livre {
	String nomLivre;
	int codeAuteur;
	int nbrPage;
	int codeCatego;
	//auteur infoau;
	public String getNomLivre() {
		return nomLivre;
	}
	public void setNomLivre(String nomLivre) {
		this.nomLivre = nomLivre;
	}
	public int getCodeAuteur() {
		return codeAuteur;
	}
	public void setCodeAuteur(int codeAuteur) {
		this.codeAuteur = codeAuteur;
	}
	public int getNbrPage() {
		return nbrPage;
	}
	public void setNbrPage(int nbrPage) {
		this.nbrPage = nbrPage;
	}
	public int getCodeCatego() {
		return codeCatego;
	}
	public void setCodeCatego(int codeCatego) {
		this.codeCatego = codeCatego;
	}
	@Override
	public String toString() {
		return "livre [nomLivre=" + nomLivre + ", codeAuteur=" + codeAuteur + ", nbrPage=" + nbrPage + ", codeCatego="
				+ codeCatego + "]";
	}
	
	
}
