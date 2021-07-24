/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelrecommendationsystem;

import java.sql.*;
/**
 *
 * @author Vijay Raj Singh
 */
public class HotelRecommendationSystem {

   Connection con;
    Statement stm;
    ResultSet rs;
    PreparedStatement pst;
    public HotelRecommendationSystem(){
        
        try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hrsystem","root", "");
        stm=con.createStatement();
        System.out.println("null");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public static void main(String arg[])
    {
        HotelRecommendationSystem ob = new HotelRecommendationSystem();
    }
  
}
