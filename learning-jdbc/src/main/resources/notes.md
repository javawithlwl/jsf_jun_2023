`### JDBC - Java Database Connectivity

    - JDBC is a Java API to connect and execute query with the database.
    - JDBC API uses JDBC drivers to connect with the database.
    - There are 4 types of JDBC drivers:
        - JDBC-ODBC bridge driver
        - Native-API driver (partially java driver)
        - Network Protocol driver (fully java driver)
        - Thin driver (fully java driver)
### To connect with the database, JDBC API provides the following interfaces:
    - Driver
    - Connection (host, port, database name, username, password)
    - Statement
        1. Statement
        2. PreparedStatement
        3. CallableStatement
    - ResultSet

### JDBC Driver postgresql maven dependency

    <dependency>
        <groupId>org.postgresql</groupId>
        <artifactId>postgresql</artifactId>
        <version>42.6.0</version>
    </dependency>

### Render postgresql connection details

    url: jdbc:postgres://dpg-chncg4u4dad1d51vem90-a.oregon-postgres.render.com/jsf_may_2023
    username: dbuser
    password: 1HnWkrn3bIQUkkSfcnwk7gW8YW3nJIWy

### JDBC Connection

    1. Load and register the driver ( This is done automatically by JDBC 4.0)
    2. Create connection    
        Connection connection = DriverManager.getConnection(url, username, password);
    3. Create statement
        Statement statement = connection.createStatement();
    4. Execute the query
        ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
    5. Process the results
        while (resultSet.next()) {
            System.out.println(resultSet.getString("name"));
        }
    6. Close the connection
        connection.close();

`