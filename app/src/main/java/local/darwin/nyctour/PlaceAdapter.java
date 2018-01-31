package local.darwin.nyctour;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * RecyclerView adapter for Place.
 */
public class PlaceAdapter extends RecyclerView.Adapter<PlaceHolder> {

    private ArrayList<Place> places;

    PlaceAdapter(ArrayList<Place> places) {
        this.places = places;
    }

    @Override
    public PlaceHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new PlaceHolder(v);
    }

    @Override
    public void onBindViewHolder(PlaceHolder holder, int position) {
        holder.setPlace(places.get(position));
    }

    @Override
    public int getItemCount() {
        return places.size();
    }
}
