package universitiesservice.exceptions;

public class NoSuchUniversityExistsException extends RuntimeException {
    private String message;

    public NoSuchUniversityExistsException(){}

    public NoSuchUniversityExistsException(String msg){
        super();
        this.message = msg;
    }
}
