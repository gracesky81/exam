package gracesky;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class UserDaoTest
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException {
        UserDao dao = new DaoFactory().userDao();

        User user = new User();
        user.setId("me");
        user.setName("박은호");
        user.setPassword("gray");

        dao.add(user);

        System.out.println(user.getId() + " 등록 성공");
    }
}
