package com.ankan.interndemo;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

import static com.ankan.interndemo.Constants.Adult;
import static com.ankan.interndemo.Constants.Animals;
import static com.ankan.interndemo.Constants.Carrer;
import static com.ankan.interndemo.Constants.Fashion;
import static com.ankan.interndemo.Constants.Health;
import static com.ankan.interndemo.Constants.Life;
import static com.ankan.interndemo.Constants.Love;
import static com.ankan.interndemo.Constants.Money;
import static com.ankan.interndemo.Constants.Movies;
import static com.ankan.interndemo.Constants.Politecs;
import static com.ankan.interndemo.Constants.Sports;
import static com.ankan.interndemo.Constants.Style;
import static com.ankan.interndemo.Constants.Technology;
import static com.ankan.interndemo.Constants.Travel;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ArrayList<String> selectedList = new ArrayList<>();
    private Button button_life;
    private Button button_politics;
    private Button button_love;
    private Button button_technology;
    private Button button_money;
    private Button button_career;
    private Button button_style;
    private Button button_travel;
    private Button button_health;
    private Button button_adult;
    private Button button_sports;
    private Button button_movies;
    private Button button_animals;
    private Button button_fashion;
    private Button button_go_next;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_life = findViewById(R.id.life);
        button_life.setOnClickListener(this);
        button_politics = findViewById(R.id.politics);
        button_politics.setOnClickListener(this);
        button_love = findViewById(R.id.love);
        button_love.setOnClickListener(this);
        button_technology = findViewById(R.id.technology);
        button_technology.setOnClickListener(this);
        button_money = findViewById(R.id.money);
        button_money.setOnClickListener(this);
        button_career = findViewById(R.id.career);
        button_career.setOnClickListener(this);
        button_style = findViewById(R.id.style);
        button_style.setOnClickListener(this);
        button_travel = findViewById(R.id.travel);
        button_travel.setOnClickListener(this);
        button_health = findViewById(R.id.health);
        button_health.setOnClickListener(this);
        button_adult = findViewById(R.id.adult);
        button_adult.setOnClickListener(this);
        button_sports = findViewById(R.id.sports);
        button_sports.setOnClickListener(this);
        button_movies = findViewById(R.id.movies);
        button_movies.setOnClickListener(this);
        button_animals = findViewById(R.id.animals);
        button_animals.setOnClickListener(this);
        button_fashion = findViewById(R.id.fashion);
        button_fashion.setOnClickListener(this);
        button_go_next = findViewById(R.id.go_next);
        button_go_next.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {


        if(v.getId() == R.id.life)
        {
            if(selectedList.contains(Life))
            {
                button_life.setBackgroundResource(R.drawable.button_normal_drawable);
                button_life.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.requiredRed));
                selectedList.remove(Life);
            }
            else
            {
                button_life.setBackgroundResource(R.drawable.button_selected_drawable);
                button_life.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.requiredWhite));
                selectedList.add(Life);

            }
        }
        else if(v.getId() == R.id.politics)
        {
            if(selectedList.contains(Politecs))
            {
                button_politics.setBackgroundResource(R.drawable.button_normal_drawable);
                button_politics.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.requiredRed));
                selectedList.remove(Politecs);
            }
            else
            {
                button_politics.setBackgroundResource(R.drawable.button_selected_drawable);
                button_politics.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.requiredWhite));
                selectedList.add(Politecs);
            }
        }
        else if(v.getId() == R.id.love)
        {
            if(selectedList.contains(Love))
            {
                button_love.setBackgroundResource(R.drawable.button_normal_drawable);
                button_love.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.requiredRed));
                selectedList.remove(Love);
            }
            else
            {
                button_love.setBackgroundResource(R.drawable.button_selected_drawable);
                button_love.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.requiredWhite));
                selectedList.add(Love);
            }

        }
        else if(v.getId() == R.id.technology)
        {
            if(selectedList.contains(Technology))
            {
                button_technology.setBackgroundResource(R.drawable.button_normal_drawable);
                button_technology.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.requiredRed));
                selectedList.remove(Technology);
            }
            else
            {
                button_technology.setBackgroundResource(R.drawable.button_selected_drawable);
                button_technology.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.requiredWhite));
                selectedList.add(Technology);
            }
        }
        else if(v.getId() == R.id.money)
        {
            if(selectedList.contains(Money))
            {
                button_money.setBackgroundResource(R.drawable.button_normal_drawable);
                button_money.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.requiredRed));
                selectedList.remove(Money);
            }
            else
            {
                button_money.setBackgroundResource(R.drawable.button_selected_drawable);
                button_money.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.requiredWhite));
                selectedList.add(Money);
            }
        }
        else if(v.getId() == R.id.career)
        {
            if(selectedList.contains(Carrer))
            {
                button_career.setBackgroundResource(R.drawable.button_normal_drawable);
                button_career.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.requiredRed));
                selectedList.remove(Carrer);
            }
            else
            {
                button_career.setBackgroundResource(R.drawable.button_selected_drawable);
                button_career.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.requiredWhite));
                selectedList.add(Carrer);
            }
        }
        else if(v.getId() == R.id.style)
        {
            if(selectedList.contains(Style))
            {
                button_style.setBackgroundResource(R.drawable.button_normal_drawable);
                button_style.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.requiredRed));
                selectedList.remove(Style);
            }
            else
            {
                button_style.setBackgroundResource(R.drawable.button_selected_drawable);
                button_style.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.requiredWhite));
                selectedList.add(Style);
            }

        }else if(v.getId() == R.id.travel)
        {
            if(selectedList.contains(Travel))
            {
                button_travel.setBackgroundResource(R.drawable.button_normal_drawable);
                button_travel.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.requiredRed));
                selectedList.remove(Travel);
            }
            else
            {
                button_travel.setBackgroundResource(R.drawable.button_selected_drawable);
                button_travel.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.requiredWhite));
                selectedList.add(Travel);
            }
        }
        else if(v.getId() == R.id.health)
        {

            if(selectedList.contains(Health))
            {
                button_health.setBackgroundResource(R.drawable.button_normal_drawable);
                button_health.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.requiredRed));
                selectedList.remove(Health);
            }
            else
            {
                button_health.setBackgroundResource(R.drawable.button_selected_drawable);
                button_health.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.requiredWhite));
                selectedList.add(Health);
            }

        }
        else if(v.getId() == R.id.adult)
        {

            if(selectedList.contains(Adult))
            {
                button_adult.setBackgroundResource(R.drawable.button_normal_drawable);
                button_adult.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.requiredRed));
                selectedList.remove(Adult);
            }
            else
            {
                button_adult.setBackgroundResource(R.drawable.button_selected_drawable);
                button_adult.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.requiredWhite));
                selectedList.add(Adult);
            }

        }
        else if(v.getId() == R.id.sports)
        {
            if(selectedList.contains(Sports))
            {
                button_sports.setBackgroundResource(R.drawable.button_normal_drawable);
                button_sports.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.requiredRed));
                selectedList.remove(Sports);
            }
            else
            {
                button_sports.setBackgroundResource(R.drawable.button_selected_drawable);
                button_sports.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.requiredWhite));
                selectedList.add(Sports);
            }
        }
        else if(v.getId() == R.id.movies)
        {
            if(selectedList.contains(Movies))
            {
                button_movies.setBackgroundResource(R.drawable.button_normal_drawable);
                button_movies.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.requiredRed));
                selectedList.remove(Movies);
            }
            else
            {
                button_movies.setBackgroundResource(R.drawable.button_selected_drawable);
                button_movies.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.requiredWhite));
                selectedList.add(Movies);
            }
        }
        else if(v.getId() == R.id.animals)
        {
            if(selectedList.contains(Animals))
            {
                button_animals.setBackgroundResource(R.drawable.button_normal_drawable);
                button_animals.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.requiredRed));
                selectedList.remove(Animals);
            }
            else
            {
                button_animals.setBackgroundResource(R.drawable.button_selected_drawable);
                button_animals.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.requiredWhite));
                selectedList.add(Animals);
            }
        }
        else if(v.getId() == R.id.fashion)
        {
            if(selectedList.contains(Fashion))
            {
                button_fashion.setBackgroundResource(R.drawable.button_normal_drawable);
                button_fashion.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.requiredRed));
                selectedList.remove(Fashion);
            }
            else
            {
                button_fashion.setBackgroundResource(R.drawable.button_selected_drawable);
                button_fashion.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.requiredWhite));
                selectedList.add(Fashion);
            }
        }
        else if(v.getId() == R.id.go_next)
        {
            StringBuilder total = new StringBuilder();

            for(String item:selectedList)
            {
                total.append(item);
                total.append(", ");
            }

            if(selectedList.size() <= 3)
                Toast.makeText(this, "Please select atleast 4 elements", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, "Selected Items are "+total.toString(), Toast.LENGTH_SHORT).show();
        }


    }
}
