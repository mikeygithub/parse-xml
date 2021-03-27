package com.tongdun.parsexml.entity.entity;

import com.tongdun.parsexml.config.ConnectionManager;
import com.tongdun.parsexml.entity.person.*;

import javax.annotation.Generated;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Entity {
    public String id;
    public String action;
    public String date;
    public String activestatus;
    public String profilenotes;

//    //内含标签列表
//    public List<Description> Descriptions;
//    public List<Name> NameDetails;
//    public List<Date> DateDetails;
//    public List<Company> CompanyDetails;
//    public List<Reference> SanctionsReferences;
//    public List<Country> CountryDetails;
//    public List<ID> IDNumberTypers;
//    public List<Source> SourceDescription;
//    public List<Vessel> VesselsDetails;


    //内含标签列表
    public String Descriptions;
    public String NameDetails;
    public String DateDetails;
    public String CompanyDetails;
    public String SanctionsReferences;
    public String CountryDetails;
    public String IDNumberTypers;
    public String SourceDescription;
    public String VesselsDetails;

    public static void  insert(List<Entity> list) {
        String sql = "insert into Entity values(?,?,?,?,?)";
        PreparedStatement pstmt = null;
        try {
            pstmt = ConnectionManager.getConnection().prepareStatement(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        for (Entity widd : list) {
            try {
                pstmt.setString(1, widd.id);
                pstmt.setString(2, widd.action);
                pstmt.setString(3, widd.date);
                pstmt.setString(4, widd.activestatus);
                pstmt.setString(5, widd.profilenotes);
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

    public static void  insertToJSON(List<Entity> list) {
        String sql = "insert into Entity_JSON values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstmt = null;
        try {
            pstmt = ConnectionManager.getConnection().prepareStatement(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        for (Entity widd : list) {
            try {
                pstmt.setString(1, widd.id);
                pstmt.setString(2, widd.action);
                pstmt.setString(3, widd.date);
                pstmt.setString(4, widd.activestatus);
                pstmt.setString(5, widd.profilenotes);
                pstmt.setString(6, widd.Descriptions);
                pstmt.setString(7, widd.NameDetails);
                pstmt.setString(8, widd.DateDetails);
                pstmt.setString(9, widd.CompanyDetails);
                pstmt.setString(10, widd.SanctionsReferences);
                pstmt.setString(11, widd.CountryDetails);
                pstmt.setString(12, widd.IDNumberTypers);
                pstmt.setString(13, widd.SourceDescription);
                pstmt.setString(14, widd.VesselsDetails);
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