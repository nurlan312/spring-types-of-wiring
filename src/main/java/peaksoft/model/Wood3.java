package peaksoft.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Wood3 {

    private final Rabbit4 rabbit4;

    @Autowired
    public Wood3(Rabbit4 rabbit4) {
        this.rabbit4 = rabbit4;
    }

    @Override
    public String toString() {
        return "\nпод дубом сундук закрыт, " + rabbit4.toString();
    }
}
