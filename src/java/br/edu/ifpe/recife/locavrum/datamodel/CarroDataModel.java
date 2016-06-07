/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.recife.locavrum.datamodel;

import br.edu.ifpe.recife.locavrum.model.Carro;
import java.util.List;
import javax.faces.model.ListDataModel;
import org.primefaces.model.SelectableDataModel;

/**
 *
 * @author Eduardo
 */
public class CarroDataModel extends ListDataModel<Carro> implements SelectableDataModel<Carro> {

    public CarroDataModel() {
    }

    @Override
    public Object getRowKey(Carro t) {
        return t.getId();
    }

    @Override
    public Carro getRowData(String rowKey) {
        List<Carro> carros = (List<Carro>) getWrappedData();

        for (Carro c : carros) {

            if (c.getId() == (Integer.parseInt(rowKey))) {
                return c;
            }

        }

        return null;
    }

}