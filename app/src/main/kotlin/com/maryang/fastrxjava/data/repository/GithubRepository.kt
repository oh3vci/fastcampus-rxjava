package com.maryang.fastrxjava.data.repository

import com.maryang.fastrxjava.data.source.ApiManager
import com.maryang.fastrxjava.entity.GithubRepo
import io.reactivex.Single

class GithubRepository {

    private val api = ApiManager.githubApi

    fun getGithubRepos(): Single<List<GithubRepo>> =
        api.getRepos()
}
