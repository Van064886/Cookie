package Van064886.coursgraven;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CookieActivity extends AppCompatActivity
{
    private TextView text;
    private ImageView img;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cookie);
        text = findViewById(R.id.textView);
        img = findViewById(R.id.cookieView);
        img.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String oldText = "Points :";
                count++;
                text.setText(oldText + count);
            }
        });
    }
}