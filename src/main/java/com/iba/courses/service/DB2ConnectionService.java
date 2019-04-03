package com.iba.courses.service;

import java.sql.Connection;

import java.sql.*;
import java.util.Properties;

public class DB2ConnectionService {
    private final String USER_ID = "LAPUSHA";
    private final String PASSWORD = "LAPUSHA2";
    private final String HOST = "172.20.2.116";
    private Connection connection;
    private Statement statement;
    private Db2Parameters db2Parameters = new Db2Parameters();

    public void init() throws SQLException {

        Db2Parameters db2Parameters = new Db2Parameters();
        db2Parameters.setHostname(HOST);
        db2Parameters.setLocation("DALLASB");
        db2Parameters.setPort(5035);
        db2Parameters.setUserId(USER_ID);
        db2Parameters.setPassword(PASSWORD);

        String url = "jdbc:db2://"
                + db2Parameters.getHostname()
                + ":" + db2Parameters.getPort()
                + "/" + db2Parameters.getLocation();

        Properties properties = new Properties();
        properties.setProperty("user", db2Parameters.getUserId());
        properties.setProperty("password", db2Parameters.getPassword());
        properties.setProperty("connectionTimeout", "5000");
        properties.setProperty("commandTimeout", "5000");
        this.connection = DriverManager.getConnection(url, properties);
        this.connection.setAutoCommit(false);
        this.statement = this.connection.createStatement();

    }

    private CallableStatement prepareCallableStatement(String command, String parseType) throws SQLException {
        CallableStatement callableStatement = this.connection.prepareCall("CALL SYSPROC.ADMIN_COMMAND_DB2(?,?,?,?,?,?,?,?,?,?,?,?)");
        callableStatement.setString(1, command);
        callableStatement.setInt(2, command.length());
        callableStatement.setString(3, parseType);
        callableStatement.setString(4, null);
        callableStatement.registerOutParameter(5, Types.INTEGER);
        callableStatement.registerOutParameter(6, Types.INTEGER);
        callableStatement.registerOutParameter(7, Types.INTEGER);
        callableStatement.registerOutParameter(8, Types.INTEGER);
        callableStatement.registerOutParameter(9, Types.INTEGER);
        callableStatement.registerOutParameter(10, Types.INTEGER);
        callableStatement.registerOutParameter(11, Types.INTEGER);
        callableStatement.registerOutParameter(12, Types.VARCHAR);
        return callableStatement;
    }

    public String execute(String command) throws SQLException {
        CallableStatement callableStatement = this.prepareCallableStatement(command, null);
        callableStatement.execute();
        ResultSet resultSet = callableStatement.getResultSet();
        StringBuilder response = new StringBuilder("");
        while (resultSet.next()) {
            response.append(resultSet.getString(2));
            response.append("\n");
        }
        return response.toString();
    }


}
