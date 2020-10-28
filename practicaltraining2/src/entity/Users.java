package entity;

public class Users {

    private String id;
    private String name;
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Users() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Users [id=" + id + ", name=" + name + ", password=" + password + "]";
    }

}
