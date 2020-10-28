package inherit;

public class User {
    private String name;
    private String number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public User(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public User() {

    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User) {
            User user = (User) obj;
            if (this.getNumber().equals(user.getNumber())
                    && this.getName().equals(user.getName())) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "我叫" + this.getName() + "，我的电话号码是：" + this.getNumber();
    }
}
