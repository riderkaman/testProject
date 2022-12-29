import java.util.List;
import java.util.Map;

public class Users {

    private Map<String, Object> resultData;
    private List<Map<String, Object>> userList;

    public Map<String, Object> getResultData() {
        return resultData;
    }

    public void setResultData(Map<String, Object> resultData) {
        this.resultData = resultData;
    }

    public List<Map<String, Object>> getUserList() {
        return userList;
    }

    public void setUserList(List<Map<String, Object>> userList) {
        this.userList = userList;
    }
}
