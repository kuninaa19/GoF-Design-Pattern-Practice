package com.pattern.gof.templatemethod;

import org.junit.jupiter.api.Test;


public class TemplateMethodPatternTest {
    @Test
    void 충전기_간략_설명() {
        Charger charger = new Charger("QC", 9, 2, 3);
        ChargerTemplate simpleChargerScript = new SimpleChargerScript(charger);

        simpleChargerScript.display();
    }

    @Test
    void 충전기_세부_설명() {
        Charger charger = new Charger("QC", 9, 2, 3);
        ChargerTemplate detailChargerScript = new DetailChargerScript(charger);

        detailChargerScript.display();
    }
}
