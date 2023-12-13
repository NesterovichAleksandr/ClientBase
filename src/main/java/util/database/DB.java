package util.database;

import java.sql.*;

public class DB {

    private static final String JDBC_URL = "jdbc:postgresql://localhost:5432/clientbase";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "admin";

    public static Connection connect() {
        try {
            // Register the PostgreSQL JDBC driver
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("PostgreSQL JDBC Driver is not found. Include it in your library path.");
            e.printStackTrace();
            return null;
        }

        System.out.println("PostgreSQL JDBC Driver successfully registered.");

        Connection connection = null;

        try {
            // Establish the connection
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Connection failed. Check the JDBC URL, username, and password.");
            e.printStackTrace();
        }

        if (connection != null) {
            System.out.println("Connected to the PostgreSQL server successfully.");
        } else {
            System.out.println("Failed to make connection to the PostgreSQL server.");
        }
        return connection;
    }

    public static ResultSet getDataTable(String table) {
        try (Connection connection = connect()) {
            assert connection != null;
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            return statement.executeQuery("SELECT * FROM " + table);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void outToConsole(ResultSet table) {
        try {
            table.first(); // Выведем имена полей
            for (int j = 1; j <= table.getMetaData().getColumnCount(); j++) {
                System.out.print(table.getMetaData().getColumnName(j) + "\t\t");
            }
            System.out.println();

            table.beforeFirst(); // Выведем записи таблицы
            while (table.next()) {
                for (int j = 1; j <= table.getMetaData().getColumnCount(); j++) {
                    System.out.print(table.getString(j) + "\t\t");
                }
                System.out.println();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getStringTable(ResultSet table) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            table.first(); // Выведем имена полей
            for (int j = 1; j <= table.getMetaData().getColumnCount(); j++) {
                stringBuilder.append(table.getMetaData().getColumnName(j)).append("\t\t");
            }
            stringBuilder.append("\n");

            table.beforeFirst(); // Выведем записи таблицы
            while (table.next()) {
                for (int j = 1; j <= table.getMetaData().getColumnCount(); j++) {
                    stringBuilder.append(table.getString(j)).append("\t\t");
                }
                stringBuilder.append("\n");
            }
            return stringBuilder.toString();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
