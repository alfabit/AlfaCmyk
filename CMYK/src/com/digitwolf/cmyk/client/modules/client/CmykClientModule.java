package com.digitwolf.cmyk.client.modules.client;

import com.digitwolf.cmyk.client.DataService;
import com.digitwolf.cmyk.client.DataServiceAsync;
import com.digitwolf.cmyk.client.presenter.AppPresenter;
import com.digitwolf.cmyk.client.presenter.MainPresenter;
import com.digitwolf.cmyk.client.view.MachinesList;
import com.digitwolf.cmyk.client.view.MainView;
import com.digitwolf.cmyk.client.view.MenuView;
import com.google.inject.Singleton;
import net.customware.gwt.presenter.client.DefaultEventBus;
import net.customware.gwt.presenter.client.EventBus;
import net.customware.gwt.presenter.client.gin.AbstractPresenterModule;

/**
 * Created with IntelliJ IDEA.
 * User: Руслан
 * Date: 11.06.13
 * Time: 18:19
 * To change this template use File | Settings | File Templates.
 */
public class CmykClientModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
        bind(EventBus.class).to(DefaultEventBus.class).in(Singleton.class);
        //bind(PlaceManager.class).in(Singleton.class);
        //bind(ILog.class).to(GwtLogAdapter.class).in(Singleton.class);
        bind(AppPresenter.class);

        bindPresenter(MainPresenter.class, MainPresenter.Display.class, MainView.class);

        bind(MainView.class).in(Singleton.class);
        bind(MenuView.class).in(Singleton.class);
        bind(MachinesList.class);

        bind(DataServiceAsync.class);
        bind(DataService.class);
    }
}
