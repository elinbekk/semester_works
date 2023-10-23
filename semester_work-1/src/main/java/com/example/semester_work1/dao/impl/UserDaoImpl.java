package com.example.semester_work1.dao.impl;

import com.example.semester_work1.JDBCConnection;
import com.example.semester_work1.dao.UserDao;
import com.example.semester_work1.models.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class UserDaoImpl implements UserDao {
    @Override
    public void save(User item) throws SQLException {
        //TODO сохранение при добавлении  фото??????????
        PreparedStatement statement = JDBCConnection.getConn().prepareStatement("insert into users(user_id, user_email, user_name, user_lastname, user_password) values (?, ?, ?, ?, ?)");
        statement.setString(1, item.getUserId());
        statement.setString(2, item.getName());
        statement.setString(3, item.getLastName());
        statement.setString(4, item.getEmail());
        statement.setString(5, item.getPassword());
        statement.executeUpdate();
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    public Optional<User> getUserByEmail(String email) {
        try {
            PreparedStatement statement = JDBCConnection.getConn().prepareStatement(
                    "select * from places where user_email = ? and user_password = ?"
            );
            statement.setString(1, email);
            return getUser(statement);
        } catch (SQLException e) {
            return Optional.empty();
        }
    }

    private Optional<User> getUser(PreparedStatement statement) throws SQLException {
        ResultSet rs = statement.executeQuery();
        if (rs.next()) {
            User user = new User(
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5)
            );
            return Optional.of(user);
        } else {
            return Optional.empty();
        }
    }

    @Override
    public Optional<User> getById(Integer id) {
        try {
            PreparedStatement statement = JDBCConnection.getConn().prepareStatement(
                    "select * from user where user_id = ?"
            );
            statement.setLong(1, id);
            return getUser(statement);
        } catch (SQLException e) {
            return Optional.empty();
        }
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void update(User item) {

    }
}
