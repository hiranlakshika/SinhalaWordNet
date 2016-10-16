/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorNet.Sample;

import WordNet.Database.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author hiran
 */
public class ConnectWordsAndSentences {

//    public void searchSentence() {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Type a word to search");
//        String id = in.next();
//        String sql = "Select * from Sentence where text='" + id + "'";
//        try {
//            Connection connection = DBConnection.getConnection();
//            Statement stm = connection.createStatement();
//            ResultSet rst = stm.executeQuery(sql);
//            if (rst.next()) {
//                System.out.println("the available sentences for this word are\n" + rst.getString("text"));
//
//            } else {
//                System.out.println("Not Found");
//            }
//        } catch (SQLException | ClassNotFoundException ex) {
//            System.out.println("" + ex.getMessage());
//        }
//    }
//    public String selectAllSentences() {
//        String text = "null";
//         String sql="Select * From Sentence";
//         try {
//            Connection connection = DBConnection.getConnection();
//            Statement stm=connection.createStatement();
//            ResultSet rst = stm.executeQuery(sql);            
//            while(rst.next()){
//                //System.out.println(rst.getString("text"));
//                text=rst.getString("text");
//            }
//                    
//            
//        } catch (SQLException | ClassNotFoundException ex) {
//             System.out.println(ex.getMessage());
//        }
//         return text;
//    }
//    public void match(){
//        String source=selectAllSentences();
//		Pattern p=Pattern.compile("අම්මා");
//		Matcher m=p.matcher(source);
//		
//		while(m.find()){
//			int index=m.start();//returns index
//			String s=m.group();
//			System.out.println(s+" "+index);
//		}
//    }
    /**
     *
     */
    public void modelSearch() {
        String sql = "Select * from Sentence";
        try {
            Connection connection = DBConnection.getConnection();
            Statement stm = connection.createStatement();
            ResultSet rst = stm.executeQuery(sql);
            if (rst.next()) {
                System.out.println(rst.getString("text"));
                System.out.println(rst.getInt("id"));
            } else {
                System.out.println("Not found");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("" + ex.getMessage());
        }
//        sql = "SELECT word_sentence.sentence_id\n"
//                + "FROM word_sentence\n"
//                + "INNER JOIN baseword\n"
//                + "ON word_sentence.word_id=baseword.id\n"
//                + "where baseword.id="+id+";";
//        try {
//            Connection connection = DBConnection.getConnection();
//            Statement stm = connection.createStatement();
//            ResultSet rst = stm.executeQuery(sql);
//            if (rst.next()) {
//                rst.getString(" text");
//
//            } else {
//                System.out.println("Not Found");
//            }
//        } catch (SQLException | ClassNotFoundException ex) {
//            System.out.println("" + ex.getMessage());
//        }

//        sql = "SELECT word_sentence.sentence_id\n"
//                + "FROM word_sentence\n"
//                + "INNER JOIN baseword\n"
//                + "ON word_sentence.word_id=baseword.id\n"
//                + "where baseword.id="+id+";";
//        try {
//            Connection connection = DBConnection.getConnection();
//            Statement stm = connection.createStatement();
//            ResultSet rst = stm.executeQuery(sql);
//            if (rst.next()) {
//                rst.getString(" text");
//
//            } else {
//                System.out.println("Not Found");
//            }
//        } catch (SQLException | ClassNotFoundException ex) {
//            System.out.println("" + ex.getMessage());
//        }
    }
}
