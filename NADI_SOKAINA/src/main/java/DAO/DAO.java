package DAO;


	import java.sql.ResultSet;
import java.sql.SQLException;
	import java.util.ArrayList;

import POJO.Etudiant;
import POJO.livre;

	

public class DAO {
	public int find(String aut) {
		int find=0;
		DBinteraction.connect();
		ResultSet r=DBinteraction.select("select * from auteur where nomcomAuteur='"+aut+"'");
		try {
			if( r.next() && find==0) {
		
					find =1;
				}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return find;
	}
	public int findidaut(String name) {
		int a=0;
		DBinteraction.connect();
		ResultSet r =DBinteraction.select("select * from auteur where nomcomAuteur='"+name+"'");
		try {
			if( r.next()) {
				a=r.getInt(1);

				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return a;
	}
	public int	findidcateg(String name) {
		int a=0;
		DBinteraction.connect();
		ResultSet r =DBinteraction.select("select * from categories where nomCatego='"+name+"'");
		try {
			if( r.next()) {
				a=r.getInt(2);

				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return a;
	}
	public int addlivre(String namelivre,int codeaut,int nbpage,int codecateg ) 
	{
		
				
		DBinteraction.connect();
		String sql="insert into livres(nomLivre,codeAuteur,nbrPage,codeCatego)values('"+namelivre+"',"+codeaut+","+nbpage+","+codecateg+")";
		int nb=DBinteraction.Maj(sql);
		DBinteraction.disconnect();
				
			return nb;	 
				
	}
	public int addauteur(String nameaut) 
	{
		
				
		DBinteraction.connect();
		String sql="insert into auteur(nomcomAuteur)values('"+nameaut+"')";
		int nb=DBinteraction.Maj(sql);
		DBinteraction.disconnect();
				
			return nb;	 
				
	}

		public static int addStudent(String full,String log, String pass) 
		{
			
					
			DBinteraction.connect();
			String sql="insert into adherent(full_name,login,password)values('"+full+"','"+log+"','"+pass+"')";
			int nb=DBinteraction.Maj(sql);
			DBinteraction.disconnect();
					
				return nb;	 
					
		}
		
		public static int addStudent(Etudiant u) 
		{
			
					
			DBinteraction.connect();
			String sql="insert into adherent(login,password) values ('"+u.getLogin()+"','"+u.getPassword()+"')";
			int nb=DBinteraction.Maj(sql);
			DBinteraction.disconnect();
					
				return nb;	 
					
		}
		
		
		public static ArrayList<livre> findlivreByauteur(String name)
		{
			livre v;
			ArrayList<livre> k=new ArrayList<livre>();
			DBinteraction.connect();
			ResultSet rs=DBinteraction.select("select b.nomLivre,b.nbrPage from auteur a,livres b where  a.codeAuteur=b.codeAuteur AND a.nomcomAuteur='"+name+"'");
			try {
				
				while(rs.next())
				{
					
					v=new livre();
					v.setNomLivre(rs.getString(1));
					v.setNbrPage(rs.getInt(2));
					k.add(v);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return k;
		}
		
		public static ArrayList<livre> findlivreBycategorie(String name)
		{
			livre h=null;
			ArrayList<livre> m=new ArrayList<livre>();
			DBinteraction.connect();
			ResultSet rs=DBinteraction.select("select b.nomLivre,b.nbrPage from auteur a,livres b,categories c where  a.codeAuteur=b.codeAuteur AND b.codeCatego=c.codeCatego AND c.nomCatego='"+name+"'");
			try {
				
				while(rs.next())
				{
					
					h=new livre();
					h.setNomLivre(rs.getString(1));
					h.setNbrPage(rs.getInt(2));
					m.add(h);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return m;
		}
		
		
		
		public static Etudiant authentification(String log, String pass)
		{
			Etudiant u=null;
			DBinteraction.connect();
			ResultSet rs = DBinteraction.select("select * from adherent where login='"+log+"' and password='"+pass+"'");
			try {
				if(rs.next())
				{
					u=new Etudiant();
					u.setLogin(rs.getString(2));
					u.setPassword(rs.getString(3));
	
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return u;
			
		}
		
	}

	
	
	

