package com.aziz.talha.newsapp.Remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Talha on 1.06.2018.
 */

public class IconBetterIdeaClient
{
    private static Retrofit retrofit=null;
    public static Retrofit getClient()
    {

        //http://i.olsh.me/
        if (retrofit == null)
        {
            retrofit = new Retrofit.Builder()
                    .baseUrl("https://icons.better-idea.org/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return  retrofit;
    }
}
