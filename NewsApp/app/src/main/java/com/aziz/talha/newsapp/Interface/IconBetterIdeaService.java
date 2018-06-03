package com.aziz.talha.newsapp.Interface;

import com.aziz.talha.newsapp.Model.IconBetterIdea;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by Talha on 1.06.2018.
 */

public interface IconBetterIdeaService
{
    @GET
    Call<IconBetterIdea> getIconUrl(@Url String url);
}
