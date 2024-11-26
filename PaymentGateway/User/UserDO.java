package User;

public class UserDO { //this is the class for input user obj, since clients and server field might not be exaclty same
        public String getUserName() {
                return userName;
        }

        public void setUserName(String userName) {
                this.userName = userName;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        String userName;
        String email;
        int id;//not needed tho
}
