package local.darwin.nyctour;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Fragment containing Views of restaurant places.
 */
public class RestaurantsFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.katz_deli), getString(R.string.mahattan), getString(R.string.katz_deli_desc), R.drawable.katzs_deli));
        places.add(new Place(getString(R.string.juliana_pizza), getString(R.string.brooklyn), getString(R.string.juliana_pizza_desc), R.drawable.julianas));
        places.add(new Place(getString(R.string.brooklyn_brewery), getString(R.string.brooklyn), getString(R.string.brooklyn_brewery_desc), R.drawable.brooklyn_brewery));

        RecyclerView recyclerView = rootView.findViewById(R.id.section_container);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);

        PlaceAdapter placeAdapter = new PlaceAdapter(places);
        recyclerView.setAdapter(placeAdapter);

        return rootView;
    }
}
