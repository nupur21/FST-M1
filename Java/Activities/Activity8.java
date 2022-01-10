package Activities;

import Activities.Activity8.CustomException;

public class Activity8 {
    static class CustomException extends Exception{
        private String message;

        CustomException(String message){
            this.message = message;
        }
        public String getMessage(){
            return message;
        }
    }
}

class Activity8Main {
    public static void main(String[] args) {
        try{
            Activity8Main.exceptionTest("value is not null");
            Activity8Main.exceptionTest(null);
        } catch (CustomException e) {
            System.out.println("Inside catch block: "+e.getMessage());
        }
    }

    static void exceptionTest(String str) throws CustomException{
        if(str == null){
            throw new CustomException("String value is null");
        }else{
            System.out.println(str);
        }
    }
}
