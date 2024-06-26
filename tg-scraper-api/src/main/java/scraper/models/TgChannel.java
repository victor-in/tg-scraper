package scraper.models;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TgChannel {

    @Nullable
    String title;

    @Nullable
    String description;

    @Nullable
    Integer userCnt;

    @Nonnull
    String channelName;
}
