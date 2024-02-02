package exampl.dao;

import java.sql.SQLException;


public interface DAO<T> {
    void save(T obj) throws SQLException;
}
