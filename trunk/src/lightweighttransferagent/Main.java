/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lightweighttransferagent;

/**
 * This is a java web start application.
 * This application can connect to a GridFTP server
 * and transfer files between GridFTP server and the
 * user's computer.
 * 
 * @author diluka
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    /**
     * this method for start the application
     */
    public void start(){
        //creating instance of MainView class
        MainView mainView = new MainView();
        mainView.setVisible(true);
    }
}
