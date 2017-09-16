package picscramble.shotang.com.picscramble.ui;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import picscramble.shotang.com.picscramble.R;

/**
 * Created by hcv on 16/09/17.
 */

public class CellItem extends RecyclerView.ViewHolder{
    public ImageView gameImage;
    public CellItem(View itemView) {
        super(itemView);
        gameImage = (ImageView)itemView.findViewById(R.id.image_holder);
    }
}
