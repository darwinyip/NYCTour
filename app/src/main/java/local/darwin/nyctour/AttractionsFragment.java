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
        places.add(new Place("Statue of Liberty", "Liberty Island", "\"The Statue of Liberty Enlightening the World\" was a gift of friendship from the people of France to the United States and is recognized as a universal symbol of freedom and democracy. The Statue of Liberty was dedicated on October 28, 1886.  It was designated as a National Monument in 1924.  Employees of the National Park Service have been caring for the colossal copper statue since 1933. ", R.raw.statue_liberty));
        places.add(new Place("Museum of Modern Art", "Manhattan", "MoMA is a place that fuels creativity, ignites minds, and provides inspiration. Its extraordinary exhibitions and collection of modern and contemporary art are dedicated to helping you understand and enjoy the art of our time.", R.raw.moma));
        places.add(new Place("One World Trade Center", "Manhattan", "One World Trade Center is the main building of the rebuilt World Trade Center complex in Lower Manhattan, New York City. It is the tallest building in the Western Hemisphere, and the sixth-tallest in the world.", R.raw.one_world_trade));

        RecyclerView recyclerView = rootView.findViewById(R.id.section_container);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);

        PlaceAdapter placeAdapter = new PlaceAdapter(places);
        recyclerView.setAdapter(placeAdapter);

        return rootView;
    }


}
