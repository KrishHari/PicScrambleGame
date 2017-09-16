package picscramble.shotang.com.picscramble.service;
import retrofit2.Retrofit;

/**
 * Created by hcv on 16/09/17.
 */

public class GameServiceFactory {

    public static <T> T buildRetrofitService(final Class<T> clazz, final String baseUrl) {
        final Retrofit restAdapter = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .build();
        T service = restAdapter.create(clazz);

        return service;
    }

}
