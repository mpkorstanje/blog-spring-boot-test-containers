package com.logarithmicwhale.demo;

import com.logarithmicwhale.demo.EnablePostgresTestContainerContextCustomizerFactory.EnabledPostgresTestContainer;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
@EnabledPostgresTestContainer
class DemoApplication2Test {

    @Test
    void contextLoads() {
        log.info("Hello world");
    }

}
