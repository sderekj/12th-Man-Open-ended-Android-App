package nyc.c4q.dereksantos.homework_unit3_week2;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class LeagueView extends AppCompatActivity {
    public static final String LEAGUE_NAME = "extra.league.name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.league_view);
        String league = getIntent().getStringExtra(LEAGUE_NAME);
        switch (league) {
            case "English Premier League":
                showEpl();
                break;
            case "La Liga":
                showLaLiga();
                break;
            case "Major League Soccer":
                showMls();
                break;
            case "Serie A":
                showSerieA();
                break;
            case "Bundesliga":
                showBundesliga();
                break;
            case "Ligue 1":
                showLigue1();
                break;
            default:
                break;
        }
    }

    private void showLigue1() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.league_profile, new Ligue1());
        fragmentTransaction.commit();
    }

    private void showBundesliga() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.league_profile, new Bundesliga());
        fragmentTransaction.commit();
    }

    private void showSerieA() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.league_profile, new SerieA());
        fragmentTransaction.commit();
    }

    private void showMls() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.league_profile, new MajorLeagueSoccer());
        fragmentTransaction.commit();
    }

    private void showLaLiga() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.league_profile, new LaLiga());
        fragmentTransaction.commit();
    }

    private void showEpl() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.league_profile, new EnglishPremierLeague());
        fragmentTransaction.commit();
    }

}
