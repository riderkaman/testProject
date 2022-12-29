import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class containsalltest {

    List<users> usersList1 = new ArrayList<>();
    List<users> usersList2 = new ArrayList<>();


    @BeforeEach
    public void listinit() {
        users users1 = new users();
        users1.setUserId("유저1");
        users1.setAge(10);

        users users2 = new users();
        users2.setUserId("유저2");
        users2.setAge(10);

        users users3 = new users();
        users3.setUserId("유저3");
        users3.setAge(10);

        users users4 = new users();
        users4.setUserId("유저4");
        users4.setAge(10);

        users users5 = new users();
        users5.setUserId("유저5");
        users5.setAge(10);

        /*users users5_1 = new users();
        users5_1.setUserId("유저5");
        users5_1.setAge(11);*/

        usersList1.add(users1);
        usersList1.add(users2);
        usersList1.add(users3);
        usersList1.add(users4);
        usersList1.add(users5);

        users5 = new users();
        users5.setUserId("유저5");
        users5.setAge(10);

        usersList2.add(users1);
        usersList2.add(users2);
        usersList2.add(users3);
        usersList2.add(users4);
        usersList2.add(users5);
        //usersList2.add(users5_1);
    }

    @Test
    public void containsalliscorrect() {

        System.out.println(CollectionUtils.isEqualCollection(usersList1, usersList2));
        for (int i = 0; i < usersList1.size(); i++) {
            users users1 = usersList1.get(i);
            users users2 = usersList2.get(i);
            System.out.println("같은지: " + users1.equals(users2));
            System.out.println(users1.getAge() + " " + users2.getAge());
        }

        assertThat(usersList1).containsAll(usersList2);

    }
}