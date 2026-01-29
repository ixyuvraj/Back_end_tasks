import java.util.Scanner;

class InvalidUserNameException extends Exception{
    public InvalidUserNameException(String message){
        super(message);
    }
}


class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}


class InvalidEmailException extends Exception{
    public InvalidEmailException (String message){
        super(message);
    }
}



class Validator{
    static void validateUsername(String username) throws InvalidUserNameException{
        if(username.length() < 3){
            throw new InvalidUserNameException("Username too short");
        }
        
        if(username.length() > 15){
            throw new InvalidUserNameException("Username too long");
        }

        if(!username.matches("^[^@#].*")){
            throw new InvalidUserNameException("username cannot start with @ or #");
        }
    }



    static void validateAge(Integer age) throws InvalidAgeException{
        if(age < 0){
            throw new InvalidAgeException("age cannot be negative");
        }
        if(age > 120){
            throw new InvalidAgeException("age cannot be too high");
        }
    }


    static void validateEmail(String email) throws InvalidEmailException{
        if(!email.matches("^[a-zA-Z0-9_.]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}$")){
            throw new InvalidEmailException("Email format is wrong");
        }
    }


}


class Task3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter username : ");
            String username = sc.nextLine();
            Validator.validateUsername(username);


            System.out.println("Enter age : ");
            Integer age = Integer.parseInt(sc.nextLine());
            Validator.validateAge(age);

        //so , we need to take input as string and then convert to integer ,cause after taking the integer, it leaves an extra line for buffer, this buffer line is taken input by the nextLine (for email) , thatws why it give wrong email erro 

            System.out.println("Enter email : ");
            String email = sc.nextLine();
            Validator.validateEmail(email);

            System.out.println("all passed");
        }

        catch(InvalidUserNameException e){
            System.out.println("Error :  " + e.getMessage());
        }

        catch(InvalidAgeException e){
            System.out.println("Error : "+e.getMessage());
        }

        catch(InvalidEmailException e){
            System.out.println("Error : "+e.getMessage());
        }

        sc.close();
    }
}