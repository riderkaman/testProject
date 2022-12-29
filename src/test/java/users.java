import java.util.List;
import java.util.Objects;

public class users {

    String userId;

    List<String> userIds;

    int age;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<String> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<String> userIds) {
        this.userIds = userIds;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        users users = (users) o;
        return age == users.age && Objects.equals(userId, users.userId) && Objects.equals(userIds, users.userIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userIds, age);
    }
}
