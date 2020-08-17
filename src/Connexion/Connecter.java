package Connexion;

import java.sql.*;


public class Connecter {
    Connection con;
    public Connecter(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            System.err.println(e);
            //pour afficher l erreur
        }
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/etude","root","");
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
    Connection obtenirconnexion(){return con;}
}

	     

