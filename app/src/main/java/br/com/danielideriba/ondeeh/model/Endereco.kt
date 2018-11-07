package br.com.danielideriba.ondeeh.model

data class Endereco(
        val longradouro: String,
        val complemento: String,
        val bairro: String,
        val localidade: String,
        val uf: String
)