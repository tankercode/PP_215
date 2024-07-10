package koschei;

import koschei.models.Ocean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KoscheyTheDeathless {

    private Ocean1 ocean1;

    public String getRulesByDeath() {
        return "На свете есть океан , " + ocean1.toString();
    }

    @Autowired
    public void setOcean(Ocean1 ocean1) {
        this.ocean1 = ocean1;
    }
}
