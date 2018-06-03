package com.aziz.talha.newsapp.Interface;

import com.aziz.talha.newsapp.Common.Common;
import com.aziz.talha.newsapp.Model.News;
import com.aziz.talha.newsapp.Model.WebSite;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by Talha on 1.06.2018.
 */

public interface NewsService {
    @GET("v2/sources?language=en&apiKey="+ Common.API_KEY)
    Call<WebSite> getSources();

    @GET
    Call<News> getNewestArticles(@Url String url);
}
