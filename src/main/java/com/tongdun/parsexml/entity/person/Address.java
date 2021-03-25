package com.tongdun.parsexml.entity.person;

import com.tongdun.parsexml.config.ConnectionManager;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Address {
    public String personId;

    public String addressline;

    public String addresscity;

    public String addresscountry;

    public String url;

    public static void insert(List<Address> list)  {
        String sql = "insert into Address values(?,?,?,?,?)";
        PreparedStatement pstmt = null;
        try {
            pstmt = ConnectionManager.getConnection().prepareStatement(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        for (Address widd : list) {
            try {
                pstmt.setString(1, widd.personId);
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