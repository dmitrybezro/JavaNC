package database;

import model.Animal;

import java.sql.*;

public class DataBaseZoo {
    Connection connection;

    public DataBaseZoo() throws SQLException{
        final String url = "jdbc:postgresql://localhost:5432/Zoo";
        final String username = "postrges";
        final String password = "root";
        try{
            connection = DriverManager.getConnection(url ,username, password);
        } catch (SQLException exception){
            System.out.println("Failed to get a connection to the database "
                    + exception.getMessage());
        }
    }

    public void add(Animal animal) throws SQLException {

    }

    public void delete(Animal animal) throws SQLException {

    }

    public void history() throws SQLException {

    }
}
