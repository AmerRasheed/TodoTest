package org.example;

import com.mysql.cj.jdbc.JdbcConnection;
import org.example.data.*;
import org.example.model.Person;
import org.example.model.Person;
import org.example.model.todoItem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

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

        PersonDAO peopleDAO = new PersonDAO();
        Person people = new Person("Habib", "Jaalib");

        people = peopleDAO.create(people);
        System.out.println(people);
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
        itemDAO itemInDB = new itemDAO();
        todoItem item = new todoItem("Handla","Från Willys", LocalDate.parse("2020-02-05"),true);

        item = itemInDB.create(item);
        System.out.println(item);
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
      /*  PeopleDAO peopleDAO = new PeopleDAO();
        People people = new People("Habib", "Jaalib");

        //we need above two already declared lines also for running the following two line
       */
        PersonInterfaceClass pObject= new PersonInterfaceClassRepository();
        pObject.create(people);

/* // && 1
   // && 2 -->dbConnection.java
   //&&3 checking connection again via class
   //&& 4 -->dbConnection.java static make

   //&& 5 People->modell ( a People class java )  ->vonlig constructor + special constructor
                                                          // int tod AND int assigneeId in the previous CONSTRUCTOR is set to O since it will not be set in DB
// && 6
creating People DAO object

// && 7
similarly(5 & 6)  contruct todoItem

// && 8
create itemDAO object

// && 9
People Interface Class and consecutively create PeopleInterfaceRepository class

// && 10 Accessing each thing from APP







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
// in FindbyName WHY NULL: all connection, statement, resultats???