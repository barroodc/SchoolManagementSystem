package com.chrisportfolio.schoolmanagementsystem.dao.jdbcmySQLImpl;

import com.chrisportfolio.schoolmanagementsystem.dao.daointerfaces.IParentDao;
import com.chrisportfolio.schoolmanagementsystem.model.Parent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    public Parent findByID(long id) {
        Parent parent = new Parent();
        try (PreparedStatement statement = this.connection.prepareStatement(GET_ONE)) {
            statement.setLong(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                parent.setParentID(rs.getLong("parent_id"));
                parent.setEmail(rs.getString("email"));
                parent.setPassword(rs.getString("password"));
                parent.setFirstName(rs.getString("first_name"));
                parent.setLastName(rs.getString("last_name"));
                parent.setDob(rs.getDate("dob"));
                parent.setHomePhone(rs.getString("home_phone"));
                parent.setMobile(rs.getString("mobile"));
                parent.setLastLogin(rs.getDate("last_login"));
                parent.setLastLoginIP(rs.getString("last_login_ip"));
            }
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return parent;
    }

    @Override
    public List<Parent> findAll() {
        return null;
    }

    @Override
    public Parent update(Parent dto) {
        Parent parent = null;
        try (PreparedStatement statement = this.connection.prepareStatement(UPDATE)) {
            statement.setString(1, dto.getEmail());
            statement.setString(2, dto.getPassword());
            statement.setString(3, dto.getFirstName());
            statement.setString(4, dto.getLastName());
            statement.setDate(5, dto.getDob());
            statement.setString(6, dto.getHomePhone());
            statement.setString(7, dto.getMobile());
            statement.setDate(8, dto.getLastLogin());
            statement.setString(9, dto.getLastLoginIP());
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return parent;
    }

    @Override
    public Parent create(Parent dto) {
        try (PreparedStatement statement = this.connection.prepareStatement(INSERT)) {
            statement.setLong(1, dto.getParentID());
            statement.setString(2, dto.getEmail());
            statement.setString(3, dto.getPassword());
            statement.setString(4, dto.getFirstName());
            statement.setString(5, dto.getLastName());
            statement.setDate(6, dto.getDob());
            statement.setString(7, dto.getHomePhone());
            statement.setString(8, dto.getMobile());
            statement.setDate(9, dto.getLastLogin());
            statement.setString(10, dto.getLastLoginIP());
        } catch (SQLException e) {
            LOGGER.error(e);
        }
        return null;
    }

    @Override
    public void delete(long id) {
        try (PreparedStatement statement = this.connection.prepareStatement(DELETE)) {
            statement.setLong(1, id);
            statement.executeQuery();
        } catch (SQLException e) {
            LOGGER.error(e);
        }
    }
}
