package commonclass;

public class MessageCard<I> {
    private I info;

    public I getInfo() {
        return info;
    }

    public void setInfo(I info) {
        this.info = info;
    }

    public MessageCard(I info) {
        this.info = info;
    }
    public MessageCard(){

    }

    @Override
    public String toString() {
        return "这是一张号码为"+this.info+"的信息卡";
    }
}
