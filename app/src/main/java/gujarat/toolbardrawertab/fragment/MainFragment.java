package gujarat.toolbardrawertab.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import gujarat.toolbardrawertab.R;

/**
 * Created by Gujarat Santana on 05/12/15.
 */
public class MainFragment extends Fragment {

    private RecyclerView rv;
    private MainAdapter mainAdapter;

    public static MainFragment newInstance(Context context, int columns) {
        Bundle args = new Bundle();
//        args.putInt("Columns", columns);
        MainFragment fragment = new MainFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.content_main, container, false);
        initUI(view);
        return view;
    }

    private void initUI(View v){
        rv = (RecyclerView) v.findViewById(R.id.ListStore);
        mainAdapter = new MainAdapter(getActivity(),getActivity());
        rv.setLayoutManager(new LinearLayoutManager(rv.getContext()));
        rv.setAdapter(mainAdapter);
    }


}
