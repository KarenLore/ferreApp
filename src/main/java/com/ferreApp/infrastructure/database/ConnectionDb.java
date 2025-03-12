package com.ferreApp.infrastructure.database;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionDb {
    Connection getConexion() throws SQLException;

    static ConnectionDb crearConexion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearConexion'");
    }
}
