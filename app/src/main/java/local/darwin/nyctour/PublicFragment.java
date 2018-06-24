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
 * Fragment containing Views of public places.
 */
public class PublicFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.central_park), getString(R.string.mahattan), getString(R.string.centra_park_desc), R.drawable.central_park));
        places.add(new Place(getString(R.string.bryant_park), getString(R.string.mahattan), getString(R.string.bryant_park_desc), R.drawable.bryant_park));
        places.add(new Place(getString(R.string.dumbo), getString(R.string.brooklyn), getString(R.string.dumbo_desc), R.drawable.dumbo));


        RecyclerView recyclerView = rootView.findViewById(R.id.section_container);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);

        PlaceAdapter placeAdapter = new PlaceAdapter(places);
        recyclerView.setAdapter(placeAdapter);

        return rootView;
    }
}
