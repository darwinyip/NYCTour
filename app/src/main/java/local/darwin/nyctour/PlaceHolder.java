package local.darwin.nyctour;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

class PlaceHolder extends RecyclerView.ViewHolder {

    private TextView name;
    private TextView location;
    private TextView description;
    private ImageView image;
    private Place place;

    PlaceHolder(View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.name_text);
        location = itemView.findViewById(R.id.location_text);
        description = itemView.findViewById(R.id.description_text);
        image = itemView.findViewById(R.id.image);
    }

    void setPlace(Place place) {
        this.place = place;
        name.setText(place.getName());
        location.setText(place.getLocation());
        description.setText(place.getDescription());
        image.setImageResource(place.getImageResourceId());
    }
}
