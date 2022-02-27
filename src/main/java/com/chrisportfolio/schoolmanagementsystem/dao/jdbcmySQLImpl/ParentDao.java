package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IParentDao;
import com.chrisportfolio.schoolmanagementsystem.model.Parent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;
import java.util.List;

public class ParentDao extends AbstractMySQLDao<Parent> implements IParentDao {

    private static final Logger LOGGER = LogManager.getLogger(ParentDao.class);

    private static final String INSERT = "INSERT INTO parent (parent_id, email, password, first_name, " +
            "last_name, dob, home_phone, mobile, last_login, last_login_ip) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    private static final String GET_ONE = "SELECT parent_id, email, password, first_name," +
            "last_name, dob, home_page, mobile, last_login, last_login_ip FROM parent WHERE parent_id = ?";

    private static final String UPDATE = "UPDATE parent SET email = ?, password = ?, first_name = ?, " +
            "last_name = ?, dob = ?, home_phone = ?, mobile = ?, last_login = ?, last_login_ip = ? FROM parent WHERE parent_id = ?";

    private static final String DELETE = "DELETE FROM parent WHERE parent_id = ?";

    @Override
    public Parent findByID(long id) throws SQLException {
        return null;
    }

    @Override
    public List<Parent> findAll() {
        return null;
    }

    @Override
    public Parent update(Parent dto) {
        return null;
    }

    @Override
    public Parent create(Parent dto) {
        return null;
    }

    @Override
    public void delete(long id) {

    }
}
