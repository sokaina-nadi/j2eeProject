package POJO;


public class categorie {
String nomCatego;
int codeCatego;
public String getNomCatego() {
	return nomCatego;
}
public void setNomCatego(String nomCatego) {
	this.nomCatego = nomCatego;
}
public int getCodeCatego() {
	return codeCatego;
}
public void setCodeCatego(int codeCatego) {
	this.codeCatego = codeCatego;
}
@Override
public String toString() {
	return "categorie [nomCatego=" + nomCatego + ", codeCatego=" + codeCatego + "]";
}

}
