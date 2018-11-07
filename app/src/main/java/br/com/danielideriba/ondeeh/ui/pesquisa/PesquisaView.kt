package br.com.danielideriba.ondeeh.ui.pesquisa

import br.com.danielideriba.ondeeh.base.BaseView
import br.com.danielideriba.ondeeh.model.Endereco

interface PesquisaView: BaseView {

    fun atualizaEndereco(endereco: Endereco)

    fun showError(error: String)

    fun showLoading()

    fun hideLoading()
}