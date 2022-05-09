package hello.jdbc.repository;

import hello.jdbc.connection.DBConnectionUtil;
import hello.jdbc.domain.Member;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * JDBC - DriverManager 사용
 */
@Slf4j
public class MemberRepositoryV0 {

    public Member save(Member member) {
        String sql = "insert into member(member_id, money) values (?, ?)";

        Connection con = null;
        PreparedStatement pstmt = null;


        con = getConnection();
        try {
            pstmt = con.prepareStatement(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @NotNull
    private Connection getConnection() {
        return DBConnectionUtil.getConnection();
    }
}
