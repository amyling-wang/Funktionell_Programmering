package Inlämning1_webbshop;

public class Size {

    private int id;
    private String size;

    public Size(int id, String size) {
        this.id = id;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String name) {
        this.size = name;
    }
}
