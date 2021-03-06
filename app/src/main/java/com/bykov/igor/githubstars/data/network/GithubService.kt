package com.bykov.igor.githubstars.data.network

import com.bykov.igor.githubstars.data.user.model.GithubRepsonse
import kotlinx.coroutines.experimental.Deferred
import retrofit2.http.GET

interface GithubService {

  @GET("search/users?q=followers:%3E1000+sort:followers&per_page=10")
  fun getUser(): Deferred<GithubRepsonse>
}