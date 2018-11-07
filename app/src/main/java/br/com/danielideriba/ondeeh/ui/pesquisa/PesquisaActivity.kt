package br.com.danielideriba.ondeeh.ui.pesquisa

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.danielideriba.ondeeh.R
import br.com.danielideriba.ondeeh.base.BaseActivity
import br.com.danielideriba.ondeeh.model.Endereco

class PesquisaActivity : BaseActivity<PesquisaPresenter>(), PesquisaView {
    override fun atualizaEndereco(endereco: Endereco) {
        Toast.makeText(this, endereco.bairro, Toast.LENGTH_LONG).show()
    }

    override fun showError(error: String) {
        Toast.makeText(this, error, Toast.LENGTH_LONG).show()
    }

    override fun showLoading() {
        Toast.makeText(this, "Carregando", Toast.LENGTH_LONG).show()
    }

    override fun hideLoading() {
        Toast.makeText(this, "fui", Toast.LENGTH_LONG).show()
    }

    override fun instantiatePresenter(): PesquisaPresenter {
        return PesquisaPresenter(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesquisa)

        presenter.pesquisar("01031001")
    }

}
