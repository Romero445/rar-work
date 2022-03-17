import domain.Advert;
import io.qameta.allure.internal.shadowed.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;


import java.nio.file.Paths;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ParsingJsonTest {

    @Test
    void jsonTest() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Advert ad = mapper.readValue(Paths.get("src/test/resources/testJ.json").toFile(), Advert.class);
        assertThat(ad.type).isEqualTo("MIDROLL");
        assertThat(ad.name).isEqualTo("QA");
        assertThat(ad.start).isEqualTo("10");

    }
}
