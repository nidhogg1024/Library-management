package dao;


import model.book;
import utils.DBConnection;
import utils.DBReplease;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class bookdao {
    public List<book> find(String ISBN) throws SQLException {
        Connection connection=new DBConnection().getConnection();//连接数据库
        List<book> list = new ArrayList<>();
        String sql = "select * from book where ISBN=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1,ISBN);
        ResultSet rs = ps.executeQuery(sql);
        while(rs.next()){
            //将查询结果遍历，先存进对象，再把对象存入list集合
            book b = new book();
            b.setTitle(rs.getString(1));
            b.setISBN(rs.getString(2));
            b.setPrice(rs.getDouble(3));
            b.setNum(rs.getInt(4));
            b.setAuthor(rs.getString(5));
            b.setCbs(rs.getString(6));
            b.setTime(rs.getDate(7));
            list.add(b);
        }
        new DBReplease(rs, connection);//释放资源
        return list;
    }
}
