import com.itheima.pojo.Student;
import com.itheima.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MybatisTest {
    @Test
    public void findStudentByNameOrMajorTest() {
        SqlSession session = MyBatisUtils.getSession();
        Student student = new Student();
        student.setName("张三");
        //student.setMajor("英语");
        // 执行SqlSession的查询方法，返回结果集
        List<Student> students = session.selectList("com.itheima.mapper"
                + ".StudentMapper.findStudentByNameAndMajor", student);
        // 输出查询结果信息
        for (Student student2 : students) {
            // 打印输出结果
            System.out.println(student2);
        }
        // 关闭SqlSession
        session.close();
    }

    @Test
    public void findByListTest() {
        SqlSession session = MyBatisUtils.getSession();
        List<Integer> ids = new ArrayList<Integer>();
        for (int i = 1; i < 5; i++) {
            ids.add(i);
        }
        // 执行SqlSession的查询方法，返回结果集
        List<Student> students = session.selectList("com.itheima.mapper"
                + ".StudentMapper.findByList", ids);
        // 输出查询结果信息
        for (Student student : students) {
            // 打印输出结果
            System.out.println(student);
        }
        // 关闭SqlSession
        session.close();
    }


}