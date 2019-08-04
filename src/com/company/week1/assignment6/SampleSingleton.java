package com.company.week1.assignment6;

import java.math.BigDecimal;
import java.sql.DriverManager;
import java.sql.ResultSet;

//// Took out static
//public class SampleSingleton {
//    //make constructor private
//    private SampleSingleton(){};
//
//    private static Connection conn = null;
//
//    private static SampleSingleton instance = null;
//
//    public static SampleSingleton getInstance() {
//        return instance;
//    }
//
//    public static void databaseQuery(BigDecimal input) {
//        conn = DriverManager.getConnection("url of database");
//        Statement st = conn.createStatement();
//        ResultSet rs = st.executeQuery("select id from table");
//        int x = 0;
//        while(rs.next()) {
//            x = rs.getInt(1) * input;
//        }
//    }
//}
