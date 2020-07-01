package org.example.data;

import org.example.model.People;

import java.sql.*;

public class PeopleDAO {

    public People create(People people) {
        if (people.getPersonId() != 0)
            throw new IllegalArgumentException("Not valid entry"); // try update instead

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet peopleSet = null;

        try {
            connection = dbConnection.getConnection();
            statement = connection.prepareStatement("INSERT INTO person (firstName,lastName) VALUES (?,?)", Statement.RETURN_GENERATED_KEYS);
          //  statement.setInt(1,people.getPersonId());
            statement.setString(1,people.getFirstName());
            statement.setString(2,people.getLastName());

            statement.execute();

            peopleSet=statement.getGeneratedKeys();

            while (peopleSet.next())
            {
                people= new People(
                        peopleSet.getInt(1),
                        //people.getPersonId(),
                        people.getFirstName(),
                        people.getLastName()
                );
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally {
            try{
                if(peopleSet!=null)
                    peopleSet.close();
                if(statement!=null)
                    statement.close();
                if(connection!=null)
                    connection.close();
            }catch (SQLException ex)
            {ex.printStackTrace();
            }
        }
        return people;
    }


}