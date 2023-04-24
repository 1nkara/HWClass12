package HW;

public class HWClass12 {

    /* Store username, password and confirm password from a user and check following requirements:

      Username and Password cannot be  empty, if so→ message=”Username or Password cannot be empty”.
      Password should be minimum 8 characters, if less → message=”Password is too short”.
      Password cannot contain username if so, → message=”Password cannot contain username”.
      Password should match confirmed password, if not  → message=“Passwords do not match”.

      Only after all requirements met → message “Your username and password has been created”*/
        public static void main(String[] args) {
            String username="admin";
            String password="admin";
            String confirmedPassword="amin";

            if(username.isBlank() && password.isBlank()){
                System.out.println("Password and username cannot be empty");
            }
            else if(username.length()<8){
                System.out.println("Password is too short");
            }
            else if(password.contains(username)){
                System.out.println("Password cannot contain username");}

            else if(!password.equals(confirmedPassword)){
                System.out.println("Passwords do not match");
            }

        }

    }


