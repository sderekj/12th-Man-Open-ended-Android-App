package nyc.c4q.dereksantos.homework_unit3_week2;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class LeagueViewHolder extends RecyclerView.ViewHolder {
    private final View mView;
    private final TextView mLeagueName;
    private final ImageView mLeagueLogo;

    public LeagueViewHolder(ViewGroup parent) {
        super(inflateView(parent));
        mView = itemView;
        mLeagueLogo = (ImageView) mView.findViewById(R.id.league_logo);
        mLeagueName = (TextView) mView.findViewById(R.id.league_name);
    }

    private static View inflateView(ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.league_view_holder, parent, false);
    }


    public void bind(LeagueDescription leagueDescription) {
        mLeagueName.setText(leagueDescription.getmName());
        mLeagueLogo.setImageResource(leagueDescription.getmLogo());
    }


    public void setOnClickListener(View.OnClickListener clickListener) {
        mView.setOnClickListener(clickListener);
    }
}
