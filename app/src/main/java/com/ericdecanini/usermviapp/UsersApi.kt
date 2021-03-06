package com.ericdecanini.usermviapp

import retrofit2.http.GET
import retrofit2.http.Query

interface UsersApi {

    @GET("api/")
    suspend fun loadUsers(
        @Query("results") results: Int
    ): UserResponse

}