package picscramble.shotang.com.picscramble.service;

import io.reactivex.Observable;
import picscramble.shotang.com.picscramble.model.GridItem;
import retrofit2.http.GET;

/**
 * Created by hcv on 16/09/17.
 */

public interface ImageService {
    @GET("/")
    Observable<GridItem> getGridItems();
}
