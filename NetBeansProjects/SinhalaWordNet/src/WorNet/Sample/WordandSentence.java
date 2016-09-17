/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorNet.Sample;

import WordNet.Database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author hiran
 */
public class WordandSentence {
    public void setDB(){
        int id = 0;
        while (id<=50) {
            id++;
            try {
                    String sql = "Insert into word_sentence values(?,?,?)";
                    Connection connection = DBConnection.getConnection();
                    PreparedStatement stm = connection.prepareStatement(sql);
                    stm.setObject(1, id);
                    stm.setObject(2, id);
                    stm.setObject(3, id);
                    int res = stm.executeUpdate();
                    if (res > 0) {
                        System.out.println("Added " + id);
                    }
                } catch (ClassNotFoundException ex) {
                    System.out.println(ex.getMessage());
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
        }
        
    }
}
