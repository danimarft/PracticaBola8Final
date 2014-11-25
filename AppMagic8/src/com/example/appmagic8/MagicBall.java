package com.example.appmagic8;

import java.util.Random;




import android.support.v7.app.ActionBarActivity;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MagicBall {
	
	private String[]resp;
	private Random al;
	private String auxresp;
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String  getPrediction(Resources res)
	{
	
       
		int longit=0;
    	resp = res.getStringArray(R.array.resp);
    	
    	al = new Random();
    	
    	
    	longit=resp.length;
    	
        auxresp=resp[al.nextInt(longit)];
    	 
		return(auxresp);
		
		
		
	}
	public char calcColor()
	{
		char colresp;
		
		int i=0;
    	
		
    	String[] respcomp = new String[]
    			{
    		    "En mi opini�n", "s�",
    		    "Es cierto",
    		    "Es decididamente as�",
    		    "Probablemente",
    		    "Buen pron�stico",
    		    "Todo apunta a que s�",
    		    "Sin duda",
    		    "S�",
    		    "S� - definitivamente",
    		    "Debes confiar en ello",
    		    "Respuesta vaga, vuelve a intentarlo",
    		    "Pregunta en otro momento",
    		    "Ser� mejor que no te lo diga ahora",
    		    "No puedo predecirlo ahora",
    		    "Conc�ntrate y vuelve a preguntar",
    		    "No cuentes con ello",
    		    "Mi respuesta es no",
    		    "Mis fuentes me dicen que no",
    		    "Las perspectivas no son buenas",
    		    "Muy dudoso"
    			};
    	
    	 while(!respcomp[i].equals(auxresp))
         {
        	 i++;
         }
      
			
		
               if(i<=9)
               {
        	    colresp='v';
              }
               else
              {
        	   if(i>=10 && i<=16)
        	   {
        		  colresp='a'; 
        	   }
        	   else
        	   {
        		   colresp='r';
        	   }
        	   
           }
		return colresp;
	}

}
