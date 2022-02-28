package peaksoft;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import peaksoft.config.AppConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class AppTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void mainTest() {
        String text = "На море на океане есть остров, на том острове дуб стоит, " +
                "\nпод дубом сундук закрыт, в сундуке -- заяц, в зайце -- утка, " +
                "\nв утке -- яйцо, в яйце -- игла, -- смерть Кощея.";

        KoscheiTheDeathless koscheiTheDeathless =
                applicationContext.getBean(KoscheiTheDeathless.class);
        System.out.println(koscheiTheDeathless.getRulesByDeth());
        String testText = koscheiTheDeathless.getRulesByDeth();

        if (!testText.contains(text) && testText.length() <= text.length()) {
            Assert.fail("Тест провален, не корректная связь бинов. Итоговая фраза не верна.");
        }
    }
}
