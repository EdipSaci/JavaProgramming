package day10_NestedIf;

public class http {
    public static void main(String[] args) {
        int statusCode = 200;
        String result = "";
        boolean code = (statusCode>=200 && statusCode<=503);

        result= (code)? (statusCode==200)? "Ok" :(statusCode==201)? "Created" :(statusCode==202)? "Accepted" :(statusCode==301)? "Moved Permanently"
                :(statusCode==303)? "See Other" :(statusCode==304)? "Not Modified" :(statusCode==307)? "Temporary Redirect" :(statusCode==400)? "Bad Request"
                :(statusCode==401)? "Unauthorized" : "Forbidden"
                : "Invalid Code" ;


        System.out.println(result);

    }
}
