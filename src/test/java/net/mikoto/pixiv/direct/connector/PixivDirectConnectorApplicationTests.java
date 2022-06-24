package net.mikoto.pixiv.direct.connector;

import net.mikoto.pixiv.direct.connector.client.PixivDirectClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest
@ComponentScan("net.mikoto.pixiv")
@SpringBootApplication
class PixivDirectConnectorApplicationTests {
    @Autowired
    PixivDirectClient pixivDirectClient;

    @Test
    void directTest() {
        pixivDirectClient.getArtwork(79905101);

    }

}
