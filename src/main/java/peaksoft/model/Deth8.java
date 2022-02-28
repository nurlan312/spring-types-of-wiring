package peaksoft.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import peaksoft.KoscheiTheDeathless;

@Component
public class Deth8 {

   private Deth8_2 deth8_2;

   @Autowired
    public Deth8(Deth8_2 deth8_2) {
        this.deth8_2 = deth8_2;
    }

    @Override
    public String toString() {
        return "-- смерть Кощея.";
    }
}
