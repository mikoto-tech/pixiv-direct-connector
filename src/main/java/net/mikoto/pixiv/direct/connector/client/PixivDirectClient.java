package net.mikoto.pixiv.direct.connector.client;

import com.dtflys.forest.annotation.Address;
import com.dtflys.forest.annotation.Get;
import com.dtflys.forest.annotation.Var;
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
     * @return Result.
     */
    @Get(
            url = "/ajax/illust/{artworkId}"
    )
    @Address(
            scheme = "https",
            host = "www.pixiv.net"
    )
    String getArtwork(@Var("artworkId") int artworkId);

    /**
     * Get the image from pixiv.
     *
     * @param url The image url.
     * @return Result.
     */
    @Get(
            url = "{url}",
            headers = {
                    "Referer: https://www.pixiv.net"
            }
    )
    @Address(
            scheme = "https",
            host = "i.pximg.net"
    )
    byte[] getImage(@Var("url") String url);
}
