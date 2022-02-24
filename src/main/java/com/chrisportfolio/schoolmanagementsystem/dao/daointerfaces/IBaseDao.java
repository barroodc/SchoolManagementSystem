package com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces;

import java.sql.SQLException;
import java.util.List;

public interface IBaseDao<T> {
    T findByID(long id) throws SQLException;
    List<T> findAll();
    T update(T dto);
    T create(T dto);
    void delete(long id);
}
