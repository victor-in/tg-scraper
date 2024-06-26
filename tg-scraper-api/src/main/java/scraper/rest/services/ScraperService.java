package scraper.rest.services;

import java.util.List;
import java.util.Objects;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

import org.springframework.stereotype.Component;
import scraper.rest.MockData;
import scraper.rest.services.getchannelposts.ChannelPostsRequest;
import scraper.rest.services.getchannelposts.ChannelPostsResponse;
import scraper.rest.services.getuserchannels.UserChannelsRequest;
import scraper.rest.services.getuserchannels.UserChannelsResponse;

@Component
@ParametersAreNonnullByDefault
public class ScraperService {

    @Nonnull
    public ChannelPostsResponse getChannelPostsResponse(ChannelPostsRequest channelPostsRequest) {
        if (Objects.equals(channelPostsRequest.getChannel().getChannelName(), MockData.CHANNEL_1.getChannelName())) {
            return ChannelPostsResponse.builder()
                    .channel(MockData.CHANNEL_1)
                    .posts(MockData.POSTS_1)
                    .build();
        }
        if (Objects.equals(channelPostsRequest.getChannel().getChannelName(), MockData.CHANNEL_2.getChannelName())) {
            return ChannelPostsResponse.builder()
                    .channel(MockData.CHANNEL_2)
                    .posts(MockData.POSTS_2)
                    .build();
        }
        return ChannelPostsResponse.builder()
                .posts(List.of())
                .build();
    }

    public UserChannelsResponse getUserChannels(UserChannelsRequest userChannelsRequest) {
        return UserChannelsResponse.builder()
                .channels(List.of(MockData.CHANNEL_1, MockData.CHANNEL_2))
                .build();
    }
}
