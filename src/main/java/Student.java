import javafx.scene.image.Image;

public class Student {
    private String name;
    private int ID;
    private Image image;
    public Student(){
    }
    public Student (String name, int ID, Image image){
        this.name = name;
        this.ID = ID;
        this.image = image;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
