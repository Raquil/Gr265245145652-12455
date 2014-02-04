package Processus;

public class Mapping{
	
	public void Update() {
	    try {
	      Class.forName("org.postgresql.Driver");
	         
	      String url = "jdbc:postgresql://localhost:5432/Ecole";
	      String user = "postgres";
	      String passwd = "postgres";
	         
	         
	      //On crée la requête
	      String query = "SELECT ? FROM ?";
	      //Premier trou pour le nom du professeur
	      query += " WHERE prof_nom = ?";
	      //Deuxième trou pour l'identifiant du professeur
	      query += " OR prof_id = ?";
	         
	      //On crée l'objet avec la requête en paramètre 
	      PreparedStatement prepare = conn.prepareStatement(query);
	      //On remplace le premier trou par le nom du professeur
	      prepare.setString(1, "MAMOU");
	      //On remplace le deuxième trou par l'identifiant du professeur
	      prepare.setInt(2, 2);
	      //On affiche la requête exécutée
	      System.out.println(prepare.toString());
	      //On modifie le premier trou
	      prepare.setString(1, "TOTO");
	      //On affiche à nouveau la requête exécutée
	      System.out.println(prepare.toString());
	      //On modifie le deuxième trou
	      prepare.setInt(2, 159753);
	      //On affiche une nouvelle fois la requête exécutée
	      System.out.println(prepare.toString());
	         
	      prepare.close();
	      state.close();

	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	  }
	}
	

}