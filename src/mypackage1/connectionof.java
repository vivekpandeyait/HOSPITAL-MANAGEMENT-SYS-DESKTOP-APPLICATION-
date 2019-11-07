package mypackage1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class connectionof
{
    //private static String String;

    public static void thequery() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
        public void thequery(String query){
           Connection con = null;
            Statement st = null;
        try{
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
              st = con.createStatement();
               st.executeUpdate(query);
               JOptionPane.showMessageDialog(null," qurey sucssefull");
        }catch(SQLException  ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage());
    }
        }
	public static void main(String args[])
	{
            connectionof s  = new connectionof();
            s.thequery("");
		
	}
}
