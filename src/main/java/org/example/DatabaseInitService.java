package org.example;



public class DatabaseInitService {
    public static void main(String[] args) {
        Database database = Database.getInstance();
        database.execute("src/sql/init_db.sql");
    }
}
