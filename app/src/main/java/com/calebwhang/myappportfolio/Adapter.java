package com.calebwhang.myappportfolio;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;

import java.util.ArrayList;

/**
 * Created by caleb on 6/6/15.
 */
public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private ArrayList<PortfolioApp> portfolioApps;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public View view;

        public ViewHolder(View v) {
            super(v);
            view = v;
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public Adapter(ArrayList<PortfolioApp> portfolioApps) {
        this.portfolioApps = portfolioApps;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row, parent, false);

        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        Button button = (Button) holder.view.findViewById(R.id.button);
        TextView description = (TextView) holder.view.findViewById(R.id.description);
        ImageView icon = (ImageView) holder.view.findViewById(R.id.icon);

        description.setText(portfolioApps.get(position).getDescription());
        button.setText(portfolioApps.get(position).getTitle());
        icon.setImageResource(portfolioApps.get(position).getIcon());
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return portfolioApps.size();
    }

}
