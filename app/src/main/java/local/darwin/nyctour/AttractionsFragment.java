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
 * Fragment containing Views of attraction places.
 */
public class AttractionsFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.statue_of_liberty), getString(R.string.mahattan), getString(R.string.statue_of_liberty_desc), R.drawable.statue_liberty));
        places.add(new Place(getString(R.string.moma), getString(R.string.mahattan), getString(R.string.moma_desc), R.drawable.moma));
        places.add(new Place(getString(R.string.wtc), getString(R.string.mahattan), getString(R.string.wtc_desc), R.drawable.one_world_trade));

        RecyclerView recyclerView = rootView.findViewById(R.id.section_container);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);

        PlaceAdapter placeAdapter = new PlaceAdapter(places);
        recyclerView.setAdapter(placeAdapter);

        return rootView;
    }


}
