package com.example.appmagic8;

import java.util.Random;



import android.R.color;
import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.view.animation.AlphaAnimation;
import android.media.MediaPlayer;


public class MainActivity extends Activity {


//AnimationDrawable animacion;

	
	//private Button boton;
	   private MagicBall mb; 
	   private TextView texto;
	   private ImageView vista;
	   private RelativeLayout rlay;
	   private MediaPlayer mp;
	  private  static final float OPACO=0;
	  private static final  float TRANSPARENTE=1;
	  private static final int DURACION=1500;
	
	

	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    	texto =(TextView)findViewById(R.id.textView1);
        rlay = (RelativeLayout)findViewById(R.id.relay);
        vista = (ImageView)findViewById(R.id.imageView1);
     
     // boton =(Button)findViewById(R.id.button1);
      
     
      
     /* boton.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			
			String resp = "si";
			texto.setText(resp);
			
			
		}
	 });*/
        
         
    }
    
  
    
    public void respuestas(View v)
    {
    	//char colresp;
    	
    	  animateball();

         mb = new MagicBall();
         texto.setText(mb.getPrediction(getResources()));
         
         animateAnswer();
         
   	  	playSound();
       
    	
        // colresp=mb.calcColor();
         
        /* if(colresp=='v')
         {
        	 rlay.setBackgroundColor(Color.GREEN);
         }
         else
         {
        	 if(colresp=='a')
             {
            	 rlay.setBackgroundColor(Color.YELLOW);
             }
        	 else
        	 {
        		 rlay.setBackgroundColor(Color.RED);
        	 }
         }*/
        
    	
		//String resp = "si";
		
    }
    public void animateball()
    {
    	
    	vista.setImageResource(R.drawable.ball_animation);
    	
    	AnimationDrawable animacion = (AnimationDrawable)vista.getDrawable();
  	    
  
        if(animacion.isRunning())
        {
  		 animacion.stop();
        }
      
       animacion.start();	
       
    
       
      
      	
  	 		  	
    }
    
    public void animateAnswer()
    {
    	AlphaAnimation alfa = new AlphaAnimation(OPACO,TRANSPARENTE);
    	
    	alfa.setDuration(DURACION);
    	alfa.setFillAfter(true);
    	
    	texto.setAnimation(alfa);
    
    	
    	
    }
    
    
    public void playSound()
    {
        mp = new MediaPlayer().create(this,R.raw.magic_ball);
    
    	mp.start();
    	mp.setOnCompletionListener(new OnCompletionListener() {
			
			@Override
			public void onCompletion(MediaPlayer mp) {
				// TODO Auto-generated method stub
				mp.release();
			}
		});
    	
    	
    }
   
 


}
