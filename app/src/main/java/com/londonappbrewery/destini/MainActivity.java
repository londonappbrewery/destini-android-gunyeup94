package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button topButton;
    Button bottomButton;
    int mIndex;
    HashMap<String, Integer> map;

    int[] mStory = new int[]{
            R.string.T1_Story,
            R.string.T2_Story,
            R.string.T3_Story,
            R.string.T4_End,
            R.string.T5_End,
            R.string.T6_End
    };

    int[] mAnswers = new int[]{
            R.string.T1_Ans1,
            R.string.T1_Ans2,
            R.string.T2_Ans1,
            R.string.T2_Ans2,
            R.string.T3_Ans1,
            R.string.T3_Ans2
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        map = new HashMap<>();
        map.put(getString(R.string.T1_Ans1), 2);
        map.put(getString(R.string.T1_Ans2), 1);
        map.put(getString(R.string.T2_Ans1), 2);
        map.put(getString(R.string.T2_Ans2), 3);
        map.put(getString(R.string.T3_Ans1), 5);
        map.put(getString(R.string.T3_Ans2), 4);

        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        topButton = (Button) findViewById(R.id.buttonTop);
        bottomButton = (Button) findViewById(R.id.buttonBottom);

        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mIndex = map.get(topButton.getText());
                updateStory(mIndex);
            }
        });

        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mIndex = map.get(bottomButton.getText());
                updateStory(mIndex);
            }
        });


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
    }

    private void updateStory(int index) {
        mStoryTextView.setText(mStory[index]);
        if (index > 2) {
            topButton.setVisibility(View.GONE);
            bottomButton.setVisibility(View.GONE);
        } else {
            topButton.setText(mAnswers[index*2]);
            bottomButton.setText(mAnswers[index*2 + 1]);
        }

    }
}
