package com.bellinf.batch4.mvc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.bellinf.batch4.mvc.model.Student;

public class DatabaseConnection {

	public ArrayList<Student> Info = new ArrayList<>();

    public String retrievedName=null,retrievedCourse=null;

    int retrievedFee=0, retrievedYear=0;

    static int i=0;

    static boolean j = true;

    static Connection connection=null;

    static PreparedStatement preparedStatement =null;

    static ResultSet resultSet = null;

    static boolean value = false;

    public static final String CREATE_TABLE = "create table student(Name character varying(40) NOT NULL , Course character varying(40) NOT NULL, Fee integer NOT NULL, Year integer NOT NULL,CurrentDate character varying(40) NOT NULL)";

    public static final String SELECT_TABLE = "select * from student";

    public static final String UPDATE_TABLE = "Insert into student values(?,?,?,?,?)";

   // public static final String DELETE_TABLE = "delete from student where Name =? and PhoneNumber=?";

   // public static final String DROP_TABLE = "drop table student";
    
	public void getConnection() {
		// TODO Auto-generated method stub
		
		try {

            Class.forName("org.postgresql.Driver");

            try {

                connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/jdbcdemo", "postgres","1234");

            } catch (SQLException ex) {

                Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);

            }

        } 

        catch (ClassNotFoundException ex) {

            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
		
	}

	public void createTable() {
		try {
			
			getConnection();
		    preparedStatement = connection.prepareStatement(CREATE_TABLE);
            value = preparedStatement.execute();
            preparedStatement.close();

        } catch (SQLException ex) {
         System.out.print("");
        }
	}

	public boolean tableCreationCheck()

    {

       try {
    	   
    	   getConnection();

           value = preparedStatement.execute("SELECT_TABLE");

           preparedStatement.close();

       }  catch(NullPointerException npr)

           {

               System.out.print("");

           } catch (SQLException ex) {

           Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);

       }

    
        return value;

         }
	
	public void InsertStudentInfoValues(ArrayList<Student> studentinfoIterator) {
		// TODO Auto-generated method stub
		try {
			
			getConnection();

            for(i=0;i<studentinfoIterator.size();i++)

            {

         preparedStatement = connection.prepareStatement(UPDATE_TABLE);

         preparedStatement.setString(1, studentinfoIterator.get(i).getName());

         preparedStatement.setString(2, studentinfoIterator.get(i).getCourse());

         preparedStatement.setInt(3, studentinfoIterator.get(i).getFee());

         preparedStatement.setInt(4,studentinfoIterator.get(i).getYear());

          preparedStatement.setString(5, studentinfoIterator.get(i).getCurrentdate());

         j = preparedStatement.execute();

         preparedStatement.close();

            } 

            if(j == false)

            {

        System.out.println("-----------------------------------------");

        System.out.println("Your information has been updated to the database successfully!");

        System.out.println("-----------------------------------------");

            }

            else

            {

                System.err.println("Something went wrong please try again!");

            }

        } catch (SQLException ex) {

            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);

        }
	}

	public ArrayList<Student> RetrieveUserInformationValues() {
		// TODO Auto-generated method stub
		
		 try {
			 
			 getConnection();

	            preparedStatement = connection.prepareStatement(SELECT_TABLE);

	            resultSet = preparedStatement.executeQuery();

	           // System.out.println("Name"+ "\t"+"EmailID"+"\t"+"Phone Number");

	            while((resultSet.next()))

	            {

	             Student info = new Student();   

	            retrievedName = resultSet.getString(1);

	            retrievedCourse = resultSet.getString(2);

	            retrievedFee = resultSet.getInt(3);

	            retrievedYear = resultSet.getInt(4);

	            String retrievedCurDate = resultSet.getString(5);

	            info.setName(retrievedName);

	            info.setCourse(retrievedCourse);

	            info.setFee(retrievedFee);

	            info.setYear(retrievedYear);

	            info.setCurrentdate(retrievedCurDate);

	            Info.add(info);

	         

	            }

	            resultSet.close();

	            preparedStatement.close();

	            

	        } catch (SQLException ex) {

	            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);

	        }

	           return Info;

	     
	}

	public void closeConnection() {
		// TODO Auto-generated method stub
		
		try {

            connection.close();

        } catch (SQLException ex) {

            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);

        }
		
	}

}
