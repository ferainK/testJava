package orderManager;

public class UserInfo {
    public String userId;
    public String userName;
    public int userAge;
    public int userTall;
    public int userWeight;
    public String userPhoneNumber;
    public String userAddress;

    //생성자
    public UserInfo() {};
    public UserInfo(String userId, String userName, int userAge, int userTall, int userWeight,
                    String userPhoneNumber, String userAddress) {
        this.userId = userId;
        this.userName = userName;
        this.userAge = userAge;
        this.userTall = userTall;
        this.userWeight = userWeight;
        this.userPhoneNumber = userPhoneNumber;
        this.userAddress = userAddress;
    }

    public String showUserInfo() {
        return userId + "님의 이름은 " + userName + "이고, " + userAge + "세 입니다.";
    }
}
