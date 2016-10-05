/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorNet.Sample;

import WordNet.Database.DBConnection;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author hiran
 * This is a sample package
 */
public class ReadModelWords {

    /**
     *
     * @throws SQLException
     */
    public void read() throws SQLException {

        try {
            File fileDir = new File("Model.txt");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(fileDir), "UTF8"));

            String str;
            int id = 0;

            while ((str = in.readLine()) != null) {
                //System.out.println(str);
                id++;
                try {
                    String sql = "Insert into baseword values(?,?)";
                    Connection connection = DBConnection.getConnection();
                    PreparedStatement stm = connection.prepareStatement(sql);
                    stm.setObject(1, id);
                    stm.setObject(2, str);
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

            in.close();
        } catch (UnsupportedEncodingException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
