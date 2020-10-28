package InternalClass;

public class FileWorks implements File {
    private String method;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public FileWorks(String method) {
        this.method = method;
    }
    public FileWorks(){

    }

    @Override
    public void boom() {

    }

    @Override
    public boolean exists() {
        return false;
    }
}
