package com.tongdun.parsexml.entity.associate;

import com.tongdun.parsexml.config.ConnectionManager;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class SpecialEntity {
    public String id;
//    public List<Associate> associates;
    public String associateList;

    public static void insert(List<SpecialEntity> specialEntityList) {
        String sql = "insert into specialentity values(?,?)";
        PreparedStatement pstmt = null;
        try {
            pstmt = ConnectionManager.getConnection().prepareStatement(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        for (SpecialEntity widd : specialEntityList) {
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
