package org.example;

import com.mysql.cj.jdbc.JdbcConnection;
import org.example.data.PeopleDAO;
import org.example.data.dbConnection;
import org.example.model.People;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
        System.out.println( "78692" );

        //&&3 checking connection again via class
        dbConnection.getConnection();

        PeopleDAO peopleDAO = new PeopleDAO();
        People people = new People(
                "Habib",
                "Galib"
        );

        people = peopleDAO.create(people);
        System.out.println(people);

/* // && 1
   // && 2 -->dbConnection.java
   //&&3 checking connection again via class
   //&& 4 -->dbConnection.java static make

   //&& 5 People->modell ( a People class java )  ->vonlig constructor + special constructor










        Connection connection= DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/world?&autoReconnect=true&useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=Europe/Berlin",
                "root",
                "1234"
        );
        */

    }
}



//Queries
//dbConnection.java -> String USER = "root"; (CREATED BY RefactorING) and public static final String USER="root"; (as done by Erik)
// dbConnection. When I was going to make getConnection method public, --> //@@3 gives compile error
