package ca.android.activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends BaseActivity implements View.OnClickListener {

    @BindView(R.id.btn_login_1)
    Button btnLogin1;
    @BindView(R.id.btn_login_2)
    Button btnLogin2;
    @BindView(R.id.btn_login_3)
    Button btnLogin3;
    @BindView(R.id.btn_login_4)
    Button btnLogin4;
    @BindView(R.id.btn_login_5)
    Button btnLogin5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        btnLogin1.setOnClickListener(this);
        btnLogin2.setOnClickListener(this);
        btnLogin3.setOnClickListener(this);
        btnLogin4.setOnClickListener(this);
        btnLogin5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v == btnLogin1) {
            Intent login_1_Intent = new Intent(HomeActivity.this, LoginActivity_1.class);
            HomeActivity.this.startActivity(login_1_Intent);

        }
        if (v == btnLogin2) {
            Intent login_2_Intent = new Intent(HomeActivity.this, LoginActivity_2.class);
            HomeActivity.this.startActivity(login_2_Intent);

        }
        if (v == btnLogin3) {
            Intent login_3_Intent = new Intent(HomeActivity.this, LoginActivity_3.class);
            HomeActivity.this.startActivity(login_3_Intent);

        }
        if (v == btnLogin4) {
            Intent login_4_Intent = new Intent(HomeActivity.this, LoginActivity_4.class);
            HomeActivity.this.startActivity(login_4_Intent);

        }
        if (v == btnLogin5) {
            Intent login_5_Intent = new Intent(HomeActivity.this, LoginActivity_5.class);
            HomeActivity.this.startActivity(login_5_Intent);

        }
    }
}
