package nyc.c4q.dereksantos.homework_unit3_week2;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

public class LeagueListAdapter extends RecyclerView.Adapter {

    private List<LeagueDescription> mData = Arrays.asList(
            new LeagueDescription("English Premier League", R.drawable.epl_logo),
            new LeagueDescription("Major League Soccer", R.drawable.mls_logo),
            new LeagueDescription("Serie A", R.drawable.serie_a_logo),
            new LeagueDescription("Ligue 1", R.drawable.ligue_1_logo),
            new LeagueDescription("Bundesliga", R.drawable.bundesliga_logo),
            new LeagueDescription("La Liga", R.drawable.laliga_logo)
    );


    @Override
    public LeagueViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new LeagueViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        LeagueViewHolder viewHolder = (LeagueViewHolder) holder;
        LeagueDescription league = mData.get(position);
        viewHolder.bind(league);
        viewHolder.setOnClickListener(navigateToLeagueViewListener(league.getmName()));
    }

    private View.OnClickListener navigateToLeagueViewListener(final String name) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), LeagueView.class);
                intent.putExtra(LeagueView.LEAGUE_NAME, name);
                view.getContext().startActivity(intent);
            }
        };
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

}
