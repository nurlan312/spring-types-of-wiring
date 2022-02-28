package peaksoft.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Island2 {

    private Wood3 wood3;

    @Autowired
    public Island2(Wood3 wood3) {
        this.wood3 = wood3;
    }

    @Override
    public String toString() {
        return "на том острове дуб стоит, " + wood3.toString();
    }
}
