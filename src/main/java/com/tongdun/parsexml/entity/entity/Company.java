package com.tongdun.parsexml.entity.entity;

import com.tongdun.parsexml.config.ConnectionManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Company {
    public String entityId;

    public String addressline;

    public String addresscity;

    public String addresscountry;

    public String url;

    public static void insert(List<Company> list)  {
        String sql = "insert into Company values(?,?,?,?,?)";
        PreparedStatement pstmt = null;
        try {
            pstmt = ConnectionManager.getConnection().prepareStatement(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        for (Company widd : list) {
            try {
                pstmt.setString(1, widd.entityId);
                pstmt.setString(2, widd.addressline);
                pstmt.setString(3, widd.addresscity);
                pstmt.setString(4, widd.addresscountry);
                pstmt.setString(5, widd.url);
                pstmt.addBatch();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        try {
            pstmt.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}