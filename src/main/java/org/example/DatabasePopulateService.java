package org.example;

public class DatabasePopulateService {
    public static void main(String[] args) {
        Database database = Database.getInstance();
        database.execute("src/sql/populate_db.sql");
    }
}
