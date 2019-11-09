package com.maryang.fastrxjava.ui

import com.maryang.fastrxjava.data.repository.GithubRepository
import com.maryang.fastrxjava.entity.GithubRepo
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class GithubReposViewModel {
    private val repository = GithubRepository()

    fun getGithubRepos(): Single<List<GithubRepo>> =
        repository.getGithubRepos()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
}
