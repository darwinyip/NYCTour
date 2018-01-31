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

public class PublicFragments extends Fragment {

    public PublicFragments() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Central Park", "Manhattan", "Central Park is a visual masterpiece created by landscape designer Frederick Law Olmsted and architect Calvert Vaux. It has gone through major developments and restoration over time to carry on its initial purpose as an open-air oasis for a metropolitan city. No matter the season or reason for your visit, this national historic landmark is a setting for enjoying many pursuits.", R.raw.central_park));
        places.add(new Place("Bryant Park", "Manhattan", "Bryant Park is a beloved, year-round New York City destination. Known as Manhattan's Town Square, the park is famous for its lush seasonal gardens, free activities, world class restrooms, and al fresco dining. Located adjacent to the New York Public Library and surrounded by iconic skyscrapers, Bryant Park is visited by more than six million people each year and is one of the busiest public spaces in the world.", R.raw.bryant_park));
        places.add(new Place("Dumbo", "Brooklyn", "Trendy Dumbo's cobblestone streets and converted Brooklyn warehouse buildings are the backdrop for independent boutiques, high-end restaurants and trendy cafes. Near the waterfront, St. Ann's Warehouse, in a former tobacco factory, is the heart of a thriving performance and gallery scene.", R.raw.dumbo));


        RecyclerView recyclerView = rootView.findViewById(R.id.section_container);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);

        PlaceAdapter placeAdapter = new PlaceAdapter(places);
        recyclerView.setAdapter(placeAdapter);

        return rootView;
    }
}
