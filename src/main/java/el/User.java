package useXML.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("user")
public class User {
    @Value("#{1}")
    private int anInt;

    @Override
    public String toString() {
        return "User{" +
                "anInt=" + anInt +
                '}';
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }
}
