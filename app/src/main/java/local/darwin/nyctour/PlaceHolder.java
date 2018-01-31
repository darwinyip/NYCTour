package local.darwin.nyctour;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * ViewHolder for Place.
 */
class PlaceHolder extends RecyclerView.ViewHolder {

    private TextView name;
    private TextView location;
    private TextView description;
    private ImageView image;
    private boolean isHidden = true;

    /**
     * Required constructor for ViewHolder.
     *
     * @param itemView View used by the Adapter
     */
    PlaceHolder(View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.name_text);
        location = itemView.findViewById(R.id.location_text);
        description = itemView.findViewById(R.id.description_text);
        image = itemView.findViewById(R.id.image);

        //Sets the action to toggle when clicking the CardView.
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleVisibility();
            }
        });
    }

    /**
     * Sets properties of Views inside of CardView.
     *
     * @param place Place object containing the data to fill CardView details
     */
    void setPlace(Place place) {
        name.setText(place.getName());
        location.setText(place.getLocation());
        description.setText(place.getDescription());
        image.setImageResource(place.getImageResourceId());
    }

    /**
     * Expands or shrinks CardView based current state.
     */
    private void toggleVisibility() {
        if (isHidden) {
            location.setVisibility(View.VISIBLE);
            description.setVisibility(View.VISIBLE);
        } else {
            location.setVisibility(View.GONE);
            description.setVisibility(View.GONE);
        }
        isHidden = !isHidden;
    }
}
