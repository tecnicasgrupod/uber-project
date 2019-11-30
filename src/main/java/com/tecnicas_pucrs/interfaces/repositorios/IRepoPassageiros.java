package com.tecnicas_pucrs.interfaces.repositorios;

import com.tecnicas_pucrs.entidades.Passageiro;

public interface IRepoPassageiros {

    public Passageiro recuperarPorCPF(String cpf);

    public void atualizaPassageiro(Passageiro passageiro);

}