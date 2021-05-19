package POJO;


public class auteur {
int codeAuteur;
String nomcomAuteur;

public int getCodeAuteur() {
	return codeAuteur;
}
public void setCodeAuteur(int codeAuteur) {
	this.codeAuteur = codeAuteur;
}
public String getNomcomAuteur() {
	return nomcomAuteur;
}
public void setNomcomAuteur(String nomcomAuteur) {
	this.nomcomAuteur = nomcomAuteur;
}
@Override
public String toString() {
	return "auteur [codeAuteur=" + codeAuteur + ", nomcomAuteur=" + nomcomAuteur + "]";
}

}
