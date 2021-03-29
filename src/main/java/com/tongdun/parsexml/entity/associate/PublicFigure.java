package com.tongdun.parsexml.entity.associate;

import com.google.gson.Gson;
import com.tongdun.parsexml.config.ConnectionManager;
import com.tongdun.parsexml.entity.entity.Entity;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PublicFigure {
    public String id;
//    public List<Associate> associateList;
    public String associateList;

    public static void insert(List<PublicFigure> publicFigureList) {
        String sql = "insert into publicfigure values(?,?)";
        PreparedStatement pstmt = null;
        try {
            pstmt = ConnectionManager.getConnection().prepareStatement(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        for (PublicFigure widd : publicFigureList) {
            try {
                pstmt.setString(1, widd.id);
                pstmt.setString(2, widd.associateList);
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
