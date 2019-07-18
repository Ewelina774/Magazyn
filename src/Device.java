public class Device {

    private String code;
    private String producer;
    private String type;
    private double prize;

    public Device () {
    }

    public Device(String code, String producer, String type, double prize) {

        this(code, producer, type);
        this.prize = prize;
    }

    public Device(String code, String producer, String type) {

        this.code = code;
        this.producer = producer;
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    String getInfo () {
    return "Kod: " + code + ", Producent:" + producer + ", Typ: " + type + ", Cena:" + prize;

        }
        }

