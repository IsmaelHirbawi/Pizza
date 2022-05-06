/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author loole
 */
public class PizzaLogger implements LoggerInterface {
    
    private static final LocalDateTime now = LocalDateTime.now();
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
    
    @Override
    public void log(String message) {
        FileWriter fileWriter = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test2", "ismael", "123");
            Statement stmt = con.createStatement();
            
            String query = "INSERT INTO test_table (messass) VALUES('testMessage1'); ";
            stmt.executeUpdate(query);
            
            fileWriter = new FileWriter("log.txt", true);
            fileWriter.write("[ " + dtf.format(now) + " ] " + message + "\n\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PizzaLogger.class.getName()).log(Level.SEVERE, null, ex);
        } 
        finally {
            try {
                assert fileWriter != null;
                fileWriter.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
