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
        places.add(new Place("Coney Island - Stillwell Avenue", "Brooklyn", "Acting as the railroad-south terminus for the D, F, N, and Q trains. The large facility, originally built in 1919, was designed at a time when Coney Island was the primary summer resort area for the New York metropolitan area, with all of the rail lines in southern Brooklyn funneling service to the area. It is one of the largest elevated transportation terminals in the world.", R.raw.coneyisland));
        places.add(new Place("Broadway Junction", "Brooklyn", "New York City Subway station complex shared by the elevated BMT Canarsie and BMT Jamaica Lines, and the underground IND Fulton Street Line. Throughout the history of the area, this has been a key junction point between various different rail lines. What is now Broadway Junction sits atop the historical Jamaica Pass, the junction of the modern Broadway, Fulton Street, and Jamaica Avenue. The Pass is where these roads passed through the valleys of the area, which are part of the terminal moraine created by the Wisconsin glaciation.", R.raw.broadwayjunction));
        places.add(new Place("Flushing - Main Street", "Queens", "The station is located in Downtown Flushing, also known as Flushing Chinatown, one of New York City's largest Asian enclaves.", R.raw.flushingmainstreet));
        places.add(new Place("South Ferry / Whitehall Street", "Manhattan", "Subway station complex in the Manhattan neighborhood of Financial District, under Battery Park. The complex is shared by the IRT Broadway–Seventh Avenue Line and the BMT Broadway Line.", R.raw.southferry));
        places.add(new Place("Grand Central - 42nd Street", "Manhattan", "It is the second busiest station in the 424-station system, with 46,121,509 passengers in 2016.", R.raw.grandcentral));

        RecyclerView recyclerView = rootView.findViewById(R.id.section_container);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);

        PlaceAdapter placeAdapter = new PlaceAdapter(places);
        recyclerView.setAdapter(placeAdapter);

        return rootView;
    }
}
