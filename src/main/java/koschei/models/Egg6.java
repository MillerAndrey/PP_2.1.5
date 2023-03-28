package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class Egg6 {


    private Needle7 needle;

    @Override
    public String toString() {
        return ", в яйце иголка " + needle.toString();
    }

    @Autowired
    public void setEnvironment(Needle7 needle) {
        this.needle = needle;
    }
}
