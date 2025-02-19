public class  The_database_config_revelation{
    public static void main(String[] args) {
DatabaseConfig.display();
    }
}

class DatabaseConfig {
    // Declare static variables
      static String Database_Url,Username,Password;

    // Static block to initialize the static variables
    static  {
        Database_Url = "jdbc:mysql://localhost:3306/mydatabase";
        Username = "admin";
        Password = "password123";
    }

    // Static methods to get the values of the static variables
    static void display(){
    System.out.println("Database URL: "+Database_Url);
    System.out.println("Username: "+Username);
    System.out.println("Password: "+Password);
}
}