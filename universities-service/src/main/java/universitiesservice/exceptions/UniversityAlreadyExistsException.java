package universitiesservice.exceptions;

public class UniversityAlreadyExistsException  extends RuntimeException{
    private String message;

    public UniversityAlreadyExistsException(){}


    public UniversityAlreadyExistsException(String msg){
        super();
        this.message = msg;
    }
}
