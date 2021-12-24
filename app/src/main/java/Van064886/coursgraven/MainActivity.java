package Van064886.coursgraven;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    private  ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.logo = findViewById(R.id.logo);
        this.logo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent cookieA = new Intent(getApplicationContext() , CookieActivity.class );
                startActivity(cookieA);
                finish();
            }
        });

    }
}