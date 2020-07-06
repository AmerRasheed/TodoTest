package org.example.data;

import org.example.model.Person;
import org.example.model.todoItem;

import java.sql.*;

public class PersonDAO {
    public Person create(Person person1) {
        if (person1.getPersonId() != 0)
            throw new IllegalArgumentException("Not valid entry"); // try update instead

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet personSet = null;

        try {
            connection = dbConnection.getConnection();
            statement = connection.prepareStatement("INSERT INTO person (first_name,last_name) VALUES (?,?)", Statement.RETURN_GENERATED_KEYS);
            //  statement.setInt(1,person.getPersonId());
            statement.setString(1,person1.getFirstName());
            statement.setString(2,person1.getLastName());

            statement.execute();

         //   personSet=null;
            personSet=statement.getGeneratedKeys();

            while (personSet.next())
            {
                person1= new Person(
                        personSet.getInt(1),
                        //people.getPersonId(),
                        person1.getFirstName(),
                        person1.getLastName()
                );
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally {
            try{
                if(personSet!=null)
                    personSet.close();
                if(statement!=null)
                    statement.close();
                if(connection!=null)
                    connection.close();
            }catch (SQLException ex)
            {ex.printStackTrace();
            }
        }
        return person1;
    }

}