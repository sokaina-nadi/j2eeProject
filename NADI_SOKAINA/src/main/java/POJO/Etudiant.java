package POJO;


public class Etudiant {
	String login;
	String password;
	String full_name;
	int codeAdherent;
	
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getCodeAdherent() {
		return codeAdherent;
	}
	
	public void setCodeAdherent(int codeAdherent) {
		this.codeAdherent = codeAdherent;
	}
	@Override
	public String toString() {
		return "Etudiant [login=" + login + ", password=" + password + ", full_name=" + full_name + ", codeAdherent="
				+ codeAdherent + "]";
	}
	

}
