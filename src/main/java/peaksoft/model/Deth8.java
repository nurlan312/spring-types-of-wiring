package peaksoft.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import peaksoft.KoscheiTheDeathless;

@Component
public class Deth8 {

    private KoscheiTheDeathless koscheiTheDeathless;

    @Autowired
    public Deth8(KoscheiTheDeathless koscheiTheDeathless) {
        this.koscheiTheDeathless = koscheiTheDeathless;
    }
}
