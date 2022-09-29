package com.example.jobplanettest.di

import com.example.jobplanettest.repository.RecruitRepository
import com.example.jobplanettest.usecase.GetRecruitListBaseUseCase
import com.example.jobplanettest.usecase.GetRecruitListUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object UseCaseModule {

    @Provides
    @ViewModelScoped
    fun provideGetRecruitListUseCase(repository: RecruitRepository): GetRecruitListBaseUseCase = GetRecruitListUseCase(repository)
}
