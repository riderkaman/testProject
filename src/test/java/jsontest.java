import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class jsontest {

    @Test
    public void gettest() throws FileNotFoundException {

        // FileReader 생성
        Reader reader = new FileReader("C:\\Users\\rider\\Downloads\\data.json");

        // Json 파일 읽어서, Lecture 객체로 변환
        Gson gson = new Gson();
        Users users = gson.fromJson(reader, Users.class);

        // Lecture 객체 출력
        // Lecture [id=1, students=[{id=123.0, name=Tom}, {id=124.0, name=Jerry}], subject={name=Java, professor=Anna}]
        Map<String, Object> resultData = users.getResultData();
        System.out.println("resultData = " + resultData);
        List<Map<String, Object>> userList = (List<Map<String, Object>>) resultData.get("userList");


        List<String> userIdList = new ArrayList<>();
        for (Map<String, Object> stringObjectMap : userList) {
            userIdList.add((String) stringObjectMap.get("userId"));
        }

        for (String s : userIdList) {
            System.out.println(s);
        }

    }


}
