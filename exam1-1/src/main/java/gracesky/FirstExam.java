package gracesky;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class FirstExam
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException {
        ConnectionMaker connectionMaker = new DConnectionMaker();

        UserDao dao = new UserDao(connectionMaker);

        User user = new User();
        user.setId("me");
        user.setName("박은호");
        user.setPassword("gray");

        dao.add(user);

        System.out.println(user.getId() + " 등록 성공");
    }
}
