/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city_halls;

/**
 *
 * @author Chacoul_Diarrassouba
 */
public class City_Halls {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        ProgressBar pgbar = new ProgressBar();
        pgbar.setVisible(true);
        
        try {
            for (int i = 0; i<=100; i++){
                Thread.sleep(50);
                ProgressBar.compte.setText(Integer.toString(i)+" %");
                ProgressBar.progressBar.setValue(i);              
            }
        }       
        catch (InterruptedException e) {
            
        }
        Background back = new Background();
        back.setVisible(true);
        Login log = new Login();
        log.setVisible(true);
        pgbar.dispose();
    }
    
}
