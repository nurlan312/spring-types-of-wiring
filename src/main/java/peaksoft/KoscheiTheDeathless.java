package peaksoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import peaksoft.model.Ocean1;

@Component
public class KoscheiTheDeathless {

    private Ocean1 ocean1;

    public String getRulesByDeth() {
        return "На море на " + ocean1.toString();
    }

    @Autowired
    public void setOcean(Ocean1 ocean1) {
        this.ocean1 = ocean1;
    }
}
