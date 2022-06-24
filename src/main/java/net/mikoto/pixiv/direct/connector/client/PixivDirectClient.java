package net.mikoto.pixiv.direct.connector.client;

import com.dtflys.forest.annotation.Address;
import com.dtflys.forest.annotation.Get;
import com.dtflys.forest.annotation.LogEnabled;
import com.dtflys.forest.annotation.Var;
import com.google.gson.JsonObject;
import org.springframework.stereotype.Component;

/**
 * @author mikoto
 * @date 2022/6/25 1:11
 */
@Component
public interface PixivDirectClient {

    /**
     * Get the artwork(raw) from pixiv.
     *
     * @param artworkId The artwork id.
     * @return The json object.
     */
    @Get(
            url = "/ajax/illust/{artworkId}"
    )
    @Address(
            scheme = "https",
            host = "www.pixiv.net"
    )
    @LogEnabled(logResponseContent = true)
    String getArtwork(@Var("artworkId") int artworkId);
}
