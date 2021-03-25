package com.tongdun.parsexml.entity.entity;

import com.tongdun.parsexml.config.ConnectionManager;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Vessel {

    public String entityId;
    public String VesselCallSign;
    public String VesselType;
    public String VesselTonnage;
    public String VesselGRT;
    public String VesselOwner;
    public String VesselFlag;

    /**
     * 批量插入
     * @param list
     */
    public static void  insert(List<Vessel> list) {
        String sql = "insert into Vessel values(?,?,?,?,?,?,?)";
        PreparedStatement pstmt = null;
        try {
            pstmt = ConnectionManager.getConnection().prepareStatement(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        for (Vessel widd : list) {
            try {
                pstmt.setString(1, widd.entityId);
                pstmt.setString(2, widd.VesselCallSign);
                pstmt.setString(3, widd.VesselType);
                pstmt.setString(4, widd.VesselTonnage);
                pstmt.setString(5, widd.VesselGRT);
                pstmt.setString(6, widd.VesselOwner);
                pstmt.setString(7, widd.VesselFlag);
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
