package sg.edu.rp.c346.id21025290.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView tvOutput;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvOutput = findViewById(R.id.textViewOutput);
        btnBack = findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();
        String moduleSelected = intentReceived.getStringExtra("Module");
        String output = "Module Code: "+ moduleSelected;
        switch (moduleSelected){
            case "C203":
                output += "\nModule Name: Web Appln Development in php" +
                        "\nAcademic Year: 2022" +
                        "\nSemester: 1" +
                        "\nModule Credit: 4" +
                        "\nVenue: W65H";
                break;
            case "C206":
                output += "\nModule Name: Software Development Process" +
                        "\nAcademic Year: 2022" +
                        "\nSemester: 1" +
                        "\nModule Credit: 4" +
                        "\nVenue: E66K";
                break;
            case "C218":
                output += "\nModule Name: UI/UX Design for Apps" +
                        "\nAcademic Year: 2022" +
                        "\nSemester: 1" +
                        "\nModule Credit: 4" +
                        "\nVenue: E66B";
                break;
            case "C235":
                    output += "\nModule Name: IT Security and Management" +
                            "\nAcademic Year: 2022" +
                            "\nSemester: 1" +
                            "\nModule Credit: 4" +
                            "\nVenue: E66G";
                    break;
            case "C346":
                output += "\nModule Name: Mobile App Development" +
                        "\nAcademic Year: 2022" +
                        "\nSemester: 1" +
                        "\nModule Credit: 4" +
                        "\nVenue: E62E";
                break;
            case "G953":
                output += "\nModule Name: Life Skills III" +
                        "\nAcademic Year: 2022" +
                        "\nSemester: 1" +
                        "\nModule Credit: 1" +
                        "\nVenue: G953";
                break;
        }
        tvOutput.setText(output);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}