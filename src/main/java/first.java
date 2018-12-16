import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class first {

    public static void main(String[] args ){


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/imdb", "root", "root");

            Statement stmt = myCon.createStatement();

            String selectMovieQuery = "select * from movies where name LIKE '%italian job%' ";

            ResultSet movieData =  stmt.executeQuery(selectMovieQuery);

            ArrayList movieNames = new ArrayList();

            while( movieData.next() ){

                System.out.println("movieData = " + movieData.getString("name").getClass().getName() );
                movieNames.add( movieData.getString("name") );

            }


            Iterator iName = movieNames.iterator();
            while( iName.hasNext() ){

                System.out.println("type = " + iName.next().getClass().getName());

            }
            System.out.println("type" + movieNames.getClass());
            for (Object mName : movieNames
                 ) {
                System.out.println("mName = " + mName);
            }
            
            
            myCon.close();
        }catch(Exception e){
            System.out.println("Exception occured = " + e);
        }
        //checkout abc = new checkout();

        /*System.out.println( abc.currenyType );
        System.out.println( abc.companyName );*/


        //ArrayList<String> a1 = new ArrayList<String>();
        ArrayList a1 = new ArrayList();

        a1.add("kasuhil");
        a1.add("abc");
        a1.add("2");
        a1.add(1,"adawd");
        //a1.add(1);
        a1.add("*");
        //a1.add(new Integer(1));

        System.out.println("Size of array list "+a1.size());
        System.out.println("element of array  "+ a1.get(1) );

        a1.remove(2);
        a1.add(2,"kkkkk");
        System.out.println("a1 = " + a1);
        
        
        ArrayList a2 = new ArrayList();
        a2.addAll(a1);
        a2.add("mammiya");
        a2.remove(2);
        System.out.println("a2 = " + a2);
        
        ArrayList a3 = new ArrayList();
        a3.add("last");
        a3.add("Mera Naam");
        a2.add(a3);
        System.out.println("Final a2 = " + a2);
        System.out.println("Inner a2 = " + ( (ArrayList) a2.get(5) ).get(1) );

        ArrayList a4 = a2;
        //a4 = a2;
        System.out.println("a4 = " + a4);
        System.out.println( a2.contains( a4 ) );
        System.out.println( a2.equals(a4) );
        System.out.println("Index of added collection :" + a2.indexOf(a3));
        System.out.println("Index of added collection :" + a2.indexOf("Mera Naam"));

        //Array ka = new String[5];
        //ka[0] = "Kkaka";
        //System.out.println("ka = " + ka);
        //Object[] ob = a4.toArray(a3[0]);
        //System.out.println("ob[0] = " + ob[0]);



    }
}

