package de.fraunhofer.isst.dataspaceconnector.model.view;

import de.fraunhofer.isst.dataspaceconnector.model.AbstractEntity;

public interface BaseViewFactory<T extends AbstractEntity, V extends BaseView<T>> {
    V create(T view);
}
