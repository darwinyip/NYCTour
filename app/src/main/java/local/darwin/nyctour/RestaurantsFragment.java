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
        places.add(new Place("Katz's Delicatessen", "Lower East Side", "Katz’s is the undisputed pastrami king of NYC. This sprawling LES institution has been serving thick-cut, meltingly tender pastrami on rye since 1888 and doesn’t show any signs of slowing down.", R.raw.katzs_deli));
        places.add(new Place("Juliana's Pizza", "Brooklyn", "Juliana's heralds  the return of Patsy Grimaldi, New York City’s most celebrated pizza proprietor: not only to the NYC restaurant scene, but to 19 Old Fulton Street, the original location under the Brooklyn Bridge", R.raw.julianas));
        places.add(new Place("Brooklyn Brewery", "Brooklyn", "Brooklyn Brewery makes beer. Good beer. Not only does it taste good and make your meal better but we like to think that since its founding in 1988, Brooklyn Brewery has brewed flavorful beers that enrich the life, tradition and culture of the communities it serves.", R.raw.brooklyn_brewery));

        RecyclerView recyclerView = rootView.findViewById(R.id.section_container);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);

        PlaceAdapter placeAdapter = new PlaceAdapter(places);
        recyclerView.setAdapter(placeAdapter);

        return rootView;
    }
}
