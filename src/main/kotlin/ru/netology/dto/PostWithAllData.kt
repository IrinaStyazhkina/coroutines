package ru.netology.dto

data class PostWithAllData(
    val post: Post,
    val comments: List<CommentWithAuthor>,
    val author: Author,
)