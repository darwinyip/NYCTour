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

public class TerminalFragment extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.coney_island), getString(R.string.brooklyn), getString(R.string.coney_island_desc), R.drawable.coneyisland));
        places.add(new Place(getString(R.string.broadway_junction), getString(R.string.brooklyn), getString(R.string.broadway_junction_desc), R.drawable.broadwayjunction));
        places.add(new Place(getString(R.string.flushing), getString(R.string.queens), getString(R.string.flushing_desc), R.drawable.flushingmainstreet));
        places.add(new Place(getString(R.string.south_ferry), getString(R.string.mahattan), getString(R.string.south_ferry_desc), R.drawable.southferry));
        places.add(new Place(getString(R.string.grand_central), getString(R.string.mahattan), getString(R.string.grand_central_desc), R.drawable.grandcentral));

        RecyclerView recyclerView = rootView.findViewById(R.id.section_container);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);

        PlaceAdapter placeAdapter = new PlaceAdapter(places);
        recyclerView.setAdapter(placeAdapter);

        return rootView;
    }
}
