package com.example.caspar.projectcn;

import android.graphics.Color;
import android.os.Handler;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView im1;
    ImageView im2;
    ImageView im3;
    ImageView im4;
    ImageView im5;
    ImageView im6;
    ImageView im7;
    ImageView im8;
    ImageView im9;
    View view3;

    public boolean transStatus1=false;
    public boolean transStatus2=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setAll();
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkMedia()==0) {

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            transStatus1 = true;
                            goFirst();

                        }
                    }, 1000);

                }

            }
        });
        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkMedia()==0) {

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            transStatus2 = true;
                            goSecond();

                        }
                    }, 1000);

                }

            }
        });
    }
    public void setAll(){
        im1 =(ImageView) findViewById(R.id.imageView);
        im2 =(ImageView) findViewById(R.id.imageView2);
        im3 =(ImageView) findViewById(R.id.imageView3);
        im4 =(ImageView) findViewById(R.id.imageView4);
        im5 =(ImageView) findViewById(R.id.imageView11);
        im6 =(ImageView) findViewById(R.id.imageView6);
        im7 =(ImageView) findViewById(R.id.imageView7);
        im8 =(ImageView) findViewById(R.id.imageView10);
        im9 =(ImageView) findViewById(R.id.imageView12);
        view3 = (View) findViewById(R.id.view3);
    }
    public int checkMedia(){

        if(!transStatus1 && !transStatus2){
            return 0;
        }
        if((transStatus2&&!transStatus1)||(transStatus1&&!transStatus2)){
            return 1;
        }
        if(transStatus1&&transStatus2){
            return 2;
        }
        return 3;

    }
    public void goFirst(){
        im7.setVisibility(View.VISIBLE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                im7.setVisibility(View.GONE);
                im5.setVisibility(View.VISIBLE);
                if(checkMedia()==2){
                    im5.setVisibility(View.GONE);
                    view3.setBackgroundColor(Color.RED);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            transStatus1 = false;
                            view3.setBackgroundColor(Color.BLACK);
                            TimeGenerator time = new TimeGenerator();
                            if(checkMedia()==0) {


                                        transStatus1 = true;
                                        goFirst();



                                    new Handler().postDelayed(new Runnable() {
                                        @Override
                                        public void run() {
                                            if(checkMedia()==0) {
                                            transStatus2 = true;
                                            goSecond();
                                            }

                                        }
                                    }, time.TimeGenerator(100));



                            }

                        }
                    },1000) ;

                }else{
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            im5.setVisibility(View.GONE);
                            im4.setVisibility(View.VISIBLE);
                            if(checkMedia()==2){
                                im4.setVisibility(View.GONE);
                                transStatus1 = false;
                            }else{
                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        im4.setVisibility(View.GONE);
                                        im8.setVisibility(View.VISIBLE);
                                        if(checkMedia()==2){
                                            im8.setVisibility(View.GONE);
                                            transStatus1 = false;
                                        }else{
                                            new Handler().postDelayed(new Runnable() {
                                                @Override
                                                public void run() {
                                                    im8.setVisibility(View.GONE);
                                                    im9.setVisibility(View.VISIBLE);
                                                    if(checkMedia()==2){
                                                        im9.setVisibility(View.GONE);
                                                        transStatus1 = false;

                                                    }else{
                                                        new Handler().postDelayed(new Runnable() {
                                                            @Override
                                                            public void run() {
                                                                im9.setVisibility(View.GONE);
                                                                im3.setVisibility(View.VISIBLE);
                                                                if(checkMedia()==2){
                                                                    im3.setVisibility(View.GONE);
                                                                    transStatus1 = false;
                                                                }else{
                                                                    new Handler().postDelayed(new Runnable() {
                                                                        @Override
                                                                        public void run() {
                                                                            im3.setVisibility(View.GONE);
                                                                            im6.setVisibility(View.VISIBLE);
                                                                            if(checkMedia()==2){
                                                                                im6.setVisibility(View.GONE);
                                                                                transStatus1 = false;
                                                                            }else{
                                                                                new Handler().postDelayed(new Runnable() {
                                                                                    @Override
                                                                                    public void run() {
                                                                                        im6.setVisibility(View.GONE);
                                                                                        transStatus1 = false;

                                                                                    }
                                                                                }, 1000);
                                                                            }
                                                                        }
                                                                    }, 1000);
                                                                }
                                                            }
                                                        }, 1000);
                                                    }
                                                }
                                            }, 1000);
                                        }
                                    }
                                },1000);
                            }
                        }
                    }, 1000);
                }
            }
        }, 1000);




    }
    public void goSecond() {
        im6.setVisibility(View.VISIBLE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                im6.setVisibility(View.GONE);
                im3.setVisibility(View.VISIBLE);
                if(checkMedia()==2){
                    im3.setVisibility(View.GONE);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            transStatus2 = false;

                        }
                    },1000) ;
                }else{
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            im3.setVisibility(View.GONE);
                            im9.setVisibility(View.VISIBLE);
                            if(checkMedia()==2){
                                im9.setVisibility(View.GONE);
                                transStatus2 = false;
                            }else{
                                new Handler().postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        im9.setVisibility(View.GONE);
                                        im8.setVisibility(View.VISIBLE);
                                        if(checkMedia()==2){
                                            im8.setVisibility(View.GONE);
                                            transStatus2 = false;
                                        }else{
                                            new Handler().postDelayed(new Runnable() {
                                                @Override
                                                public void run() {
                                                    im8.setVisibility(View.GONE);
                                                    im4.setVisibility(View.VISIBLE);
                                                    if(checkMedia()==2){
                                                        im4.setVisibility(View.GONE);
                                                        transStatus2 = false;
                                                    }else{
                                                        new Handler().postDelayed(new Runnable() {
                                                            @Override
                                                            public void run() {
                                                                im4.setVisibility(View.GONE);
                                                                im5.setVisibility(View.VISIBLE);
                                                                if(checkMedia()==2){
                                                                    im5.setVisibility(View.GONE);
                                                                    transStatus2 = false;
                                                                }else{
                                                                    new Handler().postDelayed(new Runnable() {
                                                                        @Override
                                                                        public void run() {
                                                                            im5.setVisibility(View.GONE);
                                                                            im7.setVisibility(View.VISIBLE);
                                                                            if(checkMedia()==2){
                                                                                im7.setVisibility(View.GONE);
                                                                                transStatus2 = false;
                                                                            }else{
                                                                                new Handler().postDelayed(new Runnable() {
                                                                                    @Override
                                                                                    public void run() {
                                                                                        im7.setVisibility(View.GONE);
                                                                                        transStatus2 = false;

                                                                                    }
                                                                                }, 1000);
                                                                            }
                                                                        }
                                                                    }, 1000);
                                                                }
                                                            }
                                                        }, 1000);
                                                    }
                                                }
                                            }, 1000);
                                        }
                                    }
                                },1000);
                            }
                        }
                    }, 1000);
                }
            }
        }, 1000);




    }

}
