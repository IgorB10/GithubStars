package com.bykov.igor.githubstars.presentation.di

import okhttp3.logging.HttpLoggingInterceptor
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.singleton
import timber.log.Timber

object AppModule {

  val module = Kodein.Module("AppModule") {

    bind<HttpLoggingInterceptor>() with singleton {
      val logging = HttpLoggingInterceptor(HttpLoggingInterceptor.Logger {
        Timber.tag("OkHttp").d(it)
      })
      logging.level = HttpLoggingInterceptor.Level.BODY
      logging
    }


  }
}