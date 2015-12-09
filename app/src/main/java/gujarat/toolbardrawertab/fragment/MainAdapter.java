package gujarat.toolbardrawertab.fragment;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import gujarat.toolbardrawertab.R;

/**
 * Created by Gujarat Santana on 05/12/15.
 */
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    private Context context;
    private Activity activity;

    public MainAdapter(Context context, Activity activity){
        this.context = context;
        this.activity = activity;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_store, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
    }

    @Override
    public int getItemCount() {
        return 100;

    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public final View mView;
        public final AppCompatTextView Package;
        public final AppCompatTextView detail;
        public final AppCompatTextView price;
        public final AppCompatTextView buy;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            Package = (AppCompatTextView) view.findViewById(R.id.pacakage);
            detail = (AppCompatTextView) view.findViewById(R.id.detail);
            price = (AppCompatTextView) view.findViewById(R.id.price);
            buy = (AppCompatTextView) view.findViewById(R.id.buy);
        }

    }
}
