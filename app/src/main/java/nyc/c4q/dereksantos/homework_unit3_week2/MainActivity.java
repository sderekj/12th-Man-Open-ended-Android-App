package nyc.c4q.dereksantos.homework_unit3_week2;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import jp.wasabeef.recyclerview.animators.FlipInRightYAnimator;
import jp.wasabeef.recyclerview.animators.OvershootInLeftAnimator;
import jp.wasabeef.recyclerview.animators.SlideInUpAnimator;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            mRecyclerView = (RecyclerView) findViewById(R.id.league_list_portrait);
            mRecyclerView.setLayoutManager(new GridLayoutManager(this, 1));
            mRecyclerView.setItemAnimator(new FlipInRightYAnimator());
        } else {
            mRecyclerView = (RecyclerView) findViewById(R.id.league_list_land);
            mRecyclerView.setLayoutManager(new GridLayoutManager(this, 3));
            mRecyclerView.setItemAnimator(new OvershootInLeftAnimator());
        }
        mRecyclerView.setAdapter(new LeagueListAdapter());
    }

}
