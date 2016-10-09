/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

/**
 *
 * @author Hiran
 */
public class ClipBoardListener extends Thread implements ClipboardOwner {

    Clipboard sysClip = Toolkit.getDefaultToolkit().getSystemClipboard();

    /**
     *
     * @throws UnsupportedFlavorException
     * @throws IOException
     */
    public void getFromClipBoard() throws UnsupportedFlavorException, IOException {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();
        String result = (String) clipboard.getData(DataFlavor.stringFlavor);
        System.out.println("String from Clipboard:" + result);
    }

    @Override
    public void run() {
        Transferable trans = sysClip.getContents(this);
        regainOwnership(trans);
        System.out.println("Listening to board...");
        while (true) {
        }
    }

    @Override
    public void lostOwnership(Clipboard c, Transferable t) {
        Transferable contents = sysClip.getContents(this); //EXCEPTION  
        processContents(contents);
        regainOwnership(contents);
    }

    void processContents(Transferable t) {
        System.out.println("Processing: " + t);
    }

    void regainOwnership(Transferable t) {
        sysClip.setContents(t, this);
    }

    /**
     *
     * @return
     */
    public static String getClipboard() {
        Transferable t = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);

        try {
            if (t != null && t.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                String text = (String) t.getTransferData(DataFlavor.stringFlavor);
                return text;
            }
        } catch (UnsupportedFlavorException | IOException e) {
        }
        return null;
    }

// This method writes a string to the system clipboard.
// otherwise it returns null.
    /**
     *
     * @param str
     */
    public static void setClipboard(String str) {
        StringSelection ss = new StringSelection(str);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        ClipBoardListener b = new ClipBoardListener();
        b.start();
    }
}
