import javax.swing.*;
import java.awt.*;

public class DefaultCard implements Karte {
    String id;
    String type="default";
    Image image;
    JButton button;
    public DefaultCard(String id,Image image){

    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public JButton getButton() {
        return button;
    }

    @Override
    public Image getImage() {
        return image;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void setButton(JButton button) {
        this.button = button;
    }
}
