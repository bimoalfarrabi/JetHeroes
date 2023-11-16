package com.dicoding.exercise.jetheroes.data

import com.dicoding.exercise.jetheroes.model.Hero
import com.dicoding.exercise.jetheroes.model.HeroesData

class HeroRepository {
    fun getHeroes(): List<Hero> {
        return HeroesData.heroes
    }

    fun searcHeroes(query: String): List<Hero> {
        return HeroesData.heroes.filter {
            it.name.contains(query, ignoreCase = true)
        }
    }
}