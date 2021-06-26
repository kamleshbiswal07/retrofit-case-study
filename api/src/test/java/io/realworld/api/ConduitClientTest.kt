package io.realworld.api

import org.junit.Assert.*
import org.junit.Test

class ConduitClientTest {

    private val ConduitClient = ConduitClient()

    @Test
    fun `GET_articles`(){
        val articles = ConduitClient.api.getArticles().execute()
        assertNotNull(articles.body()?.articles)
    }
}