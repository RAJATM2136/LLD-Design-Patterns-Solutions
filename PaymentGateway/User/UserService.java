package User;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserService {
    static List<UserEntity> users;
    public UserService() {
        users = new ArrayList<>();
    }
    public UserDO addUser(UserDO userDO){  //fn to take client values and make server values for mapping purpose
        UserEntity userObj=new UserEntity();
        userObj.setName(userDO.userName);
        userObj.setEmail(userDO.email);
        userObj.setId(new Random().nextInt(100-10)+10);
        users.add(userObj);
        return convertUserToUserDo(userObj);
    }
    public UserDO getUser(int id){
        for(UserEntity userObj:users){
            if(userObj.getId()==id){
                return convertUserToUserDo(userObj);
            }
        }
        return null;
    }

    public  UserDO convertUserToUserDo(UserEntity userObj) {
    UserDO userDO=new UserDO();
    userDO.userName=userObj.getName();
    userDO.email=userObj.getEmail();
    userDO.id=userObj.getId();
    return userDO;
    }

}
