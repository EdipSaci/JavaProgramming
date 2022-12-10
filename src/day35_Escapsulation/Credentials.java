package day35_Escapsulation;

public class Credentials {
    /*
    create a class named Credentials
            Variables:
                username, password

            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password
                            Characteristics of strong passwords are:
                                    1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit

                getPassword(): reads the password
                getUsername(): reads the username
                setUsername(): sets the username
                setPassword(): sets a new password
                                    the new password MUST be a strong password

                toString():

            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)
     */

    public Credentials(String userName, String password) {
        setUserName(userName);
        setPassword(password);
    }

    public String userName,password;

    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName){
        this.userName=userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isStrongPassword(password)){
            this.password = password;
        }
    }

    public boolean isStrongPassword(String password){
        boolean first = false;
        boolean sec = false;
        boolean third = false;
        boolean fourth = false;
        boolean fifth= false;
        boolean sixth= false;
       char[] chars= password.toCharArray();
        if (chars.length> 8){
           first=true;
        }
        for (char each : chars) {
            if (each!=' '){
                sec=true;
            } else if (Character.isLetter(each)) {
               third=true;
            } else if (!Character.isLetterOrDigit(each)) {
                fourth=true;
            }else if (Character.isDigit(each)){
                fifth=true;
            }
        }
        if (first&& sec&& third && fourth && fifth){
            sixth= true;
        }
        return sixth;
    }


    public String toString() {
        return "Credentials{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
