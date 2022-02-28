package peaksoft.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import peaksoft.KoscheiTheDeathless;

@Component
public class Deth8_2 {

    private KoscheiTheDeathless koscheiTheDeathless;

    @Autowired
    public Deth8_2(KoscheiTheDeathless koscheiTheDeathless) {
        this.koscheiTheDeathless = koscheiTheDeathless;
    }
}
