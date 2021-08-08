package database;

import animals.AnimalImpl;
import animals.Leon;
import model.Animal;

import java.sql.*;

public class DataBaseZoo {
    private Connection connection;

    {
        try{
            initializationCage();
        } catch(SQLException sqlException){

        }

    }

    public DataBaseZoo(){
        final String url = "jdbc:postgresql://localhost:5432/Zoo";
        final String username = "postgres";
        final String password = "root";
        try{
            connection = DriverManager.getConnection(url ,username, password);
        } catch (SQLException exception){
            System.out.println("Failed to get a connection to the database "
                    + exception.getMessage());
        }
    }

    public void add(AnimalImpl animal) throws SQLException {
        Statement statement = connection.createStatement();
        String sqlInsertAnimal = "INSERT INTO animals VALUES ('" + animal.getName() +
                "', '" + animal.getSpecies() + "', " + animal.getNumberCage() + ");";
        String sqlUpdateCage = "UPDATE cage SET vacant = false WHERE idCage = "
                + animal.getNumberCage() + ");";
        statement.executeUpdate(sqlInsertAnimal);
        statement.executeUpdate(sqlUpdateCage);

    }

    public void delete(Animal animal) throws SQLException {

    }

    public void history() throws SQLException {

    }

    private void initializationCage() throws SQLException{
        Statement statement = connection.createStatement();
        String sql = "INSERT INTO cage VALUES (";
        for(int i = 1; i <= 4; i++){
            statement.executeUpdate(sql + i + ", true);");
        }
    }

    public static void main(String[] args) {
        Leon leon = new Leon.LeonBuilder().name("LEO").build();
        DataBaseZoo dataBaseZoo = new DataBaseZoo();
        try{
            dataBaseZoo.add(leon);
        } catch (SQLException sqlException){
            System.out.println(sqlException.getMessage());
        }

    }
}
