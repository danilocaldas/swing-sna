/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sna.control;

/**
 *
 * @author Danilo
 */
public interface ControlInterface {

    public void attachListener();

    public void enableButtonsToSaveAction();

    public void disableButtonsToSaveAction();

    public void enableDisableButtonsToEdit(boolean enabled);

    public void limparCampos();

    public void desabilitarCampoDoFrm();

    public void habilitarCamposDoFrm();

    public void prepararAlterarFuncionario();

    public void preparaInserirFuncionario();

    public void alterar();

    public void salvar();

    public void excluir();

    public void formToFuncionario();
}
