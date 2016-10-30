package WordNet.App;

import Util.ClipBoardListener;
import WorNet.Sample.ConnectWordsAndSentences;
import WorNet.Sample.ReadModelSentences;
import WorNet.Sample.ReadModelWords;
import WorNet.Sample.WordandSentence;
import WordNet.UI.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author hiran
 */
public class SinhalaWordNet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            //        new ReadList().read();
            new URLReader().readURL();
//        new ReadModelWords().read();
//        new ReadModelSentences().read();
//        new ConnectWordsAndSentences().searchSentence();
//        new ConnectWordsAndSentences().match();
//        new ConnectWordsAndSentences().selectAllSentences();
//        new WordandSentence().setDB();
//        new ConnectWordsAndSentences().modelSearch();
//            MainFrame f;
//            f = new MainFrame();
//
//        ClipBoardListener clipBoardGrabber = new ClipBoardListener();
//        try {
//            clipBoardGrabber.getFromClipBoard();
//        } catch (UnsupportedFlavorException | IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//            f.go();

//        //f.setVisible(true);
        } catch (IOException ex) {
            System.out.println("" + ex.getMessage());
        } finally {

        }
    }

}
